import java.util.*;

public class rock_paper_sesser {
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSOR = "SCISSOR";

    public static void main(String[] args) {
        System.out.println("Enter anyy one of the following : -");
        System.out.println("ROCK");
        System.out.println("PAPER");
        System.out.println("SCISSOR");
        System.out.println("");

        String playermove = getplaymove();
        String computermove = getcomputermove();

        if (playermove.equals(computermove)) {
            System.out.println("game is tie ");
        } else if (playermove.equals(rock_paper_sesser.ROCK)) {
            if (computermove.equals(rock_paper_sesser.PAPER)) {
                System.out.println("computer wins ");
            } else
                System.out.println("player wins");
        } else if (playermove.equals(rock_paper_sesser.PAPER)) {
            if (computermove.equals(rock_paper_sesser.SCISSOR)) {
                System.out.println("computer wins ");
            } else
                System.out.println("player wins");
        } else if (computermove.equals(rock_paper_sesser.ROCK)) {
            System.out.println("computer wins ");
        } else
            System.out.println("player wins");

    }

    public static String getcomputermove() {
        String computermove;
        Random rand = new Random();
        int input = rand.nextInt(3) + 1;
        if (input == 1) {
            computermove = rock_paper_sesser.ROCK;
        } else if (input == 2) {
            computermove = rock_paper_sesser.PAPER;
        } else
            computermove = rock_paper_sesser.SCISSOR;
        System.out.println("Computer move is :- " + computermove);
        System.out.println(" ");
        return computermove;
    }

    public static String getplaymove() {
        Scanner mk = new Scanner(System.in);
        String input = mk.next();
        String playmove = input.toUpperCase();
        System.out.println("player move is :- " + playmove);
        return playmove;

    }
}
