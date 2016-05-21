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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * A beolvasást végző osztály.
 * @author Ak
 */
public class Reader {

    /**
     *{@code Users} objektum ami {@code User}-eket tartalmaz.
     */
    public static Users users = new Users();
    private CreateFolder cf = new CreateFolder();
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Reader.class);
    
    /**
     * A beolvasást végző metódus.
     * @throws SAXException a beolvasás miatt
     * @throws IOException a beolvasás miatt
     */
    public void read() throws SAXException, IOException {
        users.setUsers(new ArrayList<User>());
        File file = new File(cf.getPath()+"darts.xml");
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);
            NodeList nodeList = doc.getElementsByTagName("user");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element elem = (Element) node;

                    users.getUsers().add(new User(elem.getElementsByTagName("name").item(0).getTextContent(),
                            Integer.parseInt(elem.getElementsByTagName("matches").item(0).getTextContent()),
                            Integer.parseInt(elem.getElementsByTagName("score").item(0).getTextContent()),
                            Double.parseDouble(elem.getElementsByTagName("highScore").item(0).getTextContent()),
                            Double.parseDouble(elem.getElementsByTagName("avg").item(0).getTextContent()),
                            Integer.parseInt(elem.getElementsByTagName("counter1").item(0).getTextContent()),
                            Integer.parseInt(elem.getElementsByTagName("counter2").item(0).getTextContent()),
                            Integer.parseInt(elem.getElementsByTagName("counter3").item(0).getTextContent()),
                            Integer.parseInt(elem.getElementsByTagName("wonMatches").item(0).getTextContent())
                    )
                    );
                }

            }
            logger.error("Beolvasás sikeres");
        } catch (ParserConfigurationException ex) {
            logger.error("Beolvasás sikertelen");
            Logger.getLogger(Darts.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
