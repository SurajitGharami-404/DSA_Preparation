/**
 * getBit
 */
public class getBit {

    public static int get_bit(int num,int position){
        int new_num = num>>position-1;
        int result = new_num&1;
        if(result==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int result = get_bit(8, 2);
        System.out.println(result);
    }
}