import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatImplementation {

    private Scanner sc = new Scanner(System.in);
    private List<Cat> listCat = new ArrayList<Cat>();

    public void addCat() {
        Cat newCat = new Cat();
        System.out.println("Name:");
        newCat.setName(sc.nextLine());
        newCat.setAge(0);
        newCat.setHp(10);
        newCat.setAlive(true);
        System.out.println("Cat added");

        listCat.add(newCat);
    }

    public void printCats() {
        StringBuilder sb = new StringBuilder();
        for(Cat cat : listCat) {
            sb.append(cat.getName());
            sb.append(" / ");
            sb.append(cat.getAge());
            sb.append("\n");
            sb.toString();
            System.out.println(sb);
        }
    }
}
