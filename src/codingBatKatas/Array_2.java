package codingBatKatas;

public class Array_2 {

//    Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
//    countEvens([2, 1, 2, 3, 4]) → 3
//    countEvens([2, 2, 0]) → 3
//    countEvens([1, 3, 5]) → 0

    public int countEvens(int[] nums) {
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

//    Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
//        Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
//    bigDiff([10, 3, 5, 6]) → 7
//    bigDiff([7, 2, 10, 9]) → 8
//    bigDiff([2, 10, 7, 2]) → 8

    public int bigDiff(int[] nums) {
        int largest = nums[0];
        int smallest = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i] ) {
                largest = nums[i];
            }
            if (smallest > nums[i]) {
                smallest = nums[i];
            }
        }
        return largest - smallest;
    }

//    Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring
//    the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one
//    copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the
//    array is length 3 or more.
//    centeredAverage([1, 2, 3, 4, 100]) → 3
//    centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
//    centeredAverage([-10, -4, -2, -4, -2, 0]) → -3

    public int centeredAverage(int[] nums) {
        int largest = nums[0];
        int smallest = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
            if (smallest > nums[i]) {
                smallest = nums[i];
            }
            sum += nums[i];
        }

        sum = sum - largest - smallest;
        int average = sum / (nums.length - 2);

        return average;
    }

//    Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
//    so it does not count and numbers that come immediately after a 13 also do not count.
//    sum13([1, 2, 2, 1]) → 6
//    sum13([1, 1]) → 2
//    sum13([1, 2, 2, 1, 13]) → 6

    public int sum13(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int sum = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }







}
