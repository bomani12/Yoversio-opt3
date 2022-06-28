import java.util.ArrayList;

public class ControleVoertuig {

    public boolean DubbelCheckVoertuig(String typeRijbewijs, String kenteken){
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
        if ((kenteken.length() <= 7) && (kenteken.length() >= 5)){
            isCorrect = true;
        }
        return isCorrect;
    }
}
