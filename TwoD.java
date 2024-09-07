package pkg2;
import pkg1.*;

public abstract class TwoD implements Shape{
        @Override
        public double getVolume() throws MethodException{
            throw new MethodException("Volume not allowed :(");
        }
}