/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matmr.webcrawler.main;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class CrawlerLegTest {
    
    public CrawlerLegTest() {
    }

    /**
     * Test of crawl method, of class Leg.
     */
    @Test
    public void testCrawl() {
        System.out.println("crawl");
        String url = "";
        CrawlerLeg instance = new CrawlerLeg();
        boolean expResult = false;
        boolean result = instance.crawl(url);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchForWord method, of class Leg.
     */
    @Test
    public void testSearchForWord() {
        System.out.println("searchForWord");
        String searchWord = "";
        CrawlerLeg instance = new CrawlerLeg();
        boolean expResult = false;
        boolean result = instance.searchForWord(searchWord);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLinks method, of class Leg.
     */
    @Test
    public void testGetLinks() {
        System.out.println("getLinks");
        CrawlerLeg instance = new CrawlerLeg();
        List<String> expResult = null;
        List<String> result = instance.getLinks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
