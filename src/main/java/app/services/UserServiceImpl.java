package app.services;

import app.entities.User;
import app.repositories.QuestionRep;
import app.repositories.UserRep;
import app.servlets.LoginServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRep rep;

    @Override
    public void registration(User user) {
        rep.save(user);
    }

    @Override
    public String authorization(User user) {
        return null;
    }

    @Override
    public void logout() {
        System.exit(66);

    }
}
