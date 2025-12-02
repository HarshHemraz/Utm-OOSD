/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;

/**
 *
 * @author SPACE4
 */
public class Album {
    protected String albumSerialNum;
    protected String genre;
    protected int numOfSongs;
    protected int releaseYear;
    
    public Album() {
        System.out.println("Default Cosntructor");
    }
    
    public Album(String s1, String s2, int s3, int s4) {
        albumSerialNum = s1;
        genre = s2;
        numOfSongs = s3;
        releaseYear = s4;
    }
    
    public String getAlbumSerialNum() {
        return albumSerialNum;
    }
    public String getGenre() {
        return genre;
    }
    public int getNumofSongs() {
        return numOfSongs;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
}
