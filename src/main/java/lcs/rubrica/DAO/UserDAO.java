package lcs.rubrica.DAO;

import lcs.rubrica.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDAO extends AbstractDAO<User> {
    public UserDAO() {
        super("user.csv");
    }
}
