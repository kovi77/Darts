/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * hu.unideb.inf.darts csomag magában tartalmazza a működéshez szükséges fájlokat.
 */
package hu.unideb.inf.darts;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.slf4j.LoggerFactory;

/**
 *Mappa létrhozásának osztálya.
 * @author Ak
 */
public class CreateFolder {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CreateFolder.class);
    private CreateFolder cf;
    private final String path = System.getProperty("user.home") + "/.projectDatabase/";
    private File file;

    /**
     *
     * @throws JAXBException kiiratás miatt
     * @throws java.io.IOException createNewFile() miatt
     */
    public void create() throws JAXBException, IOException {
        cf = new CreateFolder();
        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdir();
        }
            file = new File(path+"darts.xml");

            if (file.createNewFile()) {
                logger.error("Fájl létrehozva");
                writeDefault();
            } else {
                logger.error("Fájl létezik");
            }
        
    }
    private void writeDefault() throws JAXBException{
        Users users = new Users();
        users.setUsers(new ArrayList<>());
        users.getUsers().add(new User("default"));
        
        JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(users, System.out);
        jaxbMarshaller.marshal(users, new File(cf.getPath()+"darts.xml"));
    }

    /**
     *
     * @return path könyvtár elérési útvonalal tér vissza
     */
    public String getPath() {
        return path;
    }

}
