package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindSumPair {


    public static int[] findSumPair(int[] numbers, int k){

        int[] indexes=new int[2];
        Map<Integer, Integer> map=new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if(map.containsKey(k-numbers[i])){
                return new int[]{map.get(k-numbers[i]), i};
            }
            map.put(numbers[i], i);
        }
        return new int[]{0,0};

    }


    public static void main(String[] args) {
        int[] nums={1,2,0,1};
        int k=3;
        System.out.println(Arrays.toString(findSumPair(nums, k)));
    }


}
