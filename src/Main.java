public class Main {
    public static void main(String[] args) {
        CloudManager cloudManager = new CloudManager();
        CloudStorage cloudStorage = new CloudStorage("ondra",50.0);
        CloudStorage cloudStorage1 = new CloudStorage("matej",40.0);
        CloudCompute cloudCompute = new CloudCompute("lol",35);
        CloudCompute cloudCompute1 = new CloudCompute("lmao",20);

        cloudManager.pridejSluzbu(cloudStorage);
        cloudManager.pridejSluzbu(cloudStorage1);
        cloudManager.pridejSluzbu(cloudCompute);
        cloudManager.pridejSluzbu(cloudCompute1);
        cloudManager.spustVsechnySluzby();
        cloudManager.zastavVsechnySluzby();
        cloudManager.vypisNaklady(5);
        cloudManager.vypisInformace();
    }
}