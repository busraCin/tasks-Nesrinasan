import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Map<String,Integer> seatRow = new HashMap<String,Integer>(){{
			put("A",1);
			put("B",2);
			put("C",3);
			put("D",4);
			put("E",5);
			put("F",6);
			put("G",7);
			put("H",8);
			put("I",9);
			put("J",10);
			put("K",11);
			put("L",12);
			put("M",13);
			put("N",14);
			put("O",15);
			
		}};
		
		Scanner scanner = new Scanner(System.in);
		
		Plane plane = null;
		Plane.askBrand();
		int brandNum = scanner.nextInt();
		scanner = new Scanner(System.in);
		Plane.askDomesticOrInternational();
		int domesticOrInternationalFlight = scanner.nextInt();
		if(brandNum ==1) {
			plane = new Plane("Pegaus",domesticOrInternationalFlight);
		}
		else if(brandNum == 2) {
			plane = new Plane("THY",domesticOrInternationalFlight);
		}
		
		
		Plane.showEmptySeats();
		scanner = new Scanner(System.in);
		String chosenSeat = scanner.nextLine();
		int row = seatRow.get(String.valueOf(chosenSeat.charAt(0)));
		int column = Integer.valueOf(chosenSeat.charAt(1))-48; //char to integer value
		plane.setReservation(chosenSeat,row, column);
		

	}
	
}
