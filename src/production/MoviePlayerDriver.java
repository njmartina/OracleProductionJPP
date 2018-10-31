package production;

public class MoviePlayerDriver {

  public static void testMoviePlayer(){
    Screen screen1 = new Screen("720x480", 40, 22);
    MoviePlayer a1 = new MoviePlayer("DBPOWER MK101", screen1, MonitorType.LCD);

    System.out.println(a1.toString());
  }
}
