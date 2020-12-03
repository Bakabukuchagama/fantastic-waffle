package app.services;

import app.entities.User;

public interface UserService {

    void registration(User user);

    String authorization(User user) throws Exception;

    public User getUserByLogin(String login);

    void logout();

}
