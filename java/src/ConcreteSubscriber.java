package java.src;

class ConcreteSubscriber implements Subscriber {
    private final String name;

    ConcreteSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}
