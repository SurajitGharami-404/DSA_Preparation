public class complimentOfInt {
    public static int  complinment_of_Integer(int x) {
        int num = ~x;
        int mask = 0,result=0;
        while(x!=0){
            mask = mask<<1;
            mask = mask|1;
            x = x>>1;  
        }
        result = mask&num;
        return result;
    }
    public static void main(String[] args) {
        int result = complinment_of_Integer(7);
        System.out.println(result);
    }
}
