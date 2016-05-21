package hu.unideb.inf.darts.test;

import hu.unideb.inf.darts.ManagerImpl;
import static org.junit.Assert.*;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ak
 */
public class ManagerTest {

    private static ManagerImpl m = new ManagerImpl();

    public ManagerTest() {
    }

    @Test
    public void setPlayer() {
        m.setPlayer("Player1", m.getPlayer1(), m.getPlayer2(), m.getDarts());
        assertEquals("A", m.getDarts().getPlayer1().getName());
        m.setPlayer("Player2", m.getPlayer1(), m.getPlayer2(), m.getDarts());
        assertEquals("B", m.getDarts().getPlayer1().getName());
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
    public void calc() {
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
        
        m.calc(501, m.getDarts());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));
        
        m.calc(1, m.getDarts());
        assertEquals(500, m.getDarts().getPlayer2().getScore());
        assertEquals(m.getDarts().getPlayer1().getScore(), m.getDarts().getPlayer1().getScore());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));
        
        m.calc(1, m.getDarts());
        assertEquals(499, m.getDarts().getPlayer2().getScore());
        assertEquals(m.getDarts().getPlayer1().getScore(), m.getDarts().getPlayer1().getScore());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));
        
        m.calc(1, m.getDarts());
        assertEquals(498, m.getDarts().getPlayer2().getScore());
        assertEquals(m.getDarts().getPlayer1().getScore(), m.getDarts().getPlayer1().getScore());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));
        
        m.calc(501, m.getDarts());
        assertEquals(m.getDarts().getPlayer2().getScore(), m.getDarts().getPlayer2().getScore());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));
        
        m.calc(1, m.getDarts());
        assertEquals(500, m.getDarts().getPlayer2().getScore());
        assertEquals(m.getDarts().getPlayer1().getScore(), m.getDarts().getPlayer1().getScore());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));
        
        m.calc(1, m.getDarts());
        assertEquals(499, m.getDarts().getPlayer2().getScore());
        assertEquals(m.getDarts().getPlayer1().getScore(), m.getDarts().getPlayer1().getScore());
        assertEquals(false, m.getWin());
        assertEquals(false, m.win(m.getDarts()));
        
        m.calc(499, m.getDarts());
        
        m.calc(501, m.getDarts());
        
        m.setResults(m.getDarts());
        
    }
}
