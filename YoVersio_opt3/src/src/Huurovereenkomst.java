import java.util.Date;

public class Huurovereenkomst {
    private Integer Id;
    private Huurder huurder;
    private Voertuig voertuig;
    private Date Huurdatum;
    private Date Einddatum;
    private Double Borg;

    public Huurovereenkomst( Huurder huurder, Voertuig voertuig, Date huurdatum, Date einddatum, Double borg){
        this.huurder = huurder;
        this.voertuig = voertuig;
        this.Einddatum = einddatum;
        this.Huurdatum = huurdatum;
        this.Borg = borg;
    }

    public Integer getId() {
        return Id;
    }

    public Huurder getHuurder() {
        return huurder;
    }

    public Voertuig getVoertuig() {
        return voertuig;
    }

    public Date getHuurdatum() {
        return Huurdatum;
    }

    public Date getEinddatum() {
        return Einddatum;
    }

}
