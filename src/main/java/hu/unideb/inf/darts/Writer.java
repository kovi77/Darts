/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * hu.unideb.inf.darts csomag magában tartalmazza a működéshez szükséges fájlokat.
 */
package hu.unideb.inf.darts;

import hu.unideb.inf.darts.ManagerImpl;
import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Ak
 */
public class Writer {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Registration.class);

    //Initialize the users list
    private ManagerImpl m = new ManagerImpl();
    private Darts darts = m.getDarts();
    private static Users users = new Users();
    private static boolean check1 = false, check2 = false;
    private CreateFolder cf = new CreateFolder();

    /**
     *
     * @throws JAXBException a kiiratás miatt
     */
    public void write() throws JAXBException {
        users.setUsers(new ArrayList<User>());
        users.setUsers(Reader.users.getUsers());
        String name1 = darts.getPlayer1().getName();
        String name2 = darts.getPlayer2().getName();
        for (int i = 0; i < users.getUsers().size(); i++) {
            if (users.getUsers().get(i).getName().equals(name1)) {
                users.getUsers().get(i).setAvg(darts.getPlayer1().getAvg());
                users.getUsers().get(i).setHighScore(darts.getPlayer1().getHighScore());
                users.getUsers().get(i).setMatches(darts.getPlayer1().getMatches());
                users.getUsers().get(i).setCounter1(darts.getPlayer1().getCounter1());
                users.getUsers().get(i).setCounter2(darts.getPlayer1().getCounter2());
                users.getUsers().get(i).setCounter3(darts.getPlayer1().getCounter3());
                users.getUsers().get(i).setWonMatches(darts.getPlayer1().getWonMatches());
                check1 = true;
                logger.info("Már regisztált felhasználó");
            }
        }
        if (!check1) {
            users.getUsers().add(new User(darts.getPlayer1().getName(),
                    darts.getPlayer1().getMatches(),
                    darts.getPlayer1().getScore(),
                    darts.getPlayer1().getAvg(),
                    darts.getPlayer1().getHighScore(),
                    darts.getPlayer1().getCounter1(),
                    darts.getPlayer1().getCounter2(),
                    darts.getPlayer1().getCounter3(),
                    darts.getPlayer1().getWonMatches()));
            check1 = true;
            logger.info("Új felhasználó");
        }
        for (int i = 0; i < users.getUsers().size(); i++) {
            if (users.getUsers().get(i).getName().equals(name2)) {
                users.getUsers().get(i).setAvg(darts.getPlayer2().getAvg());
                users.getUsers().get(i).setHighScore(darts.getPlayer2().getHighScore());
                users.getUsers().get(i).setMatches(darts.getPlayer2().getMatches());
                users.getUsers().get(i).setCounter1(darts.getPlayer2().getCounter1());
                users.getUsers().get(i).setCounter2(darts.getPlayer2().getCounter2());
                users.getUsers().get(i).setCounter3(darts.getPlayer2().getCounter3());
                users.getUsers().get(i).setWonMatches(darts.getPlayer2().getWonMatches());
                check2 = true;
                logger.info("Már regisztált felhasználó");
            }
        }
        if (!check2) {
            users.getUsers().add(new User(darts.getPlayer2().getName(),
                    darts.getPlayer2().getMatches(),
                    darts.getPlayer2().getScore(),
                    darts.getPlayer2().getAvg(),
                    darts.getPlayer2().getHighScore(),
                    darts.getPlayer2().getCounter1(),
                    darts.getPlayer2().getCounter2(),
                    darts.getPlayer2().getCounter3(),
                    darts.getPlayer2().getWonMatches()));
            check2 = true;
            logger.info("Új felhasználó");
        }
        JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        //jaxbMarshaller.marshal(users, System.out);
        jaxbMarshaller.marshal(users, new File(cf.getPath() + "darts.xml"));
    }
}
