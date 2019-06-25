import java.util.*;

public class Pallindrome {

    /* function to check whether the number entered by the user is a pallindrome or not */
    public void pallindromeCheck(int num) {

        int number = num;

        int sum=0;

        int sum_even=0;

        while(num!=0){
            int rem = num%10;
            sum=(sum*10)+rem;
            num/=10;
        }

        int final_num = number;

        if(number==sum){
            while(number!=0) {
                int r = number % 10;
                if (r % 2 == 0) {
                    sum_even += r;
                }
                number /= 10;
            }
                if(sum_even >= 25){
                    System.out.println(final_num+" is a pallindrome and the sum of even digits is greater than 25");
                } else {
                    System.out.println(final_num+" is a pallindrome and the sum of even digits is lesser than 25");
                }

        } else {
            System.out.println(number+" is not a pallindrome");
        }

    }

    /* main method */
    public static void main(String ss[]){

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
        Pallindrome objPallindrome = new Pallindrome();
        objPallindrome.pallindromeCheck(num);

    }



}
