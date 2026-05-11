import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        // LoadFiles siger "something went wrong" første gange man kører program
        // Det er fordi der ikke er gemt nogen fil endnu
        // Ik tænk over det
        File.loadFiles();

        Member newMember = new Member(getName(), getAge());
        System.out.println(Register.listOfMembers);

        File.saveFiles();

    }

    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");

        String name = "";
        name += scanner.nextLine();
        return name;
    }

    public static int getAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");

        int age = scanner.nextInt();
        return age;
    }
}
