package codingBatKatas.Java;

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

//    We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the
//    given string. The triples may overlap.
//    countTriple("abcXXXabc") → 1
//    countTriple("xxxabyyyycd") → 3
//    countTriple("a") → 0

    public int countTriple(String str) {
        int tripleCounter = 0;

        if (str.length() < 3) {
            return tripleCounter;
        }

        for (int i = 1; i < str.length()-1;i++) {
            if (str.substring(i-1,i).equals(str.substring(i,i+1)) && str.substring(i,i+1).equals(str.substring(i+1,i+2)) ) {
                tripleCounter++;
            }
        }
        return tripleCounter;
    }

//    Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0
//            if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0',
//        '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
//    sumDigits("aa1bc2d3") → 6
//    sumDigits("aa11b33") → 8
//    sumDigits("Chocolate") → 0

    public int sumDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length();i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(str.substring(i,i+1));
            }
        }
        return sum;
    }

//    Given a string, return the longest substring that appears at both the beginning and end of the string without
//    overlapping. For example, sameEnds("abXab") is "ab".
//    sameEnds("abXYab") → "ab"
//    sameEnds("xx") → "x"
//    sameEnds("xxx") → "x"

    public String sameEnds(String string) {
        String newString = "";

        for (int i = 1; i <= string.length()/2; i++) {
            String beginning = string.substring(0,i);
            String end = string.substring(string.length()-i);

            if (beginning.equals(end)) {
                newString = beginning;
            }
        }
        return newString;
    }

//    Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In
//    other words, zero or more characters at the very begining of the given string, and at the very end of the string in
//    reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
//    mirrorEnds("abXYZba") → "ab"
//    mirrorEnds("abca") → "a"
//    mirrorEnds("aba") → "aba"

    public String mirrorEnds(String string) {
        String newString = "";

        for (int i = 1; i <= string.length(); i++) {
            String beginning = string.substring(0, i);
            String end = string.substring(string.length() - i);
            String reverseEnd = "";

            for (int j = end.length() - 1; j >= 0; j--) {
                reverseEnd += end.substring(j, j + 1);
            }

            if (beginning.equals(reverseEnd)) {
                newString = beginning;
            }
        }
        return newString;
    }

//    Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
//    maxBlock("hoopla") → 2
//    maxBlock("abbCCCddBBBxx") → 3
//    maxBlock("") → 0

    public int maxBlock(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        int largest = 0;
        int currentLetterSnake = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentLetterSnake++;
            } else {
                if (currentLetterSnake > largest) {
                    largest = currentLetterSnake;
                }
                currentLetterSnake = 1;
            }
        }

        if (currentLetterSnake > largest) {
            largest = currentLetterSnake;
        }
        return largest;
    }

//    Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is
//    a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0',
//        '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
//    sumNumbers("abc123xyz") → 123
//    sumNumbers("aa11b33") → 44
//    sumNumbers("7 11") → 18

    public int sumNumbers(String str) {
        int sum = 0;
        String numString = "";

        for (int i = 0; i < str.length();i++) {
            if (Character.isDigit(str.charAt(i) ) ) {
                numString += str.substring(i,i+1);
            } else {
                if ( !numString.isEmpty() ) {
                    sum += Integer.parseInt(numString);
                }
                numString = "";
            }
        }

        if (!numString.isEmpty()) {
            sum += Integer.parseInt(numString);
        }

        return sum;
    }

//    Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
//    The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does
//    not count. (Note: Character.isLetter(char) tests if a char is a letter.)
//    notReplace("is test") → "is not test"
//    notReplace("is-is") → "is not-is not"
//    notReplace("This is right") → "This is not right"

    public String notReplace(String str) {
        String newString = "";

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) {
                if ((i == 0 || !Character.isLetter(str.charAt(i - 1))) && (i + 2 == str.length() || !Character.isLetter(str.charAt(i + 2)))) {
                    newString += "is not";
                    i++;
                } else {
                    newString += str.charAt(i);
                }
            } else {
                newString += str.charAt(i);
            }
        }
        return newString;
    }

}
