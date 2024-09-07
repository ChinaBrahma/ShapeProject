package pkg1;
import pkg3.*;
public interface Shape {
    public double getArea() throws MethodException;
    public double getVolume() throws MethodException;

    public static Shape getShape(String type, double ...params){
        switch (type) {
            case "Sphere":
                return new Sphere(params[0]);
            case "Circle":
                return new Circle(params[0]);
            
            default:
                return null;
        }
    }


    
}