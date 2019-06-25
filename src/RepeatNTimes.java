import java.util.*;

/* method to display the last n characters of the inputed string n number of times */
public class RepeatNTimes {
    public void repeat(String str, int n) {
        int length = str.length();
        char[] repeatArray = new char[n];
        int j=0;
        for(int i=(length-n); i<length ; i++) {

            repeatArray[j] = str.charAt(i);
            j++;
        }
        System.out.println(" ");
        System.out.print(str);

        for(int i=1; i<=n; i++){
            System.out.print(repeatArray);
        }

        System.out.println(" ");
    }

    /* main method */
    public static void main(String ss[]) {
        System.out.println("Enter the string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Enter the number of characters to be repeated: ");
        int n = scanner.nextInt();
        RepeatNTimes objRepeatNTimes = new RepeatNTimes();
        objRepeatNTimes.repeat(str, n);
    }
}
