import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static Controleergegevens controle = new Controleergegevens();
    static Huurderlijst huurderlijst1 = Huurderlijst.getInstance();
    static Scanner scanner = new Scanner(System.in);
    static Voertuiglijst voertuiglijst1 = new Voertuiglijst();
    static ControleVoertuig vcontrole = new ControleVoertuig();
    static ControleerHO controleerHO = new ControleerHO();
    static Huurprijs huurprijsbereking = new Huurprijs();

    public static void main(String[] args) throws ParseException {

    int keuze = 1;
    while(keuze != 0){
        menu();
        keuze = scanner.nextInt();
        switch (keuze){
            case 1 -> voegHuurderToe();
            case 2 -> adminHuurders();
            case 3 -> maakHuurovereenkomst();
            case 4 -> voegVoertuigToe();
            case 5 -> adminVoertuig();
            //case 6 -> accessoiresVraag()
        }
    }

    }




    private static void menu() {
        System.out.println("===================");
        System.out.println("Hoofdmenu");
        System.out.println("0) Uitloggen.");
        System.out.println("1) Voeg een huurder toe.");
        System.out.println("2) Wijzig huurders gegevens.");
        System.out.println("3) Maak een huurovereenkomst.");
        System.out.println("4) Voeg een voertuig toe.");
        System.out.println("5) Wijzig voertuig gegevens.");
        System.out.println("6) Accessoires vragen.");
    }
    public static void voegHuurderToe() throws ParseException {
        SimpleDateFormat dateF = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Voer de naam in van de huurder die u wilt toevoegen:");
        scanner.nextLine();
        String hNaam = scanner.nextLine();
        System.out.println("Voer de geboortedatum in van de huurder die u wilt toevoegen:");
        String gd = scanner.nextLine();
        Date hGeboortedatum = dateF.parse(gd);
        System.out.println("Voer het adres in van de huurder die u wilt toevoegen:");
        String hAdres = scanner.nextLine();
        System.out.println("Voer het telefoonnummer in van de huurder die u wilt toevoegen:");
        String hTelefoonnnummer = scanner.nextLine();
        System.out.println("Voer het type rijbewijs in van de huurder die u wilt toevoegen:");
        String hTypeRijbewijs = scanner.nextLine();
        if(controle.DubbelCheckGegevens(hTelefoonnnummer,hTypeRijbewijs)){
            Huurder nieuwehuurder = new Huurder(hNaam, hGeboortedatum,hAdres,hTelefoonnnummer,hTypeRijbewijs);
            huurderlijst1.addToLijst(nieuwehuurder);
            System.out.println("Huurder succesvol toegevoegd.");
        }else{
            System.out.println("Huurder is niet door check gekomen controleer het telefoonnummer en/of het type rijbewijs.");
        }
    }
    public static void wijzigNaam(Huurder huurder){
        System.out.println("Naar welke naam wilt u de huurder wijzigen:");
        scanner.nextLine();
        String hNaam = scanner.nextLine();
        huurder.setNaam(hNaam);
    }
    public static void wijzigAdres(Huurder huurder){
        System.out.println("Naar welke adres wilt u de huurder wijzigen:");
        scanner.nextLine();
        String hAdres = scanner.nextLine();
        huurder.setNaam(hAdres);
    }
    public static void wijzigTelefoonnummer(Huurder huurder){
        System.out.println("Naar welke telefonnummer wilt u de huurder wijzigen:");
        scanner.nextLine();
        String hTelefoonnummer = scanner.nextLine();
        huurder.setNaam(hTelefoonnummer);
    }
    public static void wijzigTyperijbewijs(Huurder huurder){
        System.out.println("Naar welke type rijbewijs wilt u de huurder wijzigen:");
        scanner.nextLine();
        String hTypeRijbewijs = scanner.nextLine();
        huurder.setNaam(hTypeRijbewijs);
    }
    public static void wijzigSchadehistorie(Huurder huurder){
        System.out.println("In wat wil u de huurders schadehistorie wijzigen:");
        scanner.nextBoolean();
        String hSchade = scanner.nextLine();
        huurder.setNaam(hSchade);
    }
    public static void adminHuurders(){
        System.out.println("Voor welke huurder wilt u wijzigen:");
        System.out.println(huurderlijst1.printHuurders());
        int hNummer = scanner.nextInt() - 1;
        Huurder huurder = huurderlijst1.getLijst().get(hNummer);
        int minikeuze = 1;
        while (minikeuze != 0){
            System.out.println("0) Naar hoofdmenu" + "\n\r");
            System.out.println("1) Naam wijzigen"+ "\n\r");
            System.out.println("2) Adres wijzigen"+ "\n\r");
            System.out.println("3) Telefoonnummer wijzigen"+ "\n\r");
            System.out.println("4) Type rijbewijs wijzigen"+ "\n\r");
            System.out.println("5) Schade historie wijzigen"+ "\n\r");
            minikeuze = scanner.nextInt();
            switch (minikeuze){
                case 1 -> {
                    wijzigNaam(huurder);
                }
                case 2 -> {
                    wijzigAdres(huurder);
                }
                case 3 -> {
                    wijzigTelefoonnummer(huurder);
                }
                case 4 -> {
                    wijzigTyperijbewijs(huurder);
                }
                case 5 -> {
                    wijzigSchadehistorie(huurder);
                }
            }
        }

    }
    private static void maakHuurovereenkomst() throws ParseException {
        SimpleDateFormat dateF = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Voor welke huurder wilt u een overeenkomst maken:");
        System.out.println(huurderlijst1.printHuurders());
        int hNummer = scanner.nextInt() - 1;
        Huurder huurder = huurderlijst1.getLijst().get(hNummer);
        System.out.println("Voor welk voertuig wilt u een overeenkomst maken:");
        System.out.println(voertuiglijst1.printVoertuigNamen());
        int vNummer = scanner.nextInt() - 1;
        Voertuig voertuig = voertuiglijst1.getVoertuigen().get(vNummer);
        System.out.println("Voer de datum van wanneer de huurovereenkomst in gaat:");
        scanner.nextLine();
        String hd = scanner.nextLine();
        Date oHuurdatum = dateF.parse(hd);
        System.out.println("Voer de datum van wanneer de huurovereenkomst eindigt:");
        String ed = scanner.nextLine();
        Date oEinddatum = dateF.parse(ed);
        System.out.println("Voer de afgesproken borg prijs in:");
        double oborg = scanner.nextDouble();
        //(Huurder huurder, Voertuig voertuig, Date huurdatum, Date einddatum)

        if (controleerHO.CheckHoGeschikt(huurder,voertuig)) {
            System.out.println("Uw prijs totale huurpijs is " + huurprijsbereking.BerekenHuurPrijs(huurder,voertuig,oHuurdatum,oEinddatum) + " en de borg bedraagd:" + oborg);
            Huurovereenkomst huurovereenkomst1 = new Huurovereenkomst(huurder, voertuig, oHuurdatum, oEinddatum, oborg);
            System.out.println("Huurovereenkomst succesvol aangemaakt");
        }
    }
    private static void voegVoertuigToe() {
        System.out.println("Welk voertuig wilt u toevoegen?");
        System.out.println("1) Auto");
        System.out.println("2) Scooter");
        System.out.println("3) Overige Voertuig");
        int vkeuze = scanner.nextInt();
        switch (vkeuze){
            case 1 ->{
                System.out.println("Wat is het automerk?");
                scanner.nextLine();
                String vMerk = scanner.nextLine();
                System.out.println("Wat is het model?");
                String vModel = scanner.nextLine();
                System.out.println("Wat is het benodigde rijbewijs type?");
                String vRT = scanner.nextLine();
                System.out.println("Wat is het kenteken?");
                String vKenteken = scanner.nextLine();
                System.out.println("Wat is de dagprijs?");
                double vDagprijs = scanner.nextDouble();
                if (vcontrole.DubbelCheckVoertuig(vRT,vKenteken)){
                    Voertuig auto1 = new Auto(vMerk,vModel,vRT,vKenteken,vDagprijs);
                    voertuiglijst1.addVoertuig(auto1);
                    System.out.println("Succesvol toegevoegd.");
                } else{
                    System.out.println("Auto is niet toegevoegd.");
                }
            }
            case 2 ->{
                System.out.println("Wat is het scootermerk?");
                scanner.nextLine();
                String vMerk = scanner.nextLine();
                System.out.println("Wat is het model?");
                String vModel = scanner.nextLine();
                System.out.println("Wat is het benodigde rijbewijs type?");
                String vRT = scanner.nextLine();
                System.out.println("Wat is het kenteken?");
                String vKenteken = scanner.nextLine();
                System.out.println("Wat is de dagprijs?");
                double vDagprijs = scanner.nextDouble();
                if (vcontrole.DubbelCheckVoertuig(vRT,vKenteken)){
                    Voertuig scooter1 = new Scooter(vMerk,vModel,vRT,vKenteken,vDagprijs);
                    voertuiglijst1.addVoertuig(scooter1);
                    System.out.println("Succesvol toegevoegd.");
                } else{
                    System.out.println("Scooter is niet toegevoegd.");
                }
            }

            case 3 ->{
                System.out.println("Wat is het voertuig merk?");
                scanner.nextLine();
                String vMerk = scanner.nextLine();
                System.out.println("Wat is het model?");
                String vModel = scanner.nextLine();
                System.out.println("Wat is het benodigde rijbewijs type?");
                String vRT = scanner.nextLine();
                System.out.println("Wat is het kenteken?");
                String vKenteken = scanner.nextLine();
                System.out.println("Wat is de dagprijs?");
                double vDagprijs = scanner.nextDouble();
                System.out.println("Vul hier extra info over het voertuig in ?");
                scanner.nextLine();
                String vExtraInfo = scanner.nextLine();
                if (vcontrole.DubbelCheckVoertuig(vRT,vKenteken)){
                    OverigeVoertuigenAdapter vOverig = new OverigeVoertuigenAdapter(vMerk,vModel,vRT,vKenteken,vDagprijs,vExtraInfo);
                    voertuiglijst1.addVoertuig(vOverig);
                    System.out.println("Succesvol toegevoegd.");
                } else{
                    System.out.println("Voertuig is niet toegevoegd.");
                }
            }
        }

    }
    public static void wijzigDagprijs(Voertuig voertuig){
        System.out.println("Wat is de nieuwe dagprijs");
        scanner.nextLine();
        Double vPrijs = scanner.nextDouble();
        voertuig.setDagprijs(vPrijs);
    }
    public static void wijzigKenteken(Voertuig voertuig){
        System.out.println("Wat is het nieuwe kenteken");
        scanner.nextLine();
        String vKenteken = scanner.nextLine();
        voertuig.setKenteken(vKenteken);
    }
    private static void adminVoertuig() {
        System.out.println("Welk voertuig wilt u wijzigen:");
        System.out.println(voertuiglijst1.printVoertuigNamen());
        int hNummer = scanner.nextInt() - 1;
        Voertuig voertuig = voertuiglijst1.getVoertuigen().get(hNummer);
        int minikeuze = 1;
        while (minikeuze != 0){
            System.out.println("0) Naar hoofdmenu" + "\n\r");
            System.out.println("1) Dagprijs wijzigen"+ "\n\r");
            System.out.println("2) Kenteken wijzigen"+ "\n\r");
            System.out.println("3) Extra info wijzigen");
            minikeuze = scanner.nextInt();
            switch (minikeuze){
                case 1 -> {
                    wijzigDagprijs(voertuig);
                }
                case 2 -> {
                    wijzigKenteken(voertuig);
                }

            }
        }

    }
    /*  System.out.println("Welke maaltijd wil de klant bestellen?");
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

        System.out.println (accessoires.getBerekening ());*/

}
