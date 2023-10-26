package codingBatKatas;

import java.util.HashMap;
import java.util.Map;

public class Array_3 {

//    Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of
//    elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array.
//        (Efficiency is not a priority.)
//    maxSpan([1, 2, 1, 1, 3]) → 4
//    maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
//    maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6

    public int maxSpan(int[] nums) {
        Map<Integer,Integer> numFirstAppearance = new HashMap<Integer,Integer>();
        int largestSpan = 0;

        if (nums.length == 0) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (numFirstAppearance.containsKey(num)) {
                int leftmostIndex = numFirstAppearance.get(num);
                int currentSpan = (i+1) - leftmostIndex;
                largestSpan = Math.max(largestSpan, currentSpan);
            } else {
                numFirstAppearance.put(num, i);
            }
        }
        return largestSpan == 0 ? 1 : largestSpan;
    }

//    Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is
//    immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number
//    of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
//    fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
//    fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
//    fix34([3, 2, 2, 4]) → [3, 4, 2, 2]

    public int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 4 && (nums[j-1] != 3)) {
                        int indexAfter3 = nums[i+1];
                        nums[i+1] = nums[j];
                        nums[j] = indexAfter3;
                        break;
                    }
                }
            }
        }
        return nums;
    }

//    (This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as
//    the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other
//    number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4.
//    In this version, 5's may appear anywhere in the original array.
//    fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
//    fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
//    fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]

    public int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4)) {
                        int indexAfter4 = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = indexAfter4;
                        break;
                    }
                }
            }
        }
        return nums;
    }







}
