public class PowerOfTwo{
    public static boolean isPowerOfTwo(long n){
        if((n>0) && (n&(n-1))==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        System.out.println(isPowerOfTwo(5));
    }
}