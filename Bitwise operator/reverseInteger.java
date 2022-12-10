public class reverseInteger {
    public static int reverse(int num){
        int result = 0,digit = 0;
        while(num!=0){
            digit = num % 10;
            num = num / 10;
            if(result > Integer.MAX_VALUE/10 || result/10 < Integer.MIN_VALUE){
                return 0;
            }
            result = (result * 10) + digit;
        }
        return result;
    }
    public static void main(String[] args) {
        int result = reverse(-321);
        System.out.println(result);
    }
}
