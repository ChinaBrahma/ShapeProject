package pkg2;
import pkg1.* ;

public abstract class ThreeD implements Shape{
        @Override
        public double getArea() throws MethodException{
            throw new MethodException("Area not allowed :( ");
        }
}