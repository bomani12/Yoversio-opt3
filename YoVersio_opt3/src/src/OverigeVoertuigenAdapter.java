public class OverigeVoertuigenAdapter extends Voertuig {
    private OverigeVoertuig overigeVoertuig;

    public OverigeVoertuigenAdapter(String merk, String model, String rijbewijsType, String kenteken, Double dagprijs,String extra) {
        super(merk, model, rijbewijsType, kenteken, dagprijs);
        OverigeVoertuig overigeVoertuig = new OverigeVoertuig(extra);
    }

    @Override
    public String getVoertuigInfo(Voertuig voertuig) {
        return "Kenteken: " + voertuig.getKenteken() + "\n" + "Merk: " + voertuig.getMerk()+ "\n" + "Model: " + voertuig.getModel()+ "\n"+ "Kenteken: " + voertuig.getKenteken()+ "\n"
                + "Dagprijs: " + voertuig.getDagprijs()+ "\n";
    }
    public void setOverigeVoertuigenInfo(String extra){
        overigeVoertuig.setExtraInfo(extra);
    }
}
