import java.util.Scanner;

public class Sneeuwschep {
    public Double getPrijsLine(){
        Double prijs = 0.0;
        System.out.println("Wilt u daar handschoenen bij?(J/N)");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextLine().equals("J")){
            prijs = 30.00;
        }else{
            prijs = 25.00;
        }
        return prijs;
    }
}
