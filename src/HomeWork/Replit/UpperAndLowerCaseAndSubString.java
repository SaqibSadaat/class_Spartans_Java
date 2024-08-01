package HomeWork.Replit;

public class UpperAndLowerCaseAndSubString {
    public static void main(String[] args) {
        /*
        I. Declare and store the following value to a variable: "Welcome To TekSchool".

        II. Separate the first two parts of the message from the last part and store it in a variable.
        1. Use the method substring() to separate "Welcome To" from "TekSchool"
        and store it in a variable called firstPartOfTheMessage.
        2. Use the method substring() to separate the "TekSchool" from "Welcome To"
        and store it in a variable called secondPartOfTheMessage.
        3. Declare another variable and name it thirdPartOfTheMessage and the
        value of this variable should be the uppercase version of the
        secondPartOfTheMessage.
        4. HINT: secondPartOfTheMessage.toUpperCase();

        III. Print the above message by following the below steps:

        1. Using the toUpperCase() method, print the uppercase version of the message.
        2. Using te toLowerCase() method, print the lowercase version of the message.
        4. Using the concat() method, print the firstPartOfTheMessage concatenated with thirdPartOfTheMessage.

        ** Note: Please select the correct name and data types for the above variables. **

        ** Hint: Look at the below expected output. **

        ** Help: The method toUpperCase() and toLowerCase() returns:

        1. A String value, representing the new string converted to upper and lower case.

        Expected output
        WELCOME TO TEKSCHOOL
        welcome to tekschool
        Welcome To TEKSCHOOL --> Just change TekSchool to TEKSCHOOL and print the whole message.
         */

        //First Part
        String message = "Welcome To TekSchool";
        String messageToUpperCase = message.toUpperCase();
        System.out.println(messageToUpperCase);

        //Second Part
        String messageToLowerCase = message.toLowerCase();
        System.out.println(messageToLowerCase);

        //Third Part
        String firstPartOfTheMessage = message.substring(0, 11); //From Welcome To (first part)
        String secondPartOfTheMessage = message.substring(11); //To TekSchool (Second Part)

        secondPartOfTheMessage = secondPartOfTheMessage.toUpperCase(); //converted TekSchool to TEKSCHOOL

        String concatPartsOfMessage = firstPartOfTheMessage.concat(secondPartOfTheMessage); //concatenated both parts.
        System.out.println(concatPartsOfMessage);





    }

}
