import java.io.*;
class PrintW
{
	public static void main(String ar[]) throws FileNotFoundException , IOException
	{
		PrintWriter pout=new PrintWriter("text.txt");
		int age=19;
		String data = "This is text ";
		pout.print(age);
		pout.print(data);
		pout.close();
	}
}
