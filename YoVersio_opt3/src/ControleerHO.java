public class ControleerHO {

    public boolean CheckHoGeschikt(Huurder huurder, Voertuig voertuig){

    return huurder.getSchadeHistorie() == false && huurder.getTypeRijbewijs().equals(voertuig.getRijbewijsType());
    }
}
