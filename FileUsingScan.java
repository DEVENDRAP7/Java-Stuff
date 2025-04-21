import java.io.*;
import java.util.*;
class FileUsingScan
{
	public static void main(String ar[]) throws IOException , FileNotFoundException
	{
		File obj=new File("text.txt");
		Scanner sc=new Scanner(obj);
		String word;
		while (sc.hasNext())
		{
			word=sc.next();
			System.out.println(word);
		}
		sc.close();
	}
}
