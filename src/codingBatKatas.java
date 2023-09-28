import java.util.Map;

public class codingBatKatas {

/*    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true*/

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday != true || vacation == true) {
            return true;
        }
        return false;
    }

  /*  We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
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


   /* We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

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


/*    Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

    notString("candy") → "not candy"
    notString("x") → "not x"
    notString("not bad") → "not bad"*/

    public String notString(String str) {

        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }

        return "not " + str;

    }

/*    Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
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

/*    Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
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


   /* Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
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


//    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
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


//    Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
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

//    Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
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


//    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
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

//    Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
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

//    Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
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


//    Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.
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


//    Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
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


//    Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
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


//    The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
//    makeTags("i", "Yay") → "<i>Yay</i>"
//    makeTags("i", "Hello") → "<i>Hello</i>"
//    makeTags("cite", "Yay") → "<cite>Yay</cite>"

    public String makeTags(String tag, String word) {

        return "<" + tag + ">" + word + "</" + tag + ">";

    }


//    Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
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


//    Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
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


//    Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
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


//    Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
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


//    Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
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


//    Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
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


//    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
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


//    Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
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

//    Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
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


//    Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
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

//    Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
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


//    Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
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


//    Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
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

//    Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
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


//    Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
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

//    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
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


//    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.
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


//    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.
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


//    Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".
//    mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
//    mapAB({"a": "Hi"}) → {"a": "Hi"}
//    mapAB({"b": "There"}) → {"b": "There"}

    public Map<String, String> mapAB(Map<String, String> map) {

        if ( map.containsKey("a") && map.containsKey("b") ) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }


//    Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
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


//    Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".
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


//    Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".
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


//    Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.
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


//    Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.
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


//    Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.
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

//    Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
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


//    Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
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


//    Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
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


//    Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
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









}
