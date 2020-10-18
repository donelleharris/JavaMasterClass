public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600)); //false
        System.out.println(isLeapYear(1600));  //true
        System.out.println(isLeapYear(2017));  //false
        System.out.println(isLeapYear(2000));  //true
        System.out.println(isLeapYear(1924));  //true
        System.out.println(isLeapYear(1800));  //false
    }

    public static boolean isLeapYear(int year) {
        if (year <= 0 || year % 4 != 0) {
            return false;
        } else if (year > 0 && year <= 9999) {
            if (year % 100 != 0) {
                return true;
            } else if (year % 400 == 0) {
                return true;
            }
        } return false;
    }
}
