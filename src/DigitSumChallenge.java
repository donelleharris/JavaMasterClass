public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(2345));
    }
    public static int sumDigits(int aNum){
        if(aNum < 10){
            return -1;
        }
        String str = Integer.toString(aNum);
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        int sum = 0;
        for(char c: ch){
            sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }
}
