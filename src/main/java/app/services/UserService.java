package app.services;

import app.entities.User;

public interface UserService {

    void registration(User user);

    String authorization(User user);

    void logout();

}
