
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class GestorLloguersLite {

    public static String informe(Client c) {
        String resultat="Client: ";
        resultat+=c.getNom()+"\n";
        resultat+="\t"+c.getNif()+"\n";
        resultat+="\t"+c.getTelefon();
        return resultat;
    }

    public static void main(String args[]) {
        // demostració de construcció d'un vehicle de categoria BASIC
        Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);
        Vehicle vehicleGeneral = new Vehicle("Tate", "Viste", Vehicle.GENERAL);
        Vehicle vehicleLuxe = new Vehicle("Tato", "Visti", Vehicle.LUXE);

        // demostració de construccuó d'un lloguer amb una data
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date;
        try {
            date = dateFormat.parse("3/8/2013");
            Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);
            Lloguer lloguerGeneral = new Lloguer(date, 2, vehicleGeneral);
            Lloguer lloguerLuxe = new Lloguer(date, 2, vehicleLuxe);

            Client yo = new Client("23920981S", "Edison", "684071952");
            yo.afegeix(lloguerBasic);
            yo.afegeix(lloguerGeneral);
            yo.afegeix(lloguerLuxe);
            System.out.println(informe(yo));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
