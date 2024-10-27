package singleton;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    private int value = 0;

    public void updateValue() {
        value += 1;
        System.out.println("Value: " + value);
    }
}
