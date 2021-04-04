package printPractice;

public class SpecialCharactersInPrint {
    /*
    TASK1
    print your name, last name, dob, favorite color in 1 println statement but in different lines
    Name: Volkan
    LastName: Gurler
    DOB: 12/12/1985
    Favorite color: red
     */

    /*
        Hey, this is Akin, and I am from Chicago. I have been working in
    IT field for a long time.
	    Chicago is really cold during winters, but it is nice in the summers.
	Its population is over 2 million.
     */

    public static void main(String[] args) {
        System.out.println("Name: Volkan\nLastName: Gurler\nDOB: 12/12/1985\nFavorite color: red");

        System.out.println("\tHey, this is Akin, and I am from Chicago. I have been working in"
                + "\nIT field for a long time."
                + "\n\tChicago is really cold during winters, but it is nice in the summers."
                + "\nIts population is over 2 million.");
    }
}
