package com.starion.loki.algorithmization.one_dimensional_arrays;

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 16, 10, 14, 9};
        int z = 6;
        int colReplacement = 0;

        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] > z) {
                nums[i] = z;
                colReplacement++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(colReplacement);
    }
}
