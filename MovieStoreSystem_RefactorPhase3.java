package MovieStoreSystem;
import java.util.ArrayList;
import java.util.Scanner;
public class MovieStoreSystem_RefactorPhase3 {
	public static void main(String[] args) {
		
		//This code is to add movie titles to the movie store and sort them
		ArrayList<String> movieTitleList = new ArrayList<String>(); // an array list of movie titles
		String newMovieTitle; //A variable to add a new movie title
		String movieToSearch = null;
		String memberToSearch = null;
		boolean isMovieFound = false; //(R3)
		boolean isMemberFound = false; //(R3)
		System.out.println("Create the movies list by entering the movie titles one by one");		
		System.out.println("Enter a movie title to be added to the movie store");
		Scanner input = new Scanner(System.in);		
		newMovieTitle = input.next();		
		while (!(newMovieTitle.equals("end"))) {		
			movieTitleList.add(newMovieTitle);
			System.out.print("Enter a movie title to be added to the movie store");
			newMovieTitle = input.next();			
			}
		
		//Sorting section
		System.out.println("The movie titles in the movie store before sorting are: ");
		   for(String counter: movieTitleList){
				System.out.println(counter);
			}
		   
		   //Bubble Sort (R3)
		   movieTitleList = bubbleSort(movieTitleList);
		 
		 //-------------------------------------------------------
		 System.out.println("The movie titles in the movie store after sorting are: ");
		   for(String counter: movieTitleList){
				System.out.println(counter);
			}  	   
		   
		   
		 //This code is to add members to the movie store and sort them
			ArrayList<String> movieMembersList = new ArrayList<String>();// an array list of movie store members
			String newMemberName;//A variable to add a new member name
			System.out.println("Create the members list by entering the member names one by one");		
			System.out.println("Enter a member name to be added to the movie store system");
			input = new Scanner(System.in);		
			newMemberName = input.next();		
			while (!(newMemberName.equals("end"))) {		
				movieMembersList.add(newMemberName);
				System.out.print("Enter a member name to be added to the movie store");
				newMemberName = input.next();			
				}
			System.out.println("The members in the movie store before sorting are: ");
			   for(String counter: movieMembersList){
					System.out.println(counter);
				}
			   
			   movieMembersList = bubbleSort(movieMembersList); //(R3)

			 //-------------------------------------------------------
			 System.out.println("The members in the movie store after sorting are: ");
			   for(String counter: movieMembersList){
					System.out.println(counter);
				}		   
			  			   
			 //This code is to search for a specific movie title
		     System.out.println("Enter a movie title to search for:");
			   movieToSearch = input.next();
			   isMovieFound = linearSearch(movieToSearch, movieTitleList); //(R3)
			   
		   if (isMovieFound == true)
		       System.out.println("The movie title is found");
		   else if (isMovieFound == false)
			   System.out.println("The movie title is not found");
		   //--------------------------------------------------------------
		   
		 //This code is to search for a specific member
		     System.out.println("Enter a member name to search for:");
			   memberToSearch = input.next();	
			   isMemberFound = linearSearch(memberToSearch, movieMembersList); //(R3)
			   
		   if (isMemberFound == true)
		       System.out.println("The member is found");
		   else if (isMemberFound == false)
				   System.out.println("The member is not found");
		   //--------------------------------------------------------------
	}
   	
	//Generalized bubble sort--------------------------------------------------
	public static ArrayList<String> bubbleSort(ArrayList<String> sortList) {
			boolean sortedList = false;
		    String bubbleSortTemp = null;
		    while(!sortedList) {
		    	sortedList = true;
		        for (int index = 0; index < sortList.size() - 1; index++) {		           
		        	if((sortList.get(index)).compareToIgnoreCase(sortList.get(index+1))>0) {
		        		bubbleSortTemp = sortList.get(index);
		        		sortList.set(index,sortList.get(index+1));
		        		sortList.set(index+1,bubbleSortTemp);
		        		sortedList = false;
		            }
		        }
		    }
		    return sortList;
	}
	
	//Generalized Linear Search Algorithm
	public static boolean linearSearch(String searchQuery, ArrayList<String> searchList) {
		for (int index = 0; index < searchList.size(); index++) {
			if (searchList.get(index).equals(searchQuery)) {
				return true; //Break algorithm early and return true
			}
		}
		return false; //Algorithm breaks naturally, returns false
	}
}
