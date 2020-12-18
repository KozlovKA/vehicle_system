package Entity;

public class Bus implements Vehicle {
    private String vehicleType = "Bus";
    private String idNumber;
    private int capacity;

    public Bus(String vehicleType, String idNumber, int capacity){
        this.capacity=capacity;
        this.vehicleType=vehicleType;
        this.idNumber=idNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
