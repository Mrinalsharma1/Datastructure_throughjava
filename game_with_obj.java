import java.util.Scanner;

class game {
    int num;
    int count = 0;

    public game(int maxum, int minum) {
        int max = maxum, min = minum;
        num = (int) (Math.random() * (max - min + 1) + min);
    }

    int takeUserInput() {
        Scanner mk = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 99");
        int x = mk.nextInt();
        if (x < num) {
            System.out.println("input number is less predect more");
            count++;
            takeUserInput();

        } else if (x > num) {
            System.out.println("input number is high predect more");
            count++;
            takeUserInput();

        } else if (x == num) {
            System.out.println("input number is matched");
        } else {
            System.out.println("wrong choise");
        }
        return count;
    }
    // void isCorrectNumber(){
    // if(super.x < num){

    // }
    // }

}

// Create a class Game, which allows a user to play "Guess the Number" game
// once.

// Game should have the following methods:
// Constructor to generate the random number
// takeUserInput() to take a user input of number
// isCorrectNumber() to detect whether the number entered by the user is true
// getter and setter for noOfGuesses
public class game_with_obj {
    public static void main(String[] args) {
        game obj = new game(99, 1);
        int temp = obj.takeUserInput();
        System.out.println("Number of step is" + temp);
    }
}
