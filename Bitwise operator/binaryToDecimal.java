
import java.util.Scanner;
public class binaryToDecimal {
    public static int binary_to_decimal(int num) {
        int bit = 0;
        int result = 0;
        int i = 0;
        while(num>0){
            bit = num&1;
            num = num>>1;
            result = (int) ((bit*Math.pow(10,i))+result);
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit:");
        int num = sc.nextInt();
        int result = binary_to_decimal(num);
        System.out.println(result);
        sc.close();
    }
}
