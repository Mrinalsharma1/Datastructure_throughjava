import java.util.Random;
import java.util.Scanner;

class game {
    int number;
    int inputnumber;
    int noofguess = 0;

    public int getnoofguess() {
        return noofguess;
    }

    public void setnoofguess(int noofguess) {
        this.noofguess = noofguess;
    }

    game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeuserinput() {
        System.out.println("guess the number");
        Scanner sk = new Scanner(System.in);
        inputnumber = sk.nextInt();
    }
    boolean iscorrectnumber(){
        noofguess++;
        if(inputnumber == number){
            System.out.format("yes your guess is right,  it was %d\n You guessed it in %d attempts",number,noofguess);
            return true;
        }
        else if(inputnumber<number){
            System.out.println("number is less try to find again");
        }
        else if(inputnumber>number){
            System.out.println("number is greater try to find again");
        }
        return false;
    }
}

public class guess_the_num {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while(!b){
            g.takeuserinput();
            b= g.iscorrectnumber();
        }
    }
}
