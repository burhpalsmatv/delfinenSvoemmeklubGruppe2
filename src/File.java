import java.io.*;
import java.util.ArrayList;

public class File {

    public File() {}

    public static void saveFiles() {
        try {
            ObjectOutputStream saveMember = new ObjectOutputStream(new FileOutputStream("listOfMembers.ser"));
            saveMember.writeObject(Register.listOfMembers);
            saveMember.close();

            ObjectOutputStream saveTrainer = new ObjectOutputStream(new FileOutputStream("listOfTrainers.ser"));
            saveTrainer.writeObject(Register.listOfTrainers);
            saveTrainer.close();

            ObjectOutputStream saveCompetitor = new ObjectOutputStream(new FileOutputStream("listOfCompetitors.ser"));
            saveCompetitor.writeObject(Register.listOfCompetitors);
            saveCompetitor.close();

            ObjectOutputStream saveCompetition = new ObjectOutputStream(new FileOutputStream("listOfCompetitions.ser"));
            saveCompetition.writeObject(Register.listOfCompetitions);
            saveCompetition.close();

        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }

    public static void loadFiles() {
        try {
            ObjectInputStream loadMember = new ObjectInputStream(new FileInputStream("listOfMembers.ser"));
            Register.listOfMembers = (ArrayList<Member>) loadMember.readObject();
            loadMember.close();

            ObjectInputStream loadTrainer = new ObjectInputStream(new FileInputStream("listOfTrainers.ser"));
            Register.listOfTrainers = (ArrayList<Trainer>) loadTrainer.readObject();
            loadTrainer.close();

            ObjectInputStream loadCompetitor = new ObjectInputStream(new FileInputStream("listOfCompetitors.ser"));
            Register.listOfCompetitors = (ArrayList<Competitor>) loadCompetitor.readObject();
            loadCompetitor.close();

            ObjectInputStream loadCompetitions = new ObjectInputStream(new FileInputStream("listOfCompetitions.ser"));
            Register.listOfCompetitions = (ArrayList<Competition>) loadCompetitions.readObject();
            loadCompetitions.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Something went wrong");
        }
    }
}