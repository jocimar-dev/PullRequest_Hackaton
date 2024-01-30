package java.src;

import java.util.Random;
import java.util.concurrent.TimeUnit;

class EventProducer implements Runnable {
    private final Publisher publisher;
    EventProducer(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void run() {
        String[] events = {"Primeiro evento", "Second Event", "Third Event"};
        Random random = new Random();

        for (String event : events) {
            try {
                TimeUnit.SECONDS.sleep(random.nextInt(5));
                publisher.notifySubscribers(event);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
            }
        }
        
    }
}
