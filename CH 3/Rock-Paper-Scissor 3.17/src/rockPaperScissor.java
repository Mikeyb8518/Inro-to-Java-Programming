import java.util.Scanner;

public class rockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int scissor = 0;
        int rock = 1;
        int paper = 2;

        System.out.println("Enter Your Choice");
        System.out.println("Scissor (0), Rock (1), Paper (2): ");

        int user = input.nextInt();

        if (user == 0 || user == 1 || user ==2) {
            int comp = (int)(Math.random() * 3);
            String result = "The computer is ";

            switch(user) {
                case 0:
                    if (comp == scissor) {
                        result += "Scissor, You are Scissor too. It's a draw";
                    } else if (comp == rock) {
                        result += "Rock, You are Scissor. You Lose";
                    } else if (comp == paper) {
                        result += "Paper, You are Scissor. You Won";
                    }
                    break;

                case 1:
                    if (comp == scissor) {
                        result += "Scissor, You are Rock. You Won";
                    } else if (comp == rock) {
                        result += "Rock, You are Rock too. It's a draw";
                    } else if (comp == paper) {
                        result += "Paper, You are Rock. You lose";
                    }
                    break;

                case 2:
                    if (comp == scissor) {
                        result += "Scissor, You are Paper. You Lose";
                    } else if (comp == rock) {
                        result += "Rock, You are Paper. You Won";
                    } else if (comp == paper) {
                        result += "Paper, You are Paper too. It's a draw";
                    }
                    break;
            }
            System.out.println(result);
        }
        else {
            System.out.println("Please Enter a Valid Number To Play Game");
        }
    }
}
