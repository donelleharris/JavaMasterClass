public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); //true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));    //false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));        //true
        System.out.println(areEqualByThreeDecimalPlaces(-3.125, 3.123));   //false
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        num1 = num1 * 1000;
        num2 = num2 * 1000;
        int a = (int) num1;
        int b = (int) num2;
        if (a == b) {
            return true;
        } else return false;
    }
}
