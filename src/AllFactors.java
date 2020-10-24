import javax.crypto.spec.PSource;

public class AllFactors {
    public static void main(String[] args) {
        printFactors(6);    //returns 1 2 3 6
        printFactors(32);   //returns 1 2 4 8 16 32
        printFactors(10);   //returns 1 2 5 10
        printFactors(-1);   //returns "Invalid Value"
    }
    /*Write a method named printFactors with one perameter of type int named number.
    * If number is < 1, the method should print "Invalid Value". The method should print
    * all factors of the passed value.*/
    public static void printFactors(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
