import java.util.*;

public class ReverseString {

    /* method to reverse a string */
    public void reverse(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        char[] reverseArray = new char[length];
        int j=0;
        for(int i=length-1; i>=0; i--) {
            reverseArray[j] = charArray[i];
            j++;
        }

        System.out.println(reverseArray);
    }

    /* main method */
    public static void main(String ss[]) {
        System.out.println("Enter the string to be reversed: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        ReverseString objReverseString = new ReverseString();
        objReverseString.reverse(str);
    }
}
