/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package statepatterndemo;

/**
 *
 * @author DAD
 */
public class Disposition implements State {
 private Scanner scanner;
 State s;
InputSimulator inputsim;
    public Disposition(Scanner scanner) {
        this.scanner = scanner;
      inputsim = new InputSimulator(this.scanner);
        
    }
    public void sendto() {
     inputsim.getUserInput();

        scanner.state.sendto();
    }
}
