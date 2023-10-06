package codingBatKatas;

public class String_2 {

//    Given a string, return a string where for every char in the original, there are two chars.
//    doubleChar("The") → "TThhee"
//    doubleChar("AAbb") → "AAAAbbbb"
//    doubleChar("Hi-There") → "HHii--TThheerree"

    public String doubleChar(String str) {
        String newString = "";

        for (int i = 0; i < str.length(); i++) {
            newString += str.substring(i,i+1) + str.substring(i,i+1);
        }

        return newString;
    }

//    Return the number of times that the string "hi" appears anywhere in the given string.
//    countHi("abc hi ho") → 1
//    countHi("ABChi hi") → 2
//    countHi("hihi") → 2

    public int countHi(String str) {
        int counter = 0;

        for (int i = 0; i < str.length()-1; i++) {
            if ( str.substring(i,i+2).equals("hi") ) {
                counter++;
            }
        }
        return counter;
    }

//    Return true if the string "cat" and "dog" appear the same number of times in the given string.
//    catDog("catdog") → true
//    catDog("catcat") → false
//    catDog("1cat1cadodog") → true

    public boolean catDog(String str) {
        int catCounter = 0;
        int dogCounter = 0;

        for (int i = 0; i < str.length()-2;i++) {
            if ( str.substring(i,i+3).equals("dog") ) {
                dogCounter++;
            }
            if ( str.substring(i,i+3).equals("cat") ) {
                catCounter++;
            }
        }
        return catCounter == dogCounter;
    }

//    Return the number of times that the string "code" appears anywhere in the given string, except we'll
//    accept any letter for the 'd', so "cope" and "cooe" count.
//    countCode("aaacodebbb") → 1
//    countCode("codexxcode") → 2
//    countCode("cozexxcope") → 2

    public int countCode(String str) {
        int counter = 0;

        for (int i = 0; i < str.length()-3;i++) {
            if (str.substring(i,i+2).equals("co") && str.substring(i+3,i+4).equals("e") ) {
                counter++;
            }
        }
        return counter;
    }

//    Given two strings, return true if either of the strings appears at the very end of the other string,
//    ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
//    Note: str.toLowerCase() returns the lowercase version of a string.
//    endOther("Hiabc", "abc") → true
//    endOther("AbC", "HiaBc") → true
//    endOther("abc", "abXabc") → true

    public boolean endOther(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.endsWith(b) || b.endsWith(a)) {
            return true;
        }

        return false;
    }

//    Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded
//    by a period (.). So "xxyz" counts but "x.xyz" does not.
//    xyzThere("abcxyz") → true
//    xyzThere("abc.xyz") → false
//    xyzThere("xyz.abc") → true

    public boolean xyzThere(String str) {

        if (str.length() >= 3) {
            if (str.substring(0,3).equals("xyz") ) {
                return true;
            }
        }

        for (int i = 1; i < str.length()-3;i++) {
            if ( !(str.substring(i,i+1).equals(".")) && str.substring(i+1,i+4).equals("xyz")) {
                return true;
            }
        }
        return false;
    }












}
