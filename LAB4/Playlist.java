/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author SPACE4
 */
public class Playlist {
    protected String playlistID;
    protected LocalDate dateCreated;
    protected LocalTime startTime;
    protected LocalTime endTime;
    protected String hostNIC;
    protected String songs;
    
    public Playlist() {
        System.out.println("Default Constructor");
    }
    public Playlist(String s1, LocalDate s2, LocalTime s3, LocalTime s4, String s5, String s6) {
        playlistID = s1;
        dateCreated = s2;
        startTime = s3;
        endTime = s4;
        hostNIC = s5;
        songs = s6;
    }
    
    public String getPlaylistID() {
        return playlistID;
    }
    public LocalDate getDateCreated() {
        return dateCreated;
    }
    public LocalTime getStartTime() {
        return startTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }
    public String getHostNIC() {
        return hostNIC;
    }
    public String getSOngs() {
        return songs;
    }
}
