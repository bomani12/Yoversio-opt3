import java.util.Scanner;

public class Winterketting {

    public Double getPrijsLine(){
       Double prijs = 0.0;
        System.out.println("Welk formaat winterkettingen, groot/medium/klein?(G/M/K)");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextLine().equals("G")){
            prijs = 20.00;
        }else if (scanner.nextLine().equals("M")){
            prijs = 15.00;
        }else if (scanner.nextLine().equals("K")){
            prijs = 10.00;
        }
        return prijs;
    }
}
