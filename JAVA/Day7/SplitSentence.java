package Day7_Expression.java;
import java.util.*;

public class SplitSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence:");
		String sentence=sc.nextLine();
		
		String[] words=sentence.split(" ");
		System.out.println("Words in Sentence:");
		
		for(String word: words)
		{
			System.out.println(word);
		}
	}

}
