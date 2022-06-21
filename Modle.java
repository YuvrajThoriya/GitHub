import java.io.*;
public class Modle
{
    String member_name;
	String gender;
	String dob;
	String age;
	String phoneno;

	
	Modle()
	{	

	}

	Modle(String a, String b,String c, String d, String e)
	{
        this.member_name = a;
		this.gender = b;
		this.dob = c;
		this.age = d;
        this.phoneno = e;
		
        
	}
	
	public String toString()
	{
		return "Member Name : "+this.member_name+"Gender : "+this.gender+ "Date Of Birth = "+this.dob+" Age: "+this.age+" Phone No :"+this.phoneno;
	}
	public String writeInFile()
	{
		return this.member_name+","+this.gender+","+this.dob+","+this.age+","+this.phoneno;
	}
	public void saveObject(String fileName) throws IOException
	{
		File f = new File(fileName);
		System.out.println(f.exists());
		if(f.exists())
		{
			FileWriter fw = new FileWriter(fileName,true);
			fw.write("\n"+this.writeInFile());
			fw.close();
		}
		else
		{
			FileWriter fw = new FileWriter(fileName);
			fw.write(this.writeInFile());
			fw.close();
		}
	}
	/*public void readObject(String fileName) throws IOException
	{
		File f = new File(fileName);
		System.out.println(f.exists());
		if(f.exists())
		{
			FileReader fr = new FileReader("customer.txt");
			char ch[] = new char[1000];
			fr.read(ch);
			fr.close();
			String myStr = String.valueOf(ch);
			String data[]  = myStr.split("\n");
		
			Modle cus[] = new Modle[data.length];
			for(int i=0;i<data.length;i++)
			{
				String attr[] = data[i].split(",");
				cus[i] = new Modle(attr[0],attr[1],attr[2],attr[3]);
			}
			for(int i=0;i<cus.length;i++)
			{
				System.out.println(cus[i]);
			}
		}
	}
	*/
}