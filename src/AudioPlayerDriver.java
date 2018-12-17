/**
 * @author      Jonathan J. Troiano
 * @date        Last updated December 15, 2018
 * @description Driver class for the AudioPlayer class. Demonstrates functionality by
 *              instantiating occurrences of itself, using media controls implemented from interface
 *              MultimediaControl, and prints out details of its object using methods from
 *              MultimediaControl.
 */
public class AudioPlayerDriver {
  
  /**
   * Creates default AudioPlayer object to test its functionality. Prints the constructed object
   * and runs through its functions (implemented from MultimediaControl).
   *
   *    OracleProduction
   *    SerialNumber
   *    GMT date
   *    assigned name (product name)
   *    ItemType (e.g. Audio, Visual, ...)
   *    "newAudioPlayer"
   *    "defaultAudioSpec"
   */
  public static void testAudioPlayer() {
    AudioPlayer iPodMiniObj = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer walkmanObj = new AudioPlayer("Walkman", "WAV");

    iPodMiniObj.play();
    iPodMiniObj.stop();
    iPodMiniObj.next();
    iPodMiniObj.previous();
    
    /**
     * This is what is supposed to print:
     *
     *    Manufacturer : OracleProduction
     *    Serial Number : 1
     *    Date : Fri Oct 12 05:06:08 EDT 2018
     *    Name : iPod Mini
     *    Audio Spec : MP3
     *    Type : AUDIO
     */
    System.out.println(iPodMiniObj.toString());
    System.out.println(walkmanObj.toString());
  }
 
}