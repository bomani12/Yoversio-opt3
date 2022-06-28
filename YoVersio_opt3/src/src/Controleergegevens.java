import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Controleergegevens {

    public boolean DubbelCheckGegevens(  String telefoonnummer, String typeRijbewijs){
        Boolean isCorrect = false;
        ArrayList<String> rijbewijslijst = new ArrayList<>();
        rijbewijslijst.add("AM");
        rijbewijslijst.add("A");
        rijbewijslijst.add("B");
        rijbewijslijst.add("BE");
    for(int i = 0; i > rijbewijslijst.size(); i++){
        if (typeRijbewijs.equals(rijbewijslijst.get(i))){
            isCorrect = true;
        }

    }
    if (telefoonnummer.startsWith("06") && telefoonnummer.length() == 10){
        isCorrect = true;
    }
    return isCorrect;
    }
}
