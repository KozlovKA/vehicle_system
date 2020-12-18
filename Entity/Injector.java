package Entity;

import Service.AuthService;
import Service.TimetableCheckService;
import Service.VehicleManagementService;
import View.*;

public class Injector {
    public void createUIMenu() {
        MainWindow mainWindow = new MainWindow();
        CarrierWindow carrierWindow = new CarrierWindow();
        EngineerWindow engineerWindow = new EngineerWindow();
        FindWay findWay = new FindWay();
        RouteAdd routeAdd = new RouteAdd();
        RouteChange routeChange = new RouteChange();
        Timetable timetable = new Timetable();
        UserWindow userWindow = new UserWindow();
    }
    public void createAuthService(){
        AuthService authService=new AuthService();

    }
    public  void createVehicleManagementService(){
        VehicleManagementService vehicleManagementService =new VehicleManagementService();
    }
    public void createTimetableCheckService(){
        TimetableCheckService timetableCheckService=new TimetableCheckService();
    }
}
