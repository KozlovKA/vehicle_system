package Entity;

public class Way {
    private String wayName;
    private String wayNumber;
    private String vehicleType;

    public Way(String vehicleType, String wayNumber, String wayName) {
        this.vehicleType=vehicleType;
        this.wayName=wayName;
        this.wayNumber=wayNumber;
    }
    public String getVehicleType() {
        return vehicleType;
    }

    public String getWayName() {
        return wayName;
    }

    public String getWayNumber() {
        return wayNumber;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setWayName(String wayName) {
        this.wayName = wayName;
    }

    public void setWayNumber(String wayNumber) {
        this.wayNumber = wayNumber;
    }
}
