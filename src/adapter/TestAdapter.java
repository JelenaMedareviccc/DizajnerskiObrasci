package adapter;

import java.util.ArrayList;
import java.util.Iterator;


public class TestAdapter {

	public static void main(String[] args) {
		ArrayList<Vehicle> vehicleList=new ArrayList<>();
		Car car=new Car();
		vehicleList.add(car);
		Truck truck= new Truck();
		vehicleList.add(truck);
		Motobike motobike=new Motobike();
		vehicleList.add(motobike);
		
		AirPlaneAdapter apAdapter=new AirPlaneAdapter(new AirPlane());
		vehicleList.add(apAdapter);
		
		Iterator<Vehicle> it=vehicleList.iterator();
		while(it.hasNext()) {
			it.next().goFaster();
		}
		

	}

}
