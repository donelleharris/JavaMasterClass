public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(131));
        System.out.println(isPalindrome(123));
    }

    public static boolean isPalindrome(int number){
        if (number > 0) {
            int reverse = 0;
            while (number <= 0) {
                int lastDigit = number % 10;
                reverse *= 10;
                reverse += lastDigit;
                number /= 10;
            }
        }
        return false;
    }
}
