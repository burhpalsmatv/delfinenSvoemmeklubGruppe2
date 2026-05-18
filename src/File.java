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
            ObjectOutputStream savePassiveMember = new ObjectOutputStream(new FileOutputStream("listOfPassiveMembers.ser"));
            savePassiveMember.writeObject(Register.listOfPassiveMembers);
            savePassiveMember.close();

            // Casual members
            ObjectOutputStream saveCasualMember = new ObjectOutputStream(new FileOutputStream("listOfCasualMembers.ser"));
            saveCasualMember.writeObject(Register.listOfCasualMembers);
            saveCasualMember.close();

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

            // IDs ------------------------------------------

            //Used Member IDs
            ObjectOutputStream saveUsedMemberIDs = new ObjectOutputStream(new FileOutputStream("listOfUsedMemberIDs.ser"));
            saveUsedMemberIDs.writeObject(Register.listOfUsedMemberIDs);
            saveUsedMemberIDs.close();

            //Used Trainer IDs
            ObjectOutputStream saveUsedTrainerIDs = new ObjectOutputStream(new FileOutputStream("listOfUsedTrainerIDs.ser"));
            saveUsedTrainerIDs.writeObject(Register.listOfUsedTrainerIDs);
            saveUsedTrainerIDs.close();

            //Used Competition IDs
            ObjectOutputStream saveUsedCompetitionIDs = new ObjectOutputStream(new FileOutputStream("listOfUsedCompetitionIDs.ser"));
            saveUsedCompetitionIDs.writeObject(Register.listOfUsedCompetitionIDs);
            saveUsedCompetitionIDs.close();
    }

    public static void loadFiles() throws IOException, ClassNotFoundException {
        // Members
        ObjectInputStream loadMember = new ObjectInputStream(new FileInputStream("listOfMembers.ser"));
        Register.listOfMembers = (ArrayList<Member>) loadMember.readObject();
        loadMember.close();

        // Passive members
        ObjectInputStream loadPassiveMember = new ObjectInputStream(new FileInputStream("listOfPassiveMembers.ser"));
        Register.listOfPassiveMembers = (ArrayList<MemberPassive>) loadPassiveMember.readObject();
        loadPassiveMember.close();

        // Casual members
        ObjectInputStream loadCasualMember = new ObjectInputStream(new FileInputStream("listOfCasualMembers.ser"));
        Register.listOfCasualMembers = (ArrayList<MemberCasual>) loadCasualMember.readObject();
        loadCasualMember.close();

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
        ObjectInputStream loadUsedMemberIDs = new ObjectInputStream(new FileInputStream("listOfUsedMemberIDs.ser"));
        Register.listOfUsedMemberIDs = (ArrayList<String>) loadUsedMemberIDs.readObject();
        loadUsedMemberIDs.close();

        // Used Trainer IDs
        ObjectInputStream loadUsedTrainerIDs = new ObjectInputStream(new FileInputStream("listOfUsedTrainerIDs.ser"));
        Register.listOfUsedTrainerIDs = (ArrayList<String>) loadUsedTrainerIDs.readObject();
        loadUsedTrainerIDs.close();

        // Used Competition IDs
        ObjectInputStream loadUsedCompetitionIDs = new ObjectInputStream(new FileInputStream("listOfUsedCompetitionIDs.ser"));
        Register.listOfUsedCompetitionIDs = (ArrayList<String>) loadUsedCompetitionIDs.readObject();
        loadUsedCompetitionIDs.close();

    }
}