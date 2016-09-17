import java.io.*;
import java.util.*;

class sample{
		Scanner scanner;
		StringBuffer buff,buff1;
		String str;
		FileInputStream in;
		int c;
	
		int open(){
			System.out.println("Enter text file ");
			scanner=new Scanner(System.in);
			String file=scanner.nextLine();
			try{
				in=new FileInputStream(file);
				buff=new StringBuffer("");            		

				while ((c = in.read()) != -1) {
					buff.append((char)c);
					}
				System.out.println("Content of file : ");
				System.out.println(buff);
			}
			
			catch(Exception e){
				System.out.println("File not found ..........");
				return 1;
			}
			return 0;
		}
		
		void count(){
			
			System.out.println("Total words are"+c);
		}
					
			

	public static void main(String args[]){
			sample s=new sample();
			int n;
			n=s.open();
			if(n==1){
				s.open();
			}
		
			s.count();
		}
}
