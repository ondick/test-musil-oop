public class CloudCompute implements ICloudService{
    private String nazev;
    private double cenaZaHodinu;

    public CloudCompute(String nazev, double cenaZaHodinu) {
        this.nazev = nazev;
        this.cenaZaHodinu = cenaZaHodinu;
    }

    @Override
    public void spustSluzbu() {
        System.out.println("výpocetni sluzba byla spustena");

    }

    @Override
    public void zastavSluzbu() {
        System.out.println("výpocetni sluzba byla zastavena");
    }

    @Override
    public double vypocitejNaklady(int pocet) {
        return cenaZaHodinu*pocet;
    }

    @Override
    public String toString() {
        return "nazev: "+nazev+", cenaZaHodinu: "+cenaZaHodinu;
    }
}
