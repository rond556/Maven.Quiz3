package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String waveString = str.toLowerCase();
        String[] waveArray = new String[str.length()];


        for(int i = 0; i < str.length(); i++){
            String waveSubString = "";
            if(Character.isLetter(str.charAt(i))) {
                waveSubString = waveString.substring(0, i) + waveString.substring(i, i + 1).toUpperCase() + waveString.substring(i + 1);
            }
            waveArray[i] = waveSubString;
        }

        return waveArray;
    }
}
