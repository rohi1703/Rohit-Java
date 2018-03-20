package org.Practice.DesignPattern;

import java.util.ArrayList;
import java.util.List;

public class RoyalEnfieldRohitCreationTest {
		
	
	public interface Bike
	{
		public Engine createEngine();
		public BikeBody createBody();
	}
	
	
	public interface BikeParts{}
	
	public abstract class RoyalBike implements Bike
	{
		Engine engine;
		Body bikeBody;
		public abstract Engine createEngine();
		public abstract BikeBody createBody();
	}
	public class ThunderBirdBike extends RoyalBike
	{
		Engine engine;
		BikeBody bikeBody;
		List<BikeParts> bikePartList = new ArrayList<BikeParts>();
		public ThunderBirdBike()
		{
			engine = new RoyalEngine();
			bikeBody = new ThunderBirdBikeBody();
			
		}
		public Engine createEngine()
		{
			return engine.createEngine();
		}
		public BikeBody createBody(){
			return bikeBody.createBody();
		}
		public Engine getEngine() {
			return engine;
		}
		public BikeBody getBikeBody() {
			return bikeBody;
		}
		public void addEngine()
		{
			bikePartList.add(engine);
		}
		public void addBikeBody()
		{
			bikePartList.add(bikeBody);
		}
		 
	}
	
	public class ClassicBike extends RoyalBike
	{
		Engine engine;
		BikeBody bikeBody;
		List<BikeParts> bikePartList = new ArrayList<BikeParts>();
		public ClassicBike()
		{
			engine = new RoyalEngine();
			bikeBody = new ClassicBikeBody();
		}
		public Engine createEngine()
		{
			return engine.createEngine();
		}
		public BikeBody createBody(){
			return bikeBody.createBody();
		}
		public Engine getEngine() {
			return engine;
		}
		public BikeBody getBikeBody() {
			return bikeBody;
		}
		public void addEngine()
		{
			bikePartList.add(engine);
		}
		public void addBikeBody()
		{
			bikePartList.add(bikeBody);
		}
		 
	}
	
	public abstract class BikeBody implements BikeParts
	{
		String headLightType;
		String OilTankTYpe;
		String seatsType;
		public String getHeadLightType() {
			return headLightType;
		}
		public void setHeadLightType(String headLightType) {
			this.headLightType = headLightType;
		}
		public String getOilTankTYpe() {
			return OilTankTYpe;
		}
		public void setOilTankTYpe(String oilTankTYpe) {
			OilTankTYpe = oilTankTYpe;
		}
		public String getSeatsType() {
			return seatsType;
		}
		public void setSeatsType(String seatsType) {
			this.seatsType = seatsType;
		}
		
		public abstract BikeBody createBody();
		 
	}
	
	public class ThunderBirdBikeBody extends BikeBody
	{
		String name;
		//String color
		public ThunderBirdBikeBody()
		{
			name = new String("ThunderBirdBody");
		}
		
		public BikeBody createBody()
		{
			this.setHeadLightType("round");
			this.setOilTankTYpe("owelShaped");
			this.setSeatsType("wave");
			return this;
		}
		
		public String toString()
		{
			return "BikeBody "+ name +" "+"HeadLightType = "+this.getHeadLightType()+" "+"OilTankTYpe = "+this.getOilTankTYpe()+" "+"seatsType = "+this.getSeatsType()+" ";
		}
		
	}
	
	public class ClassicBikeBody extends BikeBody
	{
		String name;
		//String color
		public ClassicBikeBody()
		{
			name = new String("ClassicBikeBody");
		}
		
		public BikeBody createBody()
		{
			this.setHeadLightType("round");
			this.setOilTankTYpe("EggShaped");
			this.setSeatsType("straight");
			return this;
		}
		
		public String toString()
		{
			return "BikeBody "+ name +" "+"HeadLightType = "+this.getHeadLightType()+" "+"OilTankTYpe = "+this.getOilTankTYpe()+" "+"seatsType = "+this.getSeatsType()+" ";
		}
		
	}
	
	public abstract class Engine implements BikeParts{
		Integer strokeType;
		String coolingType;
		public Integer getStrokeType() {
			return strokeType;
		}
		public void setStrokeType(Integer strokeType) {
			this.strokeType = strokeType;
		}
		public String getCoolingType() {
			return coolingType;
		}
		public void setCoolingType(String coolingType) {
			this.coolingType = coolingType;
		}
		//Ab method
		public abstract Engine createEngine();
	}
	
	public class RoyalEngine extends Engine
	{
		public RoyalEngine()
		{
			
		}
		public Engine createEngine()
		{
			this.setStrokeType(4);
			this.setCoolingType("oil cooled");
			return this;
		}
		
		public String toString()
		{
			return "Engine"+" "+"cooling_Type = "+this.getCoolingType()+"Stroke_Type = "+this.getStrokeType()+" ";
		}
	}

	public class BikeBuilder
	{
		public BikeBuilder(){}
		public Bike createBike(Bike bikeType)
		{
			BikeBody body = bikeType.createBody();
			System.out.println(body.toString());
			Engine engine = bikeType.createEngine();
			System.out.println(engine.toString());
			return bikeType;
		}
		
		public Bike BuildThunderBird()
		{
			ThunderBirdBike thunder = new ThunderBirdBike();
			thunder.addBikeBody();
			thunder.addEngine();
			return thunder;
		}
		
		public Bike Classic()
		{
			ClassicBike classic = new ClassicBike();
			classic.addBikeBody();
			classic.addEngine();
			return classic;
		}
	}
	
	
}


