/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.darts;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author Ak
 */
public class Registration {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Registration.class);
    private Users users = new Users();
    private boolean ch1 = false;
    private String invalidName;
    private CreateFolder cf = new CreateFolder();
    private Reader rd = new Reader();

    /**
     *
     * @return Nem érvényes név esetén egy Stringel.
     */
    public String getInvalidName() {
        return invalidName;
    }

    /**
     *
     * @param name Egy név
     * @throws JAXBException Írás és olvsás miatt
     * @throws SAXException Írás és olvsás miatt
     * @throws IOException Írás és olvsás miatt
     */
    public void registration(String name) throws JAXBException, SAXException, IOException {

        if (!name.isEmpty()) {
            cf.create();
            rd.read();
            users.setUsers(new ArrayList<>());
            users.setUsers(Reader.users.getUsers());
            for (User user : users.getUsers()) {
                if (user.getName().equals(name)) {
                    ch1 = true;
                    invalidName = "Existing name";
                    logger.warn("Létező név");
                    break;
                }else{
                    ch1 = false;
                }
            }
            if (!ch1) {
                users.getUsers().add(new User(name));
                    invalidName = "Registered";
                    write();
                    logger.warn("Regisztáció sikeres");
            }

        } else {
            invalidName = "Invalid Name";
            logger.warn("Szabálytalan név");
        }
    }

    private void write() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(users, System.out);
        jaxbMarshaller.marshal(users, new File(cf.getPath() + "darts.xml"));
    }

}
