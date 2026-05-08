import javax.annotation.processing.Filer;
import java.io.*;

public class File {

    static BufferedWriter writer;
    static BufferedReader reader;

    public static void readTest() {
            try {

                BufferedReader reader = new BufferedReader(new FileReader("Members.txt"));

                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(reader.readLine());
                }

                reader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

    public File() {
        // Tom konstruktør
    }

    public static void writeFileMembers() {
        try {
            writer = new BufferedWriter(new FileWriter("Members.txt"));
            writer.write(String.valueOf(Register.listOfMembers));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFileTrainers() {
        try {
            writer = new BufferedWriter(new FileWriter("Trainers.txt"));
            writer.write(String.valueOf(Register.listOfTrainers));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFileCompetitors() {
        try {
            writer = new BufferedWriter(new FileWriter("Competitors.txt"));
            writer.write(String.valueOf(Register.listOfCompetitors));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFileCompetition() {
        try {
            writer = new BufferedWriter(new FileWriter("Competetion.txt"));
            writer.write(String.valueOf(Register.listOfCompetitions));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
