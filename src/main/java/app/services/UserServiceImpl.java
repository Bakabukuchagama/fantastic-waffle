package app.services;

import app.entities.User;
import app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.security.auth.login.LoginException;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository rep;

    @Override
    public void registration(User user) {
        rep.save(user);
    }

    @Override
    public String authorization(User user) throws Exception {
        try{
            User logUser = rep.findByLoginAndPassword(user.getLogin(), user.getPassword()).get();
            return logUser.getRole().name();
        }
        catch (RuntimeException e){
          throw new RuntimeException("Неправильный логи или пароль");
        }
    }
    @Override
    public User getUserByLogin(String login){
        try {
            User user = rep.findByLogin(login).get();
            return user;
        }
        catch (RuntimeException e){
            throw new RuntimeException("Неправильный логи");
        }
    }

    @Override
    public void logout() {
        System.exit(66);

    }
}
