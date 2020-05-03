package MorseConverter;

import java.util.Scanner;



public class Main
{

    public static void main(String[] args) {
    	
    	 String loop="y";
    	 
    	 

         char [] English = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };

            String [] Morse = { ".-" , "-..." , "-.-." , "-.." , "." , "..-." , "--." , "...." , ".." , ".---" , "-.-" , ".-.." , "--" , "-." , "---" , ".--." , "--.-" ,  ".-." , "..." , "-" , "..-" , "...-" , ".--" , "-..-" , "-.--" , "--.." , "|" };

            
            while(loop.equalsIgnoreCase("y")) {
            Scanner input = new Scanner (System.in);
            System.out.println( "Please enter \"Mc\" if you want to translate Morse Code into English, or \"Eng\" if you want to translate from English into Morse Code" );
            String a = input.nextLine();
            
                if ( a.equalsIgnoreCase("MC"))
                {
                    System.out.println( "Please enter a sentence in Morse Code. Separate each letter/digit with a single space and delimit multiple words with a | ." );
                    String b = input.nextLine();
                    String[] words = null;
                    if(b.contains("|")){
                     words = b.split("[|]");
                    }else{
                        words = new String[1];
                        words[0] = b;
                    }

                    for (String word: words )
                    {
                        String[] characters = word.split(" ");
                        for(int h = 0;h < characters.length;h++){
                        for(int i = 0;i < Morse.length;i++){
                            if(characters[h].equals(Morse[i])){
                                System.out.print(English[i]);
                            }
                        }
                        }
                        System.out.print(" ");  
                    }    
                }

                else if ( a.equalsIgnoreCase("Eng" ))
                {
                    System.out.println("Please enter a sentence in English, and separate each word with a blank space.");
                    String c = input.nextLine(); 

                    c = c.toLowerCase ();

                    for ( int x = 0; x < c.length(); x++ )
                    {
                        for ( int y = 0; y < English.length; y++ )
                        {
                            if ( English [ y ] == c.charAt ( x ) )

                            System.out.print ( Morse [ y ] + " " );


                        }

                    }


                }

                else 
                {
                    System.out.println ( "Invalid Input" );

                }
            
         System.out.println("\nWant to convert agian? Y/N");
         loop=input.nextLine();
    	 
    	 
    	 }

            }
    
    
}
