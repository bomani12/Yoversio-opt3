public abstract class Voertuig {
    private String Merk;
    private String Model;
    private String RijbewijsType;
    private String Kenteken;
    private Double Dagprijs;

    public Voertuig(String merk, String model, String rijbewijsType, String kenteken, Double dagprijs){
        this.Merk = merk;
        this.Model = model;
        this.RijbewijsType = rijbewijsType;
        this.Kenteken = kenteken;
        this.Dagprijs = dagprijs;
    }
public abstract String getVoertuigInfo(Voertuig voertuig);


    public String getMerk() {
        return Merk;
    }

    public String getModel() {
        return Model;
    }

    public String getRijbewijsType() {
        return RijbewijsType;
    }

    public Double getDagprijs() {
        return Dagprijs;
    }

    public String getKenteken() {
        return Kenteken;
    }

    public void setDagprijs(Double dagprijs) {
        Dagprijs = dagprijs;
    }

    public void setKenteken(String kenteken) {
        Kenteken = kenteken;
    }

}
