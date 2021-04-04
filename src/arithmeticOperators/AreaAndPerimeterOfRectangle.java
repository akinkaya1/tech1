package arithmeticOperators;

public class AreaAndPerimeterOfRectangle {
    /*
    Exercise
    Write a java program that calculates and prints the area and perimeter of a rectangle
    Interview Question!
    NOTE: width = 5 and height = 6

    PSEUDO CODE
    1.Create 2 variables that holds width and height
    2.Find area by given formula => area = width * height
    3.Find perimeter by given formula => perimeter = 2*(width + height)
    4.Print results
     */
    public static void main(String[] args) {
        int width = 5, height = 6;

        int areaOfTheRectangle = width * height;
        int perimeterOfTheRectangle = 2*(width + height);

        System.out.println("The area of the rectangle is equal to : " + areaOfTheRectangle);
        System.out.println("Perimeter of the rectangle is equal to : " + perimeterOfTheRectangle);

    }
}
