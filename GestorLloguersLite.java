
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class GestorLloguersLite {

    public static String informe(Client c) {
        Vector<Lloguer> lloguers = c.getLloguers();
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyy");
        Lloguer lloguer;
        String resultat="Client: ";
        resultat+=c.getNom()+"\n";
        resultat+="\t"+c.getNif()+"\n";
        resultat+="\t"+c.getTelefon()+"\n";
        resultat+="Lloguers: "+lloguers.size()+"\n";
        for (int i = 0; i < lloguers.size(); i++){
			lloguer = lloguers.get(i);
			resultat+="\t"+(i+1)+". vehicle: "+lloguer.getVehicle().getMarca()+" "+lloguer.getVehicle().getModel()+"\n";
			resultat+="\t   data d'inici: "+dateFormat.format(lloguer.getData())+"\n";
			resultat+="\t   dies llogats: "+lloguer.getDies()+"\n";
		}
		
        return resultat;
    }

    public static void main(String args[]) throws ParseException{
        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);
        Vehicle vehicleGeneral = new Vehicle("Tate", "Viste", Vehicle.GENERAL);
        Vehicle vehicleLuxe = new Vehicle("Tato", "Visti", Vehicle.LUXE);

        // demostració de construccuó d'un lloguer amb una data
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("3/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 5, vehicleBasic);
        Lloguer lloguerGeneral = new Lloguer(date, 5, vehicleGeneral);
        Lloguer lloguerLuxe = new Lloguer(date, 5, vehicleLuxe);

        Client yo = new Client("23920981S", "Edison", "684071952");
        //yo.afegeix(lloguerBasic);
        yo.afegeix(lloguerGeneral);
        yo.afegeix(lloguerLuxe);
        System.out.println(yo.informe());
    }
}
