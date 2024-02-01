package lcs.rubrica.DAO;

import lcs.rubrica.model.Contact;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Component
public class RubricaDAO extends AbstractDAO<Contact> {

    public RubricaDAO() {
        super("rubrica.csv");
    }


    public Contact get(String name, String surname) throws IOException {
        List<Contact> rubrica = getAll();
        if (rubrica != null && !rubrica.isEmpty()) {
            Optional<Contact> contact = rubrica.stream().filter(c -> c.getName().equalsIgnoreCase(name) && c.getSurname().equalsIgnoreCase(surname)).findFirst();
            return contact.orElse(null);
        }
        else
            return null;
    }

}
