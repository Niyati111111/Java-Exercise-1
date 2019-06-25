import java.util.*;
public class EvenOdd {

    /* function to check whether the entered number is even or odd and to display the output accordingly */
    public void evenOdd(int num) {

        if(num%2==0 && (num >= 20 && num <= 30)){
            System.out.println("Jerry"); /* print Jerry if even */
        } else if (num >= 20 && num <= 30) {

            System.out.println("Tom"); /* print Tom if odd */
        } else {
            System.out.println("Neither Tom nor Jerry.");
        }

    }

    /* main method */
    public static void main(String ss[]) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); /* input is read using Scanner class */
        EvenOdd objEvenOdd = new EvenOdd();
        objEvenOdd.evenOdd(num);
    }
}
