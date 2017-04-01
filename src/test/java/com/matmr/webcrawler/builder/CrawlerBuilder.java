package com.matmr.webcrawler.builder;

import com.matmr.webcrawler.main.Crawler;

public class CrawlerBuilder {
    
    public int maxNumberPages;

    public CrawlerBuilder withMaxNumberPages(int maxNumber) {
        this.maxNumberPages = maxNumber;
        return this;
    }
    
    public Crawler build() {
        return new Crawler(maxNumberPages);
    }
}
