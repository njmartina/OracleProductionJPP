package production;

/**
 * Driver to test the Player classes
 */
public class PlayerDriver {

  public static void testPlayer(){
    Screen screen = new Screen("1366x768", 40, 22);
    MoviePlayer a3 = new MoviePlayer("Pyle PDV156BK", screen, MonitorType.LED);

    System.out.println(a3.toString());

    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    a1.play();
    a1.stop();
    a1.next();
    a1.previous();

    a3.play();
    a3.stop();
    a3.next();
    a3.previous();
  }
}
