public class VerzekeringBasis extends Accessoires{

    public VerzekeringBasis(int keuze){
        super(keuze, "Basis Verzekering",20.00);
    }

    @Override
    public Double getPrijsLine() {
        return 0.0;
    }
}
