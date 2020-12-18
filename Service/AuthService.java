package Service;

import Entity.Carrier;
import Entity.Engineer;
import Entity.User;

public class AuthService {
    public User userAuth(String login, String password) {
        return new User(login, password);
    }

    public Carrier carrierAuth(String login, String password) {
        return new Carrier(login, password);
    }

    public Engineer engineerAuth(String login, String password) {
        return new Engineer(login, password);
    }
}
