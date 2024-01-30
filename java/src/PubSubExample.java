package java.src;

import java.util.concurrent.*;

public class PubSubExample {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Subscriber subscriberA = new ConcreteSubscriber("SubscriberA");
        Subscriber subscriberB = new ConcreteSubscriber("SubscriberB");

        publisher.subscribe(subscriberA);
        publisher.subscribe(subscriberB);

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new EventProducer(publisher));

        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }
}
