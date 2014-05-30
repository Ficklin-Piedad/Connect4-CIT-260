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

public class Sound {
	public static AudioClip BALL = Applet.newAudioClip(Sound.class.getResource("ball.wav"));
	public static AudioClip GAMEOVER = Applet.newAudioClip(Sound.class.getResource("gameover.wav"));
	public static AudioClip BACK = Applet.newAudioClip(Sound.class.getResource("NEON.wav"));
}
