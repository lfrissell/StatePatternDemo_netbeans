/*
 * Scanner Object holds the current state, and provides setter/getter methods for changing state
 */

package statepatterndemo;

/**
 *
 * @author DAD
 */
public class Scanner {
    Document doc;
  State insertDoc;
       State acceptDoc;
       State disposition;
       State disk;
       State print;
       State email;
       State done;
       State rejectDoc;
       State state = insertDoc;

       public Scanner(Document _doc){
      acceptDoc = new AcceptDoc(this);
      rejectDoc = new RejectDoc(this);
      disposition = new Disposition(this);
      disk = new Disk(this);
      print = new Print(this);
      email = new Email(this);
      done = new Done(this);
      insertDoc = new InsertDoc(this);
      this.setState( insertDoc);
      this.setDoc(_doc);
           
       }

    public Document getDoc() {
        return doc;
    }

    public final void setDoc(Document doc) {
        this.doc = doc;
    }

    public State getRejectDoc() {
        return rejectDoc;
    }

    public void setRejectDoc(State rejectDoc) {
        this.rejectDoc = rejectDoc;
    }
       
    public void sendto(){
        state.sendto();
    }   
    public State getAcceptDoc() {
        return acceptDoc;
    }

    public State getDisk() {
        return disk;
    }

    public State getDisposition() {
        return disposition;
    }

    public State getDone() {
        return done;
    }

    public State getEmail() {
        return email;
    }

    public State getInsertDoc() {
        return insertDoc;
    }

    public State getPrint() {
        return print;
    }

    public State getState() {
        return state;
    }
     final void setState(State state) {
		this.state = state;
     }

  
     
}
