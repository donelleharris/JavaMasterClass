import java.util.Stack;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15)); //should return 5
        System.out.println(getGreatestCommonDivisor(12, 30)); //should return 6
        System.out.println(getGreatestCommonDivisor(9, 18));  //should return -1
        System.out.println(getGreatestCommonDivisor(81, 153)); //should return 9
    }
    /* Write a method named getGreatestCommonDivisor with two parameters of type int
    * named first and second. If one of the parameters is < 10, the method should return
    * -1 to indicate an invalid value. The Method should return the greatest common
    * divisor of the two numbers (int).The greatest common divisor is the largest positive
    * integer that can fully divide each of the integers without leaving a remainder. */

    public static int getGreatestCommonDivisor(int a, int b){
        if(a < 10 || b < 10){
            return -1;
        }
        int gCD = 0;
        int i = 0;
        if(a > b){
            i = a;
        }else{
            i = b;
        }
        for(int j=i ; j > 0; j--){
            if(a%j == 0 && b%j == 0){
                gCD = j;
                break;
            }
        }
        return gCD;
    }
}
