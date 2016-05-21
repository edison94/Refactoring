
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

}
