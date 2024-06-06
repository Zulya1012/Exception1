package exsp;
import java.io.File;
import java.io.IOException;
public class Dispatcher {
	public static void main(String[] args){
		File f1 = new File("C:/Users/User1/eclipse-workspace/Store/Exception2/src/exsp/file1");
		System.out.println(f1.length());
		File f2 = new File("C:/Users/User1/eclipse-workspace/Store/Exception2/src/exsp/file4");
		try{
			create (f2);
		}catch(IOException e) {}
		int x = 10;
		int y = 0;
		int [] z = {3,1,6,2};
		try {
			display(z);
			divide(x,y);
	 	}catch (RuntimeException e) {
			System.out.println(e);
		}
		
		System.out.println("End");
	}
	static void create(File f) throws IOException{
			f.createNewFile();
	}
	static void divide(int a, int b) {
		System.out.println(a/b);
	}
	
	static void display (int [] a) {
		System.out.println(a[4]);
	}

}
