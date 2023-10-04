import java.util.HashMap;
import java.util.Map;

public class codingBatKatas {

/*    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true*/

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday != true || vacation == true) {
            return true;
        }
        return false;
    }

  /*  We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
  We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false*/

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile != bSmile) {
            return false;
        }
        return true;
    }


  /*  Given two int values, return their sum. Unless the two values are the same, then return double their sum.
    sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8*/

    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        }
        return a + b;
    }

  /*  Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0*/

    public int diff21(int n) {
        if (n > 21) {
            return Math.abs((21 - n) * 2);
        }
        return Math.abs(21 - n);
    }


   /* We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble
   if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

    parrotTrouble(true, 6) → true
    parrotTrouble(true, 7) → false
    parrotTrouble(false, 6) → false*/

    public boolean parrotTrouble(boolean talking, int hour) {
        if ((hour < 7 && talking == true) || (hour > 20 && talking == true)) {
            return true;
        }
        return false;
    }

/*    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    makes10(9, 10) → true
    makes10(9, 9) → false
    makes10(1, 9) → true*/

    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        }
        return false;
    }

 /*   Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
    nearHundred(93) → true
    nearHundred(90) → true
    nearHundred(89) → false*/

    public boolean nearHundred(int n) {
        if (n >= 90 && n <= 110) {
            return true;
        }
        if (n >= 190 && n <= 210) {
            return true;
        }
        return false;
    }

   /* Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

    posNeg(1, -1, false) → true
    posNeg(-1, 1, false) → true
    posNeg(-4, -5, true) → true*/

    public boolean posNeg(int a, int b, boolean negative) {
        if(a < 0 && negative == false && b > 0 || b < 0 && negative ==false && a > 0) {
            return true;
        }
        if (negative == true && b < 0 && a < 0) {
            return true;
        }
        return false;
    }

/*    Given a string, return a new string where "not " has been added to the front. However, if the string already begins with
 "not", return the string unchanged. Note: use .equals() to compare 2 strings.

    notString("candy") → "not candy"
    notString("x") → "not x"
    notString("not bad") → "not bad"*/

    public String notString(String str) {

        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }

/*    Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string (i.e. n will be in the range
0..str.length()-1 inclusive).
    missingChar("kitten", 1) → "ktten"
    missingChar("kitten", 0) → "itten"
    missingChar("kitten", 4) → "kittn"*/

    public String missingChar(String str, int n) {
        String charLess = "";

        for(int i = 0; i < str.length(); i++) {
            if( i != n ){
                charLess += str.charAt(i);
            }
        }
        return charLess;
    }

 /*   Given a string, return a new string where the first and last chars have been exchanged.

    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"*/

    public String frontBack(String str) {

        if (str.length() <= 1) {

            return str;
        }

        String newString = "";
        String firstChar = str.substring(str.length() - 1);
        String lastChar = str.substring(0,1);
        String middle = str.substring(1, str.length() - 1);

        newString = firstChar + middle + lastChar;

        return newString;
    }

/*    Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
    front3("Java") → "JavJavJav"
    front3("Chocolate") → "ChoChoCho"
    front3("abc") → "abcabcabc"*/

    public String front3(String str) {

        String firstThree = "";

        if (str.length() < 3) {
            return str + str + str;
        }

        firstThree = str.substring(0, 3);

        return firstThree + firstThree + firstThree;
    }

/*    Given a string, take the last char and return a new string with the last char added at the front and back,
so "cat" yields "tcatt". The original string will be length 1 or more.
    backAround("cat") → "tcatt"
    backAround("Hello") → "oHelloo"
    backAround("a") → "aaa"*/

    public String backAround(String str) {

        String newString = str.substring(str.length() - 1);

        return newString + str + newString;
    }

/*    Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod
    or35(3) → true
    or35(10) → true
    or35(8) → false*/

    public boolean or35(int n) {

        if ( n % 5 == 0 || n % 3 == 0) {

            return true;
        }
        return false;
    }

   /* Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
   so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
    front22("kitten") → "kikittenki"
    front22("Ha") → "HaHaHa"
    front22("abc") → "ababcab"*/

    public String front22(String str) {

        String frontEnd = "";

        if (str.length() < 2 ) {

            return str + str + str;

        } else {

            frontEnd = str.substring(0, 2);
        }
        return frontEnd + str + frontEnd;
    }

/*    Given a string, return true if the string starts with "hi" and false otherwise.
    startHi("hi there") → true
    startHi("hi") → true
    startHi("hello hi") → false*/

    public boolean startHi(String str) {


        if (str.length() >= 2) {
            if (str.substring(0,2).equals("hi")) {

                return true;
            }
        }
        return false;
    }

/*    Given two temperatures, return true if one is less than 0 and the other is greater than 100.
    icyHot(120, -1) → true
    icyHot(-1, 120) → true
    icyHot(2, 120) → false*/

    public boolean icyHot(int temp1, int temp2) {

        int lowerTemp = Math.min(temp1, temp2);
        int higherTemp = Math.max(temp1, temp2);

        if ( (lowerTemp < 0) && (higherTemp > 100) ) {

            return true;
        }
        return false;
    }

  /*  Given 2 int values, return true if either of them is in the range 10..20 inclusive.
    in1020(12, 99) → true
    in1020(21, 12) → true
    in1020(8, 99) → false*/

    public boolean in1020(int a, int b) {

        if ( (a >= 10 && a <= 20) || (b >= 10 && b <= 20) ) {

            return true;
        }

        return false;

    }

   /* We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
    hasTeen(13, 20, 10) → true
    hasTeen(20, 19, 10) → true
    hasTeen(20, 10, 13) → true*/

    public boolean hasTeen(int a, int b, int c) {

        if ( (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19) ) {

            return true;
        }
        return false;
    }

    /*We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
    loneTeen(13, 99) → true
    loneTeen(21, 19) → true
    loneTeen(13, 13) → false*/

    public boolean loneTeen(int a, int b) {

        if ( (a >= 13 && a <= 19) && !(b >= 13 && b <= 19) ) {

            return true;
        }

        if ( (b >= 13 && b <= 19) && !(a >= 13 && a <= 19) ) {

            return true;
        }
        return false;
    }

    /*Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

    delDel("adelbc") → "abc"
    delDel("adelHello") → "aHello"
    delDel("adedbc") → "adedbc"*/

    public String delDel(String str) {

        String firstIndex = "";
        String fourthIndex = "";

        if (str.length() < 4) {

            return str;
        }

        if (str.length() >= 4 ) {

            firstIndex = str.substring(0, 1);

            fourthIndex = str.substring(4);

            if (str.substring(1,4).equals("del")) {

                return firstIndex + fourthIndex;
            }
        }
        return str;
    }

/*    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
    mixStart("mix snacks") → true
    mixStart("pix snacks") → true
    mixStart("piz snacks") → false*/

    public boolean mixStart(String str) {
        if ( str.length() < 3 ) {
            return false;
        }
        if (str.substring(1,3).equals("ix") ) {
            return true;
        }
        return false;
    }

  /*  Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
    startOz("ozymandias") → "oz"
    startOz("bzoo") → "z"
    startOz("oxx") → "o"*/

    public String startOz(String str) {
        if (str.length() < 1) {
            return str;
        }
        if (str.length() < 2) {
            return str;
        }
        if (str.substring(0, 2).equals("oz") ) {
            return str.substring(0, 2);
        } else if (str.substring(0,1).equals("o") ) {
            return str.substring(0,1);
        } else if (str.substring(1,2).equals("z") ) {
            return str.substring(1,2);
        }
        return "";
    }

 /*   Given three int values, a b c, return the largest.
    intMax(1, 2, 3) → 3
    intMax(1, 3, 2) → 3
    intMax(3, 2, 1) → 3*/

    public int intMax(int a, int b, int c) {

        int largest = Math.max(Math.max(a,b), c);

        return largest;
    }

  /*  Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

    close10(8, 13) → 8
    close10(13, 8) → 8
    close10(13, 7) → 0*/

    public int close10(int a, int b) {

        if (a == b ) {
            return 0;
        }

        if ( Math.abs(10 - a) == Math.abs(10 - b) ) {
            return 0;
        }

        if ( Math.abs(10 - a) > Math.abs(10 - b) ) {
            return b;
        } else {
            return a;
        }
    }

 /*   Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.

    in3050(30, 31) → true
    in3050(30, 41) → false
    in3050(40, 50) → true*/

    public boolean in3050(int a, int b) {

        if ( (a >= 30 && a <= 40) && (b >= 30 && b <= 40) ) {
            return true;
        } else if ((a >= 40 && a <= 50) && (b >= 40 && b <= 50) ) {
            return true;
        }

        return false;
    }

/*    Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

    max1020(11, 19) → 19
    max1020(19, 11) → 19
    max1020(11, 9) → 11*/

    public int max1020(int a, int b) {


        if ( (a >= 10 && a <= 20) && (b >= 10 && b <= 20) ) {
            return Math.max(a,b);
        } else if (a >= 10 && a <= 20) {
            return a;
        } else if (b >= 10 && b <= 20) {
            return b;
        }

        return 0;
    }

/*    Return true if the given string contains between 1 and 3 'e' chars.

    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false*/

    public boolean stringE(String str) {

        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if ( str.charAt(i) == 'e') {
                counter += 1;
            }
        }

        return counter >= 1 && counter <= 3;
    }

/*    Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

    lastDigit(7, 17) → true
    lastDigit(6, 17) → false
    lastDigit(3, 113) → true*/

    public boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }

/*    Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

    endUp("Hello") → "HeLLO"
    endUp("hi there") → "hi thERE"
    endUp("hi") → "HI"*/

    public String endUp(String str) {

        if (str.length() < 3) {
            return str.toUpperCase();
        }

        String lastThree = str.substring(str.length() - 3 ).toUpperCase();
        String firstSection = str.substring(0, str.length() - 3);

        return firstSection + lastThree;
    }

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

//    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
//    helloName("Bob") → "Hello Bob!"
//    helloName("Alice") → "Hello Alice!"
//    helloName("X") → "Hello X!"
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

//    Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
//    makeAbba("Hi", "Bye") → "HiByeByeHi"
//    makeAbba("Yo", "Alice") → "YoAliceAliceYo"
//    makeAbba("What", "Up") → "WhatUpUpWhat"

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

//    The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag
//    makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around
//    the word, e.g. "<i>Yay</i>".
//    makeTags("i", "Yay") → "<i>Yay</i>"
//    makeTags("i", "Hello") → "<i>Hello</i>"
//    makeTags("cite", "Yay") → "<cite>Yay</cite>"

    public String makeTags(String tag, String word) {

        return "<" + tag + ">" + word + "</" + tag + ">";
    }

//    Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of
//    the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going
//    up to but not including index j.
//    makeOutWord("<<>>", "Yay") → "<<Yay>>"
//    makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
//    makeOutWord("[[]]", "word") → "[[word]]"

    public String makeOutWord(String out, String word) {

        return out.substring(0,2) + word + out.substring(2);
    }

//    Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
//    extraEnd("Hello") → "lololo"
//    extraEnd("ab") → "ababab"
//    extraEnd("Hi") → "HiHiHi"

    public String extraEnd(String str) {
        return str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2);
    }

//    Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is
//    shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
//    Note that str.length() returns the length of a string.
//    firstTwo("Hello") → "He"
//    firstTwo("abcdefg") → "ab"
//    firstTwo("ab") → "ab"

    public String firstTwo(String str) {

        if (str.length() < 2 ) {
            return str;
        }
        return str.substring(0,2);
    }

//    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
//    firstHalf("WooHoo") → "Woo"
//    firstHalf("HelloThere") → "Hello"
//    firstHalf("abcdef") → "abc"

    public String firstHalf(String str) {

        int firstHalf = str.length() / 2;

        return str.substring(0, firstHalf);
    }

//    Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
//    withoutEnd("Hello") → "ell"
//    withoutEnd("java") → "av"
//    withoutEnd("coding") → "odin"

    public String withoutEnd(String str) {

        if (str.length() < 3 ) {
            return "";
        }

        String middle = str.substring(1,str.length()-1);

        return middle;
    }

//    Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside
//    and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
//    comboString("Hello", "hi") → "hiHellohi"
//    comboString("hi", "Hello") → "hiHellohi"
//    comboString("aaa", "b") → "baaab"

    public String comboString(String a, String b) {

        int shortString = Math.min(a.length(),b.length());

        if (a.length() == shortString) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

//    Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
//    nonStart("Hello", "There") → "ellohere"
//    nonStart("java", "code") → "avaode"
//    nonStart("shotl", "java") → "hotlava"

    public String nonStart(String a, String b) {
        String one = a.substring(1);
        String two = b.substring(1);

        return one + two;
    }

//    Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
//    left2("Hello") → "lloHe"
//    left2("java") → "vaja"
//    left2("Hi") → "Hi"

    public String left2(String str) {

        String newEnd = str.substring(0,2);
        String newBeginnings = str.substring(2);

        return newBeginnings + newEnd;
    }

//    Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
//    right2("Hello") → "loHel"
//    right2("java") → "vaja"
//    right2("Hi") → "Hi"

    public String right2(String str) {

        String lastTwo = str.substring(str.length() - 2);

        return lastTwo + str.substring(0,str.length() - 2);
    }

//    Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
//    theEnd("Hello", true) → "H"
//    theEnd("Hello", false) → "o"
//    theEnd("oh", true) → "o"

    public String theEnd(String str, boolean front) {

        if (front == true) {
            return str.substring(0,1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

//    Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
//    withouEnd2("Hello") → "ell"
//    withouEnd2("abc") → "b"
//    withouEnd2("ab") → ""

    public String withouEnd2(String str) {

        if (str.length() < 2 ) {
            return "";
        }

        String middle = str.substring(1,str.length()-1);
        return middle;
    }

//    Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
//    middleTwo("string") → "ri"
//    middleTwo("code") → "od"
//    middleTwo("Practice") → "ct"

    public String middleTwo(String str) {
        int middle = str.length() /2;

        return str.substring(middle -1,middle + 1);
    }

//    Given a string, return true if it ends in "ly".
//    endsLy("oddly") → true
//    endsLy("y") → false
//    endsLy("oddy") → false

    public boolean endsLy(String str) {

        if (str.length() < 2) {
            return false;
        }

        if (str.substring(str.length() - 2).equals("ly") ) {
            return true;
        } else {
            return false;
        }
    }

//    Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
//    nTwice("Hello", 2) → "Helo"
//    nTwice("Chocolate", 3) → "Choate"
//    nTwice("Chocolate", 1) → "Ce"

    public String nTwice(String str, int n) {

        String firstPart = str.substring(0,n);
        String lastPart = str.substring(str.length() - n);

        return firstPart + lastPart;
    }

//    Given a string and an index, return a string length 2 starting at the given index. If the index is too big or
//    too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
//    twoChar("java", 0) → "ja"
//    twoChar("java", 2) → "va"
//    twoChar("java", 3) → "ja"

    public String twoChar(String str, int index) {

        if (index >= str.length() -1 || index < 0) {
            return str.substring(0,2);
        }

        return str.substring(index, index +2);
    }

//    Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
//    middleThree("Candy") → "and"
//    middleThree("and") → "and"
//    middleThree("solving") → "lvi"

    public String middleThree(String str) {

        int middleIndex = str.length()/2;

        return str.substring(middleIndex -1, middleIndex+2);
    }

//    Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or
//    "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
//    hasBad("badxx") → true
//    hasBad("xbadxx") → true
//    hasBad("xxbadxx") → false

    public boolean hasBad(String str) {

        if (str.length() < 3 ) {
            return false;
        }

        if (str.length() == 3 && !(str.substring(0,3).equals("bad")) ) {
            return false;
        }

        if (str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad") ) {
            return true;
        } else {
            return false;
        }
    }

//    Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@'
//    for the missing chars.
//    atFirst("hello") → "he"
//    atFirst("hi") → "hi"
//    atFirst("h") → "h@"

    public String atFirst(String str) {

        if (str.length() == 1) {
            return str + "@";
        } else if (str.length() == 0) {
            return "@@";
        }
        return str.substring(0,2);
    }

//    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and
//    "java" yields "ya". If either string is length 0, use '@' for its missing char.
//    lastChars("last", "chars") → "ls"
//    lastChars("yo", "java") → "ya"
//    lastChars("hi", "") → "h@"

    public String lastChars(String a, String b) {

        if (a.length() == 0) {
            a = "@";
        }

        if (b.length() == 0) {
            b = "@";
        }

        String firstA = a.substring(0,1);
        String lastB = b.substring(b.length() -1 );

        return firstA + lastB;
    }

//    Given two strings, append them together (known as "concatenation") and return the result. However, if the
//    concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
//    conCat("abc", "cat") → "abcat"
//    conCat("dog", "cat") → "dogcat"
//    conCat("abc", "") → "abc"

    public String conCat(String a, String b) {

        if (a.equals("") ) {
            return b;
        }

        if (b.equals("") ) {
            return a;
        }

        if (a.substring(a.length() -1).equals(b.substring(0,1)) ) {
            return a + b.substring(1);
        }
        return a + b;
    }

//    Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding"
//    yields "codign".
//    lastTwo("coding") → "codign"
//    lastTwo("cat") → "cta"
//    lastTwo("ab") → "ba"

    public String lastTwo(String str) {

        if (str.length() < 2) {
            return str;
        }

        String swapOne = str.substring(str.length() -1);
        String swapTwo = str.substring(str.length() -2, str.length() -1);

        return str.substring(0,str.length() -2) + swapOne + swapTwo;
    }

//    Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
//    seeColor("redxx") → "red"
//    seeColor("xxred") → ""
//    seeColor("blueTimes") → "blue"

    public String seeColor(String str) {

        if (str.length() < 4 && !(str.equals("red")) ) {
            return "";
        } else if (str.substring(0,3).equals("red") ) {
            return "red";
        } else if (str.substring(0,4).equals("blue") ) {
            return "blue";
        } else {
            return "";
        }
    }

//    Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
//    frontAgain("edited") → true
//    frontAgain("edit") → false
//    frontAgain("ed") → true

    public boolean frontAgain(String str) {

        if (str.length() < 2) {
            return false;
        }

        if ( str.substring(0,2).equals(str.substring(str.length()-2)) ) {
            return true;
        }
        return false;
    }

//    Given two strings, append them together (known as "concatenation") and return the result. However, if the strings
//    are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello"
//    and "Hi" yield "loHi". The strings may be any length.
//    minCat("Hello", "Hi") → "loHi"
//    minCat("Hello", "java") → "ellojava"
//    minCat("java", "Hello") → "javaello"

    public String minCat(String a, String b) {

        if ( a.length() == b.length() ) {
            return a + b;
        } else if ( a.length() > b.length() ) {
            return a.substring(a.length() - b.length() ) + b;
        } else if ( b.length() > a.length() ) {
            return a + b.substring(b.length() - a.length() );
        } else {
            return "";
        }
    }

//    Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be
//    any length. If there are fewer than 2 chars, use whatever is there.
//    extraFront("Hello") → "HeHeHe"
//    extraFront("ab") → "ababab"
//    extraFront("H") → "HHH"

    public String extraFront(String str) {

        if (str.length() < 2) {
            return str + str + str;
        }

        String newString = str.substring(0,2);

        return newString + newString + newString;
    }

//    Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring
//    at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise,
//    return the original string unchanged.
//    without2("HelloHe") → "lloHe"
//    without2("HelloHi") → "HelloHi"
//    without2("Hi") → ""

    public String without2(String str) {

        if(str.length() < 2) {
            return str;
        }

        if ( str.substring(0,2).equals(str.substring(str.length()-2)) ) {
            return str.substring(2);
        }
        return str;
    }

//    Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the
//    second char if it is 'b'. The string may be any length. Harder than it looks.
//    deFront("Hello") → "llo"
//    deFront("java") → "va"
//    deFront("away") → "aay"

    public String deFront(String str) {

        if ( str.substring(0,1).equals("a") && str.substring(1,2).equals("b") ) {
            return "a" + "b" + str.substring(2);
        } else if ( str.substring(0,1).equals("a") ) {
            return "a" + str.substring(2);
        } else if ( str.substring(1,2).equals("b") ) {
            return "b" + str.substring(2);
        } else {
            return str.substring(2);
        }
    }

//    Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front
//    of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
//    startWord("hippo", "hi") → "hi"
//    startWord("hippo", "xip") → "hip"
//    startWord("hippo", "i") → "h"

    public String startWord(String str, String word) {

        if (str.length() >= word.length()) {

            if (str.substring(1, word.length()).equals(word.substring(1))) {

                return str.substring(0, word.length());
            }
        }
        return "";
    }

//    Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise
//    return the string unchanged.
//    withoutX("xHix") → "Hi"
//    withoutX("xHi") → "Hi"
//    withoutX("Hxix") → "Hxi"

    public String withoutX(String str) {

        if (str.length() < 2) {
            return "";
        }

        if ( str.substring(0,1).equals("x") && str.substring(str.length() -1 ).equals("x") ) {
            return str.substring(1,str.length() -1 );
        } else if (str.substring(0,1).equals("x")) {
            return str.substring(1);
        } else if ( str.substring(str.length() -1 ).equals("x") ) {
            return str.substring(0,str.length() -1 );
        } else {
            return str;
        }
    }

//    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and
//    otherwise return the string unchanged. This is a little harder than it looks.
//    withoutX2("xHi") → "Hi"
//    withoutX2("Hxi") → "Hi"
//    withoutX2("Hi") → "Hi"

    public String withoutX2(String str) {

        if (str.length() < 2) {
            return "";
        }

        if ( str.substring(0,1).equals("x") && str.substring(1,2).equals("x") ) {
            return str.substring(2);
        } else if ( str.substring(0,1).equals("x") ) {
            return str.substring(1);
        } else if ( str.substring(1,2).equals("x") ) {
            return str.substring(0,1) + str.substring(2);
        } else {
            return str;
        }
    }

//    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and
//    set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty
//    string.
//    mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
//    mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
//    mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}

    public Map<String, String> mapBully(Map<String, String> map) {

        if ( map.containsKey("a") ) {
            map.put("b", map.get("a") );
            map.put("a", "");
        }
        return map;
    }

//    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
//    In all cases remove the key "c", leaving the rest of the map unchanged.
//    mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
//    mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
//    mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}

    public Map<String, String> mapShare(Map<String, String> map) {

        if (map.containsKey("a") ) {
            map.put("b", map.get("a"));
        }

        map.remove("c");

        return map;
    }

//    Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
//    If both keys are present, append their 2 string values together and store the result under the key "ab".
//    mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
//    mapAB({"a": "Hi"}) → {"a": "Hi"}
//    mapAB({"b": "There"}) → {"b": "There"}

    public Map<String, String> mapAB(Map<String, String> map) {

        if ( map.containsKey("a") && map.containsKey("b") ) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

//    Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is
//    present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
//    topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
//    topping1({}) → {"bread": "butter"}
//    topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}

    public Map<String, String> topping1(Map<String, String> map) {

        if (map.containsKey("ice cream") ) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");

        return map;
    }

//    Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream"
//    has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value
//    to "nuts".
//    topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
//    topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
//    topping2({"yogurt": "salt"}) → {"yogurt": "salt"}

    public Map<String, String> topping2(Map<String, String> map) {

        if (map.containsKey("ice cream") ) {
            map.put("yogurt", map.get("ice cream"));
        }

        if (map.containsKey("spinach") ) {
            map.put("spinach", "nuts");
        }
        return map;
    }

//    Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value,
//    set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key
//    "spinach".
//     topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
//    topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
//    topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}

    public Map<String, String> topping3(Map<String, String> map) {

        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

//    Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values,
//    remove them both.
//    mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
//    mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
//    mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}

    public Map<String, String> mapAB2(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b") && map.get("a").equals(map.get("b")) ) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

//    Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map
//    (but not both), set the other to have that same value in the map.
//    mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
//    mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
//    mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}

    public Map<String, String> mapAB3(Map<String, String> map) {

        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        } else if (map.containsKey("b") && !map.containsKey("a")) {
            map.put("a", map.get("b"));
        }
        return map;
    }

//    Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths,
//    then set "c" to have the longer value. If the values exist and have the same length, change them both to the
//    empty string in the map.
//    mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
//    mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
//    mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}

    public Map<String, String> mapAB4(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")) {
            if ( map.get("a").length() > map.get("b").length() ) {
                map.put("c", map.get("a") );
            } else if ( map.get("b").length() > map.get("a").length() ) {
                map.put("c", map.get("b") );
            } else if ( map.get("b").length() == map.get("a").length() ) {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

//    Given an array of ints, return true if 6 appears as either the first or last element in the array. The array
//    will be length 1 or more.
//    firstLast6([1, 2, 6]) → true
//    firstLast6([6, 1, 2, 3]) → true
//    firstLast6([13, 6, 1, 2, 3]) → false

    public boolean firstLast6(int[] nums) {

        if (nums[0] == 6 || nums[nums.length -1] == 6 ) {
            return true;
        }
        return false;
    }

//    Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
//    sameFirstLast([1, 2, 3]) → false
//    sameFirstLast([1, 2, 3, 1]) → true
//    sameFirstLast([1, 2, 1]) → true

    public boolean sameFirstLast(int[] nums) {

        if (nums.length >= 1 && nums[0] == nums[nums.length-1]) {
            return true;
        }
        return false;
    }

//    Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
//    makePi() → [3, 1, 4]

    public int[] makePi() {

        int[] pi = new int[] {3,1,4};

        return pi;
    }


//    Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
//    Both arrays will be length 1 or more.
//    commonEnd([1, 2, 3], [7, 3]) → true
//    commonEnd([1, 2, 3], [7, 3, 2]) → false
//    commonEnd([1, 2, 3], [1, 3]) → true

    public boolean commonEnd(int[] a, int[] b) {

        if (a[0] == b[0] || a[a.length-1] == b[b.length-1] ) {
            return true;
        }
        return false;
    }

//    Given an array of ints length 3, return the sum of all the elements.
//    sum3([1, 2, 3]) → 6
//    sum3([5, 11, 2]) → 18
//    sum3([7, 0, 0]) → 7

    public int sum3(int[] nums) {

        return nums[0] + nums[1] + nums[2];
    }

//    Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
//    rotateLeft3([1, 2, 3]) → [2, 3, 1]
//    rotateLeft3([5, 11, 9]) → [11, 9, 5]
//    rotateLeft3([7, 0, 0]) → [0, 0, 7]

    public int[] rotateLeft3(int[] nums) {

        int[] rotated = new int[] {nums[1],nums[2],nums[0]};

        return rotated;
    }

//    Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
//    reverse3([1, 2, 3]) → [3, 2, 1]
//    reverse3([5, 11, 9]) → [9, 11, 5]
//    reverse3([7, 0, 0]) → [0, 0, 7]

    public int[] reverse3(int[] nums) {

        int[] reverse = new int[] {nums[2],nums[1],nums[0]};
        return reverse;
    }

//    Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all
//    the other elements to be that value. Return the changed array.
//    maxEnd3([1, 2, 3]) → [3, 3, 3]
//    maxEnd3([11, 5, 9]) → [11, 11, 11]
//    maxEnd3([2, 11, 3]) → [3, 3, 3]

    public int[] maxEnd3(int[] nums) {

        int max = Math.max(nums[0],nums[nums.length-1]);
        int[] changed = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            changed[i] = max;
        }
        return changed;
    }

//    Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2,
//    just sum up the elements that exist, returning 0 if the array is length 0.
//    sum2([1, 2, 3]) → 3
//    sum2([1, 1]) → 2
//    sum2([1, 1, 1, 1]) → 2

    public int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            return nums[0] + nums[1];
        }
    }

//    Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
//    middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
//    middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
//    middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]

    public int[] middleWay(int[] a, int[] b) {

        int[] middle = new int[] {a[1],b[1]};
        return middle;
    }

//    Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
//    The original array will be length 1 or more.
//    makeEnds([1, 2, 3]) → [1, 3]
//    makeEnds([1, 2, 3, 4]) → [1, 4]
//    makeEnds([7, 4, 6, 2]) → [7, 2]

    public int[] makeEnds(int[] nums) {

        if (nums.length == 1) {
            int[] timesTwo = new int[] {nums[0],nums[0]};
            return timesTwo;
        }

        int[] firstAndLast = new int[] {nums[0],nums[nums.length-1]};
        return firstAndLast;
    }

//    Given an int array length 2, return true if it contains a 2 or a 3.
//    has23([2, 5]) → true
//    has23([4, 3]) → true
//    has23([4, 5]) → false

    public boolean has23(int[] nums) {
        if ( (nums[0] == 2 || nums[0] == 3) || (nums[1] == 2 || nums[1] == 3) ) {
            return true;
        }
        return false;
    }

//    Given an int array length 2, return true if it does not contain a 2 or 3.
//    no23([4, 5]) → true
//    no23([4, 2]) → false
//    no23([3, 5]) → false

    public boolean no23(int[] nums) {
        if (nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3) {
            return true;
        }
        return false;
    }

//    Given an int array, return a new array with double the length where its last element is the same as the original
//    array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int
//    array contains all 0's.
//    makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
//    makeLast([1, 2]) → [0, 0, 0, 2]
//    makeLast([3]) → [0, 3]

    public int[] makeLast(int[] nums) {

        int[] doubler = new int[nums.length * 2];

        doubler[doubler.length-1] = nums[nums.length-1];

        return doubler;
    }

//    Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
//    double23([2, 2]) → true
//    double23([3, 3]) → true
//    double23([2, 3]) → false

    public boolean double23(int[] nums) {
        int counter2 = 0;
        int counter3 = 0;

        if (nums.length < 2) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                counter2++;
            }
            if (nums[i] == 3) {
                counter3++;
            }
        }

        if (counter2 > 1 || counter3 > 1) {
            return true;
        } else {
            return false;
        }
    }

//    Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
//    Return the changed array.
//    fix23([1, 2, 3]) → [1, 2, 0]
//    fix23([2, 3, 5]) → [2, 0, 5]
//    fix23([1, 2, 1]) → [1, 2, 1]

    public int[] fix23(int[] nums) {
        for(int i = 0; i < nums.length -1; i++) {
            if (nums[i] == 2 && nums[i+1] == 3) {
                nums[i+1] = 0;
                return nums;
            }
        }
        return nums;
    }

//    Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
//    start1([1, 2, 3], [1, 3]) → 2
//    start1([7, 2, 3], [1]) → 1
//    start1([1, 2], []) → 1

    public int start1(int[] a, int[] b) {
        int counter = 0;

        if (a.length > 0 && a[0] == 1) {
            counter++;
        }
        if (b.length > 0 && b[0] == 1) {
            counter++;
        }
        return counter;
    }

//    Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array
//    which has the largest sum. In event of a tie, return a.
//    biggerTwo([1, 2], [3, 4]) → [3, 4]
//    biggerTwo([3, 4], [1, 2]) → [3, 4]
//    biggerTwo([1, 1], [1, 2]) → [1, 2]

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < a.length; i++) {
            sumA+= a[i];
        }

        for (int j = 0; j < b.length; j++) {
            sumB+= b[j];
        }

        if (sumA == sumB) {
            return a;
        }

        int largest = Math.max(sumA,sumB);

        if (largest == sumA) {
            return a;
        } else if (largest == sumB) {
            return b;
        }
        return a;
    }

//    Given an array of ints of even length, return a new array length 2 containing the middle two elements from the
//    original array. The original array will be length 2 or more.
//    makeMiddle([1, 2, 3, 4]) → [2, 3]
//    makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
//    makeMiddle([1, 2]) → [1, 2]

    public int[] makeMiddle(int[] nums) {
        if (nums.length < 3) {
            return nums;
        }

        int middle = (nums.length / 2);

        int[] newArray = new int[] {nums[middle-1],nums[middle]};

        return newArray;
    }

//    Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
//    plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
//    plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
//    plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]

    public int[] plusTwo(int[] a, int[] b) {

        int[] bigGuy = new int[] {a[0],a[1],b[0],b[1]};

        return bigGuy;
    }

//    Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length
//    will be at least 1.
//    swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
//    swapEnds([1, 2, 3]) → [3, 2, 1]
//    swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]

    public int[] swapEnds(int[] nums) {

        int[] newArray = new int[nums.length];

        newArray[0] = nums[nums.length-1];
        newArray[newArray.length-1] = nums[0];

        for (int i = 1; i < nums.length-1;i++) {
            newArray[i] = nums[i];
        }
        return newArray;
    }

//    Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the
//    array. The array length will be at least 3.
//    midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
//    midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
//    midThree([1, 2, 3]) → [1, 2, 3]

    public int[] midThree(int[] nums) {

        if (nums.length == 3) {
            return nums;
        }

        int middle = nums.length/2;

        int[] newArray = new int[] {nums[middle-1],nums[middle],nums[middle+1]};

        return newArray;
    }

//    Given an array of ints of odd length, look at the first, last, and middle values in the array and return the
//    largest. The array length will be a least 1.
//    maxTriple([1, 2, 3]) → 3
//    maxTriple([1, 5, 3]) → 5
//    maxTriple([5, 2, 3]) → 5

    public int maxTriple(int[] nums) {

        if (nums.length < 2) {
            return nums[0];
        }

        int middle = (nums.length/2);

        int largest = Math.max( (Math.max(nums[0],nums[nums.length-1])),nums[middle] );

        return largest;
    }

//    Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length
//    2, use whatever elements are present.
//    frontPiece([1, 2, 3]) → [1, 2]
//    frontPiece([1, 2]) → [1, 2]
//    frontPiece([1]) → [1]

    public int[] frontPiece(int[] nums) {
        if(nums.length < 2) {
            return nums;
        }

        int[] firstTwo = new int[] {nums[0],nums[1]};

        return firstTwo;
    }

//    We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array
//    contains an unlucky 1 in the first 2 or last 2 positions in the array.
//    unlucky1([1, 3, 4, 5]) → true
//    unlucky1([2, 1, 3, 4, 5]) → true
//    unlucky1([1, 1, 1]) → false

    public boolean unlucky1(int[] nums) {

        boolean isUnlucky = false;

        if (nums.length < 2) {
            return isUnlucky;
        }

        if (nums[0] == 1 && nums[1] == 3) {
            return isUnlucky = true;
        } else if (nums[1] == 1 && nums[2] == 3) {
            return isUnlucky = true;
        } else if (nums[nums.length-2] == 1 && nums[nums.length-1] == 3) {
            return isUnlucky = true;
        }

        return isUnlucky;
    }

//    Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a
//    followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements
//    available between the 2 arrays.
//    make2([4, 5], [1, 2, 3]) → [4, 5]
//    make2([4], [1, 2, 3]) → [4, 1]
//    make2([], [1, 2]) → [1, 2]

    public int[] make2(int[] a, int[] b) {

        int[] newArray = new int[2];

        if (a.length == 0) {
            newArray[0] = b[0];
            newArray[1] = b[1];
            return newArray;
        }

        if (a.length >= 2) {
            newArray[0] = a[0];
            newArray[1] = a[1];
            return newArray;
        }

        if (a.length == 1) {
            newArray[0] = a[0];
            newArray[1] = b[0];
            return newArray;
        }
        return newArray;
    }

//    Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either
//    array is length 0, ignore that array.
//    front11([1, 2, 3], [7, 9, 8]) → [1, 7]
//    front11([1], [2]) → [1, 2]
//    front11([1, 7], []) → [1]

    public int[] front11(int[] a, int[] b) {

        int[] newArray;

        if (a.length == 0 && b.length == 0) {
            newArray = new int[0];
            return newArray;
        }

        if (a.length == 0) {
            newArray = new int[1];
            newArray[0] = b[0];
            return newArray;
        }

        if (b.length == 0) {
            newArray = new int[1];
            newArray[0] = a[0];
            return newArray;
        }

        newArray = new int[2];
        newArray[0] = a[0];
        newArray[1] = b[0];

        return newArray;
    }

//    Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
//    always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later,
//    but for this problem the value is simply 0.
//    word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
//    word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
//    word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}

    public Map<String, Integer> word0(String[] strings) {

        Map<String,Integer> zeros = new HashMap<String,Integer>();

        for(String string : strings) {
            zeros.put(string, 0);
        }
        return zeros;
    }

//    Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.
//    wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
//    wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
//    wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}

    public Map<String, Integer> wordLen(String[] strings) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String string : strings) {
            map.put(string, string.length());
        }
        return map;
    }


//      Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add
//      its first character as a key with its last character as the value.
////    pairs(["code", "bug"]) → {"b": "g", "c": "e"}
////    pairs(["man", "moon", "main"]) → {"m": "n"}
////    pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

    public Map<String, String> pairs(String[] strings) {

        Map<String,String> map = new HashMap<String,String>();

        for (String string : strings) {
            map.put(string.substring(0,1),string.substring(string.length()-1));
        }
        return map;
    }

//    The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each
//    different string, with the value the number of times that string appears in the array.
//    wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
//    wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
//    wordCount(["c", "c", "c", "c"]) → {"c": 4}

    public Map<String, Integer> wordCount(String[] strings) {

        Map<String,Integer> map = new HashMap<String,Integer>();

        for (String letter : strings) {
            if (map.containsKey(letter)) {
                int numberOfTimes = map.get(letter);
                map.put(letter,numberOfTimes+1);
            } else {
                map.put(letter, 1);
            }
        }
        return map;
    }

//    Given an array of non-empty strings, return a Map<String, String> with a key for every different first character
//    seen, with the value of all the strings starting with that character appended together in the order they appear in the array.
//    firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
//    firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
//    firstChar([]) → {}

    public Map<String, String> firstChar(String[] strings) {

        Map<String,String> map = new HashMap<String,String>();

        for(String word : strings) {
            String firstLetter = word.substring(0,1);

            if(map.containsKey(firstLetter)) {
                String previousWord = map.get(firstLetter);
                map.put(firstLetter,previousWord+word);
            } else {
                map.put(firstLetter,word);
            }
        }
        return map;
    }

//    Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th,
//    etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.
//    wordAppend(["a", "b", "a"]) → "a"
//    wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
//    wordAppend(["a", "", "a"]) → "a"

    public String wordAppend(String[] strings) {

        Map<String,Integer> map = new HashMap<String,Integer>();

        String newString = "";

        for (String string : strings) {
            if (map.containsKey(string)) {
                int count = map.get(string);
                count++;
                map.put(string, count);
                if (count % 2 == 0) {
                    newString += string;
                    map.put(string, 0);
                }
            } else {
                map.put(string, 1);
            }
        }
        return newString;
    }

//    Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is
//    true if that string appears 2 or more times in the array.
//    wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
//    wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
//    wordMultiple(["c", "c", "c", "c"]) → {"c": true}

    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String,Boolean> map = new HashMap<String,Boolean>();

        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, true);
            } else {
                map.put(string, false);
            }
        }
        return map;
    }

//    We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then
//    return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap
//    the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a
//    map, this can be solved making just one pass over the array. More difficult than it looks.
//    allSwap(["ab", "ac"]) → ["ac", "ab"]
//    allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
//    allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]

    public String[] allSwap(String[] strings) {

        //use map to store index and string (substring)
        //check if string.substring exists on map, swap indexes if so
        //so need to track prior index
        //then remove from the map
        Map<String, Integer> firstCharIndexMap = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String firstChar = strings[i].substring(0, 1);

            if (firstCharIndexMap.containsKey(firstChar)) {
                int swapIndex = firstCharIndexMap.get(firstChar);

                if (swapIndex != i) {
                    String temp = strings[i];
                    strings[i] = strings[swapIndex];
                    strings[swapIndex] = temp;

                    firstCharIndexMap.remove(firstChar);
                }
            } else {
                firstCharIndexMap.put(firstChar, i);
            }
        }
        return strings;
    }

//    We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return
//    the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2
//    strings in the array. A particular first char can only cause 1 swap, so once a char has caused a swap, its later
//    swaps are disabled. Using a map, this can be solved making just one pass over the array. More difficult than it looks.
//    firstSwap(["ab", "ac"]) → ["ac", "ab"]
//    firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
//    firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]

    public String[] firstSwap(String[] strings) {
        Map<String, Integer> firstCharMap = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            String firstChar = currentString.substring(0,1);

            if (firstCharMap.containsKey(firstChar)) {
                int swapIndex = firstCharMap.get(firstChar);

                if (swapIndex != -1) {
                    String temp = strings[swapIndex];
                    strings[swapIndex] = currentString;
                    strings[i] = temp;

                    firstCharMap.put(firstChar, -1);
                }
            } else {
                firstCharMap.put(firstChar, i);
            }
        }
        return strings;
    }

//    When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number
//    of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the
//    number of cigars. Return true if the party with the given values is successful, or false otherwise.
//    cigarParty(30, false) → false
//    cigarParty(50, false) → true
//    cigarParty(70, true) → true

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40;
        } else {
            return cigars >= 40 && cigars <= 60;
        }
    }

//    You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your
//    clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table
//    is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result
//    is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise
//    the result is 1 (maybe).
//    dateFashion(5, 10) → 2
//    dateFashion(5, 2) → 0
//    dateFashion(5, 5) → 1

    public int dateFashion(int you, int date) {
        int youGetATable = 2;
        int maybeYouGetATable = 1;
        int noTableForYou = 0;

        if (you <= 2 || date <= 2) {
            return noTableForYou;
        } else if (you >= 8 || date >= 8) {
            return youGetATable;
        } else {
            return maybeYouGetATable;
        }
    }

//    The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between
//    60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature
//    and a boolean isSummer, return true if the squirrels play and false otherwise.
//    squirrelPlay(70, false) → true
//    squirrelPlay(95, false) → false
//    squirrelPlay(95, true) → true

    public boolean squirrelPlay(int temp, boolean isSummer) {

        if (temp >= 60 && temp <= 90 && !isSummer) {
            return true;
        } else if (temp >= 60 && temp <= 100 && isSummer) {
            return true;
        }
        return false;
    }

//    You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an
//    int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between
//    61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on
//    that day, your speed can be 5 higher in all cases.
//    caughtSpeeding(60, false) → 0
//    caughtSpeeding(65, false) → 1
//    caughtSpeeding(65, true) → 0

public int caughtSpeeding(int speed, boolean isBirthday) {
    int noTicket = 0;
    int smallTicket = 1;
    int bigTicket = 2;

    if (speed <= 60 || (speed <= 65 && isBirthday) ) {
        return noTicket;
    } else if ((speed >= 61 && speed <= 80) || (speed >= 66 && speed <= 85 && isBirthday) ) {
        return smallTicket;
    } else if (speed >= 81 || (speed >= 86 && isBirthday) ) {
        return bigTicket;
    }
    return noTicket;
}

//    Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in
//    that case just return 20.
//    sortaSum(3, 4) → 7
//    sortaSum(9, 4) → 20
//    sortaSum(10, 11) → 21

    public int sortaSum(int a, int b) {

        int sum = a + b;

        if (sum < 10 || sum > 19) {
            return sum;
        } else {
            return 20;
        }
    }

//    Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation,
//    return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00"
//    and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and
//    weekends it should be "off".
//    alarmClock(1, false) → "7:00"
//    alarmClock(5, false) → "7:00"
//    alarmClock(0, false) → "10:00"

    public String alarmClock(int day, boolean vacation) {
        int sun = 0;
        int mon = 1;
        int tues = 2;
        int wed = 3;
        int thur = 4;
        int fri = 5;
        int sat = 6;

        if ( (day == sun || day == sat) && vacation ) {
            return "off";
        } else if ( (day == sun || day == sat) && !vacation ) {
            return "10:00";
        } else if ( (day >= mon && day <= fri) && vacation ) {
            return "10:00";
        } else {
            return "7:00";
        }
    }

//    The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their
//    sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
//    love6(6, 4) → true
//    love6(4, 5) → false
//    love6(1, 5) → true

    public boolean love6(int a, int b) {
        int sum = a + b;
        int diff = Math.abs(a - b);

        if ( a == 6 || b == 6 || sum == 6 || diff == 6 ) {
            return true;
        } else {
            return false;
        }
    }

//    Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true, in which case
//    return true if the number is less or equal to 1, or greater or equal to 10.
//    in1To10(5, false) → true
//    in1To10(11, false) → false
//    in1To10(11, true) → true

    public boolean in1To10(int n, boolean outsideMode) {

        if (!outsideMode) {
            return n >= 1 && n <= 10;
        } else if (outsideMode) {
            if (n <= 1 || n >= 10) {
                return true;
            }
        }
        return false;
    }

//    We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true
//    if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod
//    specialEleven(22) → true
//    specialEleven(23) → true
//    specialEleven(24) → false

    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

//    Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod
//    more20(20) → false
//    more20(21) → true
//    more20(22) → true

    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

//    Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator
//    -- see Introduction to Mod
//    old35(3) → true
//    old35(10) → true
//    old35(15) → false

    public boolean old35(int n) {
        if (n % 3 == 0 && n % 5 != 0) {
            return true;
        } else if (n % 5 == 0 && n % 3 != 0) {
            return true;
        } else {
            return false;
        }
    }

//    Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return
//    true, but 40 returns false. See also: Introduction to Mod
//    less20(18) → true
//    less20(19) → true
//    less20(20) → false

    public boolean less20(int n) {
        return n % 20 == 19 || n % 20 == 18;
    }

//    Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the
//    remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
//    nearTen(12) → true
//    nearTen(17) → false
//    nearTen(19) → true

    public boolean nearTen(int num) {
        return (num % 10 <= 2 || num % 10 >= 8);
    }

//    Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky.
//    So if either value is a teen, just return 19.
//    teenSum(3, 4) → 7
//    teenSum(10, 13) → 19
//    teenSum(13, 2) → 19

    public int teenSum(int a, int b) {
        int sum = a + b;

        if ( (a >= 13 && a <=19) || (b >= 13 && b <=19) ) {
            return 19;
        } else {
            return sum;
        }
    }

//    Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only
//    answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
//    answerCell(false, false, false) → true
//    answerCell(false, false, true) → false
//    answerCell(true, false, false) → false

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        } else if (!isMom && isMorning) {
            return false;
        } else {
            return true;
        }
    }

//    We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good,
//    or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least
//    double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less
//    than 5, the party is always bad (0).
//    teaParty(6, 8) → 1
//    teaParty(3, 8) → 0
//    teaParty(20, 6) → 2

    public int teaParty(int tea, int candy) {
        int bad = 0;
        int good = 1;
        int great = 2;

        if (tea < 5 || candy < 5) {
            return bad;
        } else if ( (tea >= candy * 2) || (candy >= tea * 2) ) {
            return great;
        } else {
            return good;
        }
    }

//    Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If
//    both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.
//    (See also: FizzBuzz Code)
//    fizzString("fig") → "Fizz"
//    fizzString("dib") → "Buzz"
//    fizzString("fib") → "FizzBuzz"

    public String fizzString(String str) {
        if ( str.substring(0,1).equals("f") && str.substring(str.length()-1).equals("b") ) {
            return "FizzBuzz";
        } else if ( str.substring(0,1).equals("f") ) {
            return "Fizz";
        } else if ( str.substring(str.length()-1).equals("b") ) {
            return "Buzz";
        } else {
            return str;
        }
    }


//    Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if the number
//    is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz", and if divisible
//    by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields
//    3. What will the remainder be when one number divides evenly into another? (See also: FizzBuzz Code and Introduction
//    to Mod)
//    fizzString2(1) → "1!"
//    fizzString2(2) → "2!"
//    fizzString2(3) → "Fizz!"

    public String fizzString2(int n) {
        String numString = "";

        if (n % 5 == 0 && n % 3 == 0) {
            return "FizzBuzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        } else {
            numString = Integer.toString(n) + "!";
            return numString;
        }
    }

//    Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
//    twoAsOne(1, 2, 3) → true
//    twoAsOne(3, 1, 2) → true
//    twoAsOne(3, 2, 2) → false

    public boolean twoAsOne(int a, int b, int c) {
        if (a + b == c || a + c == b || b + c == a) {
            return true;
        } else {
            return false;
        }
    }

//    Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception
//    that if "bOk" is true, b does not need to be greater than a.
//    inOrder(1, 2, 4, false) → true
//    inOrder(1, 2, 1, false) → false
//    inOrder(1, 1, 2, true) → true

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk && c > b) {
            return true;
        } else if (b > a && c > b) {
            return true;
        } else {
            return false;
        }
    }

//    Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7
//    or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.
//    inOrderEqual(2, 5, 11, false) → true
//    inOrderEqual(5, 7, 6, false) → false
//    inOrderEqual(5, 5, 7, true) → true

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk && a <= b && b <= c) {
            return true;
        } else if (a < b && b < c) {
            return true;
        } else {
            return false;
        }
    }

//    Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative.
//    Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
//    lastDigit(23, 19, 13) → true
//    lastDigit(23, 19, 12) → false
//    lastDigit(23, 19, 3) → true

    public boolean lastDigit(int a, int b, int c) {
        if (a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10) {
            return true;
        } else {
            return false;
        }
    }

//    Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
//    lessBy10(1, 7, 11) → true
//    lessBy10(1, 7, 10) → false
//    lessBy10(11, 1, 7) → true

    public boolean lessBy10(int a, int b, int c) {
        if (a + 9 < b || a + 9 < c || b + 9 < a || b + 9 < c || c + 9 < a || c + 9 < b) {
            return true;
        } else {
            return false;
        }
    }

//    Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice
//    show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.
//    withoutDoubles(2, 3, true) → 5
//    withoutDoubles(3, 3, true) → 7
//    withoutDoubles(3, 3, false) → 6

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {

        if (noDoubles && die1 == die2) {
            die1++;
            if (die1 > 6) {
                die1 = 1;
                return die1 + die2;
            }
            return die1 + die2;
        } else {
            return die1 + die2;
        }
    }

//    Given two int values, return whichever value is larger. However if the two values have the same remainder when
//    divided by 5, then the return the smaller value. However, in all cases, if the two values are the same, return 0.
//    Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
//    maxMod5(2, 3) → 3
//    maxMod5(6, 2) → 6
//    maxMod5(3, 2) → 3

    public int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a % 5 == b % 5) {
            return Math.min(a,b);
        } else {
            return Math.max(a,b);
        }
    }

//    You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2,
//    the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are
//    different from a, the result is 1. Otherwise the result is 0.
//    redTicket(2, 2, 2) → 10
//    redTicket(2, 2, 1) → 0
//    redTicket(0, 0, 0) → 5

    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        } else {
            return 0;
        }
    }


//    You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the
//    result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result
//    is 10.
//    greenTicket(1, 2, 3) → 0
//    greenTicket(2, 2, 2) → 20
//    greenTicket(1, 1, 2) → 10

    public int greenTicket(int a, int b, int c) {
        if (a != b && b != c && c != a) {
            return 0;
        } else if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } else {
            return 0;
        }
    }

//    You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and
//    ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if
//    the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.
//    blueTicket(9, 1, 0) → 10
//    blueTicket(9, 2, 0) → 0
//    blueTicket(6, 1, 4) → 10

    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        } else if (ab - 10 == bc || ab - 10 == ac) {
            return 5;
        } else {
            return 0;
        }
    }

//    Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the
//    2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
//    shareDigit(12, 23) → true
//    shareDigit(12, 43) → false
//    shareDigit(12, 44) → false

    public boolean shareDigit(int a, int b) {
        int aRight = a % 10;
        int bRight = b % 10;
        int aLeft = a / 10;
        int bLeft = b / 10;

        return (aRight == bRight || aRight == bLeft || aLeft == bRight || aLeft == bLeft);
    }

//    Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the
//    sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a non-negative
//    int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)
//    sumLimit(2, 3) → 5
//    sumLimit(8, 3) → 8
//    sumLimit(8, 1) → 9

    public int sumLimit(int a, int b) {
        int sum = a + b;
        String aString = Integer.toString(a);
        String sumString = Integer.toString(sum);

        if (sumString.length() == aString.length()) {
            return sum;
        } else {
            return a;
        }
    }

//    We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big
//    bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a
//    little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks
//    makeBricks(3, 1, 8) → true
//    makeBricks(3, 1, 9) → false
//    makeBricks(3, 2, 10) → true

    public boolean makeBricks(int small, int big, int goal) {
        if (goal > small + big * 5) {
            return false;
        } else {
            return goal % 5 <= small;
        }
    }








}
