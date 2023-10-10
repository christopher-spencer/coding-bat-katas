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














}
