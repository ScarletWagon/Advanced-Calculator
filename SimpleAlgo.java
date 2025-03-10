   import java.io.*;
   import java.util.*;
	
   public class SimpleAlgo
   {
      public static Scanner input = new Scanner(System.in);
      
      public static void circle() throws IOException
      {
      //FIRST, DEFINE THE VARIABLES THAT YOU WILL NEED
      //GIVE THEM NAMES THAT MAKE SENSE
         double radius,	//user inputed radius of a circle
            area,		//the area of a circle
            perimeter;	//perimeter of a circle
      
      //INPUT - ASK THE USER FOR DATA AND STORE IT INTO A VARIABLE
         System.out.println("Enter the radius of a circle:");
         radius = input.nextDouble();
      
      //PROCESS - HAVE THE COMPUTER DO THE WORK FOR YOU
         area = Math.PI * radius * radius;
         perimeter = 2 * Math.PI * radius;
      
      //OUTPUT - SHOW THE USER THE RESULTS OF THAT WORK
         System.out.println("The area of a circle with radius "+radius+" is "+area+".");  
         System.out.println("The perimeter  is " + perimeter + ".");
      }
   
      public static void altitude() throws IOException
      {
      //THE ALTITUDE OF AN OBJECT DROPPED FROM 100 METERS is GIVEN BY 
      //alt = 100 - 4.9 * t * t WHERE t IS TIME IN SECONDS (must be less than 20).  
      //ASK FOR t AND FIND THE ALTITUDE.
      //EX. Enter the time in seconds: 2
      //    The object is at 80.4 meters.
      double alt,
      time;
      System.out.println("Enter the time after the item is dropped:");
         time = input.nextDouble();
         alt = 100 - 4.9 * time * time; 
         System.out.println("The altitude of a item dropeed within "  + time +" seconds is  " + alt + ".");

       
       
      }
   
      public static void temperature() throws IOException
      {
      //WRITE A PROGRAM THAT CONVERTS FAHRENHEIT TO CELCIUS USING C = (5.0/9)*(F-32).
      //WATCH OUT FOR THE DIFFERENCE BETWEEN DIV AND DIVIDE.
      //EX. Enter the temperature in Fahrenheit: 212
      //  	The temperature in Celcius is 100.0 degrees.
      double temp_f,
      temp_c;
      System.out.println("Enter the temprature in farenheit:");
         temp_f = input.nextDouble();
         temp_c = (5.0/9) * (temp_f - 32);
         System.out.println("the temprature of a object of " +temp_f+ " degrees farenheit is " +temp_c+ " degrees in celcius");
      
      
      }
   
      public static void pizza() throws IOException
      {
      //THE COST OF MAKING A PIZZA, GIVEN LABOR AND RENT IS $1.20 REGARDLESS OF SIZE 
      //AND AN ADDITIONAL $0.05 * THE DIAMETER SQUARED.  FIND THE COST GIVEN THE DIAMETER.
      //EX. Enter the size of the pizza: 10
      //      The cost is $6.20
      double size,
      cost,
      tax,
      cost_2,
      cost_3;
      System.out.println("Enter the size of the pizza:");
         size = input.nextDouble();
      tax = 1.20;
      cost_3 = 0.05;
      cost_2 = size * size * cost_3;
      cost = cost_2 + tax;
       System.out.println("The cost of a pizza without the tax of size "+size+" is "+cost_2+".");  
         System.out.println("The final cost is " + cost + ".");
      
      }
   
      public static void distance() throws IOException
      {
      //THE DISTANCE TO SCHOOL IS 32 KILOMETERS.  
      //WRITE A PROGRAM THAT ASKS THE USER FOR AN AVERAGE SPEED IN KILOMETERS PER     
      //HOUR AND FIND THE TIME FOR THE TRIP IN MINUTES.
      //Ex. Enter the average speed: 88
      //   	The trip will take you 21.8 minutes
      double distance,
         speed,
         time;
         System.out.println("Enter the average speed in km/h");
         speed = input.nextDouble();
         distance = 32;
         time = distance / speed * 60;
         System.out.println("The time taken to get to the school at a speed of  "+ speed + " will be "  + time + " minutes");
      }
   
    
      public static void divAndMod() throws IOException
      {
      //THE USER ENTERS TWO INTS AND THE METHOD DISPLAYS THE RESULT OF DIV AND MOD.
      //Ex. Enter the first integer:  13
      //  	 Enter the second integer: 4
      //  		13 / 4 is 3
      //  		13 % 4 is 1
      // 		4 / 13 is 0
      // 		4 % 13 is 4
      int number_1,
      div_1,
      div_2,
      mod_1,
      mod_2,
         number_2;
         System.out.println("Enter a integer");
         number_1 = input.nextInt();
         System.out.println("Enter another integer");
         number_2 = input.nextInt();
         div_1 = number_1 / number_2;
         mod_1 = number_1 % number_2;
         div_2 = number_2 / number_1;
         mod_2 = number_2 % number_1;
       System.out.println("the first divison is " +div_1+ ".");
        System.out.println("the first mod is " +mod_1+ "." );
        System.out.println("the second divison is " +div_2+ ".");
        System.out.println("the second mod is " +mod_2+ ".");
      }
   
   
      public static void volleyball() throws IOException
      {
      //VOLLEYBALL TEAMS ARE SET TO 7 PLAYERS PER TEAM.  HAVE THE USER ENTER THE      
      //  NUMBER OF AVAILABLE PLAYERS AND THEN CALCULATE THE NUMBER OF TEAMS AND  
      //  PLAYERS LEFT OVER.
      //  Ex. Enter the number of players: 37
      //      There will be 5 teams with 2 left over.
      int team_1,
        subs,
      players;
      System.out.println("Enter the number of players");
         players = input.nextInt();
         team_1 = players / 7;
         subs = players % 7;
           System.out.println("the numbers of teams will be  " +team_1+ ".");
           System.out.println("the numbers of subs will be  " +subs+ ".");

      }
   
   
      public static void time() throws IOException
      {
      //THE USER ENTERS A TIME IN MINUTES AND THE METHOD CALCULATES AND SHOWS THE 
      //   NUMBER OF HOURS AND MINUTES.
      //   Ex. Enter the number of minutes: 327
      //     	 This is 5:27
      int raw,
        hour,
        minutes;
        System.out.println("Enter the number of minutes");
         raw = input.nextInt();
         minutes = raw % 60;
           hour = raw / 60;
            System.out.println("the numbers of hours will be " +hour+ " hours along with " +minutes+ " minutes");
            System.out.println(" the complete time would be " +hour+ ":" +minutes+ " .");

      
      }
   
   
      public static void change() throws IOException
      {
      //THE USER ENTERS AN AMOUNT OF CHANGE IN CENTS AND THE PROGRAM SHOWS THE NUMBER
      //   OF QUARTERS, DIMES, NICKLES AND PENNIES.
      //   Ex. Enter an amount of change in cents: 68
      //   	 Quarters: 2		Dimes: 1		Nickles: 1		Pennies: 3  // quarter 0.25  dime 0.10  nickels 0.05   pennies 0.01
      int change,
      quarters,
      dimes,
      nickels,
      pennies;
      System.out.println("enter the amount of change");
      change = input.nextInt();
      quarters = change / 25;
      change = change - quarters * 25;
      dimes = change / 10;
      change = change - dimes * 10;
      nickels =  change / 5;
      change = change - nickels * 5;
      pennies = change / 1;
      System.out.println(" you would have " +quarters+ " quarters");
      System.out.println(" you would have " +dimes+ " dimes");
      System.out.println(" you would have " +nickels+ " nickles ");
      System.out.println(" you would have " +pennies+ " pennies");

       
      
      }
     
      public static void main(String argv[]) throws IOException      //everything with "main" is gonna run 
      {
        circle();
         pizza();
         altitude();
         temperature(); 
         distance(); 
        divAndMod();  
         volleyball();  
         time();  
         change();                         //anything marked here is gonna run
      }
   }