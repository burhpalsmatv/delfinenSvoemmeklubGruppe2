import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        Member mads = new Member("Mads", MedlemsType.SENIOR, "22334455");

            while(scan.hasNext()){
                System.out.printf("""
                        Hvad vil du ændre?
                        Tast 1 for at ændre navn
                        Tast 2 for at ændre medlemstype
                        Tast 3 for at ændre telefonnummer
                        Tast 4 for at ændre alder
                        Tast 5 for at ændre adresse
                        Tast 6 for at ændre postnummer
                        Tast 7 for at ændre email
                        Tast 8 for at ændre køn
                        Tast 9 for at ændre kategori
                        Tast 10 for at ændre 
                        """);
            switch (scan.nextLine()){
                case 1:

            }
        }
    }
}
