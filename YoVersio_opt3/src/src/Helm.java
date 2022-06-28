import java.util.Scanner;

public class Helm {
    public Double getPrijsLine(){
        Double prijs = 0.0;
        System.out.println("Wilt u daar een grote of klein helm?(G/K)");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextLine().equals("G")){
            prijs = 10.00;
        }else{
            prijs = 7.50;
        }
        return prijs;
    }
}
