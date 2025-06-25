package Day18.java;
import java.io.*;

public class IOException01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			FileReader reader=new FileReader("ABC.txt");
			reader.read();
			reader.close();
			}
		catch(IOException e)
		{
			System.out.println("Exception: file not exits");
		}
	}

}
