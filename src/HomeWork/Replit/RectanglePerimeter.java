package HomeWork.Replit;

public class RectanglePerimeter {
    /*
    I. Declare and store the following value to the variables.

    1. Declare a variable and name it length and assign a value of 6
    2. Declare a variable and name it width and assign a value of 4

    II. Calculate the Area of the rectangle.

    1. Declare a variable and name it rectangleArea.
    2. The formula for calculating the Area of the triangle is as follow:
     Area = (length * width)
    3. Assign the result of the calculation to rectangleArea.

    III. Calculate the perimeter of the rectangle.

    1. Declare a variable and name it rectanglePerimeter.
    2. The formula for calculating the Area of the triangle is as follow:
     Perimeter = 2 * (length + width)
    3. Assign the result of the calculation to rectanglePerimeter.
     */

    public static void main(String[] args) {

        double length = 6;
        double width = 4;
        //The area of a rectangle is the length times the width.
        double rectangleArea = length * width;
        System.out.println(rectangleArea);

        // double rectanglePerimeter = length + length + width + width; // you can do this waay too.
        double rectanglePerimeter = (length + width) * 2;
        System.out.println(rectanglePerimeter);


    }
}
