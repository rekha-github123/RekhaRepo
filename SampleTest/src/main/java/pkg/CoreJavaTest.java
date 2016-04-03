package pkg;

public class CoreJavaTest {

	public static void main(String arg[]){
		 test1();
		//test2();
	}


	private static void test2() {
		int x=0;
		
		while(x<4){
		
			System.out.print("a");
			if(x<1){
				System.out.print(" ");
			}
			
			System.out.print("n");
			if(x>1){
				
				System.out.print(" oyster");
				x=x+2;
			}
		
			if(x==1){
				
				System.out.print("noys");
			}
			
			
			if(x<1){
				
				System.out.print("oise");
			}
			
			System.out.println(" ");
			
			x=x+1;
		}
	}
	
	
	static void test1(){
		int x=0;
		int y=0;
		
		while(x<5){
			//case1
			//y=x-y;
			
			//case2
			//y=x+y;
			
			//case3
//			y=y+2;
//			if(y>4){
//				y=y-1;
//			}
			
			//case4
			x=x+1;
			y=y+x;
			
			System.out.print(x+""+y+" ");
			x=x+1;
		}
		
	}
	
}
