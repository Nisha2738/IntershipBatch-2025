package Day12.java;

interface Printable {
	void print();
}

class Document implements Printable
{
	public void print()
	{
		System.out.println("Printing a Document");
		}
}

class Photo implements Printable
{
	public void print()
	{
		System.out.println("Printing a Photo");
		}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printable p1=new Document();
		Printable p2=new Photo();
		p1.print();
		p2.print();
		
	}

}
