import java.util.Random;
import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args)
	{	
		//Sets intial variables and the intial random Integer array.
		int Num = 1;
		int[] RAge = new int[10]; 
		Random r = new Random();
		String Player1 = "Player";
		Player NewTeam;
		//Player Players = null;
		//Adds a number to each of the player, generates a random number for the age up to 65
		//changes the string back to an integer and resets variables along with increasing certain variables.
		//It also displays the new team with players. 
		for(int i = 0; i < RAge.length; i++)
		{
			String s = Integer.toString(Num);
			RAge[i] = r.nextInt(65);
			NewTeam = new Player (Player1 + s, RAge[i]);
			Num = Integer.parseInt(s);
			s = "";
			Num++;
			NewTeam.display();
			
		} 
		//Errors in length, syntax, and getting the get age part of an object.
		for(int i = 0; i < NewTeam.length; i++)
		{
			//Calls the merge sort class.
			mergeSort(NewTeam, NewTeam.charAt(i).getage(), NewTeam.charAt(i).getage().length-1);
			//Binary search method.
			Scanner myObj = new Scanner(System.in);
			System.out.println("Type in the age you want to search.");
			String input = myObj.nextLine();
			//Error in getting the getage bucket. 
			if(NewTeam.charAt(i).getage() = input);
			{
				System.out.println("The player you were searching for is: " + NewTeam.charAt(i));
			}
			else
			{
				System.out.println("No players were found with that age");
			}
		}
		
	} //end main method
		static void mergeSort(int[] ar, int begin, int end)
		{
			if(begin != end)
			{
				int begin1 = begin;
				int end1 = begin + ((end - begin)/2);
				int begin2 = end1 + 1;
				int end2 = end;
				mergeSort(ar, begin1, end1);
				mergeSort(ar, begin2, end2);
				merge(ar, begin1, end1, begin2, end2);
			}
		} 
		
		static void merge(int[] ar, int begin1, int end1, int begin2, int end2)
		{
			int[] temp = new int[end2 - begin1 + 1];
			int pos1 = begin1;
			int pos2 = begin2;
			for(int i = 0; i < temp.length; i++)
			{
				if(pos1 <= end1 && pos2 <= end2)
				{
					if(ar[pos1] < ar[pos2])
					{
						temp[i] = ar[pos1];
						pos1++;
					}
					else
					{
						temp[i] = ar[pos2];
						pos2++;
					}
				}
				else
				{
					//either pos1 or pos2 is off the end of their list and the other guy is the 
					//default winner
					if(pos1 > end1)
					{
						temp[i] = ar[pos2];
						pos2++;
					}
					else
					{
						temp[i] = ar[pos1];
						pos1++;
					}
				}
			} //end of for loop
		}
} 

