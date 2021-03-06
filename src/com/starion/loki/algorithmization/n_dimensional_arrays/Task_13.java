package com.starion.loki.algorithmization.n_dimensional_arrays;

/*Sort matrix columns in ascending and descending order of element values.*/

import static java.lang.Math.random;

public class Task_13 {

  public static void main(String[] args) {
    int[][] nums;
    int n = 10;
    nums = new int[n][n];
    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = 0; j <= nums.length - 1; j++) {
        nums[i][j] = (int) (random() * 21) - 10;
        System.out.printf("%5.3s", nums[i][j]);
      }
      System.out.println();
    }
    System.out.println();

    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = 0; j <= nums.length - 1; j++) {
        for (int k = 0; k < nums.length - 1; k++) {
          if (nums[k][j] > nums[k + 1][j]) {
            int temp = nums[k][j];
            nums[k][j] = nums[k + 1][j];
            nums[k + 1][j] = temp;
          }
        }
      }
    }
    System.out.println("Sort columns in ascending order");
    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = 0; j <= nums.length - 1; j++) {
        System.out.printf("%5.3s", nums[i][j]);
      }
      System.out.println();
    }
    System.out.println();

    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = 0; j <= nums.length - 1; j++) {
        for (int k = 0; k < nums.length - 1; k++) {
          if (nums[k][j] < nums[k + 1][j]) {
            int temp = nums[k][j];
            nums[k][j] = nums[k + 1][j];
            nums[k + 1][j] = temp;
          }
        }
      }
    }
    System.out.println("Sort columns in descending order");
    for (int i = 0; i <= nums.length - 1; i++) {
      for (int j = 0; j <= nums.length - 1; j++) {
        System.out.printf("%5.3s", nums[i][j]);
      }
      System.out.println();
    }

  }
}

