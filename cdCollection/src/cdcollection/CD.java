/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdcollection;

import java.text.NumberFormat;

/**
 *
 * @author Ivan Day
 */
public class CD {
    private String title, artist;
    private double cost;
    private int tracks;
    
    public CD(String name, String singer, double price, int numTracks){
        title = name;
        artist = singer;
        cost = price;
        tracks = numTracks;
    }
    
    public String toString(){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        String description;
        
        description = fmt.format(cost) + "\t" + tracks + "\t";
        description += title + "\t" + artist;
        
        return description;
        
    }
    
}
