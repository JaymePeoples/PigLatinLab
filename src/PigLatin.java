import java.util.Scanner;
import java.lang.StringBuffer;

/**
 * Created by Jayme Peoples on 6/30/2017.
 */
public class PigLatin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Pig Latin Translator!");//1. Display welcome message
        System.out.println("Please enter a line to be translated: ");//2. Prompt for user word
        String userInput = scan.nextLine();//3. get user input

        //4. translate user input
        //4.1 Convert input to lowercase
        userInput = userInput.toLowerCase();
        StringBuffer result = new StringBuffer(userInput);
        if (isVowel(userInput)) {//vowels
            result.append("way");
            //5. display result
            //6. prompt user to play again
        } else {//consanent
            result = piggifiedConsanent(userInput);
        }
        System.out.println(result);
    }

    private static StringBuffer piggifiedConsanent(String userInput) {
        StringBuffer sBuffer = new StringBuffer(userInput);

        for (int i = 0; i < userInput.length(); i++) {

            if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i' ||
                    userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u') {

                sBuffer = sBuffer.append(sBuffer.subSequence(0, i) + ("ay")); //add "ay" to end of word
                sBuffer.delete(0, i);//if word starts with a consanent move all consanents before vowels to end of word
                return sBuffer;
            }

        }
        return sBuffer;
    }


    //Translates a word using vowel pig Latin logic
//    private static StringBuffer piggifiedVowels(String userInput) {
//        StringBuffer result;
//        return re;
//    }

    //Determines if a word starts with a vowel or consanent
    private static boolean isVowel(String userInput) {
        if (userInput.charAt(0) == 'a' || userInput.charAt(0) == 'e' || userInput.charAt(0) == 'i' ||
                userInput.charAt(0) == 'o' || userInput.charAt(0) == 'u') {

            return true;
        } else {
            return false;
        }
    }
}

