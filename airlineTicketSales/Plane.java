import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Plane {
	String brand;
	int price;
	int domesticOrInternationalFlight;
	static ArrayList<Seat> seats = new ArrayList<Seat>();
	public Plane(String brand, int domesticOrInternationalFlight) {
		this.brand = brand;
		if (brand.equals("Pegasus")) {
			this.price = 100;
		}
		else {
			this.price = 200;
		}
		if(domesticOrInternationalFlight ==2) {
			this.price *= 3; //International flights are 2 times more expensive than domestic flights.
			this.price += 50; //International flights have various food and beverages.
		}
		
		
		this.setSeats();
	}
	
	public void setSeats() {
		if(brand.equals("THY")) {
			for(int i=1;i<11;i++) {
				String classType;
				if (i <4) {
					classType = "business";
				}
				else {
					classType = "economy";
				}
				for(int j=1;j<7;j++) {	
					seats.add(new Seat(i,j,classType,price));
				}
			}
		}
		else {
			for(int i=1;i<16;i++) {
				String classType;
				if (i <6) {
					classType = "business";
				}
				else {
					classType = "economy";
				}
				for(int j=1;j<7;j++) {	
					seats.add(new Seat(i,j,classType,price));
				}
			}
			
		}
	}
	
	public static void showEmptySeats() {
		Map<Integer, String> seatRow = new HashMap<Integer, String>(){{
			put(1,"A");
			put(2,"B");
			put(3,"C");
			put(4,"D");
			put(5,"E");
			put(6,"F");
			put(7,"G");
			put(8,"H");
			put(9,"I");
			put(10,"J");
			put(11,"K");
			put(12,"L");
			put(13,"M");
			put(14,"N");
			put(15,"O");
			
		}};
		for(int index=0;index<seats.size();index++) {
			if(!seats.get(index).isReserved()) {
				String row = seatRow.get(seats.get(index).row);
				int column = seats.get(index).column;
				System.out.print(row+column+" ");
				if (index !=seats.size()-1) {
					if (seats.get(index+1).row>seats.get(index).row) {
						System.out.println();
					}
				}
			}
			else {
				System.out.print("   ");
				if (index !=seats.size()-1) {
				if (seats.get(index+1).row>seats.get(index).row) {
					System.out.println();
				}
				
			}}
		}
		
		System.out.println("\n\nThese seats are empty. Which seats do you want to reserve?");
	}
	
	public void setReservation(String chosenSeat,int row,int column) {
		int index = (row-1)*6 + column -1; 
		seats.get(index).setReserved(true);
		System.out.println("\n"+chosenSeat+ " is reserved successfuly!\n");
		System.out.println("It costs $"+seats.get(index).price);
	}
	
	public static void askBrand() {
		System.out.println("Do you want to use Pegasus Airlines or THY for flying? \nType '1' for Pegasus Airlines or '2' for THY");
		
	}
	public static void askDomesticOrInternational() {
		System.out.println("Are you planning to domestic or international flight? \n Type '1' for Domectic Flight or '2' for Internatinaol. ");
	}
}
