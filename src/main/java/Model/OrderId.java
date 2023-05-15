package Model;

public class OrderId {
	private int count =+ 1;
	

    public OrderId() {
        this.count = 1;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        this.count++;
        System.out.println("");
        System.out.println("COUNTTER");
        System.out.println(count);
        System.out.println("COUNTTER");
        System.out.println("");
    }
    
    
}
