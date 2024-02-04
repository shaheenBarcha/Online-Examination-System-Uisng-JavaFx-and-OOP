import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filing extends Login
{
	String q1, q2, q3, q4, q5, q6, q7, q8, q9, q10 = "";
	String q1o1, q1o2, q1o3, q1o4, q1c1 = "";
	String q2o1, q2o2, q2o3, q2o4, q2c2 = "";
	String q3o1, q3o2, q3o3, q3o4, q3c3 = "";
	String q4o1, q4o2, q4o3, q4o4, q4c4 = "";
	String q5o1, q5o2, q5o3, q5o4, q5c5 = "";
	String q6o1, q6o2, q6o3, q6o4, q6c6 = "";
	String q7o1, q7o2, q7o3, q7o4, q7c7 = "";
	String q8o1, q8o2, q8o3, q8o4, q8c8 = "";
	String q9o1, q9o2, q9o3, q9o4, q9c9 = "";
	String q10o1, q10o2, q10o3, q10o4, q10c10 = "";
	String PST, MVC, OOP = "";
	
	
	Scanner x;
	
	
	public void WriteToDataFile(String d, String txt) throws IOException
	{
		FileWriter file = new FileWriter(txt,true);
		BufferedWriter w = new BufferedWriter(file);
		
		w.write(d);
		w.write("\n");
		w.close();
	}
	
	public void WriteToUser_Pass(String up, String txt) throws IOException
	{
		FileWriter upfile = new FileWriter(txt,true);
		BufferedWriter wr = new BufferedWriter(upfile);
		
		wr.write(up);
		wr.write("\n");
		wr.close();
	}
	
	public void WriteToQuest(String d,String txt) throws IOException
	{
		FileWriter file = new FileWriter(txt,true);
		BufferedWriter w = new BufferedWriter(file);
		
		w.write(d);
		w.write("\n");
		w.close();
	}
	
	public void WriteToOpt(String d,String txt) throws IOException
	{
		FileWriter file = new FileWriter(txt,true);
		BufferedWriter w = new BufferedWriter(file);
		
		w.write(d);
		w.write("\n");
		w.close();
	}
	
	public void read_dates(String txt)
	{
		try
		{
			x = new Scanner(new File(txt));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}  
		while (x.hasNextLine())
		{  
		   PST = x.nextLine();
		   MVC = x.nextLine();
		   OOP = x.nextLine();
		}
	}
	
	public void read_questions(String txt)
	{
		try
		{
			x = new Scanner(new File(txt));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}  
		while (x.hasNextLine())
		{  
		   q1 = x.nextLine();
		   q2 = x.nextLine();
		   q3 = x.nextLine();
		   q4 = x.nextLine();
		   q5 = x.nextLine();
		   q6 = x.nextLine();
		   q7 = x.nextLine();
		   q8 = x.nextLine();
		   q9 = x.nextLine();
		   q10 = x.nextLine();
		}
	}
	
	public void read_options(String d)
	{
		try
		{
			x = new Scanner(new File(d));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}  
		while (x.hasNextLine())
		{  
		   q1o1 = x.nextLine();
		   q1o2 = x.nextLine();
		   q1o3 = x.nextLine();
		   q1o4 = x.nextLine();
		   q1c1 = x.nextLine();
		   q2o1 = x.nextLine();
		   q2o2 = x.nextLine();
		   q2o3 = x.nextLine();
		   q2o4 = x.nextLine();
		   q2c2 = x.nextLine();
		   q3o1 = x.nextLine();
		   q3o2 = x.nextLine();
		   q3o3 = x.nextLine();
		   q3o4 = x.nextLine();
		   q3c3 = x.nextLine();
		   q4o1 = x.nextLine();
		   q4o2 = x.nextLine();
		   q4o3 = x.nextLine();
		   q4o4 = x.nextLine();
		   q4c4 = x.nextLine();
		   q5o1 = x.nextLine();
		   q5o2 = x.nextLine();
		   q5o3 = x.nextLine();
		   q5o4 = x.nextLine();
		   q5c5 = x.nextLine();
		   q6o1 = x.nextLine();
		   q6o2 = x.nextLine();
		   q6o3 = x.nextLine();
		   q6o4 = x.nextLine();
		   q6c6 = x.nextLine();
		   q7o1 = x.nextLine();
		   q7o2 = x.nextLine();
		   q7o3 = x.nextLine();
		   q7o4 = x.nextLine();
		   q7c7 = x.nextLine();
		   q8o1 = x.nextLine();
		   q8o2 = x.nextLine();
		   q8o3 = x.nextLine();
		   q8o4 = x.nextLine();
		   q8c8 = x.nextLine();
		   q9o1 = x.nextLine();
		   q9o2 = x.nextLine();
		   q9o3 = x.nextLine();
		   q9o4 = x.nextLine();
		   q9c9 = x.nextLine();
		   q10o1 = x.nextLine();
		   q10o2 = x.nextLine();
		   q10o3 = x.nextLine();
		   q10o4 = x.nextLine();
		   q10c10 = x.nextLine();
		}
	}
		
	public void open_file(String txt)
	{
		try
		{
			x=new Scanner(new File(txt));
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	
	public void close()
	{
		x.close();
	}
	
	public boolean read_Login(String n, String p)
	{
		boolean status= false;
		String tempn= n;
		String tempp= p;
		
		while(x.hasNext())
		{
			String a= x.next();
			String b= x.next();
			
			if(tempn.equals(a) && tempp.equals(b)) 
			{
				status = true;	
			}
		}
		return status;
	}
}
