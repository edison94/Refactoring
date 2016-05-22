
import java.util.Date;

class Lloguer {

    private Date data;
    private int dies;
    private Vehicle vehicle;

    Lloguer(Date fecha, int dias, Vehicle vehicle) {
        data = fecha;
        dies = dias;
        this.vehicle = vehicle;
        
    }

    public Date getData() {
        return data;
    }

    public void setData(Date d) {
        data = d;
    }

    public int getDies() {
        return dies;
    }

    public void setDies(int d) {
        dies = d;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public double quantitat(){
		double quantitat = 0;
        switch (vehicle.getCategoria()) {
            case Vehicle.BASIC:
                quantitat += 3;
                if (dies > 3) {
                    quantitat += (dies - 3) * 1.5;
                }
                break;
            case Vehicle.GENERAL:
                quantitat += 4;
                if (dies > 2) {
                    quantitat += (dies - 2) * 2.5;
                }
                break;
            case Vehicle.LUXE:
                quantitat += dies * 6;
        }
        return quantitat;
	}

}
