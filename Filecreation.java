import java.io.*;
class Filecreation
{
	public static void main(String ar[]) throws IOException , FileNotFoundException
	{
		File f=new File("C:\\Users\\deven\\OneDrive\\Documents\\devendra\\NLJ\\java project\\File1.txt");
		f.createNewFile();
		System.out.println(f.canWrite());
		System.out.println(f.canRead());
		System.out.println(f.length());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		//System.out.println(f.AbsolutePath());
	}
}