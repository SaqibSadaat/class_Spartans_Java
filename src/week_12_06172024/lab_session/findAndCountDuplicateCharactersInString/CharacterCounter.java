package week_12_06172024.lab_session.findAndCountDuplicateCharactersInString;

public class CharacterCounter {

    public static int countCharacterOccurrences(String message, char character) {
        int count = 0;
        for (char ch : message.toCharArray()) {
            if (ch == character) {
                count++;
            }
        }
        return count;
    }

}
