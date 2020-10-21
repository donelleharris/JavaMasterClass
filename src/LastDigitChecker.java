public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71)); //returns true
        System.out.println(hasSameLastDigit(23, 32, 42)); //returns true
        System.out.println(hasSameLastDigit(9, 99, 999)); //returns false
    }
    /*Write a method named hasSameLastDigit with three parameters of type int.
    *
    * Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
    * If one of the numbers is not within range, the method should return false. The
    * method should return true if at least two fo the numbers share the same rightmost
    * digit; otherwise, it should return false.
    *
    * Write another method named isValid with one parameter of type int.
    * The method needs to return true if the number parameter is in rang of 10 (inclusive)
    * - 1000 (inclusive), otherwise return false.*/
    public static boolean isValid(int num){
        return num >= 10 && num <= 1000;
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            int num1a = num1 % 10;
            int num2a = num2 % 10;
            int num3a = num3 % 10;

            return (num1a == num2a) || (num1a == num3a) || (num2a == num3a);
        } return false;
    }
}
