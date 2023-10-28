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

//    Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one
//    side is equal to the sum of the numbers on the other side.
//    canBalance([1, 1, 1, 2, 1]) → true
//    canBalance([2, 1, 1, 2, 1]) → false
//    canBalance([10, 10]) → true

    public boolean canBalance(int[] nums) {
        int beginSum = 0;
        int endSum = 0;
        int middle = (nums.length/2);
        int allFirst = 0;
        int lastIndex = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[nums.length-1]) {
                allFirst += nums[j];
            } else {
                lastIndex += nums[j];
            }
        }

        if (allFirst == lastIndex) {
            return true;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < middle) {
                beginSum += nums[i];
            } else if (i > middle) {
                endSum += nums[i];
            }
        }
        return (endSum + nums[middle] == beginSum) || (beginSum + nums[middle] == endSum);
    }

//    Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner
//    appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact
//    that both arrays are already in sorted order.
//    linearIn([1, 2, 4, 6], [2, 4]) → true
//    linearIn([1, 2, 4, 6], [2, 3, 4]) → false
//    linearIn([1, 2, 4, 4, 6], [2, 4]) → true

    public boolean linearIn(int[] outer, int[] inner) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int i = 0; i < outer.length; i++) {
            map.put(outer[i],i);
        }

        for (int j = 0; j < inner.length; j++) {
            if (!map.containsKey(inner[j])) {
                return false;
            }
        }
        return true;
    }

//    Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1}
//    (spaces added to show the 3 groups).
//    squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
//    squareUp(2) → [0, 1, 2, 1]
//    squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]

    public int[] squareUp(int n) {
        int[] squaredArray = new int[n*n];
        int index = 0;

        for (int block = 1; block <= n; block++) {

            for (int zeroZeroCountDown = n; zeroZeroCountDown > 0; zeroZeroCountDown--) {
                if (zeroZeroCountDown <= block) {
                    squaredArray[index] = zeroZeroCountDown;
                } else {
                    squaredArray[index] = 0;
                }
                index++;
            }
        }
        return squaredArray;
    }

//    Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the
//    grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
//    seriesUp(3) → [1, 1, 2, 1, 2, 3]
//    seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
//    seriesUp(2) → [1, 1, 2]

    public int[] seriesUp(int n) {
        int[] newArray = new int[n*(n+1)/2];
        int index = 0;

        for (int block = 1; block <= n; block++) {
            for (int i = 1; i <= block; i++) {
                newArray[index] = i;
                index++;
            }
        }
        return newArray;
    }




}
