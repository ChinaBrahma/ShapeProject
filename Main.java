import pkg3.*;
import pkg1.*;

public class Main{
	public static void main(String[] args){
		try{
			Shape circle = Shape.getShape("Circle", 5);	
			System.out.println(circle.getArea());
			System.out.println(circle.getVolume());
		}catch(Exception ex){
			System.out.println("Exception thrown: "+ex);
		}
        try{
			Shape sphere = Shape.getShape("Sphere", 5);
			System.out.println(sphere.getVolume());
			System.out.println(sphere.getArea());
		}catch(Exception ex){
			System.out.println("Exception thrown: "+ex);
		}
	}
}
