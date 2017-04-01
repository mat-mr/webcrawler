package com.matmr.webcrawler.main;

public class Main {
    
    public static void main(String[] args)
    {
        Crawler crawler = new Crawler(500);
        crawler.search("http://www.rbs.com.br/", "cwi");
    }
    
}
