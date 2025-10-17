import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CloudManager {
    Scanner sc = new Scanner(System.in);
    List<ICloudService>cloudServices=new ArrayList<ICloudService>();

    public void pridejSluzbu(ICloudService service){
        cloudServices.add(service);
        /*System.out.println("cloud storage(1) beco cloud compute(2)?");
        int option = sc.nextInt();
        sc.nextLine();
        if(option==1){
            System.out.println("napis nazev");
            String nazev = sc.nextLine();
            System.out.println("napis cenu za gb");
            double cenaZaGB = sc.nextDouble();
            CloudStorage cloudStorage = new CloudStorage(nazev,cenaZaGB);
            cloudServices.add(cloudStorage);
        }
        else if(option==2){
            System.out.println("napis nazev");
            String nazev = sc.nextLine();
            System.out.println("napis cenu za hodinu");
            int cenaZaHodinu = sc.nextInt();
            CloudCompute cloudCompute1 = new CloudCompute(nazev,cenaZaHodinu);
            cloudServices.add(cloudCompute1);
        }
        else System.out.println("Invalid option");
*/
    }
    public void spustVsechnySluzby(){
        for (int i=0;i<cloudServices.size();i++){
            cloudServices.get(i).spustSluzbu();
        }
    }
    public void zastavVsechnySluzby(){
        for (int i=0;i<cloudServices.size();i++){
            cloudServices.get(i).zastavSluzbu();
        }
    }
    public void vypisNaklady(int hodiny){
        for (int i=0;i<cloudServices.size();i++){
            System.out.println(cloudServices.get(i).vypocitejNaklady(hodiny));
        }

    }
    public void vypisInformace(){
        for(int i=0; i<cloudServices.size(); i++){
            System.out.println(cloudServices.get(i).toString());
        }

    }

}
