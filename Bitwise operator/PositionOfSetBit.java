public class PositionOfSetBit{
    public static int findPos(int N){
        int currentPos=0,position=0,count=0;
        while(N!=0){
            if((N&1)==1){
                currentPos = position;
                count++;
            }
            N=N>>1;
            position++;
        }
        if(count==0 || count>1){
            return -1;
        }
        return position;

    }
    public static void main(String args[]){
        System.out.println(findPos(512));
    }
}