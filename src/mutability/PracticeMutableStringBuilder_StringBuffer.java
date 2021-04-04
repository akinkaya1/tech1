package mutability;

import oop.constructors.Cat;

public class PracticeMutableStringBuilder_StringBuffer {
    public static void main(String[] args) {
            String greeting = "Hello"; // Hello is created in the String pool in the Heap

            greeting = "Hi"; // Hi is also created in the pool. Hello is also still in the pool as it was before

        /**
        Since Hello value did not change et all, we call String as immutable object
        Hi is a completely new object
        NOTE: Hello is not garbage collected because it is in the pool and not created with new keyword
         NOTE: String Pool is a special area reserved for Strings in the heap

         StringBuilder and StringBuffer are the mutable types of String
         */

        StringBuilder sb = new StringBuilder("Hello");
        Cat cat =  new Cat();
        cat.name = "Busia";

        System.out.println(sb); // Hello

        sb.append("WhatsApp"); // HelloWhatsApp

        System.out.println(sb);

        sb.append(10); // HelloWhatsApp10
        sb.append(true); //HelloWhatsApp10true
        sb.append(10.5); //HelloWhatsApp10true10.5
        sb.append(cat.name); //HelloWhatsApp10true10.5Busia

        System.out.println(sb);



        StringBuilder sb2 = new StringBuilder("Lionel");
        sb2.insert(2, "HELLO");

        System.out.println(sb2); // LiHELLOonel

        sb2.delete(5, 8); // 8 is not included

        System.out.println(sb2); //LiHELnel

        StringBuilder sb3 = new StringBuilder("Java is fun");
        System.out.println(sb3.reverse());


        /*
        All we learned about StringBuilder is same for StringBuffer
        All methods can be used with String Buffer as well
         */

        String word = "1234555555555554321"; // kayak, civic, abcba, 1234554321

        StringBuffer stringBuffer = new StringBuffer(word);

        stringBuffer.reverse();
        System.out.println(stringBuffer);

        if((stringBuffer.toString()).equals(word)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");



    }
}
