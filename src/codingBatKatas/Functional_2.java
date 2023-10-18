package codingBatKatas;

import java.util.List;

public class Functional_2 {

//    Given a list of integers, return a list of the integers, omitting any that are less than 0.
//    noNeg([1, -2]) → [1]
//    noNeg([-3, -3, 3, 3]) → [3, 3]
//    noNeg([-1, -1, -1]) → []

    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }

//    Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9.
//    (Note: % by 10)
//    no9([1, 2, 19]) → [1, 2]
//    no9([9, 19, 29, 3]) → [3]
//    no9([1, 2, 3]) → [1, 2, 3]

    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> n % 10 == 9);
        return nums;
    }

//    Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
//    noTeen([12, 13, 19, 20]) → [12, 20]
//    noTeen([1, 14, 1]) → [1, 1]
//    noTeen([15]) → []

    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n >= 13 && n <= 19);
        return nums;
    }

//    Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the
//    str.contains(x) method returns a boolean)
//    noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
//    noZ(["hziz", "hzello", "hi"]) → ["hi"]
//    noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]

    public List<String> noZ(List<String> strings) {
        strings.removeIf(s -> s.contains("z"));
        return strings;
    }

//    Given a list of strings, return a list of the strings, omitting any string length 4 or more.
//    noLong(["this", "not", "too", "long"]) → ["not", "too"]
//    noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
//    noLong(["cccc", "cccc", "cccc"]) → []

    public List<String> noLong(List<String> strings) {
        strings.removeIf(s -> s.length() >= 4);
        return strings;
    }

//    Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
//    no34(["a", "bb", "ccc"]) → ["a", "bb"]
//    no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
//    no34(["ccc", "dddd", "apple"]) → ["apple"]

    public List<String> no34(List<String> strings) {
        strings.removeIf(s -> s.length() == 3 || s.length() == 4 );
        return strings;
    }







}
