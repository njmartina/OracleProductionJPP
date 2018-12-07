package production;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

  /**
  Allows employee to enter their first and last name
  Generates a department ID from their name information

   */
public class EmployeeInfo {

  private StringBuilder name = new StringBuilder();
  private String code;
  private String deptId;
  private Pattern p;
  private Scanner in;

    /**
     * Creates new scanner, calls method to set the employee name
     * Checks if the name is a first and last separated by a space
     * If so, sets the code to the first letter of the first name followed by the last name
     * Sets string patter
     */
  EmployeeInfo() {
    in = new Scanner(System.in);

    setName();

    if (checkName(this.name)) {
      createEmployeeCode(this.name);
    } else {
      this.code = "guest";
    }

    String patternString = "([A-Z])[a-z][a-z][a-z]\\d\\d";
    p = Pattern.compile(patternString);

    in.close();
  }

  public String reverseString(String id){
    char letter = id.charAt(id.length()-1);

    if (id.length() == 1){
      return Character.toString(letter);
    }
    else {
      return letter+reverseString(id.substring(0,id.length()-1));
    }
  }

  public StringBuilder getName() {
    return name;
  }

  private void setName() {
    name.append(inputName());
  }

  public String getCode() {
    return code;
  }

  private void createEmployeeCode(StringBuilder name) {
    this.code = new String(name.delete(1, (name.indexOf(" ") + 1)));
  }

  private String inputName() {
    System.out.println("Please input employee name(first and last separated by a space): ");
    return in.nextLine();
  }

  private boolean checkName(StringBuilder name) {
    CharSequence str = " ";
    return name.toString().contains(str);
  }

  public String getDeptId(){
    System.out.println("Please enter the department ID: ");
    return in.nextLine();
  }

  private void setDeptId(){
    String inputID = getDeptId();
    if (validId(inputID)){
      deptId = reverseString(inputID);
    }
    else{
      deptId = "None01";
    }
  }

  private String getId(){
    return deptId;
  }

  private boolean validId(String id){
    boolean matches = false;

    Matcher matcher = p.matcher(id);
    matches = matcher.matches();

    return matches;
  }

  @Override
  public String toString() {
    return "Employee Code : " + code + '\n' +
          "Department Number : " + deptId;
  }
}
