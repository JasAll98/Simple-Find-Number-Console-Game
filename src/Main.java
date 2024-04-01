import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int topilganSon;
        int counter = 0;

        int oylanganSon = random.nextInt(99);

        System.out.print("Men o'ylangan sonnni toping: ");
        topilganSon = scanner.nextInt();

        while (true) {

            if (topilganSon > oylanganSon) {
                System.out.print("Men o'ylagan sonim kichikroq...");
                topilganSon = scanner.nextInt();
                counter++;
            } else if (topilganSon < oylanganSon) {
                System.out.print("Men o'ylagan sonim kattaroq...");
                topilganSon = scanner.nextInt();
                counter++;
            } else {
                System.out.print(counter + " ta urinishdan keyin topdingiz");
                break;
            }

        }

    }
}