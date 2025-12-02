/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;

/**
 *
 * @author SPACE4
 */
public class Song {
    protected int songID;
    protected String title;
    protected int duration;
    protected int singerID;
    protected String albumSerialNum;

    public Song() {
        System.out.println("Default Constructor");
    }
    
    public Song(int s1, String s2, int s3, int s4, String s5) {
        songID=s1;
        title = s2;
        duration = s3;
        singerID = s4;
        albumSerialNum = s5;
    }
    
    public int getSongID() {
        return songID;
    }
    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }
    public int getSingerID() {
        return singerID;
    }
    public String getAlbumSerialNum() {
        return albumSerialNum;
    }
    
}

