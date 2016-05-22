import org.junit.*;
import static org.junit.Assert.*;    // importa una classe static
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class TestGestorLloguersLite {
    @Test
    public void testInforme() {
		String salida = "Informe de lloguers del client Edison (23920981S)\n";
							salida+="\tVista Tata: 90.0€\n";
							salida+="\tViste Tate: 120.0€\n";
							salida+="\tVisti Tato: 360.0€\n";
						salida+="Import a pagar: 570.0€\n";
						salida+="Punts guanyats: 4\n";

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
            assertEquals(salida, yo.informe());
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestGestorLloguersLite");
    }
}
