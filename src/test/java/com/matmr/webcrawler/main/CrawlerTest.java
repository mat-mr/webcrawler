package com.matmr.webcrawler.main;

import com.matmr.webcrawler.builder.CrawlerBuilder;
import org.junit.Test;
import static org.junit.Assert.*;

public class CrawlerTest {
    
    public CrawlerTest() {
    }

    @Test
    public void mustStartWithDeclaredMaxNumberOfPages() {        
        int expectedNumber = 50;
        Crawler crawler = new CrawlerBuilder()
                                .withMaxNumberPages(expectedNumber)
                                .build();
        
        assertEquals(expectedNumber, crawler.getMaxNumberPages());
    }
}
