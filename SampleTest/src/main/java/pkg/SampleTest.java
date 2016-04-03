package pkg;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class SampleTest {

	public SampleTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/*String jsnStr= "{Contingencies \\ mmm \" of \\}";
		DataObject dob = new DataObject();
		Gson gson = new Gson();
		String s1= gson.toJson(dob);
		System.out.println("the String is: "+s1);
		System.out.println(gson.fromJson(s1, DataObject.class));
		
		System.out.println("\n====================================\n");
		String s2= gson.toJson(jsnStr);
		System.out.println("the String2 is: "+s2);
		System.out.println(gson.fromJson(s2, String.class));*/
		
		System.out.println("Before wait");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After wait");
}
	
	void test1(int i){
		
		i++;
		for(int i1=1;i1<5;i1++);
		
		}
}

