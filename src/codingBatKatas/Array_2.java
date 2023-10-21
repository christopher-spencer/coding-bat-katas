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

//    Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the
//        next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
//    sum67([1, 2, 2]) → 5
//    sum67([1, 2, 2, 6, 99, 99, 7]) → 5
//    sum67([1, 1, 6, 7, 2]) → 4

    public int sum67(int[] nums) {
        int sum = 0;
        boolean between6and7 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                between6and7 = true;
            } else if (between6and7 && nums[i] == 7) {
                between6and7 = false;
            } else if (!between6and7) {
                sum += nums[i];
            }
        }
        return sum;
    }

//    Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
//    has22([1, 2, 2]) → true
//    has22([1, 2, 1, 2]) → false
//    has22([2, 1, 2]) → false

    public boolean has22(int[] nums) {

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 2 && nums[i+1] == 2) {
                return true;
            }
        }
        return false;
    }

//    Given an array of ints, return true if the array contains no 1's and no 3's.
//    lucky13([0, 2, 4]) → true
//    lucky13([1, 2, 3]) → false
//    lucky13([1, 2, 4]) → false

    public boolean lucky13(int[] nums) {
        boolean isNo13 = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                isNo13 = false;
            }
        }
        return isNo13;
    }

//    Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
//    sum28([2, 3, 2, 2, 4, 2]) → true
//    sum28([2, 3, 2, 2, 4, 2, 2]) → false
//    sum28([1, 2, 3, 4]) → false

    public boolean sum28(int[] nums) {
        int counterOf2s = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                counterOf2s+= 2;
            }
        }
        return counterOf2s == 8;
    }

//    Given an array of ints, return true if the number of 1's is greater than the number of 4's
//    more14([1, 4, 1]) → true
//    more14([1, 4, 1, 4]) → false
//    more14([1, 1]) → true

    public boolean more14(int[] nums) {
        int count4s = 0;
        int count1s = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                count4s++;
            }
            if (nums[i] == 1) {
                count1s++;
            }
        }
        return count4s < count1s;
    }

//    Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. The given
//    n may be 0, in which case just return a length 0 array. You do not need a separate if-statement for the length-0 case;
//    the for-loop should naturally execute 0 times in that case, so it just works. The syntax to make a new int array is:
//        new int[desired_length]   (See also: FizzBuzz Code)
//    fizzArray(4) → [0, 1, 2, 3]
//    fizzArray(1) → [0]
//    fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

    public int[] fizzArray(int n) {
        int[] nLength = new int[n];
        int counter = 0;

        for (int i = 0; i < n; i++) {
            nLength[i] = counter;
            counter++;
        }
        return nLength;
    }

//    Given an array of ints, return true if every element is a 1 or a 4.
//    only14([1, 4, 1, 4]) → true
//    only14([1, 4, 2, 4]) → false
//    only14([1, 1]) → true

    public boolean only14(int[] nums) {
        boolean all41 = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                all41 = false;
                break;
            }
        }
        return all41;
    }

//    Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through
//    n-1. N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String form of
//    most types. The syntax to make a new string array is: new String[desired_length]  (See also: FizzBuzz Code)
//    fizzArray2(4) → ["0", "1", "2", "3"]
//    fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
//    fizzArray2(2) → ["0", "1"]

    public String[] fizzArray2(int n) {
        String[] newString = new String[n];
        int indexCounter = 0;

        for (int i = 0; i < n; i++) {
            newString[i] = String.valueOf(indexCounter);
            indexCounter++;
        }
        return newString;
    }

//    Given an array of ints, return true if it contains no 1's or it contains no 4's.
//    no14([1, 2, 3]) → true
//    no14([1, 2, 3, 4]) → false
//    no14([2, 3, 4]) → true

    public boolean no14(int[] nums) {
        boolean no1s = true;
        boolean no4s = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                no1s = false;
            }
            if (nums[i] == 4) {
                no4s = false;
            }
        }
        return no1s || no4s;
    }

//    We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one
//    of the pair is that value. Return true if the given value is everywhere in the array.
//    isEverywhere([1, 2, 1, 3], 1) → true
//    isEverywhere([1, 2, 1, 3], 2) → false
//    isEverywhere([1, 2, 1, 3, 4], 1) → false

    public boolean isEverywhere(int[] nums, int val) {
        boolean isEverywhere = true;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != val && nums[i+1] != val) {
                isEverywhere = false;
            }
        }
        return isEverywhere;
    }









}