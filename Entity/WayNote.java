package Entity;
import java.util.Date;

public class WayNote {
    private String wayNumber;
    private String vehicleType;
    private Date arrivalTime;
    public WayNote(String vehicleType, String wayNumber, Date arrivalTime) {
        this.vehicleType=vehicleType;
        this.arrivalTime=arrivalTime;
        this.wayNumber=wayNumber;
    }
    public String getWayNumber() {
        return wayNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setWayNumber(String wayNumber) {
        this.wayNumber = wayNumber;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public void changeArrivalTime(Date arrivalTime,String wayNumber){

    }

}
