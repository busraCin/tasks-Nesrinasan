
public class Seat {
	int row,column;
	private boolean isReserved = false;
	int price;
	String classType; // Economy or business class
	public Seat(int row,int column,String classType,int price) {
		this.row = row;
		this.column = column;
		this.classType = classType;
		if(classType.equals("business")) {
			this.price = (int) Math.round(price * 2.3);
		}
		else {
			this.price = price;
		}
	}
	
	
	
	
	public boolean isReserved() {
		return isReserved;
	}
	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}
	
	
	
}
