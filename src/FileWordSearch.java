import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileWordSearch 
{
   public static void main(String[] args) throws IOException 
   {
	   Scanner myobj = new Scanner(System.in);  
	   System.out.println("Enter the search term:");
	   String input = myobj.nextLine();
	   //Scanner type = new Scanner(System.in);
	   //System.out.println("Search Method: 1) String Match 2) Regular Expression 3) Indexed");
	   //String input1 = type.nextLine();
	    
	   
	   File dir = new File("C:\\Users\\mcha214\\Desktop\\Files"); //Creation of File Descriptor for input file
	   
	   for (File f1 : dir.listFiles()) 
	   {
		   	int count=0;  
    	    Scanner s = new Scanner(f1);
    	    String[] words=null;  //Intialize the word Array
    	    FileReader fr = new FileReader(f1);  //Creation of File Reader object
    	    BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
    	    String s1;
    	    
    	    while((s1=br.readLine())!=null)   //Reading Content from the file
    	      {
    	         words=s1.split(" ");  //Split the word using space
    	         
    	          for (String word : words) 
    	          {
    	                 if (word.equals(input))   //Search for the given word
    	                 {
    	                	 count++;    //If Present increase the count by one
    	                	 
    	                 }
    	          } 
    	         	         
    	      }
    	      String name = f1.getName();
    	      
    	      
    	      if(count!=0)  //Check for count not equal to zero
		      {
		         System.out.println(""+name+" - "+count+"");
		      }
		      else
		      {
		         System.out.println(""+name+" - "+count+"");
		      }      
    	      
    	      fr.close();
    	      s.close();
    	}

   }
}