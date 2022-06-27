import java.util.ArrayList;
import java.util.Date;

public class Huurder {
    private String Naam;
    private Date Geboortedatum;
    private String Adres;
    private String Telefoonnummer;
    private String TypeRijbewijs;
    private boolean SchadeHistorie;

    Huurder(String naam,Date geboortedatum,String adres,String telefoonnummer,String typeRijbewijs){
        this.Naam = naam;
        this.Geboortedatum = geboortedatum;
        this.Adres = adres;
        this.Telefoonnummer = telefoonnummer;
        this.TypeRijbewijs = typeRijbewijs;
        this.SchadeHistorie = false;

    }

    public String getNaam() {
        return Naam;
    }

    public Date getGeboortedatum() {
        return Geboortedatum;
    }

    public String getAdres() {
        return Adres;
    }

    public String getTelefoonnummer() {
        return Telefoonnummer;
    }

    public String getTypeRijbewijs() {
        return TypeRijbewijs;
    }

    public boolean getSchadeHistorie() {
        return SchadeHistorie;
    }



    public void setNaam(String naam) {
        Naam = naam;
    }

    public void setAdres(String adres) {
        Adres = adres;
    }

    public void setGeboortedatum(Date geboortedatum) {
        Geboortedatum = geboortedatum;
    }

    public void setSchadeHistorie(boolean schadeHistorie) {
        SchadeHistorie = schadeHistorie;
    }

    public void setTelefoonnummer(String telefoonnummer) {
        Telefoonnummer = telefoonnummer;
    }

    public void setTypeRijbewijs(String typeRijbewijs) {
        TypeRijbewijs = typeRijbewijs;
    }
}
