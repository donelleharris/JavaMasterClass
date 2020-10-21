public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(2345));
        System.out.println(sumDigits(-2345));
        System.out.println(sumDigits(5));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;

            number /= 10;
        }
        return sum;
    }

//  Ryan's solution:
//        String str = Integer.toString(number);
//        char[] ch = new char[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            ch[i] = str.charAt(i);
//        }
//        int sum = 0;
//        for(char c: ch){
//            sum += Integer.parseInt(String.valueOf(c));
//        }
//        return sum;

}
