import java.util.*;

public class VowelConsonant {

    /* method to determine whether each character in the entered string is a vowel or consonant  */
    public void determineVowelConsonants(String word) {

        for(int i=0; i<word.length(); i++) {


            if ((word.charAt(i) >= 'a' && word.charAt(i) <= 'z') ||(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')) {



                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {

                    System.out.println("vowel");

                } else {
                    System.out.println("consonant");
                }

            } else {
                System.out.println("Inavlid Input!");
            }
        }
    }

    /* main method */
    public static void main(String ss[]){
        System.out.println("Enter a word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        VowelConsonant objVowelConsonant = new VowelConsonant();
        objVowelConsonant.determineVowelConsonants(word);

    }
}
