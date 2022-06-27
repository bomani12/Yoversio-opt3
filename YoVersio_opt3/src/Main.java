import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welke maaltijd wil de klant bestellen?");
        System.out.println ();
        System.out.println("1. Verzekering Basis");
        System.out.println("2. Verzekering Basis met winterpakket");
        System.out.println("3. VerzekeringPlus ");
        System.out.println("4. VerzekeringPlus met winterpakket");
        System.out.println("4. VerzekeringPlus met helm");
        System.out.println("4. Verzekering Basis met helm");
        System.out.println ();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welke maaltijd? ");
        int keuze = scanner.nextInt();
        scanner.nextLine ();

        Accessoires accessoires;

        if ((keuze == 1) || (keuze == 2)|| (keuze == 6)) {
            accessoires = new VerzekeringBasis (keuze);
        }
        else {
            accessoires = new VerzekeringPlus (keuze);
        }

        System.out.println (accessoires.getBerekening ());
    }
}
