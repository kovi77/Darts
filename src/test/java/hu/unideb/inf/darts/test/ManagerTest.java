package hu.unideb.inf.darts.test;

import hu.unideb.inf.darts.manager.CreateFolder;
import hu.unideb.inf.darts.manager.Login;
import hu.unideb.inf.darts.manager.ManagerImpl;
import hu.unideb.inf.darts.manager.Reader;
import hu.unideb.inf.darts.manager.Registration;
import hu.unideb.inf.darts.model.User;
import java.io.IOException;
import javax.xml.bind.JAXBException;
import static org.junit.Assert.*;
import org.junit.Test;
import org.xml.sax.SAXException;

/**
 *
 * @author Ak
 */
public class ManagerTest {

    private static ManagerImpl m = new ManagerImpl();
    private static Reader r = new Reader();
    private static Login l = new Login();
    private static CreateFolder cf = new CreateFolder();
    private static Registration re = new Registration();
    private static User u1 = new User("X");
    private static User u2 = new User("Y");

    public ManagerTest() {
    }

    @Test
    public void calc() {
        //1.Játékos
        m.setLeg("3", m.getDarts());
        m.setPlayer("Player1", m.getPlayer1(), m.getPlayer2(), m.getDarts());
        m.calc(0, m.getDarts());
        assertEquals(m.getDarts().getPlayer1().getScore() - 0, m.getDarts().getPlayer1().getScore());
        assertEquals(m.getDarts().getPlayer2().getScore(), m.getDarts().getPlayer2().getScore());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));
        assertEquals(0.3, m.getOp1(), 0.1);
        assertEquals(0.2, m.getOp2(), 0.1);

        m.calc(1, m.getDarts());
        assertEquals(500, m.getDarts().getPlayer1().getScore());
        assertEquals(m.getDarts().getPlayer2().getScore(), m.getDarts().getPlayer2().getScore());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));

        m.calc(501, m.getDarts());
        assertEquals(501, m.getDarts().getPlayer1().getScore());
        assertEquals(m.getDarts().getPlayer2().getScore(), m.getDarts().getPlayer2().getScore());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));
        //2.Játékos
        m.calc(0, m.getDarts());
        assertEquals(m.getDarts().getPlayer2().getScore() - 0, m.getDarts().getPlayer2().getScore());
        assertEquals(m.getDarts().getPlayer1().getScore(), m.getDarts().getPlayer1().getScore());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));

        m.calc(1, m.getDarts());
        assertEquals(500, m.getDarts().getPlayer2().getScore());
        assertEquals(m.getDarts().getPlayer1().getScore(), m.getDarts().getPlayer1().getScore());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));

        m.calc(501, m.getDarts());
        assertEquals(501, m.getDarts().getPlayer2().getScore());
        assertEquals(m.getDarts().getPlayer1().getScore(), m.getDarts().getPlayer1().getScore());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));
        //1.Játékos
        m.calc(101, m.getDarts());
        assertEquals(400, m.getDarts().getPlayer1().getScore());
        m.calc(140, m.getDarts());
        assertEquals(260, m.getDarts().getPlayer1().getScore());
        m.calc(260, m.getDarts());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));
        //2.Játékos
        m.calc(101, m.getDarts());
        assertEquals(400, m.getDarts().getPlayer2().getScore());
        assertEquals(m.getDarts().getPlayer1().getScore(), m.getDarts().getPlayer1().getScore());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));
        
        m.calc(140, m.getDarts());
        assertEquals(260, m.getDarts().getPlayer2().getScore());
        assertEquals(m.getDarts().getPlayer1().getScore(), m.getDarts().getPlayer1().getScore());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));
        
        m.calc(180, m.getDarts());
        assertEquals(80, m.getDarts().getPlayer2().getScore());
        assertEquals(m.getDarts().getPlayer1().getScore(), m.getDarts().getPlayer1().getScore());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));
        //1.Játékos
        m.calc(501, m.getDarts());
        assertEquals(m.getDarts().getPlayer2().getScore(), m.getDarts().getPlayer2().getScore());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));
        //2.Játékos
        m.calc(101, m.getDarts());
        assertEquals(400, m.getDarts().getPlayer2().getScore());
        assertEquals(m.getDarts().getPlayer1().getScore(), m.getDarts().getPlayer1().getScore());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));
        
        m.calc(140, m.getDarts());
        assertEquals(260, m.getDarts().getPlayer2().getScore());
        assertEquals(m.getDarts().getPlayer1().getScore(), m.getDarts().getPlayer1().getScore());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));
        
        m.calc(260, m.getDarts());
        
        m.setResults(m.getDarts());
        
    }
    
    
    @Test
    public void setPlayer() {
        m.setPlayer("Player1", u1, u2, m.getDarts());
        assertEquals("X", m.getDarts().getPlayer1().getName());
        m.setPlayer("Player2", u1,u2, m.getDarts());
        assertEquals("Y", m.getDarts().getPlayer1().getName());
    }

    @Test
    public void options() {
        m.setWin(false);
        m.setPlayer("Player1", m.getPlayer1(), m.getPlayer2(), m.getDarts());
        m.options("501", m.getDarts());
        assertEquals("501", m.getDarts().getGameMode());
        assertEquals(Integer.parseInt("501"), m.getDarts().getPlayer1().getScore());
        assertEquals(Integer.parseInt("501"), m.getDarts().getPlayer2().getScore());
    }

    @Test
    public void setLeg() {
        m.setLeg("3", m.getDarts());
        assertEquals(Integer.parseInt("3"), m.getDarts().getLegs());
    }
    
    @Test
    public void Login() throws JAXBException, IOException, SAXException{
        cf.create();
        r.read();
        l.login("default","sdf");
        assertEquals(false, l.isCheck1());
    }
    @Test
    public void Registration() throws JAXBException, IOException, SAXException{
        re.registration("default");
        assertEquals("Existing name", re.getInvalidName());
    }
}
