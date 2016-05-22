import org.junit.*;
import static org.junit.Assert.*;    // importa una classe static
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class TestGestorLloguersLite {
    @Test
    public void testInformeSenseLloguers() {
		String salida = "Informe de lloguers del client Edison (23920981S)\n";
						salida+="Import a pagar: 0.0€\n";
						salida+="Punts guanyats: 0\n";
		Client yo = new Client("23920981S", "Edison", "684071952");
		assertEquals(salida, yo.informe());
	}
	
	@Test
    public void testInformeAmbUnLlogerBasicDeDosDies() throws ParseException{
		String salida = "Informe de lloguers del client Edison (23920981S)\n";
						salida+="\tVista Tata: 90.0€\n";
						salida+="Import a pagar: 90.0€\n";
						salida+="Punts guanyats: 1\n";
		Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("3/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);
		Client yo = new Client("23920981S", "Edison", "684071952");
		yo.afegeix(lloguerBasic);
		assertEquals(salida, yo.informe());
	}
	
	@Test
    public void testInformeAmbUnLlogerBasicDeDosCinc() throws ParseException{
		String salida = "Informe de lloguers del client Edison (23920981S)\n";
						salida+="\tVista Tata: 180.0€\n";
						salida+="Import a pagar: 180.0€\n";
						salida+="Punts guanyats: 1\n";
		Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("3/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 5, vehicleBasic);
		Client yo = new Client("23920981S", "Edison", "684071952");
		yo.afegeix(lloguerBasic);
		assertEquals(salida, yo.informe());
	}
	
	@Test
    public void testInformeAmbUnLlogerGeneralDeUnDia() throws ParseException{
		String salida = "Informe de lloguers del client Edison (23920981S)\n";
						salida+="\tViste Tate: 120.0€\n";
						salida+="Import a pagar: 120.0€\n";
						salida+="Punts guanyats: 1\n";
		Vehicle vehicleGeneral = new Vehicle("Tate", "Viste", Vehicle.GENERAL);
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("3/8/2013");
        Lloguer lloguerGeneral = new Lloguer(date, 1, vehicleGeneral);
		Client yo = new Client("23920981S", "Edison", "684071952");
		yo.afegeix(lloguerGeneral);
		assertEquals(salida, yo.informe());
	}
	
	@Test
    public void testInformeAmbUnLlogerGeneralDeCincDies() throws ParseException{
		String salida = "Informe de lloguers del client Edison (23920981S)\n";
						salida+="\tViste Tate: 345.0€\n";
						salida+="Import a pagar: 345.0€\n";
						salida+="Punts guanyats: 1\n";
		Vehicle vehicleGeneral = new Vehicle("Tate", "Viste", Vehicle.GENERAL);
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("3/8/2013");
        Lloguer lloguerGeneral = new Lloguer(date, 5, vehicleGeneral);
		Client yo = new Client("23920981S", "Edison", "684071952");
		yo.afegeix(lloguerGeneral);
		assertEquals(salida, yo.informe());
	}
	
	@Test
    public void testInformeAmbUnLlogerDeLuxeDeUnDia() throws ParseException{
		String salida = "Informe de lloguers del client Edison (23920981S)\n";
						salida+="\tViste Tate: 180.0€\n";
						salida+="Import a pagar: 180.0€\n";
						salida+="Punts guanyats: 1\n";
		Vehicle vehicleLuxe = new Vehicle("Tate", "Viste", Vehicle.LUXE);
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("3/8/2013");
        Lloguer lloguerLuxe = new Lloguer(date, 1, vehicleLuxe);
		Client yo = new Client("23920981S", "Edison", "684071952");
		yo.afegeix(lloguerLuxe);
		assertEquals(salida, yo.informe());
	}
	
	@Test
    public void testInformeAmbUnLlogerDeLuxeDeUnCinc() throws ParseException{
		String salida = "Informe de lloguers del client Edison (23920981S)\n";
						salida+="\tViste Tate: 900.0€\n";
						salida+="Import a pagar: 900.0€\n";
						salida+="Punts guanyats: 2\n";
		Vehicle vehicleLuxe = new Vehicle("Tate", "Viste", Vehicle.LUXE);
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("3/8/2013");
        Lloguer lloguerLuxe = new Lloguer(date, 5, vehicleLuxe);
		Client yo = new Client("23920981S", "Edison", "684071952");
		yo.afegeix(lloguerLuxe);
		assertEquals(salida, yo.informe());
	}
	
	@Test
    public void testInformeAmbUnLlogerDeGeneralYUnDeLuxeDeUnDia() throws ParseException{
		String salida = "Informe de lloguers del client Edison (23920981S)\n";
						salida+="\tViste Tate: 345.0€\n";
						salida+="\tVisti Tato: 180.0€\n";
						salida+="Import a pagar: 525.0€\n";
						salida+="Punts guanyats: 2\n";
		Vehicle vehicleGeneral = new Vehicle("Tate", "Viste", Vehicle.GENERAL);
        Vehicle vehicleLuxe = new Vehicle("Tato", "Visti", Vehicle.LUXE);
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("3/8/2013");
        Lloguer lloguerGeneral = new Lloguer(date, 5, vehicleGeneral);
        Lloguer lloguerLuxe = new Lloguer(date, 1, vehicleLuxe);
		Client yo = new Client("23920981S", "Edison", "684071952");
		yo.afegeix(lloguerGeneral);
		yo.afegeix(lloguerLuxe);
		assertEquals(salida, yo.informe());
	}
	
	@Test
    public void testInformeAmbUnLlogerDeGeneralYUnDeLuxeDeCincDies() throws ParseException{
		String salida = "Informe de lloguers del client Edison (23920981S)\n";
						salida+="\tViste Tate: 345.0€\n";
						salida+="\tVisti Tato: 900.0€\n";
						salida+="Import a pagar: 1245.0€\n";
						salida+="Punts guanyats: 3\n";
		Vehicle vehicleGeneral = new Vehicle("Tate", "Viste", Vehicle.GENERAL);
        Vehicle vehicleLuxe = new Vehicle("Tato", "Visti", Vehicle.LUXE);
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("3/8/2013");
        Lloguer lloguerGeneral = new Lloguer(date, 5, vehicleGeneral);
        Lloguer lloguerLuxe = new Lloguer(date, 5, vehicleLuxe);
		Client yo = new Client("23920981S", "Edison", "684071952");
		yo.afegeix(lloguerGeneral);
		yo.afegeix(lloguerLuxe);
		assertEquals(salida, yo.informe());
	}
	
    @Test
    public void testInformeAmbTresLloguers() throws ParseException{
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
        Date date = dateFormat.parse("3/8/2013");
        Lloguer lloguerBasic = new Lloguer(date, 2, vehicleBasic);
        Lloguer lloguerGeneral = new Lloguer(date, 2, vehicleGeneral);
        Lloguer lloguerLuxe = new Lloguer(date, 2, vehicleLuxe);

        Client yo = new Client("23920981S", "Edison", "684071952");
        yo.afegeix(lloguerBasic);
        yo.afegeix(lloguerGeneral);
        yo.afegeix(lloguerLuxe);
        assertEquals(salida, yo.informe());
    }

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestGestorLloguersLite");
    }
}
