package pkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationSample {

	public static void main(String[] args) {

		try {
			Employee emp =  new Employee(new Address("Raleigh", "Cherry creek"), "Rekha");
			System.out.println("Emp object b4 serial: "+emp.name+" "+emp.addrs.city+" "+emp.addrs.street);
			
			FileOutputStream fo =  new FileOutputStream("C:/rekha_stuff/emp.ser");
			ObjectOutputStream os = new ObjectOutputStream(fo); 
			os.writeObject(emp);
			os.close();
			System.out.println("########################################################");
			FileInputStream fi = new FileInputStream("C:/rekha_stuff/emp.ser");
			ObjectInputStream oin = new ObjectInputStream(fi);
			Employee newEmp =  (Employee) oin.readObject();
			System.out.println("Emp object after serial: "+newEmp.name+" "+newEmp.addrs.city+" "+emp.addrs.street);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
