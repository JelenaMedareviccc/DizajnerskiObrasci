package methodFactory;

public class BillFactory {

	public static  final int UTILITY=2;
	public static final int ELECTRICITY=1;
	public static final int GAS=3;
	public Bill getSomeBill(int billID) {
		switch(billID) {
		case 1: return new ElectricityBill();
		case 2: return new UtilityBill();
		case 3: return new GasBill();
		default: return null;
		}
	}

}
