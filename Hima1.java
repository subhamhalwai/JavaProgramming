import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;  
class Hima1{  
	public static void main(String args[]) throws IOException{  
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();  
		h.put(1,100);
		h.put(2,200);
		h.put(3,300);
		h.put(4,400);
		h.put(5,500); 
		FileOutputStream f=new FileOutputStream("C:\\Users\\santo\\OneDrive\\Desktop\\Ex.txt");//your Path where you wanna to save the output file 
		for(Entry<Integer, Integer> m:h.entrySet()){
			String s="("+m.getKey()+","+m.getValue()+"),";
			byte b[]=s.getBytes();
			f.write(b);  
		} 
		f.flush();
		f.close();
	}  
}  