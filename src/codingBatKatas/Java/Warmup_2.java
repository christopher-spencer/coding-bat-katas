package codingBatKatas.Java;

public class Warmup_2 {

//    Given a non-empty string and an int N, return the string made starting with char 0,
//    and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
//
//    everyNth("Miracle", 2) → "Mrce"
//    everyNth("abcdefg", 2) → "aceg"
//    everyNth("abcdefg", 3) → "adg"

    public String everyNth(String str, int n) {

        String newString = "";

        for(int i = 0; i < str.length(); i+= n ) {

            newString += str.charAt(i);
        }

        return newString;
    }

//    Given a string and a non-negative int n, return a larger string that is n copies of the original string.
//    stringTimes("Hi", 2) → "HiHi"
//    stringTimes("Hi", 3) → "HiHiHi"
//    stringTimes("Hi", 1) → "Hi"

    public String stringTimes(String str, int n) {

        String newString = "";

        for (int i = 0; i < n; i++) {
            newString += str;
        }

        return newString;
    }


//    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever
//    is there if the string is less than length 3. Return n copies of the front;
//    frontTimes("Chocolate", 2) → "ChoCho"
//    frontTimes("Chocolate", 3) → "ChoChoCho"
//    frontTimes("Abc", 3) → "AbcAbcAbc"

    public String frontTimes(String str, int n) {

        String newString = "";

        for (int i = 0; i < n; i++) {

            if (str.length() < 3 ) {
                newString += str;
            } else {
                newString += str.substring(0,3);
            }
        }
        return newString;
    }

//    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
//    countXX("abcxx") → 1
//    countXX("xxx") → 2
//    countXX("xxxx") → 3

    int countXX(String str) {

        int counter = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i,i+2).equals("xx") ) {
                counter++;
            }
        }
        return counter;
    }

//    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
//    doubleX("axxbb") → true
//    doubleX("axaxax") → false
//    doubleX("xxxxx") → true

    boolean doubleX(String str) {

        boolean xX = false;

        for(int i = 0; i < str.length() - 1; i++) {

            if (str.substring(i, i+1).equals("x") ) {
                if (str.substring(i+1,i+2).equals("x")) {
                    xX = true;
                } else {
                    break;
                }
            }

        }
        return xX;
    }

//    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
//    stringBits("Hello") → "Hlo"
//    stringBits("Hi") → "H"
//    stringBits("Heeololeo") → "Hello"


    public String stringBits(String str) {

        String newString = "";

        for(int i = 0; i < str.length(); i+= 2 ) {
            newString += str.substring(i, i+1);
        }

        return newString;

    }

//    Given a non-empty string like "Code" return a string like "CCoCodCode".
//    stringSplosion("Code") → "CCoCodCode"
//    stringSplosion("abc") → "aababc"
//    stringSplosion("ab") → "aab"

    public String stringSplosion(String str) {

        String newString = "";

        for(int i = 0; i < str.length(); i++) {
            newString = newString + str.substring(0,i+1);
        }
        return newString;
    }

//    Given a string, return the count of the number of times that a substring length 2 appears in the string
//    and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
//    last2("hixxhi") → 1
//    last2("xaxxaxaxx") → 1
//    last2("axxxaaxx") → 2

    public int last2(String str) {

        if (str.length() < 2 ) {
            return 0;
        }

        int counter = 0;
        String lastTwo = str.substring(str.length() - 2);

        for(int i = 0; i < str.length() - 2; i++) {

            if( str.substring(i,i+2).equals(lastTwo) ) {
                counter++;
            }

        }
        return counter;
    }

//    Given an array of ints, return the number of 9's in the array.
//    arrayCount9([1, 2, 9]) → 1
//    arrayCount9([1, 9, 9]) → 2
//    arrayCount9([1, 9, 9, 3, 9]) → 3

    public int arrayCount9(int[] nums) {

        int counter = 0;

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                counter++;
            }
        }
        return counter;
    }

//    Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length
//    may be less than 4.
//    arrayFront9([1, 2, 9, 3, 4]) → true
//    arrayFront9([1, 2, 3, 4, 9]) → false
//    arrayFront9([1, 2, 3, 4, 5]) → false

    public boolean arrayFront9(int[] nums) {

        int arraySize = Math.min(nums.length, 4);


        for(int i = 0; i < arraySize; i++) {
            if (nums[i] == 9 ) {
                return true;
            }
        }
        return false;
    }

//    Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
//    array123([1, 1, 2, 3, 1]) → true
//    array123([1, 1, 2, 4, 1]) → false
//    array123([1, 1, 2, 1, 2, 3]) → true

    public boolean array123(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i+1] == 2 && nums [i+2] == 3) {
                return true;
            }
        }
        return false;
    }

//    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
//    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both
//    strings.
//    stringMatch("xxcaazz", "xxbaaz") → 3
//    stringMatch("abc", "abc") → 2
//    stringMatch("abc", "axc") → 0

    public int stringMatch(String a, String b) {

        int counter = 0;

        int smallestStr = Math.min(a.length(),b.length() );

        for (int i = 0; i < smallestStr - 1; i++) {
            if (a.substring(i,i+2).equals(b.substring(i,i+2)) ) {
                counter++;
            }
        }
        return counter;
    }

//    Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end
//    should not be removed.
//    stringX("xxHxix") → "xHix"
//    stringX("abxxxcd") → "abcd"
//    stringX("xabxxxcdx") → "xabcdx"

    public String stringX(String str) {

        if (str.length() < 1 ) {
            return "";
        }

        if (str.length() < 2 && str.equals("x") ) {
            return "x";
        }

        String noX = "";

        if (str.substring(0,1).equals("x") ) {
            noX += "x";
        }

        for (int i = 0; i < str.length(); i++) {
            if (!str.substring(i, i+1).equals("x") ) {
                noX += str.substring(i, i+1);
            }
        }

        if (str.substring(str.length() -1).equals("x") ) {
            noX += "x";
        }
        return noX;
    }

//    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
//     altPairs("kitten") → "kien"
//    altPairs("Chocolate") → "Chole"
//    altPairs("CodingHorror") → "Congrr"

    public String altPairs(String str) {

        String newString = "";

        if (str.length() < 2) {
            return str;
        }

        newString = str.substring(0,2);

        if (str.length() > 5) {
            newString += str.substring(4,6);
        }

        if (str.length() == 9) {
            newString += str.substring(8,9);
        }

        if (str.length() > 9 ) {
            newString += str.substring(8,10);
        }

        if (str.length() > 12 ) {
            newString += str.substring(12,14);
        }
        return newString;
    }

//    Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a"
//    can be any char. The "yak" strings will not overlap.
//    stringYak("yakpak") → "pak"
//    stringYak("pakyak") → "pak"
//    stringYak("yak123ya") → "123ya"

    public String stringYak(String str) {

        String noYak = "";

        for (int i = 0; i < str.length()-2; i++) {
            if (!str.substring(i,i+3).equals("yak") ) {
                noYak += str.substring(i,i+1);
            } else {
                i += 2;
            }
        }

        if (!str.substring(str.length() - 3,str.length() - 2).equals("y") ) {
            noYak += str.substring(str.length() - 2);
        }
        return noYak;
    }

//    Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count
//    instances where the second "6" is actually a 7.
//    array667([6, 6, 2]) → 1
//    array667([6, 6, 2, 6]) → 1
//    array667([6, 7, 2, 6]) → 1

    public int array667(int[] nums) {

        int counter = 0;

        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == 6) {
                if (nums[i+1] == 6 || nums[i+1] == 7) {
                    counter++;
                }
            }
        }
        return counter;
    }

//    Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if
//    the array does not contain any triples.
//    noTriples([1, 1, 2, 2, 1]) → true
//    noTriples([1, 1, 2, 2, 2, 1]) → false
//    noTriples([1, 1, 1, 2, 2, 2, 1]) → false

    public boolean noTriples(int[] nums) {

        for (int i = 0; i < nums.length-2; i++) {
            if ( (nums[i] == nums[i+1]) && (nums[i+1] == nums[i+2]) ) {
                return false;
            }
        }
        return true;
    }

//    Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5,
//    followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
//    has271([1, 2, 7, 1]) → true
//    has271([1, 2, 8, 1]) → false
//    has271([2, 7, 1]) → true

    public boolean has271(int[] nums) {

        for (int i = 0; i < nums.length-2; i++) {
            if ((nums[i+1] == nums[i] + 5) && ((nums[i+2] == nums[i] - 1) || (nums[i+2] == nums[i] - 2) || (nums[i+2] == nums[i] - 3) || (nums[i+2] == nums[i] + 1))) {
                return true;
            }
        }
        return false;
    }
}
