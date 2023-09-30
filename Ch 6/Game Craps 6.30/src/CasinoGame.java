public class CasinoGame {
    public static void main(String[] args) {

        int point = rollTwoDice();

        int result = getResult(point);

        if (isNaturalOrCraps(result)) {
            printResult(result);
        }
        else {
            rollTilWinOrLose(result);
        }
    }

    public static int rollDice() {
        return (int)(1 + Math.random() * 6);
    }

    public static int rollTwoDice() {
        int dice1 = rollDice();
        int dice2 = rollDice();

        int sum = dice1 + dice2;

        System.out.println("you rolled " + dice1 + " + " + dice2 + " = " + sum);

        return sum;
    }

    public static int getResult(int point) {
        switch (point) {
            case 2, 3, 12 -> point = 0;
            case 7, 11 -> point = 1;
        }

        return point;
    }

    public static void printResult(int result) {
        if (result == 0) {
            System.out.println("You lose");
        } else if (result == 1) {
            System.out.println("You win");
        }
    }

    public static boolean isNaturalOrCraps(int result) {
        return  result == 0 || result == 1;
    }

    public static void rollTilWinOrLose(int point) {
        int result;

        do {
            result = rollTwoDice();
        } while (result != point && result != 7);

        if (result == 7)
            printResult(0);
        else
            printResult(1);
    }
}
