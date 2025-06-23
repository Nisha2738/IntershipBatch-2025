package Day2_1.java;

public class EvenNum {
	public void printEvenNumbers(int n) {
		        for (int i = 1; i <= n; i++) { 
		            if (i % 2 == 0) {
		                System.out.println(i);
		            }
		        }
		    }

		    public static void main(String[] args) {
		        EvenNum obj = new EvenNum();
		        obj.printEvenNumbers(10); 
		    }
		}

	

