package production;
/*
  Concrete class Screen used to define resolution, refresh rate, and response time
 */
public class Screen implements ScreenSpec {

  //Class variables
  String resolution;
  int refreshrate;
  int responsetime;

  //Overloaded constructor takes screen resolution, refresh rate, and response time
  Screen(String resolution, int refreshrate, int responsetime){
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  //Methods implemented from ScreenSpec interface
  @Override
  public String getResolution() {
    return resolution;
  }

  @Override
  public int getRefreshRate() {
    return refreshrate;
  }

  @Override
  public int getResponseTime() {
    return responsetime;
  }

  //Overloaded toString method to add resolution, refresh rate, and response time
  @Override
  public String toString() {
    return "Resolution : " + getResolution() + "\n" +
        "Refresh Rate : " + getRefreshRate() + "\n" +
        "Response Time : " + getResponseTime();
  }
}
