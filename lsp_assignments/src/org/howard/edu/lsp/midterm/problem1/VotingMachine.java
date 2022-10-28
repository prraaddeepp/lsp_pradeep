package org.howard.edu.lsp.midterm.problem1;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class VotingMachine {
  // YOU must decide upon an appropriate data representation to associate a name
  // with respective votes. Create whatever you like.
  static Scanner sc = new Scanner(System.in);
  static LinkedHashMap<String, Integer> votes_dict = new LinkedHashMap<>();

  public static void main(String[] args) throws VotingMachineException {
  //This will take information about candidate as well as contains the vote casting workflow
    while (true) {
    	
      System.out.println("1. Add Name of the Candidate");
      System.out.println("2. Cast Vote to the Candidate");
      System.out.println("3. See Votes of the Candidates");
      System.out.println("4. Result of the Vote");
      int choices = sc.nextInt();
      //adding the name of the candidate.
      if (choices == 1) {
    	sc.nextLine();
        System.out.println("Enter the candidate's name");
        String candidate_name = sc.nextLine();
        addCandidate(candidate_name);
      	} 
      //casting vote to the candidate.
      else if (choices == 2) {
    	  	sc.nextLine();
	        System.out.println("List of candidates present to vote: ");
	        votes_dict.forEach((k,v) -> {
	            System.out.println(k);
	        });
	        System.out.println("Enter candidates name to cast vote: ");
	        String candidate_name = sc.nextLine();
	        if (votes_dict.containsKey(candidate_name)) {
	          int votes = votes_dict.get(candidate_name) + 1;
	          castVotes(candidate_name, votes);
	        }
	        else {
		          System.out.println("The candidate is invalid. Enter another valid name of the candidate: ");
		        }
	        } 
      
      	//see votes of the candidates.
        else if (choices == 3) {
        	sc.nextLine();
	        System.out.println("Enter candidate's name to see vote of: ");
	        String candidate_name = sc.nextLine();
	        getVotes(candidate_name);
	      }
      	//to see total votes.
        else if (choices == 4) {
	        sum();
          }
        else {
        	break;
        }
    }
  }

  static int getVotes(String candidate_name) throws VotingMachineException {
    // TODO Auto-generated method stub
    if (votes_dict.containsKey(candidate_name)) {
      int votes = votes_dict.get(candidate_name);
      System.out.println(candidate_name + votes);
      return votes;
    } else {
      throw new VotingMachineException();
      
    }

  }

  public static void addCandidate(String candidate_name) {
    // Add a candidate to the list, initialize number of votes to 0
    votes_dict.put(candidate_name, 0);
  }

  public static void castVotes(String candidate_name, int votes) {
    // Cast votes to the candidate with the given name
    votes_dict.put(candidate_name, votes);
  }



  public static int sum(){
		// Return the total number of votes for all candidates.	
		int total = 0;
		Set<String> votes = votes_dict.keySet();
		for (String vote : votes) {
			total += votes_dict.get(vote);
		
		}
		return total;
	
  }
}

