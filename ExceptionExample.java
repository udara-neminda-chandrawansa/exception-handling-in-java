public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int data = 10 / 0;
            System.out.println(data);
        } catch (Exception ex) {
            System.out.println("Cannot divide by zero: " + ex);
        } finally {
            System.out.println("Exception Handled!");
        }
    }
}