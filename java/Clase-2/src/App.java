import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String wordSecret = "teamo";
        int wordSize = wordSecret.length();
      
        int maximumAttempt = 3;
        int count = 0;
      
        boolean isGuess = false;
        boolean letterCorrect = false;

        char[] letterGuesses = new char[wordSize];
        

        for (int i = 0; i < letterGuesses.length; i++) {
            letterGuesses[i] = '_';
        }


        while (!isGuess & count < maximumAttempt ) {
            System.out.println("Palabra a adivinar " + String.valueOf(letterGuesses));
            System.out.println("Introduce una letra!");
            char letter = scanner.next().charAt(0);

            for (int i = 0; i < wordSize; i++) {
                if(wordSecret.charAt(i) == letter){
                    letterGuesses[i] = letter;
                    letterCorrect = true;
                }
            }
            if(!letterCorrect){
                count++;
                System.out.println("Incorrecto te quedan " + (maximumAttempt - count) + " intentos") ;
            }
            if(String.valueOf(letterGuesses).equals(wordSecret)){
                isGuess = true;
                System.out.println("Felicitaciones! haz adivinado " + wordSecret);
            }
        }


        if(!isGuess){
            System.out.println("GAME OVER!");
        }

        scanner.close();

    }
}
