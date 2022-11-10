package arrayafter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDemo {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
		
/*   //1.creation of file
 
	File file=new File("/home/krishna/Documents/file1.txt");
	System.out.println(file.createNewFile());  // create file return datatype is boolean
	*/	

		/*		
 		//2.Creation of folder
 		
		File file =new File("/home/krishna/Documents/krishna");
		System.out.println(file.mkdir());
		*/
		
		/* 			//3.Creation of multiple folder
		File file =new File("/home/krishna/Documents/krishna/1/2/3/4/5/6");
		System.out.println(file.mkdirs());  
		*/		
		
		/* 	
		  		//4 .file exists or  not
		File file =new File("/home/krishna/Documents/krishna/1/2/3/4/5/6");
		System.out.println(file.mkdirs());  
		System.out.println(file.exists());  
		*/

	/*	//4 .file delete
				File file =new File("/home/krishna/Documents/krishna/1/2");	
				System.out.println(	file.delete());  */
				
	/*		//5.last modified
		File file =new File("/home/krishna/Documents/krishna/1/2.txt");	
		System.out.println(file.createNewFile());
		System.out.println(	file.lastModified());  
		System.out.println(file.getName());  //to check the file name
		System.out.println(file.canExecute());
		System.out.println(file.canRead());   */
		
		
		//list of file(all)
/*	File file = new File("/home/krishna/Pictures");

	String[] ar = file.list();

	for (String f : ar) {
		System.out.println(f);
	}
		*/
	

/*		
		// it will print all the file folder in pictures with proper location
	File file = new File("/home/krishna/Pictures");

	File[] ar = file.listFiles();

	for (File files : ar) {
		System.out.println(files);
		}
*/

/*
 * // it will print only a folder. File file=new
 * File("/home/krishna/Documents"); File[] ar=file.listFiles();
 * 
 * for(File element:ar) { if(element.isDirectory()) System.out.println(element);
 * }
 */
		
		
/*		// it will print only a file.
				File file=new File("/home/krishna/Documents");
				File[]  ar=file.listFiles();
				
				for(File element:ar)
				{
					if(element.isFile())		
						System.out.println(element);
				}
			*/
		
/*		
	// specific files
		
	File file=new File("/home/krishna/Downloads");

	File[] ar=file.listFiles();
	for(File element: ar)
	{
		if(element.isFile())
		{
			String name=element.getName();
			
			String extension=name.substring(name.length()-4, name.length());
			if(extension.equals("java"))
				System.out.println(name);
		}
	}		*/
		
/*
 * // it will rewrite if we change inside content File file=new
 * File("/home/krishna/Documents/abc.txt"); file.createNewFile(); FileWriter
 * fl=new FileWriter(file);
 * 
 * fl.write("sql"); fl.write("Python"); fl.flush(); fl.close();
 */
		
		
/*
 * // if we pass true in constructor it will add in the nextline File file=new
 * File("/home/krishna/Documents/abc.txt"); 
 * FileWriter fl=new FileWriter(file,true);
 * 
 * fl.write("Java"); fl.write("\n"); fl.write("Python"); fl.write("\n");
 * fl.write("Angular"); fl.write("\n"); fl.write("ReactJS"); fl.write("\n");
 * fl.flush(); fl.close();
 * 
 */
	
/*
 * File file=new File("/home/krishna/Documents/abc.txt"); FileWriter fl=new
 * FileWriter(file,true); BufferedWriter br=new BufferedWriter(fl);
 * 
 * br.newLine(); br.write("I have completed degree in BIT Campus");
 * br.newLine(); br.write("I am from tvm"); br.newLine(); br.flush();
 * br.close();
 */
	

/*
 * File file = new File("/home/krishna/Documents/abc.txt"); FileReader fr = new
 * FileReader(file); int value = fr.read();
 * 
 * int count=0; while (value != -1) { if((char)value==' ' ) // (if(char)value=='
 * ') //if we want space count add this if statement count++;
 * 
 * System.out.print((char) value); value = fr.read(); }
 * System.out.println("Total character present in the file is "+count);
 */ 
 
 
 
/*
 * File file=new File("/home/krishna/Downloads/Array2.java"); FileReader fr=new
 * FileReader(file); BufferedReader br=new BufferedReader(fr);
 * 
 * String value=br.readLine(); int count=0; while(value!=null) {
 * System.out.println(value); value=br.readLine(); count++; }
 * System.out.println("Total line present in the file is: "+count);
 */
//------------------------------------------------------------------------------------	
		
	//mp3 file writing in another location	
		
	/*InputStream is=new FileInputStream("/home/krishna/Documents/Dil Ko Karaar Aaya.mp3"); 	
	OutputStream os=new FileOutputStream("/home/krishna/Documents/B25/Dil.mp3");
	
	int byt=is.read();
	while(byt!=-1)
	{
		os.write(byt);
		byt=is.read();
	}
	System.out.println();
	}*/
//------------------------------------------------------------------------------		
		//line or count
		
/*		File file=new File("/home/krishna/Documents/abc.txt");
		FileReader fr=new FileReader(file);		
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		int count=0;
		while(line!=null)
		{
			count++;
			System.out.println(line);
			line=br.readLine();
		}
		System.out.println("Total line in the file "+count);  */
//	-----------------------------------------------------------------------	
	
/*		
	File file=new File("/home/krishna/Documents/abc.txt")	;
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);
	
	String line=br.readLine();
	String[] ar=line.split(" ");
	int count=0;

		for(int i=0; i<ar.length; i++)
		{
		if(ar[i].charAt(0)>='A' && ar[i].charAt(0)<='Z')
			count++;
		line=br.readLine();
		}
		
	System.out.println("word start with capital letter count is "+ count);	  */
//---------------------------------------------------------------------------------
	// Renaming a file.	
		
	/*
	 * File file=new File("/home/krishna/Documents/abc.txt");
	 * System.out.println(file.exists());
	 * 
	 * File newFile=new File("/home/krishna/Documents/practice.txt");
	 * 
	 * System.out.println(file.renameTo(newFile));
	 */
		
	//printing a filename;
		
	/*
	 * File file=new File("/home/krishna/Documents/practice.txt");
	 * System.out.println(file.getName());
	 */

		
/*		
	File file = new File("/home/krishna/Downloads");

	File[] ar = file.listFiles();

	for (File ele : ar) {

		if (ele.length() > 1048576 * 200) {
			System.out.println(ele);
		}
	}
	
	*/
		
}
} 






