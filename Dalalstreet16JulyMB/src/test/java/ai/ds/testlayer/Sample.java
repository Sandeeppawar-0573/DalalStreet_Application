package ai.ds.testlayer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;

public class Sample {
	
//	@Test
//	public void test()
//	{
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("Harry" + i + "Potter");
//		}
//	}
	
	 public static void main(String[] args) 
	 {    
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
	 }    

}
