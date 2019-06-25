import java.util.*;
public class GuessGame {

    /* function to check whether the number guessed matches the target number */
    public void guessNumber(int target) {
       int randomNum;
        do{
            Random rand = new Random();
            randomNum = rand.nextInt((100-1)+1)+1; /* random number between 1 to 100 is generated */
            if(randomNum > target){
                System.out.println("Number guessed is more than the original number");
            } else {
                System.out.println("Number guessed is less than original number");
            }
        } while(randomNum != target); /* loop continues as long as the guessed number does not match the target */

        System.out.println("Number matches the original number");
    }

    /* main method */
    public static void main(String ss[]) {
        System.out.println("Enter the target number between 1 to 100: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        GuessGame objGame = new GuessGame();
        objGame.guessNumber(input);

    }
}
