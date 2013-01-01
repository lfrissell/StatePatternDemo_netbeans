/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package statepatterndemo;

/**
 *
 * @author DAD
 */
public class Disk implements State {
private Scanner scanner;
    public Disk(Scanner scanner) {
        this.scanner = scanner;
    }

    public void sendto() {
        System.out.println(" Sending Document to disk as a PDF");
         scanner.setState(scanner.getDisposition());
           scanner.state.sendto();
    }

}
