package pkg;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{

	
	transient Address addrs;
	String name;
	
	public Employee(Address adrs,String nm) {
		this.addrs=adrs;
		this.name=nm;
	}
	
	private void writeObject(ObjectOutputStream os){
		try {
			os.defaultWriteObject();
			os.writeObject(addrs.city);
			os.writeObject(addrs.street);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void  readObject(ObjectInputStream in){
		try {
			in.defaultReadObject();
			addrs = new Address((String) in.readObject(), (String) in.readObject());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
