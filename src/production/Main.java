package production;

public class Main {

  public static void main(String args[]) {

    MoviePlayerDriver.testMoviePlayer();
    PlayerDriver.testPlayer();

    ProcessFiles f = new ProcessFiles();

    try {
      f.WriteFile("test222");
    } catch (Exception ex){
      System.out.println("could not write");
    }
}

}
