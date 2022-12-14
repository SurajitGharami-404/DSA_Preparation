import java.util.Arrays;
public class NonRepeating{
    public static int[] singleNumber(int[] nums){
        int res = 0;
        for(int i=0;i<nums.length;i++){
            res ^= nums[i];
        }

        int rmsb = res&~(res-1);
        int set1=0,set2=0;

        for(int i=0;i<nums.length;i++){
            if((nums[i]&rmsb)==0){
                set1^=nums[i];
            }
            else set2^=nums[i];
            System.out.println("setl: "+set1);
            System.out.println("set2: "+set2);
        }
        int[] elements = new int[2];
        if(set1>set2){
            elements[0] = set2;
            elements[1] = set1;
        }
        else {
            elements[0] = set1;
            elements[1] = set2;
        }
        
        return elements;
    }
    public static void main(String args[]){
        int[] nums = {7, 6, 25, 4, 25, 15, 15, 7, 4, 3, 29, 6};
        singleNumber(nums);
    }
}