
package iphone2gsimulator;

import iphone2gsimulator.iphone.Iphone2G;

public class Main {
    public static void main(String[] args) {
        Iphone2G iphone = new Iphone2G();
        // turning on
        iphone.powerOn();
        // calling
        iphone.call("34-99117-9515");
        // picking up
        iphone.pickUp();
        // voice mail
        iphone.startVoiceMail();
        // Music
        iphone.selectTrack("Fate Symphony");
        iphone.play();
        iphone.pause();
        // Internet
        iphone.showWeb("https://www.ufu.br");
        iphone.addNewTab();
        iphone.reloadPage();

    }
}
