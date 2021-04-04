package stringMethods;

public class LastIndexOfMethod {
    public static void main(String[] args) {
        String str = "TechGlobal Tech";

        int lastIndexOfl = str.lastIndexOf('l'); // 9
        int lastIndexOfT = str.lastIndexOf("T"); // 11
        int lastIndexOfTech = str.lastIndexOf("Tech"); // 11

        System.out.println(lastIndexOfl);
        System.out.println(lastIndexOfT);
        System.out.println(lastIndexOfTech);
    }
}
