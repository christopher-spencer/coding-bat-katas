package codingBatKatas;

import java.util.ArrayList;
import java.util.List;

public class AP_1 {

//    Given an array of scores, return true if each score is equal or greater than the one before. The array will be
//    length 2 or more.
//    scoresIncreasing([1, 3, 4]) → true
//    scoresIncreasing([1, 3, 2]) → false
//    scoresIncreasing([1, 1, 4]) → true

    public boolean scoresIncreasing(int[] scores) {

        for (int i = 1; i < scores.length; i++) {
            if (scores[i-1] > scores[i]) {
                return false;
            }
        }
        return true;
    }

//    Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length
//    will be at least 2.
//    scores100([1, 100, 100]) → true
//    scores100([1, 100, 99, 100]) → false
//    scores100([100, 1, 100, 100]) → true

    public boolean scores100(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i-1] == 100 && scores[i] == 100) {
                return true;
            }
        }
        return false;
    }

//    Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ
//    from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
//    scoresClump([3, 4, 5]) → true
//    scoresClump([3, 4, 6]) → false
//    scoresClump([1, 3, 5, 5]) → true

    public boolean scoresClump(int[] scores) {
        for (int i = 2; i < scores.length; i++) {
            if (scores[i] - scores[i - 2] <= 2) {
                return true;
            }
        }
        return false;
    }

//    Given an array of scores, compute the int average of the first half and the second half, and return whichever is larger.
//    We'll say that the second half begins at index length/2. The array length will be at least 2. To practice decomposition,
//    write a separate helper method int average(int[] scores, int start, int end) { which computes the average of the elements
//    between indexes start..end. Call your helper method twice to implement scoresAverage(). Write your helper method after
//    your scoresAverage() method in the JavaBat text area. Normally you would compute averages with doubles, but here we use
//    ints so the expected results are exact.
//    scoresAverage([2, 2, 4, 4]) → 4
//    scoresAverage([4, 4, 4, 2, 2, 2]) → 4
//    scoresAverage([3, 4, 5, 1, 2, 3]) → 4

    public int scoresAverage(int[] scores) {
        int secondHalf = scores.length / 2;
        int beginAverage = average(scores, 0, secondHalf - 1);
        int endAverage = average(scores, secondHalf, scores.length - 1);
        int largestAverage = Math.max(beginAverage, endAverage);

        return largestAverage;
    }

    public int average(int[] scores, int start, int end) {
        int totalIndexes = end - start + 1;
        int sum = 0;
        int average = 0;

        for (int i = start; i <= end; i++) {
            sum += scores[i];
        }

        average = sum / totalIndexes;
        return average;
    }

//    Given an array of strings, return the count of the number of strings with the given length.
//    wordsCount(["a", "bb", "b", "ccc"], 1) → 2
//    wordsCount(["a", "bb", "b", "ccc"], 3) → 1
//    wordsCount(["a", "bb", "b", "ccc"], 4) → 0

    public int wordsCount(String[] words, int len) {
        int counter = 0;

        for (String word : words) {
            if (word.length() == len) {
                counter++;
            }
        }
        return counter;
    }

//    Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.
//    wordsFront(["a", "b", "c", "d"], 1) → ["a"]
//    wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
//    wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]

    public String[] wordsFront(String[] words, int n) {
        String[] newString = new String[n];

        for (int i = 0; i < newString.length; i++) {
            newString[i] = words[i];
        }
        return newString;
    }

//    Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted.
//    See wordsWithout() below which is more difficult because it uses arrays.
//    wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
//    wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
//    wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]

    public List wordsWithoutList(String[] words, int len) {
        List<String> newStrings = new ArrayList<String>();

        for (String word : words) {
            if (word.length() != len) {
                newStrings.add(word);
            }
        }
        return newStrings;
    }










}
