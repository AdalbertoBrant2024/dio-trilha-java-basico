
package iphone2gsimulator.iphone;

import iphone2gsimulator.device.Device;
import iphone2gsimulator.internet.InternetBrowser;
import iphone2gsimulator.music.MusicPlayer;
import iphone2gsimulator.phone.Phone;

public class Iphone2G extends Device implements InternetBrowser, MusicPlayer, Phone {
    private String music;
    private String url;
    private String number;
    private Boolean isOn = false;
    
    // MusicPlayer
    @Override
    public void play(){
        System.out.println("Playing -> " + this.music);
    }
    @Override
    public void pause(){
        System.out.println("Pausing -> " + this.music);
    }
    @Override
    public void selectTrack(String track){
        this.music = track;
        System.out.println("Now playing -> " + this.music);
    }
    // Internet
    @Override
    public void showWeb(String url){
        this.url = url;
        System.out.println("Browsing to -> " + url);
    }
    @Override
    public void addNewTab(){
        System.out.println("Creating new tab to navigate!");
    }
    @Override
    public void reloadPage(){
        System.out.println("Reloading -> " + this.url);
    }
    
    // Phone
    @Override
     public void call(String number){
         this.number = number;
         System.out.println("Dialing -> " + this.number);
     };
     @Override
    public void pickUp(){
         System.out.println("Answering -> "+ this.number);
    }
    @Override
    public void startVoiceMail(){
        System.out.println("Playing voice mail!");
    }
    
}
