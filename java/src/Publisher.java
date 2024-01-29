package java.src;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class Publisher {
    private final List<Subscriber> subscribers = new CopyOnWriteArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }
}
