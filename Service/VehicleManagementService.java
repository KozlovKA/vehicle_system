package Service;

import Entity.Bus;
import Entity.DayOfWeek;
import Entity.Way;
import Entity.WayNode;

public class VehicleManagementService {
    public WayNode createWayNode(String name, String street) {
        return new WayNode(name, street);
    }

    public void deleteWayNode(String name) {

    }

    public WayNode getWayNode(String name, String street) {
        return new WayNode(name, street);
    }

    public DayOfWeek createDayOfWeek(String day) {
        return new DayOfWeek(day);
    }

    public void deleteDayOfWeek(String day) {

    }

    public DayOfWeek getDayOfWeek(String day) {
        return new DayOfWeek(day);
    }

    public Bus createBus(String vehicleType, String idNumber, int capacity) {
        return new Bus(vehicleType, idNumber, capacity);
    }

    public void deleteBus(String idNumber) {

    }

    public Bus getBus(String vehicleType, String idNumber, int capacity) {
        return new Bus(vehicleType, idNumber, capacity);
    }

    public Way createWay(String vehicleType, String wayNumber, String wayName) {
        return new Way(vehicleType, wayNumber, wayName);
    }

    public Way getWay(String vehicleType, String wayNumber, String wayName) {
        return new Way(vehicleType, wayNumber, wayName);
    }

    public void deleteWay(Way way) {

    }
}
