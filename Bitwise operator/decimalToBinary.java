/**
 * decimalToBinary
 */
import java.util.Scanner;
public class decimalToBinary {
    public static int decimal_to_binary(int num) {
        int bit=0,i=0,result=0;
        while(num>0){
            bit = num%10;
            if(bit==1){
                result = (int)(result+Math.pow(2,i));
            }
            num=num/10;
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary:\t");
        int num = sc.nextInt();
        int result = decimal_to_binary(num);
        System.out.println(result);
        sc.close();
    }
}