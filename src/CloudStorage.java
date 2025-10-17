public class CloudStorage implements ICloudService{
    private String nazev;
    private double cenaZaGB;
    private int pocetSpusteni;

    public CloudStorage(String nazev, double cenaZaGB) {
        this.nazev = nazev;
        this.cenaZaGB = cenaZaGB;
    }

    @Override
    public void spustSluzbu() {
        System.out.println("úložiště bylo spuštěno");
        pocetSpusteni++;
    }

    @Override
    public void zastavSluzbu() {
        System.out.println("úložiště bylo zastaveno");
    }

    @Override
    public double vypocitejNaklady(int pocet) {
        return cenaZaGB * 1;
    }

    @Override
    public String toString() {
        return "Nazev: "+nazev+", cena za gb: "+cenaZaGB+", pocet spusteni: "+pocetSpusteni;
    }
}
