import java.io.*;
import java.util.ArrayList;

public class File {
// skal gemmes som .csv filer // bufferedwriter&reader?
    public File() {}

    public static void saveFiles() throws IOException {
            // Members
            ObjectOutputStream saveMember = new ObjectOutputStream(new FileOutputStream("listOfMembers.ser"));
            saveMember.writeObject(Register.listOfMembers);
            saveMember.close();

            // Passive members
            //
            // ADD CODE
            //
            //


            // Casual members
            //
            // ADD CODE
            //
            //

            // Competitors members
            ObjectOutputStream saveCompetitor = new ObjectOutputStream(new FileOutputStream("listOfCompetitors.ser"));
            saveCompetitor.writeObject(Register.listOfCompetitors);
            saveCompetitor.close();

            // Trainers
            ObjectOutputStream saveTrainer = new ObjectOutputStream(new FileOutputStream("listOfTrainers.ser"));
            saveTrainer.writeObject(Register.listOfTrainers);
            saveTrainer.close();

            // Competitions
            ObjectOutputStream saveCompetition = new ObjectOutputStream(new FileOutputStream("listOfCompetitions.ser"));
            saveCompetition.writeObject(Register.listOfCompetitions);
            saveCompetition.close();

            //Used Member IDs
            ObjectOutputStream saveUsedMemberIDs = new ObjectOutputStream(new FileOutputStream("listOfUsedMemberIDs.ser"));
            saveCompetition.writeObject(Register.listOfUsedMemberIDs);
            saveCompetition.close();

            //Used Trainer IDs
            ObjectOutputStream saveUsedTrainerIDs = new ObjectOutputStream(new FileOutputStream("listOfUsedTrainerIDs.ser"));
            saveCompetition.writeObject(Register.listOfUsedTrainerIDs);
            saveCompetition.close();

            //Used Competition IDs
            ObjectOutputStream saveUsedCompetitionIDs = new ObjectOutputStream(new FileOutputStream("listOfUsedCompetitionIDs.ser"));
            saveCompetition.writeObject(Register.listOfUsedCompetitionIDs);
            saveCompetition.close();
    }

    public static void loadFiles() throws IOException, ClassNotFoundException {
        // Members
        ObjectInputStream loadMember = new ObjectInputStream(new FileInputStream("listOfMembers.ser"));
        Register.listOfMembers = (ArrayList<Member>) loadMember.readObject();
        loadMember.close();

        // Passive members
        //
        // ADD CODE
        //
        //


        // Casual members
        //
        // ADD CODE
        //
        //

        // Competitors
        ObjectInputStream loadCompetitor = new ObjectInputStream(new FileInputStream("listOfCompetitors.ser"));
        Register.listOfCompetitors = (ArrayList<Competitor>) loadCompetitor.readObject();
        loadCompetitor.close();

        // Trainers
        ObjectInputStream loadTrainer = new ObjectInputStream(new FileInputStream("listOfTrainers.ser"));
        Register.listOfTrainers = (ArrayList<Trainer>) loadTrainer.readObject();
        loadTrainer.close();

        // Competitions
        ObjectInputStream loadCompetitions = new ObjectInputStream(new FileInputStream("listOfCompetitions.ser"));
        Register.listOfCompetitions = (ArrayList<Competition>) loadCompetitions.readObject();
        loadCompetitions.close();

        // Used Member IDs
        //
        // ADD CODE
        //
        //


        // Used Trainer IDs
        //
        // ADD CODE
        //
        //

        // Used Competition IDs
        //
        // ADD CODE
        //
        //

    }
}