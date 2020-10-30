public class Que1 {

    private static void customPrint(int n, String message) {
        if (n > 0) {
            System.out.println(message);
            n--;
            customPrint(n, message);
        }
    }

    public static void main(String[] args) {
        customPrint(5, "Hello, World!");
    }

}
