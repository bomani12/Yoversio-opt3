import java.util.ArrayList;

public class Voertuiglijst {
    private ArrayList<Voertuig> Voertuigen;

    public Voertuiglijst(){
        this.Voertuigen = new ArrayList<>();
    }
    public Boolean addVoertuig(Voertuig voertuig){
        return Voertuigen.add(voertuig);
    }
    public ArrayList<Voertuig> getVoertuigen(){
        return Voertuigen;
    }
    public String printVoertuigNamen(){
        String result = "";
        int i = 1;
        for (Voertuig voertuig : Voertuigen){
            result += i + ") Merk: " + voertuig.getMerk() + " Model: " + voertuig.getModel() + " Kenteken: " + voertuig.getKenteken() + "\n";
            i++;
        }
        return result;
    }

}
