import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Huurprijs {

    public Double BerekenHuurPrijs(Huurder huurder, Voertuig voertuig, Date huurdatum, Date einddatum){
        Double prijs = 0.00;
        if (huurder.getSchadeHistorie() == true){
            prijs += 10;
        }
        long diffInMillies = Math.abs(einddatum.getTime() - huurdatum.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        double reken = (double) diff;
        reken = reken * voertuig.getDagprijs();
        prijs += reken;
        return prijs;
    }

}
