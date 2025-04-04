
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int min = nums.get(0);
        int max = nums.get(0);
        for(int x = 0; x < nums.size(); x++){
            if(min > nums.get(x)){
                min = nums.get(x);
            }
            if(max < nums.get(x)){
                max = nums.get(x);
            }
        }
        return max - min;
    }
}
