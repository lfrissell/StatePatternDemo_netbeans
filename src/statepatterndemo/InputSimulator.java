/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package statepatterndemo;

    
/**
 *
 * @author DAD
 */
public class InputSimulator {
    private Scanner scanner;
    private static int sel = 1;
    State s;

    public InputSimulator(Scanner scanner) {
        this.scanner=scanner;
    }
  /* Input  Simulator Tests muliple paths using a switch statement
   *  The switch statement selects path. 
   * 
   */
    

public void getUserInput(){
          switch (sel) {   
   case 1:  scanner.setState(scanner.getDisk());  break;
   case 2: scanner.setState(scanner.getPrint()); break;
   case 3: scanner.setState(scanner.getEmail()); break;
   case 4:  scanner.setState(scanner.getDone());break; 
   default: System.out.println("Invalid State.");break;


}
 sel = sel+1;
}
}