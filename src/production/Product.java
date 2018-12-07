//Nicolo Martina COP 3003
//Abstract class used to implement the Item interface

package production;

import java.util.Date;
import java.util.List;

/**
 * Abstract class used as a skeleton for further products
 * Features incrementing serial number, dates and names
 */
abstract public class Product implements Item, Comparable <Product> {

  //Variables used for product class
  private int serialNumber;
  private String manufacturer = Item.manufacturer;
  private Date manufacturedOn;
  private String name;

  private static int currentProductionNumber = 1;

  /**Constructor takes product name and sets field variable
   * Sets serialnumber to production number while incrementing
   * Sets manufactured date to current date
   **/
  public Product(String name) {
    this.name = name;
    serialNumber = currentProductionNumber++;
    manufacturedOn = new Date();
  }


  //Implements interface method, sets production number
  @Override
  public void setProductionNumber(int i) {
    currentProductionNumber = i;
    //sets current production number
  }

  //Implements interface method, sets product names
  @Override
  public void setName(String name) {
    this.name = name;
  }

  //Implements interface method, gets manufacture date
  @Override
  public Date getManufactureDate() {
    return manufacturedOn;
  }

  //Implements interface method, gets serial number
  @Override
  public int getSerialNumber() {
    return serialNumber;
  }

  public String getName() {
    return name;
  }

  public int compareTo(Product p) {

    return name.compareTo(p.getName());

  }

  static void printType(List<?> list, Class<? extends Product> c){
    for (Object o : list){
      if (c.isInstance(o)) {
        System.out.println(o.toString());
      }

    }

  }


  //Override toString method to print manufacture, serial number, date, and name
  @Override
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
        + "Serial Number : " + getSerialNumber() + "\n"
        + "Date : " + getManufactureDate() + "\n"
        + "Name : " + getName();
  }
}

