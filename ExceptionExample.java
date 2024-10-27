public class ExceptionExample {
    public static void main(String[] args) {
        generalEx();
        arithmaticEx();
        multipleEx();
    }

    // general exception handling
    public static void generalEx() {
        try {
            int data = 10 / 0;
            System.out.println(data);
        } catch (Exception ex) {
            System.out.println("Cannot divide by zero: " + ex);
        } finally {
            System.out.println("Exception Handled!");
        }
    }

    // arithmatic exception handling
    public static void arithmaticEx() {
        try {
            int data = 10 / 0;
            System.out.println(data);
        } catch (ArithmeticException ex) {
            System.out.println("Arithmatic Exception Handling: " + ex);
        } catch (Exception ex) {
            System.out.println("General Exception: " + ex);
        } finally {
            System.out.println("Exception Handled!");
        }
    }

    // multiple exception handling (Index out of bounds & Arithmatic exception
    // handling)
    public static void multipleEx() {
        try {
            int data = 10 / 0;
            System.out.println(data);
        } catch (IndexOutOfBoundsException | ArithmeticException ex) {
            System.out.println("Multiple Exception Handling: " + ex);
        } catch (Exception ex) {
            System.out.println("General Exception: " + ex);
        } finally {
            System.out.println("Exception Handled!");
        }
    }
}