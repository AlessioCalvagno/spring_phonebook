package lcs.rubrica.service;

import lcs.rubrica.DAO.RubricaDAO;
import lcs.rubrica.model.Contact;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class RubricaService extends AbstractService<Contact> {

    private final static Logger logger = LogManager.getLogger(RubricaService.class);


    public Contact searchContact(String name, String surname) {
        Contact toReturn = null;
        try {
            toReturn =((RubricaDAO) dao).get(name, surname);
        } catch (IOException e) {
            logger.error("Error in reading phonebook file", e);
        }
        if (toReturn == null)
            logger.warn("Contact with name : {}, surname: {} not found", name, surname);
        else
            logger.info("Found contact: {}",toReturn.toString());

        return toReturn;
    }


    public void prova() {
        logger.fatal("OK");
        logger.error("OK");
        logger.warn("OK");
        logger.info("OK");
        logger.debug("OK");
    }
}
