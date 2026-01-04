package MovieStoreSystem;
import java.util.ArrayList;
import java.util.Scanner;
public class MovieStoreSystemBeforeRefactoring {
	public static void main(String[] args) {
		
		//This code is to add movie titles to the movie store and sort them
		ArrayList<String> movieTitleList = new ArrayList<String>(); // an array list of movie titles
		String newMovieTitle; //A variable to add a new movie title
		String movieToSearch = null;
		String memberToSearch = null;
		boolean isMovieFound;
		boolean isMemberFound;
		System.out.println("Create the movies list by entering the movie titles one by one");		
		System.out.println("Enter a movie title to be added to the movie store");
		Scanner input = new Scanner(System.in);		
		newMovieTitle = input.next();		
		while (!(newMovieTitle.equals("end"))) {		
			movieTitleList.add(newMovieTitle);
			System.out.print("Enter a movie title to be added to the movie store");
			newMovieTitle = input.next();			
			}
		System.out.println("The movie titles in the movie store before sorting are: ");
		   for(String counter: movieTitleList){
				System.out.println(counter);
			}
		 //bubble sort--------------------------------------------------
		   boolean sortedMovieList = false;
		    String movieSortTemp = null;
		    while(!sortedMovieList) {
		        sortedMovieList = true;
		        for (int i = 0; i < movieTitleList.size() - 1; i++) {		           
		        	if((movieTitleList.get(i)).compareToIgnoreCase(movieTitleList.get(i+1))>0) {
		                movieSortTemp = movieTitleList.get(i);
		                movieTitleList.set(i,movieTitleList.get(i+1));
		                movieTitleList.set(i+1,movieSortTemp);
		                sortedMovieList = false;
		            }
		        }
		    }
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
			 //bubble sort--------------------------------------------------
			   boolean sortedMembersList = false;
			   String memberSortTemp = null;
			    while(!sortedMembersList) {
			        sortedMembersList = true;
			        for (int i = 0; i < movieMembersList.size() - 1; i++) {		           
			        	if((movieMembersList.get(i)).compareToIgnoreCase(movieMembersList.get(i+1))>0) {
			                memberSortTemp = movieMembersList.get(i);
			                movieMembersList.set(i,movieMembersList.get(i+1));
			                movieMembersList.set(i+1,memberSortTemp);
			                sortedMembersList = false;
			            }
			        }
			    }
			 //-------------------------------------------------------
			 System.out.println("The members in the movie store after sorting are: ");
			   for(String counter: movieMembersList){
					System.out.println(counter);
				}		   
			  			   
			 //This code is to search for a specific movie title
		     System.out.println("Enter a movie title to search for:");
			   movieToSearch = input.next();	
			   isMovieFound = false;	
			   
		   //Linear Search----------------------------------------------
		   for (int index = 0; index < movieTitleList.size(); index++) {
		        if (movieTitleList.get(index).equals(movieToSearch)) 
		        	isMovieFound = true;     
		    }
		   //------------------------------------------------------------
		   if (isMovieFound == true)
		       System.out.println("The movie title is found");
		   else if (isMovieFound == false)
				   System.out.println("The movie title is not found");
		   //--------------------------------------------------------------
		   
		 //This code is to search for a specific member
		     System.out.println("Enter a member name to search for:");
			   memberToSearch = input.next();	
			   isMemberFound = false;	
			   
		   //Linear Search----------------------------------------------
		   for (int index = 0; index < movieMembersList.size(); index++) {
		        if (movieMembersList.get(index).equals(memberToSearch)) 
		        	isMemberFound = true;     
		    }
		   //------------------------------------------------------------
		   if (isMemberFound == true)
		       System.out.println("The member is found");
		   else if (isMemberFound == false)
				   System.out.println("The member is not found");
		   //--------------------------------------------------------------
	}
}
