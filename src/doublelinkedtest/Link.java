package doublelinkedtest;

public class Link {

    public long dDate;
    public Link next;
    public Link previous;
    
    
    public Link(long d) {
	super();
	dDate = d;
    }
    
    public void displayLink() {
	System.out.print(dDate+" ");
    }
}
