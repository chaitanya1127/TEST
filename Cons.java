public class Cons{
        int trainNumber;
	String destination;
	int capacity;
	String type;
	int currentPassengers;

public static void main(String[] args){
Cons();
Cons cons = new Cons(1325,"bengaluru",2000,"Express",1400);

System.out.println("trainNumber ="+cons.trainNumber);
System.out.println("destination ="+cons.destination);
System.out.println("capacity ="+cons.capacity);
System.out.println("type ="+cons.type);
System.out.println("currentPassengers="+cons.currentPassengers);
}
public static void Cons(){
System.out.println(" constructor with no parameter");
}
public Cons( int trainNumber,String destination,int capacity,String type,int currentPassengers){
System.out.println(" constructor with parameter");
this.trainNumber=trainNumber;
this.destination=destination;
this.capacity=capacity;
this.type=type;
this.currentPassengers=currentPassengers;
}
}
 