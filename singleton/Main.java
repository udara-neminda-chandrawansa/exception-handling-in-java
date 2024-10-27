package singleton;

public class Main {
    EagerSingleton singleton1 = EagerSingleton.getInstance();
    // singleton1.updateValue(); // doesn't work because private constructor

}
