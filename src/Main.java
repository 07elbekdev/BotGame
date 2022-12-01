import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----<<<Start game>>>-----" + "\n" + "Predicate amount of points (2 ... 12)" + "\n" + "Write here:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.err.println("User rolls the dises... ");
        int count = 1;
        if (number > 1 && number < 13) {
            while (count != 4) {
                game(number);
                count++;
                if (count != 4) {
                    System.out.println("-----<<<Round " + count + ">>>-----" + "\n" + "Predicate amount of points (2 ... 12)" + "\n" + "Write here:");
                    number = scanner.nextInt();
                    System.err.println("User rolls the dises....");
                }
            }
        }
    }

    public static void game(int a) {
        Random random = new Random();
        int ran = random.nextInt(1, 6);
        int ran0 = random.nextInt(1, 6);
        cubUser1(ran);
        cubUser1(ran0);
        int plus = ran + ran0;
        int b = Math.max(plus, a);
        int c = Math.min(plus, a);
        int d = b - c;
        int p = d * 2;
        int botNumber = random.nextInt(2, 12);
        System.out.println("Number bot: " + botNumber);
        int superPlus = random.nextInt(1, 6);
        int superMinus = random.nextInt(1, 6);
        cubUser1(superPlus);
        cubUser1(superMinus);
        int megaPlus = superPlus + superMinus;
        int q = Math.max(megaPlus, botNumber);
        int w = Math.min(megaPlus, botNumber);
        int e = q - w;
        int o = e * 2;
        System.out.println("-----Current score-----");
        System.out.println("point user: " + p + "\n" + "point bot: " + o);
        int countUser = 0;
        int countBot = 0;
        int countDraw = 0;
        if (p > o) {
            int num = p - o;
            System.out.println("User is ahead by " + num + " points!");
            countUser++;
        } else if (p == o) {
            System.out.println("Draw");
            countDraw++;
        } else {
            int num1 = p - o;
            System.out.println("Bot is ahead by " + num1 + " points!");
            countBot++;
        }
        if (countBot > countUser && countDraw < countBot) {
            System.out.println("Bot win");
        } else if (countUser > countBot && countUser > countDraw) {
            System.out.println("User win");
        } else {
            System.out.println("Draw");
        }
    }

    public static void cubUser1(int randomForCub) {
        switch (randomForCub) {
            case 1:
                System.out.println("+-------+\n|       |\n|   #   |\n|       |\n+-------+");
                break;
            case 2:
                System.out.println("+-------+\n| #     |\n|       |\n|     # |\n+-------+");
                break;
            case 3:
                System.out.println("+-------+\n|     # |\n|   #   |\n| #     |\n+-------+");
                break;
            case 4:
                System.out.println("+-------+\n| # #   |\n| # #   |\n|       |\n+-------+");
                break;
            case 5:
                System.out.println("+-------+\n| #   # |\n|   #   |\n| #   # |\n+-------+");
                break;
            case 6:
                System.out.println("+-------+\n| #   # |\n| #   # |\n| #   # |\n+-------+");
                break;
        }
    }
}