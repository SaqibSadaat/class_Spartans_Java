package week_12_06172024.lab_session.CountspacesGemini;

public class StringConfig {
    private final String str;

    public StringConfig(String str) {
        this.str = str;
    }

    public int countEmptySpaces() {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                count++;
            }
        }
        return count;
    }

    public void printEmptySpaceCount() {
        int spaceCount = countEmptySpaces();
        System.out.println("There are " + spaceCount + " number of empty spaces in the following String:\n" + str);
    }
}

