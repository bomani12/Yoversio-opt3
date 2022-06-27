import java.util.ArrayList;
import java.util.Collections;

public class Huurderlijst {
    private static Huurderlijst huurderlijst;
    private static ArrayList<Huurder> huurderArrayList = new ArrayList<>();

    private Huurderlijst(){}

    public static Huurderlijst getInstance(){
        if (huurderlijst == null){
            huurderlijst = new Huurderlijst();
        }
        return huurderlijst;
    }
    public ArrayList<Huurder> getLijst(){
        return huurderArrayList;
    }
    public Boolean addToLijst(Huurder h){
        return huurderArrayList.add(h);
    }

}
