public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(10, 100));
    }
    /*Write a method named hasSharedDigit with two parameters of type int.
    *
    * Each number should be within the range of 10 (inclusive) - 99 (inclusive).
    * If one of the numbers is not within the range, the method should return false.
    *
    * The method should return true if there is a digit that appears in both numbers,
    * such as 2 in 12 and 23; otherwise the method should return false. */

    public static boolean hasSharedDigit(int num1, int num2){
        if((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)){
            return false;
        }
        int num1a = num1 / 10;
        int num1b = num1 % 10;
        int num2a = num2 / 10;
        int num2b = num2 % 10;
        if ((num1a == num2a) || (num1a == num2b)){
            return true;
        } else if ((num1b == num2a) || (num1b == num2b)){
            return true;
        } else return false;
    }
}
