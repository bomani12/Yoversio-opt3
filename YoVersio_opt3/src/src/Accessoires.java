public abstract class  Accessoires {
    private String Naam;
    private Double Prijs;
    private Sneeuwschep sneeuwschep;
    private Winterketting winterketting;
    private Helm helm;

    public Accessoires(int keuze, String naam, double prijs){
        this.Naam = naam;
        this.Prijs = prijs;
        if ((keuze == 2) || (keuze == 4)){
            sneeuwschep = new Sneeuwschep();
            winterketting = new Winterketting();
        }
        else if ((keuze == 5) || (keuze == 6)){
            helm = new Helm();
        }
    }
    public String getNaam() {
        return Naam;
    }

    public abstract Double getPrijsLine();

    public Double getPrijs(){
        return Prijs;
    }
    public Double getBerekening(){
        Double eindberekening = null;
        eindberekening += getPrijs();
        if (sneeuwschep != null){
            eindberekening += sneeuwschep.getPrijsLine();
        }
        if (winterketting != null){
            eindberekening += winterketting.getPrijsLine();
        }
        if (helm != null){
            eindberekening += winterketting.getPrijsLine();
        }
        return eindberekening;
    }
}
