//Nicolo Martina COP 3003
//Enum used to set each of the 4 types of products
package production;
/*
  Enum used to store different player specifications
 */
public enum ItemType {
  AUDIO("AU"), VISUAL("VI"), AUDIOMOBILE("AM"), VISUALMOBILE("VM");

  public String code;

  //sets item code
  ItemType(String code) {
    this.code = code;
  }
}
