import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args)  {

        System.out.println("Welcome To Bash Em!, Wrap Em!, & Slice Em! \n What is Your Name? ");

        int index = 0;
        while(index < 10) {
            playGame(index);
            index++;
        }

    }

    public static void playGame(int count) {

        if(count<1) {
            Scanner userName = new Scanner(System.in);
            System.out.println("Enter Name: ");

            String user = userName.nextLine();
            System.out.println("Hi " + user + "! Ready to get started?");

            System.out.println("Enter 1 of 3 selections. \n " +
                    "From 'ROCK', 'PAPER' or 'SCISSORS' \n " +
                    "The computer will play back! \n " +
                    "Are you ready for this game of chance!?!?");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("TYPE SELECTION: ");

        String userChoice = input.nextLine().toUpperCase();
        String computerChoice = randomRPS();

        System.out.println("YOU: " + userChoice);
        System.out.println("COMPUTER: " + computerChoice);

        choice(userChoice, computerChoice);
    }

    public static void choice(String userChoice, String computerChoice){

        String rock = "ROCK";
        String paper = "PAPER";
        String scissors = "SCISSORS";

        boolean win = false;

        if (userChoice.equals(computerChoice)) System.out.println("ISSA DRAW!! Play Again!!");

        if(userChoice.equals(rock) && computerChoice.equals(scissors))  win = true;
        if(userChoice.equals(paper) && computerChoice.equals(rock))  win = true;
        if(userChoice.equals(scissors) && computerChoice.equals(paper))  win = true;

        if(win) {
            System.out.println("You Win!!");
        }
        else if(!userChoice.equals(computerChoice) && win == false)  {
            System.out.println("You Lose :(!!");
        }

    }

    public static String randomRPS() {

        String heartOfTheCards = "";
        double random = Math.floor(Math.random() * (2 - 0 + 1) + 0);

        switch ((int) random) {
            case 0:
                heartOfTheCards = "ROCK";
                break;
            case 1:
                heartOfTheCards = "SCISSORS";
                break;
            case 2:
                heartOfTheCards = "PAPER";
                break;
        }

        return heartOfTheCards;

    }
}
