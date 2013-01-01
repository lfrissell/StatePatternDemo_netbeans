/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package statepatterndemo;

/**
 *
 * @author DAD
 */
public class InsertDoc implements State {
Scanner scanner;

    public InsertDoc(Scanner scanner) {
        this.scanner = scanner;
    }

    public void sendto() {
        System.out.println("Welcome to SuperDuper Scanner 1000 ");   
        System.out.println("Please insert document ");   
        System.out.println("Thank you");
        if((this.scanner.getDoc().width == 8) && (this.scanner.getDoc().hieght ==11)){
        scanner.setState(scanner.getAcceptDoc());
        scanner.state.sendto();
        }else{
             scanner.setState(scanner.rejectDoc);
        scanner.state.sendto();
        }
       
    }

}
