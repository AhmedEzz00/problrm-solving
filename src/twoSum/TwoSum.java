package twoSum;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int currentIndex;
        int[] ret= new int[2];
        for(currentIndex =0; currentIndex< nums.length-1; currentIndex++){
            for(int nextIndex= currentIndex+1; nextIndex< nums.length; nextIndex++) {
                if (nums[currentIndex]+ nums[nextIndex]== target){
                    ret[0]= currentIndex;
                    ret[1]= nextIndex;
                    return ret;
                }
            }
        }
        return null;
    }
}
