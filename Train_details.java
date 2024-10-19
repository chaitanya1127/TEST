public class Train_details {
	int trainNumber;
	String destination;
	int capacity;
	String type;
	int currentPassengers;

	public static void main(String[] args) {
		Train train = new Train();
		train.trainNumber = 1233;
		train.destination = " bengaluru";
		train.capacity = 2000;
		train.trainType = " express";
		train.currentPassengers = 1200;
		
                System.out.println("trainNumber :"+train.trainNumber);
                System.out.println("destination :"+train.destination);
                System.out.println("capacity :"+train.capacity);
                System.out.println("trainType :"+train.trainType);
                System.out.println("currentPassengers :"+train.currentPassengers);
        
                System.out.println("-----------------------------------");
        
                Train train1 = new Train();
		train1.trainNumber = 1127;
		train1.destination = "mysore";
		train1.capacity = 3000;
		train1.trainType = " express";
		train1.currentPassengers = 1100;
		System.out.println("trainNumber :"+train1.trainNumber);
	        System.out.println("destination :"+train1.destination);
	        System.out.println("capacity :"+train1.capacity);
	        System.out.println("trainType :"+train1.trainType);
	        System.out.println("currentPassengers :"+train1.currentPassengers);
	
                System.out.println("-----------------------------------");
        
                Train train2 = new Train();
		train2.trainNumber = 14245;
		train2.destination = "chennai";
		train2.capacity = 4000;
		train2.trainType = " ordinary";
		train2.currentPassengers = 1500;
		System.out.println("trainNumber :"+train2.trainNumber);
	        System.out.println("destination :"+train2.destination);
	        System.out.println("capacity :"+train2.capacity);
	        System.out.println("trainType :"+train2.trainType);
	        System.out.println("currentPassengers :"+train2.currentPassengers);
		
                System.out.println("-----------------------------------");
        
                Train train3 = new Train();
		train3.trainNumber = 2574;
		train3.destination = "new delhi";
		train3.capacity = 4400;
		train3.trainType = " ordinary";
		train3.currentPassengers = 1700;
		System.out.println("trainNumber :"+train3.trainNumber);
	        System.out.println("destination :"+train3.destination);
	        System.out.println("capacity :"+train3.capacity);
	        System.out.println("trainType :"+train3.trainType);
	        System.out.println("currentPassengers :"+train3.currentPassengers);
                System.out.println("-----------------------------------");
}
}
        
               