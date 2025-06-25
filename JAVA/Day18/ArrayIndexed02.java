package Day18.java;

import java.lang.reflect.Array;

public class ArrayIndexed02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {1,2,3,4,5};
		try
		{
			for(int i=0; i<=array.length; i++)
			{
				System.out.println("Element at index " + i + ":" + array[i]);
				}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception: Invalid array index");
		}
	}
}
