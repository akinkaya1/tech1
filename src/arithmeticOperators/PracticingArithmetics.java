package arithmeticOperators;

public class PracticingArithmetics {
    public static void main(String[] args) {
        /*
        NOTES:
        In such function or calculation, there are rules to follow
        -Do calculation in the parentheses first
        -Do multiplication or division if there are any
        -addition and subtraction comes as last
         */

        /*
        TASK-1
        find the result for int number1 = 1*2+(10/5)-6+1*3/3

        Steps-
        1.do the parentheses first => 1*2+2-6+1*3/3
        2.do division => 1*2+2-6+1*1
        3.do the multiplication => 2+2-6+1
        4.do addition and subtraction => 2+2-6+1 = -1
         */

        System.out.println("Number1 is equal to: " + (1*2+(10/5)-6+1*3/3));

        /*
        TASK-2
         find the result for int number2 = (1+4)*2+5-10/2/(6-1)

         Steps-
            1.do the parentheses first => 5*2+5-10/2/5
            2.do division => 5*2+5-1
            3.do the multiplication => 10+5-1
            4.do addition and subtraction => 10+5-1 = 14
         */

        System.out.println("Number2 is equal to: " + ((1+4)*2+5-10/2/(6-1)));

        System.out.println(5*3+6-8/2);
    }
}
