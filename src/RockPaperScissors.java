import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args)  {
        int index = 0;
        while(index < 10) {
            playGame();
        }

    }

    public static void playGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("TYPE SELECTION: ");

        String userChoice = input.nextLine();
        System.out.println("YOU: " + userChoice);
        System.out.println("COMPUTER: " + randomCPU());

        choice(userChoice, randomCPU());
    }

    public static void choice(String userChoice, String computerChoice){

        String rock = "ROCK";
        String paper = "PAPER";
        String scissors = "SCISSORS";

        boolean win = false;

        switch(userChoice) {
            case "PAPER":
                if(computerChoice.equalsIgnoreCase(rock)) win = true;
                if(computerChoice.equalsIgnoreCase(scissors)) win = false;
                break;

            case "SCISSORS":
                if(computerChoice.equalsIgnoreCase(paper)) win = true;
                if(computerChoice.equalsIgnoreCase(rock)) win = false;
                break;

            case "ROCK":
                if(computerChoice.equalsIgnoreCase(scissors)) win = true;
                if(computerChoice.equalsIgnoreCase(paper)) win = false;
                break;

        }

        if (win) {
            System.out.println("You Win!!");
        }
        else {
            System.out.println("You Lose!!");
        }

    }

    public static String randomCPU() {
        int max = 2;
        int min = 0;
        double random = Math.floor(Math.random() * (max - min + 1) + min);

        String computer = "";


        switch ((int) random) {
            case 0:
                computer = "ROCK";
                break;
            case 1:
                computer = "SCISSORS";
                break;
            case 2:
                computer = "PAPER";
                break;
        }

        return computer;

    }
}
