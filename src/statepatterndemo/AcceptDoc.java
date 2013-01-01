/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package statepatterndemo;

/**
 *
 * @author DAD
 */
public class AcceptDoc implements State{
private Scanner scanner;


    public AcceptDoc(Scanner scanner) {
        this.scanner = scanner;
    }


    public void sendto() { 
           System.out.println(" The User has accepted this Document");
           scanner.setState(scanner.getDisposition());
           scanner.state.sendto();

    }

}
