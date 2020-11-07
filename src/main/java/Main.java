import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CatImplementation catImplementation = new CatImplementation();

        System.out.println("Wybierz opcje:");
        System.out.println("1 - dodaj, 2 - druk, 0 - wyjscie");
        int option = -1;

        while(option != 0) {
            option = sc.nextInt();
            switch (option) {
                case 1:
                    catImplementation.addCat();
                    break;
                case 2:
                    catImplementation.printCats();
                    break;
                case 0:
                    System.out.println("Wyjscie");
                    break;
                default:
                    System.out.println("ERR");
            }
            System.out.println("1 - dodaj, 2 - druk, 0 - wyjscie");
        }

    }
}
