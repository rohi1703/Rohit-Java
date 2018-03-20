package org.Practice.DesignPattern;

import org.Practice.DesignPattern.RoyalEnfieldRohitCreationTest.Bike;
import org.Practice.DesignPattern.RoyalEnfieldRohitCreationTest.BikeBuilder;

public class TestClient {

	public static void main(String[] args) {
		RoyalEnfieldRohitCreationTest ServerTest = new RoyalEnfieldRohitCreationTest();
		//BikeBuilder bb = new BikeBuilder();
		BikeBuilder bb = ServerTest.new BikeBuilder();
		Bike thunderbird = ServerTest.new ThunderBirdBike();
		Bike classic = ServerTest.new ClassicBike();
		Bike bike = bb.createBike(thunderbird);
		Bike bike1 = bb.createBike(classic);
		

	}

}
