package org.howard.edu.lsp.midterm.problem1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.howard.edu.lsp.midterm.problem1.VotingMachine;

public class VotingMachineTest {
	@Test
	@DisplayName("Test cases for getVotes")
	public void testgetVotes() throws VotingMachineException{
		VotingMachine vote = new VotingMachine();
		vote.addCandidate("Pradeep");
		vote.addCandidate("Ram");
		vote.addCandidate("Aakash");
		vote.addCandidate("Bikram");
		vote.addCandidate("Chandragiri");
		vote.addCandidate("Lali");
		vote.addCandidate("Chadda");
		
		vote.castVotes("Pradeep", 10);
		vote.castVotes("Ram", 6);
		vote.castVotes("Aakash", 50);
		vote.castVotes("Bikram", 80);
		vote.castVotes("Chandragiri", 1);
		vote.castVotes("Lali", 90);
		vote.castVotes("Chadda", 60);
		
		
		assertNotEquals("error found in getVotes()", 6, vote.getVotes("Pradeep"));
		assertNotEquals("error found in getVotes()", 8, vote.getVotes("Lali"));
		assertEquals("error found in getVotes()", 50, vote.getVotes("Aakash"));
		assertEquals("error found in getVotes()", 60, vote.getVotes("Chadda"));
		
		
		
	}
	
	
	
	@Test
	@DisplayName("testgetVotes throws exception")
	public void testgetVotes_THROWS_EXCEPTION() {
		VotingMachine vote = new VotingMachine();
		Exception exception = assertThrows(VotingMachineException.class, ()->{
			vote.getVotes("Hiralal");
		});
		String expectedMessage = "Not a candidate!";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	@DisplayName("Test cases for sum")
	public void testsum() {
		VotingMachine vote = new VotingMachine(); 

		vote.addCandidate("Pradeep");
		vote.addCandidate("Ram");
		vote.addCandidate("Aakash");
		vote.addCandidate("Bikram");
		vote.addCandidate("Chandragiri");
		vote.addCandidate("Lali");
		vote.addCandidate("Chadda");
		
		vote.castVotes("Pradeep", 10);
		vote.castVotes("Ram", 6);
		vote.castVotes("Aakash", 50);
		vote.castVotes("Bikram", 80);
		vote.castVotes("Chandragiri", 1);
		vote.castVotes("Lali", 90);
		vote.castVotes("Chadda", 60);
		
		assertNotEquals("error found in sum()", 2, vote.sum());
		assertEquals("error found in sum()", 297, vote.sum());
		
		
		
	
	}

		
		
		
		
	
	
	}