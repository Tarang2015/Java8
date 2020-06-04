package com.test.lambda;

import com.sun.tools.javac.util.List;

import java.net.URL;

public class WebCrawler {
  public static void main(String[] args) {
    List<String> urlsToCrawl = List.of("https://masterdevskills.com");
    WebCrawler webCrawler = new WebCrawler();
    webCrawler.craw(urlsToCrawl);
  }
  public void craw(List<String> urlsToCrawl) {
    urlsToCrawl.stream()
        .map(url-> {
          try {
            return new URL(url);
          } catch (Exception e) {
            e.printStackTrace();
          }
          return null;
        })

        .forEach(url->{
          try{
            save(url);
          }catch (Exception e){

          }

  } );


  }
  public void save(URL url){
    System.out.println(url);

  }
}
