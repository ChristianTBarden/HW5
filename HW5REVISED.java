import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HW5REVISED {public static void main(String[] args) throws FileNotFoundException {
	
	//Goal:Write a program that calculates distance traveled based on vehicle type and its speed and time.
	
	//imports Space vehicle record file with scanner (assigned file to scanner object)
	
			Scanner sc = new Scanner(new File("SpaceProbe.txt"));
			
				// Turn scanner object to string with while loop
			
			while(sc.hasNext()) {
				
                    //Scan each line
				   String lineOfText = sc.nextLine();
				   String lineOfText2 = sc.nextLine();
				   String lineOfText3 = sc.nextLine();
				   String lineOfText4 = sc.nextLine();
				   String lineOfText5 = sc.nextLine();
				   String lineOfText6 = sc.nextLine();
				
				   
				    //Delimit string by "," and tokenize//
				   StringTokenizer st = new StringTokenizer(lineOfText2, "," );
				   StringTokenizer sy = new StringTokenizer(lineOfText3, "," );
				   StringTokenizer sk = new StringTokenizer(lineOfText4, "," );
				   StringTokenizer sl = new StringTokenizer(lineOfText5, "," );
				   StringTokenizer sm = new StringTokenizer(lineOfText6, "," );
				   
				  String[] strTokenArray = new String[ st.countTokens() ];
				  String[] strTokenArray1 = new String[ sy.countTokens() ];
				  String[] strTokenArray2 = new String[ sk.countTokens() ];
				  String[] strTokenArray3 = new String[ sl.countTokens() ];
				  String[] strTokenArray4 = new String[ sm.countTokens() ];
				  
		            //iterate through all the tokens
		            int count = 0;
		            
		            while( st.hasMoreTokens() ) {
		                //add to an array
		                strTokenArray[count++] = st.nextToken();
		            }
		            int count0 = 0;
		            
		            while( sy.hasMoreTokens() ) {
		                //add to an array
		                strTokenArray1[count0++] = sy.nextToken();
		               
		            }int count1 = 0; while( sk.hasMoreTokens() ) {
		                //add to an array
		                 strTokenArray2[count1++] = sk.nextToken();
		                 
		            }int count2 = 0; while( sl.hasMoreTokens() ) {
		                //add to an array
		                strTokenArray3[count2++] = sl.nextToken();
		                
		            }int count3 = 0; while( sm.hasMoreTokens() ) {
		                //add to an array
		                strTokenArray4[count3++] = sm.nextToken();
		            }	
			        	//extract integers from created arrays containing tokens
		            
			            //voyager 1
			        	int V1_Speed = Integer.parseInt(strTokenArray[1]);
			        	
			        	int V1_Hrs = Integer.parseInt(strTokenArray[2]);
			        	    
			            //voyager2
			        	int V2_Speed = Integer.parseInt(strTokenArray1[1]);
			        	
			        	int V2_Hrs = Integer.parseInt(strTokenArray1[2]);
			        	
			            //pioneer1
			        	int P10_Speed = Integer.parseInt(strTokenArray2[1]);
			        	
			        	int P10_Hrs = Integer.parseInt(strTokenArray2[2]);
			        	
			        	//CassiniHuygens
			        	int CH_Speed = Integer.parseInt(strTokenArray3[1]);
			        	
			        	int CH_Hrs = Integer.parseInt(strTokenArray3[2]);
			        	
                        //HubbleSpaceTelescope
			        	int HST_Speed = Integer.parseInt(strTokenArray4[1]);
			        	
			        	int HST_Hrs = Integer.parseInt(strTokenArray4[2]);
			   
			        	 //Method prints println input to output file
			        		saveAsFile("Voyager1.txt");
			        	 
			        	 System.out.println("      |Voyager1|   ");
			        	 System.out.println("Hours              Distance Traveled(miles)");
			        	 System.out.println("-------------------------------------------");
			        	
			        	    for(int i = 1;i <= V1_Hrs;i++) {
			        		int  x = distance(V1_Speed,i);
			        		System.out.println(i+"                   "+x);
			        		
			        	//Method prints println input to output file
			        	} saveAsFile("Voyager2.txt");
			        	
			        	 System.out.println("       |Voyager2|   ");
			        	 System.out.println("Hours              Distance Traveled(miles)");
			        	 System.out.println("-------------------------------------------");
			        	 
			        	 	 for( int i = 1;i <= V2_Hrs;i++) {
			        		 int  x = distance(V2_Speed,i);
				        	 System.out.println(i+"                   "+x);
			              
				        //Method prints println input to output file
			        	} saveAsFile("Pioneer10.txt");
			        	
			        	 System.out.println("       |Pioneer10|   "); 
			        	 System.out.println("Hours              Distance Traveled(miles)");
			        	 System.out.println("-------------------------------------------");
			        	 
			        	 	 for( int i = 1;i <= P10_Hrs;i++) {
			        		 int  x = distance(P10_Speed,i);	
				        	 System.out.println(i+"                   "+x);
			        		
				        //Method prints println input to output file
			        	} saveAsFile("CasinniHuygens.txt");
			        	
			        	System.out.println("    |CassiniHuygens|   ");
			        	System.out.println("Hours              Distance Traveled(miles)");
			        	System.out.println("-------------------------------------------");
			        	
			        	     for(int i = 1;i <= CH_Hrs;i++) {
			        		 int  x = distance(CH_Speed,i);
				        	 System.out.println(i+"                   "+x);
			        		
			        		
			        	} saveAsFile("HubbleSpaceTelescope.txt");
			        	
			        	System.out.println("   |HubbleSpaceTelecope|   ");
			        	System.out.println("Hours              Distance Traveled(miles)");
			        	System.out.println("-------------------------------------------");
			        	
			                 for(int i = 1;i <= HST_Hrs;i++){
			            	 int  x = distance(HST_Speed,i);	
			            	 System.out.println(i+"                   "+x);
					     
			        		
			        		
			        		
			        	}}
			        }

static int distance(int speed, int time) {
	
	
int Distance = speed*time;

  return Distance;


  }

public static void saveAsFile(String filename) throws FileNotFoundException{
 
	 
	File file = new File(filename);
	
    //Instantiating the PrintStream class
	
    PrintStream stream = new PrintStream(file);
    
     //Setting Println as input and Printing values to file
    
    System.setOut(stream);
   
   
	    
	

}

}
