package codingBatKatas;

import java.util.List;

public class Functional_1 {


//    Given a list of integers, return a list where each integer is multiplied by 2.
//    doubling([1, 2, 3]) → [2, 4, 6]
//    doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
//    doubling([]) → []

    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

//    Given a list of integers, return a list where each integer is multiplied with itself.
//    square([1, 2, 3]) → [1, 4, 9]
//    square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
//    square([]) → []

    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }

//    Given a list of strings, return a list where each string has "*" added at its end.
//    addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
//    addStar(["hello", "there"]) → ["hello*", "there*"]
//    addStar(["*"]) → ["**"]

    public List<String> addStar(List<String> strings) {
        strings.replaceAll(s -> s+= "*");
        return strings;
    }

//    Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
//    copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
//    copies3(["24", "a", ""]) → ["242424", "aaa", ""]
//    copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]

    public List<String> copies3(List<String> strings) {
        strings.replaceAll(s -> s = s + s + s);
        return strings;
    }













}
