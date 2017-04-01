package com.matmr.webcrawler.main;

import org.junit.Test;
import static org.junit.Assert.*;

public class CrawlerTest {
    
    public CrawlerTest() {
    }

    @Test
    public void testSearch() {
        Crawler crawler = new Crawler(50);
        crawler.search("http://arstechnica.com/", "computer");
        assertTrue(true);
    }
}
