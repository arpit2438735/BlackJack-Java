package com.hashedin.arpit.blackjack;
import java.lang.Enum;
import java.util.*;
/**
 * 
 * @author arpit
 *
 */
class Cards{
	/**Map<Integer,Integer>cardsSelection=new HashMap<Integer,Integer>();*/
	ArrayList<HashMap<Integer,Integer>> selection=new ArrayList<HashMap<Integer,Integer>>();
	private int randomvalue;
	private int suit;
	private int card;
	private int value=0;
	public enum Card{
		Ace(1),Two(2),Three(3),Four(4),Five(5),Six(6),Seven(7),Eight(8),Nine(9),Ten(10),King(10),Queen(10),Jack(10);
		
		private final int value;
		Card(int value){this.value=value;}
		public int getValue(){return value;}
	}
	public enum Suit{
		Club(0),Spade(1),Diamond(2),Heart(3);
		private final int value;
		Suit(int value){this.value=value;}
		public int getValue(){return value;}
	}
	public void Random(){
		//selection.put(Integer.valueOf(Card.Ace),Integer.valueOf(Suit.Club));
		Random random=new Random();
		
		
		while(value<=52)
		{
			 randomvalue=random.nextInt(52);
			 suit=randomvalue/13;//Taking Random Suit
			 card=randomvalue%13;//Taking Random Cards
		}
	}
   	
}
public class BlackJackGame {
    
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);        //Declaring to take input from user 
		Cards cards=new Cards();
	     
		System.out.println("Welcome to BlackJackGame");
		System.out.println("--------------------------");
		
			System.out.println("Press B for Bet and Q for Quit");
			String input = scan.next();
	        if(input.equalsIgnoreCase("B")){
	        	//Intilaize Method of Betting
	        	System.out.println("Would like to Hit enter H or Stand enter S");
	        	input= scan.next();
	        	while(input.equalsIgnoreCase("H")){
	        		//Run the Method of Giving Card
	        		System.out.println("Would like to Hit enter H or Stand enter S");
	        		input=scan.next();
	        	}
	        	if(input.equalsIgnoreCase("S")){
	        		//Check who win either Dealer or Person
	        	}
	        }
	        else
	        	System.exit(0);
		
		
	}
}
