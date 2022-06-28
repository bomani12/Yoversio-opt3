public class Scooter extends Voertuig{
        public Scooter(String merk, String model, String rijbewijsType, String kenteken, Double dagprijs) {
            super(merk, model, rijbewijsType, kenteken, dagprijs);
        }

        @Override
        public String getVoertuigInfo(Voertuig voertuig) {
            return "Kenteken: " + voertuig.getKenteken() + "\n" + "Merk: " + voertuig.getMerk()+ "\n" + "Model: " + voertuig.getModel()+ "\n"+ "Kenteken: " + voertuig.getKenteken()+ "\n"
                    + "Dagprijs: " + voertuig.getDagprijs()+ "\n";
        }
}
