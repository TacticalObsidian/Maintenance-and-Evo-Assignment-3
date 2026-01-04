package MovieStoreSystem;
import java.util.ArrayList;
import java.util.Scanner;
public class MovieStoreSystem_RefactorPhase4 {
	public static void main(String[] args) {
		
		//This code is to add movie titles to the movie store and sort them
		ArrayList<Movie> movieList = new ArrayList<Movie>(); // an array list of movie titles
		String newMovieTitle; //A variable to add a new movie title
		String movieToSearch;
		String memberToSearch;
		boolean isMovieFound = false; //(R3)
		boolean isMemberFound = false; //(R3)
		System.out.println("Create the movies list by entering the movie titles one by one");		
		System.out.println("Enter a movie title to be added to the movie store");
		Scanner input = new Scanner(System.in);		
		newMovieTitle = input.next();		
		while (!(newMovieTitle.equals("end"))) {		
			movieList.add(new Movie(newMovieTitle));
			System.out.print("Enter a movie title to be added to the movie store");
			newMovieTitle = input.next();			
			}
		
		//Sorting section
		System.out.println("The movie titles in the movie store before sorting are: ");
		   for (Movie m : movieList) {
            System.out.println(m.getTitle());
            }
		   
		   //Bubble Sort (R4)
		   sortMovies(movieList);
		 
		 //-------------------------------------------------------
		 System.out.println("The movie titles in the movie store after sorting are: ");
		   for (Movie m : movieList) {
             System.out.println(m.getTitle());
            }	   
		   
		   
		 //This code is to add members to the movie store and sort them
			ArrayList<Member> memberList = new ArrayList<Member>();// an array list of movie store members
			String newMemberName;//A variable to add a new member name
			System.out.println("Create the members list by entering the member names one by one");		
			System.out.println("Enter a member name to be added to the movie store system");	
			newMemberName = input.next();		
			while (!(newMemberName.equals("end"))) {		
				memberList.add(new Member(newMemberName));
				System.out.print("Enter a member name to be added to the movie store");
				newMemberName = input.next();			
				}
			System.out.println("The members in the movie store before sorting are: ");
			   for (Member mem : memberList) {
                 System.out.println(mem.getName());
                }
			   
			   sortMembers(memberList); //(R4)

			 //-------------------------------------------------------
			 System.out.println("The members in the movie store after sorting are: ");
			   for (Member mem : memberList) {
                 System.out.println(mem.getName());
                }	   
			  			   
			 //This code is to search for a specific movie title
		     System.out.println("Enter a movie title to search for:");
			   movieToSearch = input.next();
			   isMovieFound = searchMovieTitle(movieToSearch, movieList);//(R4)
			   
		   if (isMovieFound == true)
		       System.out.println("The movie title is found");
		   else if (isMovieFound == false)
			   System.out.println("The movie title is not found");
		   //--------------------------------------------------------------
		   
		 //This code is to search for a specific member
		     System.out.println("Enter a member name to search for:");
			   memberToSearch = input.next();	
			   isMemberFound = searchMemberName(memberToSearch, memberList); //(R4)
			   
		   if (isMemberFound == true)
		       System.out.println("The member is found");
		   else if (isMemberFound == false)
				   System.out.println("The member is not found");
		   //--------------------------------------------------------------
           input.close();
	}
   	
	public static void sortMovies(ArrayList<Movie> movies){
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i =0; i< movies.size() - 1; i++){
                String current = movies.get(i).getTitle();
                String next = movies.get(i + 1).getTitle();

                if (current.compareToIgnoreCase(next) > 0){
                    Movie temp = movies.get(i);
                    movies.set(i, movies.get(i + 1));
                    movies.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }
	public static void sortMembers(ArrayList<Member> members) {
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < members.size() - 1; i++){
                String current = members.get(i).getName();
                String next = members.get(i + 1).getName();

                if (current.compareToIgnoreCase(next) > 0){
                    Member temp = members.get(i);
                    members.set(i, members.get(i + 1));
                    members.set(i + 1, temp);
                    sorted =false;
                }
            }
        }
    }
    public static boolean searchMovieTitle(String title, ArrayList<Movie> movies){
        for (Movie m : movies){
            if (m.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    public static boolean searchMemberName(String name, ArrayList<Member> members){
        for (Member mem : members){
            if (mem.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
}
