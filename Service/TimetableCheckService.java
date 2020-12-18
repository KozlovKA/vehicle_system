package Service;

import Entity.WayNote;

import java.util.Date;

public class TimetableCheckService {
    public WayNote showTimetable(String vehicleType, String wayNumber, Date arrivalTime) {
        return new WayNote(vehicleType, wayNumber, arrivalTime);
    }
    public WayNote getNote(String vehicleType, String wayNumber, Date arrivalTime){
        return new WayNote(vehicleType, wayNumber, arrivalTime);
    }
}
