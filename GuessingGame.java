//Programmer: Jacob Gersick
//Class: CS &145 
//Date: 1/10/2023
//Assignment: Guessing Game
//Reference Materials: Sections 3.3 and 4.1, Chapter 5 case study
//Purpose: 
//This program is supposed to run a guessing game with the following features:
//Instructions page, ability to play multiple games, and a summary/results page. 
//The user should be able to interact with it naturally.


import java.util.*; //imports all java utilities


public class GuessingGame { 
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in); // scanner 
            
        //initialize variables
      int maxNumber = 100;
      maxNumber = options(input, maxNumber);
      int guessTotal = 0;
      int bestGuess = 100;
      int gameCount = 0; 
      int gameScore = 0;       
      String reply = "y";
      instructions(input, maxNumber, reply);
     
      do {
      
         startLine(); //says 'Great, I've got my number.'           
         gameCount++;
           
           //Plays game
         gameScore = playGame(maxNumber,input);
           
           //captures best guess
         if (gameScore < bestGuess) {
            bestGuess = gameScore;
         }           
           //adds each game to total score    
         guessTotal += gameScore;
           
           //answer to the prompt "play again?"
         reply = input.next();
         reply = reply.toLowerCase();
           
      } // end DO/WHILE
       while (reply.startsWith("y") == true); 
       
      results(gameCount,guessTotal,bestGuess);
          
   } //end of MAIN
   
     //prompts until an integer is entered and then returns integer
   public static int getInt (Scanner input, String prompt) {
      System.out.print(prompt);
      while (!input.hasNextInt()) {
         input.nextLine();   //discards input
         System.out.println("Not an integer, please try again");
         System.out.print(prompt);
      } //end of while
      return input.nextInt();
   }//end of getInt method
   
    // allows user to select their own maximum for the guessed number range
   public static int options(Scanner input, int maxNumber) {
      System.out.println("Current maximum for number range is set to: "
       + maxNumber + ".");
      maxNumber = getInt(input, "Choose the maximum you would like to use"
      + " for this game:");
      return maxNumber;
   }
       
     //runs through one round of the game
   public static int playGame(int maxNumber, Scanner input) {    
      
      int randomNumber = randNum(maxNumber);
      int usrGuess = 0;
      int guessCounter = 0;
      
      while (usrGuess != randomNumber) {
         usrGuess = getInt(input,"Enter your guess: ");
         
         if (usrGuess > randomNumber) {
            lowerReply(usrGuess);
         }//end if
         
         else if (usrGuess < randomNumber) {
            higherReply(usrGuess);
         }//end else
         guessCounter++;
      }// end while
       
      winnerReply(usrGuess,guessCounter);
      return guessCounter;
   }//end of playGame method  
   
     //sums up stats based on the counters in the do/while loop in main method.                 
   public static void results(double gameCount,double guessTotal,int bestGuess) {
      
      double avgGuesses =  guessTotal / gameCount;
      
      System.out.println("\n\nSummary of game(s):");
      System.out.println("Total number of games played: " + (int) gameCount);
      System.out.println("Total number of guesses made: " + (int) guessTotal);
      System.out.println("Total number of robot friends made: 1");
      System.out.printf("Average guesses per game: %.1f%n",avgGuesses);
      System.out.println("Best round score: " + bestGuess + "\n");
      wait(2000);
      System.out.print("\"Good");
      wait(1000);
      System.out.print("bye ");
      wait(1000);
      System.out.print("hu");
      wait(1000);
      System.out.print("man\"");
      wait(1000);   
   } //end of results method 

   
     //returns a random number based on the input max
   public static int randNum(int maxNumber) {
      Random rand = new Random();
      int randomNumber = rand.nextInt(maxNumber) + 1;
      return randomNumber;
   } // end of randNum method     

     //makes pauses for dramatic effect in print statements    
   public static void wait(int ms) {
      try {
         Thread.sleep(ms);
      }
      catch(InterruptedException ex)  {
         Thread.currentThread().interrupt();
      }
   }//end of wait method
 
 
 //Sorry about the ugliness of all these. 
 //I tried to think of a better way but couldn't figure it out.
   
     //initial instructions 
   public static void instructions(Scanner input, int maxNumber, String reply) {   
   
      while (reply.startsWith("Y") || reply.startsWith("y") == true) {
         System.out.print("\"Hello ");
         wait(400);
         System.out.print("there ");
         wait(700);
         System.out.println("human.\"");
         wait(1000);
         System.out.println(".");
         wait(500);
         System.out.println(".");
         wait(500);
         System.out.println(".");
         System.out.print("\"Let's");
         wait(170);
         System.out.print(" play");
         wait(220);
         System.out.print(" the");
         wait(180);
         System.out.print(" guessing");
         wait(400);
         System.out.println(" game.\"");
         wait(800);
         System.out.println(".");
         wait(500);
         System.out.println(".");
         wait(500);
         System.out.println(".");
         wait(500);
         System.out.print("\"I'll ");     
         System.out.print("think ");
         wait(randNum(800));
         System.out.print("of ");
         wait(randNum(800));
         System.out.print("a ");
         wait(randNum(800));
         System.out.print("number ");
         wait(randNum(800));
         System.out.print("between ");
         wait(randNum(800));
         System.out.print("1 ");
         wait(randNum(800));
         System.out.print("and ");
         wait(randNum(800));
         System.out.println(maxNumber + ".\"");
         wait(randNum(800));
         System.out.print("\"and ");
         wait(randNum(800));
         System.out.print("you ");
         wait(randNum(800));
         System.out.print("try ");
         wait(randNum(800));
         System.out.print("to ");
         wait(randNum(800));
         System.out.print("guess ");
         wait(randNum(800));
         System.out.println("it.\"");
         wait(randNum(800));
         System.out.println(".");
         wait(randNum(800));
         System.out.println(".");
         wait(randNum(800));
         System.out.println(".");
         wait(randNum(800));
         System.out.print("\"Don't ");
         wait(randNum(400));
         System.out.print("w0rry, ");
         wait(randNum(800));
         System.out.print("I ");
         wait(randNum(800));
         System.out.print("will ");
         wait(randNum(800));
         System.out.print("g1ve you ");
         wait(randNum(800));
         System.out.print("h1nts ");
         wait(randNum(800));
         System.out.print("along ");
         wait(randNum(800));
         System.out.print("the ");
         wait(randNum(800));
         System.out.println("way\"");
         wait(randNum(800));
         System.out.println(".");
         wait(randNum(800));
         System.out.println(".");
         wait(randNum(800));
         System.out.println(".");
         wait(randNum(800));
         System.out.print("\"What ");
         wait(randNum(800));
         System.out.print("do ");
         wait(randNum(800));
         System.out.print("you ");
         wait(randNum(800));
         System.out.println("think?\"");
         wait(randNum(800));
         System.out.print("\"Should ");
         wait(randNum(800));
         System.out.print("I ");
         wait(randNum(800));
         System.out.print("repeat ");
         wait(randNum(800));
         System.out.print("all ");
         wait(randNum(800));
         System.out.println("that?\"");
         wait(randNum(800));
         System.out.print("Say Something: ");
      
         reply = input.next();
      } // end while loop
      
      return;       
      
   }// end of instructions method
   
   //prompts user to make a guess
   public static void startLine() {  
      System.out.print("\"Great, ");
      wait(randNum(800));
      System.out.print("I've ");
      wait(randNum(800));
      System.out.print("got ");
      wait(randNum(800));
      System.out.print("my ");
      wait(randNum(800));
      System.out.println("number.\"");
      wait(randNum(800));   
   } // end startLine method
      
   //when the user guesses too low in the game   
   public static void higherReply(int usrGuess) {   
      System.out.print("\"Hmm, ");
      wait(randNum(800));
      System.out.print(usrGuess + "? ");
      wait(randNum(800));
      System.out.print("That's close, ");
      wait(randNum(800));
      System.out.print("but my ");
      wait(randNum(800));
      System.out.print("number is ");
      wait(randNum(800));
      System.out.println("HIGHER.\""); 
   }//end higherReply method
   
   //when the user guesses too high in game
   public static void lowerReply(int usrGuess) {     
      System.out.print("\"Hmm, ");
      wait(randNum(800));
      System.out.print(usrGuess + "? ");
      wait(randNum(800));
      System.out.print("That's close, ");
      wait(randNum(800));
      System.out.print("but my ");
      wait(randNum(800));
      System.out.print("number is ");
      wait(randNum(800));
      System.out.println("LOWER.\"");  
   } //end lowerReply method
   
   //when the user guesses correctly in a game
   public static void winnerReply(int usrGuess,int guessCounter) {        
      System.out.print("\"Hmm, ");
      wait(randNum(800));
      System.out.print(usrGuess + "? ");
      wait(randNum(800));
      System.out.print("WOW, ");
      wait(randNum(800));
      System.out.print("that IS ");
      wait(randNum(800));
      System.out.println("my number! \n");
      wait(randNum(800));
      System.out.print("YOU ");
      wait(randNum(1200));
      System.out.print("== ");
      wait(randNum(1200));
      System.out.println("A WINNER!\"");
      wait(randNum(1200));
      System.out.println(
      "\n\nThat game took you "
       + guessCounter + 
       " tries. I bet you can do better...");
      System.out.print("Play again?");
   } //end winnerReply method
   
} // end of class