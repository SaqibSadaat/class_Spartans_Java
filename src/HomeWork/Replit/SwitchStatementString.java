package HomeWork.Replit;

public class SwitchStatementString {
    public static void main(String[] args) {
        String studentName = "saq";
        switch (studentName) {
            case "John":
            case "Joe":
            case "Smith":
            case "Benjamin":
            case "Emily":
            case "Oscar":
            case "Emma":
            case "Heidi":
                System.out.println(studentName + " is a student of this class" );
                break;
            default:
                System.out.println(studentName + " is not student of this class " );
        }

    }
}
