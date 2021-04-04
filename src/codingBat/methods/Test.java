package codingBat.methods;

public class Test {
    public String notString(String str) {
    /**
    This is a return type method
    It returns a String
    It takes a String as an argument

    SOLUTION - PSEUDO CODE
    */
        if(str.startsWith("not")) return str;
        else return "not " + str;
    }

    public static void main(String[] args) {
        Test test = new Test();

        System.out.println(test.notString("candy"));
        System.out.println(test.notString("x"));
        System.out.println(test.notString("not bad"));
        System.out.println(test.notString("bad"));
        System.out.println(test.notString("not"));
        System.out.println(test.notString("is not"));
        System.out.println(test.notString("no"));
    }
}
