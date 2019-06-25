import java.util.*;
public class NthIteration {

    /* method to display nth number for n number of times */
    public void iterate(int n){
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
        }
    }

    /* main method */
    public static void main(String ss[]) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); /* input is read using Scanner class */
        NthIteration objNthIteration = new NthIteration();
        objNthIteration.iterate(num); /* Here we are calling iterate function */
    }

}
