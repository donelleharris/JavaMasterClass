public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252)); //should return 4
        System.out.println(sumFirstAndLastDigit(257)); //should return 9
        System.out.println(sumFirstAndLastDigit(0));   //should return 0
        System.out.println(sumFirstAndLastDigit(5));   //should return 5
        System.out.println(sumFirstAndLastDigit(-10)); //should return -1
    }
    /*Write a method named sumFirstAndLastDigit with one parameter of type int called number.
    *
    * The method needs to find the first and the last digit of the parameter number passed to
    * the method, using a loop and return the sum of the first and the last digit of that number.
    *
    * If the number is a negative then the method needs to return -1 to indicate an invalid value.
    * */
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        } else {
            int sum = 0;

            int lastDigit = number % 10;
            int firstDigit = 0;

            firstDigit = number;
            while (firstDigit >= 10) {
                firstDigit /= 10;
            }
            sum = firstDigit + lastDigit;

            return sum;
        }
    }
}
