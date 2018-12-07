package production;

/**
  Concrete class to capture the details of an audio player
 */
public class AudioPlayer extends Product implements MultimediaControl {

  String audioSpecification;
  ItemType mediaType;


  //Overloaded constructor takes in name of audio player and audio specification
  AudioPlayer(String name, String audioSpecification){

    //Calls Product super constructor to assign name
    super(name);
    this.audioSpecification = audioSpecification;

    this.mediaType = ItemType.AUDIO;

  }

  //Methods implemented from MultiMediaControl interface
  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  @Override
  public void previous() {
    System.out.println("Playing previous");
  }

  @Override
  public void next() {
    System.out.println("Skipping");
  }

  //Overloaded toString method to add audio specification and media type
  @Override
  public String toString() {
    return super.toString() + "\n" + "Audio Spec : " + audioSpecification + "\n" +
        "Type : " + mediaType;
  }
}
