package Day18.java;
import java.io.*;

public class IOException02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			FileReader reader=new FileReader("myfile.txt");
			int ch;
			
			while((ch=reader.read())!=-1)
			{
				System.out.println((char)ch);
				}
			reader.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
			}
		catch(IOException e)
	{
		System.out.println(e);
	}
	}
}
