/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crazyconnect4;


/**
 *
 * @author henrydiazlds
 */
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class SoundTest {
    
    /**
     *
     * @throws InterruptedException
     */
    public void backgroundMusicPlay() throws InterruptedException {
                URL url = SoundTest.class.getResource("NEON.wav");
		AudioClip clip = Applet.newAudioClip(url);
		clip.loop();
    }
}
