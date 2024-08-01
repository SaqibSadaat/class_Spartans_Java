package week_12_06172024.lab_session.WorkingWithScanner;

public class GeminiUsernameManager {

    private String[] usernames;
    public GeminiUsernameManager(String[] usernames) {
        this.usernames = usernames;
    }
    public void displayUsernames() {
        System.out.println("\nStored usernames:");
        for (String username : usernames) {
            if (username != null) { // Avoid printing empty elements
                System.out.println(username);
            }
        }
    }

}
