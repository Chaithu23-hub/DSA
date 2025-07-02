//prints second largest 
// if no second large element then print -1
import java.util.*;
class SecondLargestElement {
    public static int secondLargestElement(int[] nums) {
    int max=0;
    int secmax=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
         secmax=max;
         max=nums[i];
        }
         else if(nums[i]>secmax && nums[i]!=max){
            secmax=nums[i];
         }
    }
    if(secmax==0){
        return -1;
    }
    else{
        return secmax;
    }
    }
    public static void main(String[] args) {
        int [] nums = {8, 8, 7, 6, 5};
        int [] nums1={10,10,10,10};
        int SL = secondLargestElement(nums1);
        System.out.println(SL);
    }
}
