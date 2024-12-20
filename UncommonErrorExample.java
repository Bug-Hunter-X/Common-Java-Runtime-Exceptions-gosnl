public class UncommonErrorExample {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException: 5
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        String str = null;
        try {
            System.out.println(str.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }

        try {
            int result = 10 / 0; // ArithmeticException: / by zero
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }
}