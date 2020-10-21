public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789)); //should return 20
        System.out.println(getEvenDigitSum(252));       //should return 4
        System.out.println(getEvenDigitSum(-22));       //should return -1
    }
/*Write a method named getEvenDigitSum with one paraneter of type int called number.
* The method should return the sum of the even digits within the number. If the number
* is negative, the method should return -1 to indicate an invalid value.*/

    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        } else {
            int lastDigit = number % 10;
            int sum = 0;
            if (lastDigit % 2 == 0){
                sum =+ lastDigit;
            }
            while (number > 0){
                number /= 10;
                int temp = 0;
                if (number % 2 == 0){
                    temp = number % 10;
                } sum += temp;
            } return sum;
        }
    }
}
