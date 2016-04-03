package pkg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map;
import java.util.Map;

class ABC{
	
	int a=10;
	static int b=20;
	final int k;
	Map<String, String> map =  new HashMap<String,String>();
	
	ABC(){
		k=50;
	}
	
    class XYZ{
        private int x=10;
    }
    
    static class SampleStatic{
    	static int frmStatIn = 100;
    	int frmStatIn1 = 200;
     	void test(){
     		System.out.println("From outer class: "+b);
     	}
    }

    public static void main(String... args){
    	/*ABC out =  new ABC();
        ABC.XYZ xx = out.new XYZ();
    	
        System.out.println("Hello :: "+xx.x); ///Why is this allowed??
        out.testInner();
        out.testNestedStatic();
        new ABC.SampleStatic().test();
        */
    	System.out.println("Property is: "+System.getProperty("java.class.path"));
    	System.out.println("all Property is: "+System.getProperties().toString());
    }
    
    void testInner(){
    	XYZ xx = new XYZ();
    	 System.out.println("Hello from method :: "+xx.x);
    }
    
    void testNestedStatic(){
    	ABC.SampleStatic obj = new ABC.SampleStatic();
    	System.out.println("Hello from method :: "+SampleStatic.frmStatIn +" and "+obj.frmStatIn1 );
    }
    
    void testLocalInner(){
    	//public int k=10;
    	//protected int l = 20;
    	final int m = 30;
    	
    	class LocalInnerCls{
    		
    	}
    	
    }
}
