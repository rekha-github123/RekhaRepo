package pkg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestRuntimeCls {

	
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		List<HashMap<String, String>> lMap = new ArrayList<HashMap<String,String>>();
		List<HashMap<String,String>> hashMaps = new ArrayList<HashMap<String,String>>();

		try {
		//rt.exec("notepad");
		rt.exec("mspaint");
		} catch (IOException ioe) {
		ioe.printStackTrace();
		}
	}	
}
