import java.util.*;
public class CharacterType {

    /*  function to check the character type */
    public void checkType(String currentCharacter) {
        if(currentCharacter.charAt(0) >= 65 && currentCharacter.charAt(0) <= 90){
            System.out.println("Capital Letter");
        } else if (currentCharacter.charAt(0) >= 97 && currentCharacter.charAt(0) <= 122){
            System.out.println("Small letter");
        } else if (currentCharacter.charAt(0) >= 48 && currentCharacter.charAt(0) <= 57){
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }

    /* main method */
    public static void main(String ss[]) {
        String str;
        System.out.println("Enter a character: ");
        Scanner scanner = new Scanner(System.in); /*input is read using Scanner class*/
        str = scanner.nextLine();
        CharacterType objType = new CharacterType(); /* instance of the class checkType is created*/
        objType.checkType(str); /*Here we are calling the function checkType*/
    }
}
