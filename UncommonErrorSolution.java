public class UncommonErrorSolution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            int index = 5;
            if (index >= 0 && index < arr.length) {
                System.out.println(arr[index]);
            } else {
                System.out.println("Index out of bounds");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        String str = null;
        try {
            if (str != null) {
                System.out.println(str.length());
            } else {
                System.out.println("String is null");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        try {
            int num1 = 10;
            int num2 = 0;
            if(num2 != 0) {
                int result = num1 / num2;
                System.out.println(result);
            } else {
                System.out.println("Cannot divide by zero");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}