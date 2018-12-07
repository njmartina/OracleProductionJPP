//Nicolo Martina COP 3003
//Interface used to implement the following functions

package production;

import java.util.Date;

/**
 * Interface item used to implement the following functions
 */
public interface Item {

  String manufacturer = "OracleProduction"; //Sets string for production manufacturer

  void setProductionNumber(int i); //Sets production number (serial number)

  void setName(String name); //Sets name for product

  String getName(); //Gets name of product

  Date getManufactureDate(); //Gets date of production

  int getSerialNumber(); //Gets serial number
}
