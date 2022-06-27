public class VerzekeringPlus extends Accessoires {
    public VerzekeringPlus(int keuze){
        super(keuze, "Verzekering Plus",30.00);
    }
    public Double getPrijsLine() {
        System.out.println("Wilt u gaat u naar het buitenland? (J/N)");
        return 0.0;
    }
}
