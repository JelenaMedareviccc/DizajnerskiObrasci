package methodFactory;

public class TestBill {

	public static void main(String[] args) {
	BillFactory bf=new BillFactory();
	UtilityBill util=(UtilityBill) bf.getSomeBill(BillFactory.UTILITY);
	util.calculateTotal();
	ElectricityBill ele=(ElectricityBill) bf.getSomeBill(BillFactory.ELECTRICITY);
	ele.calculateTotal();
	GasBill bg=(GasBill) bf.getSomeBill(BillFactory.GAS);
	bg.calculateTotal();
	
	}
}
