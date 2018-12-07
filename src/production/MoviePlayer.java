package production;

/**
  Concrete class to capture the details of a movie player
 */
public class MoviePlayer extends Product implements MultimediaControl {

  //Two variables of objects screen and monitortype
  Screen screen;
  MonitorType monitorType;

  /**
   * Overloaded constructor takes in name of audtio player, screen type, and monitor type
   */
  MoviePlayer(String name, Screen screen, MonitorType monitorType){

    //Calls Product super constructor to assign name
    super(name);

    //Sets passed variables
    this.monitorType = monitorType;
    this.screen = screen;
  }

  //Methods implemented from MultiMediaControl interface
  @Override
  public void play() {
    System.out.println("Playing movie");
  }

  @Override
  public void stop() {
    System.out.println("Stopping movie");
  }

  @Override
  public void previous() {
    System.out.println("Playing previous movie");
  }

  @Override
  public void next() {
    System.out.println("Playing next movie");
  }

  //Overloaded toString method to add screen and monitor type
  @Override
  public String toString() {
    return super.toString() + "\n" + "Screen : " + screen.toString() + "\n" + "Monitor Type : " + monitorType;

  }
}
