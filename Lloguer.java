
import java.util.Date;

class Lloguer {
	private static final int MINIM_DIES_BASIC = 3;
	private static final int MINIM_DIES_GENERAL = 2;
	private static final int QUANTITAT_VEHICLE_BASIC = 3;
	private static final int QUANTITAT_VEHICLE_GENERAL = 4;
	private static final int QUANTITAT_VEHICLE_LUXE = 6;
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
                quantitat += QUANTITAT_VEHICLE_BASIC;
                if (dies > MINIM_DIES_BASIC) {
                    quantitat += (dies - MINIM_DIES_BASIC) * 1.5;
                }
                break;
            case Vehicle.GENERAL:
                quantitat += QUANTITAT_VEHICLE_GENERAL;
                if (dies > MINIM_DIES_GENERAL) {
                    quantitat += (dies - MINIM_DIES_GENERAL) * 2.5;
                }
                break;
            case Vehicle.LUXE:
                quantitat += dies * QUANTITAT_VEHICLE_LUXE;
        }
        return quantitat;
	}
	
	public int bonificacions(){
		return (vehicle.getCategoria() == Vehicle.LUXE && dies>1 )?2:1;
	}

}
