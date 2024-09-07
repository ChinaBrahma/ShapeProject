package pkg1;
import  java.io.*;

public class MethodException extends Exception{
	private String msg;

	public MethodException(String msg){
		this.msg = msg;
	}

	public String toString(){
		return ""+msg;
	}
}
