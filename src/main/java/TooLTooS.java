import java.util.Scanner;
import java.util.Random;


public class TooLTooS {

   private int guessCount;
   private int userInput;
   private int answer;



    public int randNum(){
         Random num = new Random();
         return num.nextInt(10);
     }


    public void runGame() {


        while (true) {
                //start the program
            setUserInput();
            if (getUserInput() == 1) {
                //game
                setAnswer(randNum());
                while(true) {

                    setUserInput();

                    if (getUserInput() == getAnswer()) {

                        System.out.println("CONGRATS!");
                        System.out.println("You guessed it in "+getGuessCount()+" tries!");
                        System.out.println("Play again?");
                        System.out.println("press 1.) Yes  2.) No");
                        setAnswer(randNum());
                        break;
                    } else if (getUserInput() > getAnswer()) {
                        setGuessCount(getGuessCount()+1);
                        System.out.println("TOO LARGE");
                    } else if (getUserInput() < getAnswer()) {
                        setGuessCount(getGuessCount()+1);
                        System.out.println("too small");
                    } else {
                        System.out.println("TRY AGAIN!");
                    }
                }

            } else if (getUserInput() == 2) {
                //end the program
                System.exit(0);
                //"Catch"
            } else {
                System.out.println("INVALID INPUT");

            }
        }
    }

    public int getGuessCount() {
        return guessCount;
    }

    public void setGuessCount(int guessCount) {
        this.guessCount = guessCount;
    }

    public int getUserInput() {
        return userInput;
    }

    public void setUserInput() {
        this.userInput = new Scanner(System.in).nextInt();
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
