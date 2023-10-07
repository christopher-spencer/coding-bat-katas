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

//    Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
//    bobThere("abcbob") → true
//    bobThere("b9b") → true
//    bobThere("bac") → false

    public boolean bobThere(String str) {

        for (int i = 0; i < str.length()-2;i++) {
            if (str.substring(i,i+1).equals("b") && str.substring(i+2,i+3).equals("b") ) {
                return true;
            }
        }
        return false;
    }

//    We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char
//    somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
//    xyBalance("aaxbby") → true
//    xyBalance("aaxbb") → false
//    xyBalance("yaaxbb") → false

    public boolean xyBalance(String str) {

        //If lastX and/or lastY == -1 after for loop, there are no 'x' and/or 'y' characters in str
        int lastX = -1;
        int lastY = -1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                lastX = i;
            } else if (str.charAt(i) == 'y') {
                lastY = i;
            }
        }
        return lastX <= lastY;
    }

//    Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char
//    of a, the second char of b, and so on. Any leftover chars go at the end of the result.
//    mixString("abc", "xyz") → "axbycz"
//    mixString("Hi", "There") → "HTihere"
//    mixString("xxxx", "There") → "xTxhxexre"

    public String mixString(String a, String b) {
        String newString = "";
        int smallest = Math.min(a.length(),b.length());

        if (a.equals("")) {
            return b;
        } else if (b.equals("")) {
            return a;
        }

        for (int i = 0; i < smallest; i++) {
            newString+= a.substring(i,i+1);
            newString+= b.substring(i,i+1);
        }

        if (a.length() == smallest) {
            newString += b.substring(smallest);
        } else if (b.length() == smallest) {
            newString += a.substring(smallest);
        }
        return newString;
    }

//    Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may
//    assume that n is between 0 and the length of the string, inclusive.
//    repeatEnd("Hello", 3) → "llollollo"
//    repeatEnd("Hello", 2) → "lolo"
//    repeatEnd("Hello", 1) → "o"

    public String repeatEnd(String str, int n) {
        String newString = "";

        for (int i = 0; i < n; i++) {
            newString += str.substring(str.length()-n);
        }
        return newString;
    }

//    Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1
//    characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive
//    (i.e. n >= 0 and n <= str.length()).
//    repeatFront("Chocolate", 4) → "ChocChoChC"
//    repeatFront("Chocolate", 3) → "ChoChC"
//    repeatFront("Ice Cream", 2) → "IcI"

    public String repeatFront(String str, int n) {
        String newString = "";
        int countDown = n;

        for (int i = 0; i < n; i++) {
            newString += str.substring(0,countDown);
            countDown--;
        }
        return newString;
    }

//    Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated
//    by the separator string.
//    repeatSeparator("Word", "X", 3) → "WordXWordXWord"
//    repeatSeparator("This", "And", 2) → "ThisAndThis"
//    repeatSeparator("This", "And", 1) → "This"

    public String repeatSeparator(String word, String sep, int count) {
        String newString = "";
        int countDown = count;

        for (int i = 0; i < count; i ++) {
            newString += word;
            countDown--;
            if (countDown > 0) {
                newString += sep;
            }
        }
        return newString;
    }

//    Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear
//    somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
//    prefixAgain("abXYabc", 1) → true
//    prefixAgain("abXYabc", 2) → true
//    prefixAgain("abXYabc", 3) → false

    public boolean prefixAgain(String str, int n) {
        boolean isTwice = false;

        if (str.substring(n).contains(str.substring(0,n))) {
            isTwice = true;
        }
        return isTwice;
    }















}
