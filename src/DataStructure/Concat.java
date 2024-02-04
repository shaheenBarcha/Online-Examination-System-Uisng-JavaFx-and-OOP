package DataStructure;

import java.util.Scanner;

public class Concat {

	String output="";
	
	String con(String first,String second)
	{
		
      for(int i=0;i<first.length();i++)
      {
    	  output+=first.charAt(i);
       
      }
      for(int i=0;i<second.length();i++)
      {
    	  
           output+=second.charAt(i);
           
      }

        return output;
    }

    public static void main(String[] args) {
 
    String in1,in2;
    Scanner input = new Scanner(System.in);
    System.out.println("Please Enter First Word : ");
    in1 = input.next();
    System.out.println("Please Enter Second word : ");
    in2 = input.next();
    Concat c = new Concat();
    System.out.println("Output : "+c.con(in1, in2));
    }    
}