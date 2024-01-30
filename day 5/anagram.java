import java.util.Arrays;

class Anagram {
    public static void main(String[] arg) {
        String str1 = "Race";
        String str2 = "Care";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        Boolean result = Arrays.equals( charArray1,charArray2);
        if (result) {
            System.out.println("Anagram");
        } else {
            System.out.println("not an Anagram");
        }
    }
}