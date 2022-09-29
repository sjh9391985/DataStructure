package 문자열;

public class Char {
    public static void main(String[] args) {

        /**
         * Char array
         */
        String str = "hello";

        for(char c : str.toCharArray()){
            // System.out.println(c);
        }

        String str1 = "it is time to study";
        String[] strArr = str1.split(" ");

        for(String temp : strArr){
            // System.out.println(temp);
        }

        /**
         * 문자열 뒤집기
         */
        String str2 = "hello";
        String reverse = new StringBuffer(str2).reverse().toString();
            // System.out.println(reverse);

    }
}
