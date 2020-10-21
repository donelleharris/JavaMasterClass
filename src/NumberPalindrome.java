public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(131));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(-3113));
    }
/*Write a method called isPalindrome with one int parameter called number.
*
* The method needs to return a boolean. It should return true if the number is
* a palindrome number otherwise it should return false.
*/
    public static boolean isPalindrome(int number){
        int reverse = Math.abs(number);
        number = Math.abs(number);
        int r, sum = 0;
        while (number > 0){
            r = number%10;
            sum = (sum * 10) + r;
            number /=10;
        }
        if (reverse == sum){
            return true;
        } else return false;
    }
}
