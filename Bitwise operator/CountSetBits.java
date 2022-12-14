public class CountSetBits{
    public static int setBits(int num){
        int count = 0;
        while(num!=0){
            num = num&(num-1);
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        int count = setBits(8);
        System.out.println(count);
    }
}