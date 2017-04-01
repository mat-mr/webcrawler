package com.matmr.webcrawler.main;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Crawler {
    
    private int maxNumberPages;
    private Set<String> pagesVisited = new HashSet<>();
    private List<String> pagesToVisit = new LinkedList<>();
    private List<String> found = new LinkedList<>();

    public Crawler(int maxNumberPages) {
        this.maxNumberPages = maxNumberPages;
    }
    
    private String nextUrl()
    {
        String nextUrl;
        do
        {
            nextUrl = this.pagesToVisit.remove(0);
        } while(this.pagesVisited.contains(nextUrl));
        this.pagesVisited.add(nextUrl);
        return nextUrl;
    }
    
    public void search(String url, String searchWord)
    {
        while(this.pagesVisited.size() < maxNumberPages)
        {
            String currentUrl;
            CrawlerLeg leg = new CrawlerLeg();
            if(this.pagesToVisit.isEmpty())
            {
                currentUrl = url;
                this.pagesVisited.add(url);
            }
            else
            {
                currentUrl = this.nextUrl();
            }
            leg.crawl(currentUrl); 
            boolean success = leg.searchForWord(searchWord);
            if(success)
            {
                found.add(currentUrl);
            }
            this.pagesToVisit.addAll(leg.getLinks());
        }
        System.out.println(String.format("Word %s found at:", searchWord));
        for (String site : found) {
           System.out.println(site); 
        }
    }
}
