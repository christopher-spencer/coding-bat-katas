package codingBatKatas;

public class String_3 {

//    Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
//    but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an
//    alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
//    countYZ("fez day") → 2
//    countYZ("day fez") → 2
//    countYZ("day fyyyz") → 2
public int countYZ(String str) {
    int wordsIndex = 0;
    int counter = 0;
    String[] words = new String[str.length()];
    String word = "";

    for (int i = 0; i < str.length(); i++) {
        char letter = str.charAt(i);

        if (Character.isLetter(letter)) {
            word += letter;
        } else {
            words[wordsIndex] = word;
            wordsIndex++;
            word = "";
        }
    }

    if (!word.isEmpty()) {
        words[wordsIndex] = word;
        wordsIndex++;
    }

    for (int j = 0; j < wordsIndex; j++) {
        String lowercaseWord = words[j].toLowerCase();
        if (lowercaseWord.endsWith("y") || lowercaseWord.endsWith("z")) {
            counter++;
        }
    }
    return counter;
}

//    Given two strings, base and remove, return a version of the base string where all instances of the remove string have
//    been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping
//    instances, so with "xxx" removing "xx" leaves "x".
//    withoutString("Hello there", "llo") → "He there"
//    withoutString("Hello there", "e") → "Hllo thr"
//    withoutString("Hello there", "x") → "Hello there"

    public String withoutString(String base, String remove) {
        String newString = "";
        int i = 0;
        int baseLength = base.length();
        int removeLength = remove.length();

        while (i < baseLength) {
            // Find the next occurrence of 'remove' in 'base' (case-insensitive)
            int removeIndex = base.toLowerCase().indexOf(remove.toLowerCase(), i);

            if (removeIndex == -1) {
                // No more occurrences found, copy the remaining characters
                newString += base.substring(i);
                break;
            } else {
                // Append characters from 'i' to 'index' in 'base' to 'result'
                newString += base.substring(i, removeIndex);
                // Move 'i' past the matched part
                i = removeIndex + removeLength;
            }
        }
        return newString;
    }

//    Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of
//    appearances of "not" anywhere in the string (case sensitive).
//    equalIsNot("This is not") → false
//    equalIsNot("This is notnot") → true
//    equalIsNot("noisxxnotyynotxisi") → true

    public boolean equalIsNot(String str) {
        int counterIs = 0;
        int counterNot = 0;

        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i,i+3).equals("not")) {
                counterNot++;
            }
        }

        for (int j = 0; j < str.length()-1; j++) {
            if (str.substring(j,j+2).equals("is")) {
                counterIs++;
            }
        }
        return counterIs == counterNot;
    }

//    We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
//    Return true if all the g's in the given string are happy.
//    gHappy("xxggxx") → true
//    gHappy("xxgxx") → false
//    gHappy("xxggyygxx") → false

    public boolean gHappy(String str) {
        if (str.equals("")) {
            return true;
        }
        if (str.length() < 2) {
            return false;
        }

        if (str.substring(str.length()-1).equals("g") && !str.substring(str.length()-2,str.length()-1).equals("g")) {
            return false;
        }

        for (int i = 1; i < str.length()-1; i++) {
            if (str.substring(i,i+1).equals("g") && !str.substring(i-1,i).equals("g") && !str.substring(i+1,i+2).equals("g")) {
                return false;
            }
        }
        return true;
    }















}
