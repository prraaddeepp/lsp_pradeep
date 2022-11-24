package org.howard.edu.lsp.assignment7;

import java.util.Collections;
import java.util.List;


	
interface AverageStrategy {
	 public int compute(List<Integer> grades) throws EmptyListException;
	}
	
class Strategy1 implements AverageStrategy {
	
    @Override
    public int compute(List<Integer> grades) throws EmptyListException {
            if(grades == null || grades.size() < 1) {
                    throw new EmptyListException();
            }

            int j = 0;
            int total = 0;
            Collections.sort(grades);
            for(int i=0; i<grades.size(); i++) {
                    total += grades.get(i);
                    j++;
            }
            
            return total/j;
    }
    
}
class Strategy2 implements AverageStrategy {

    @Override
    public int compute(List<Integer> grades) throws EmptyListException {
            if(grades == null || grades.size() <= 2) {
                    throw new EmptyListException();
            }
            
            int j = 0;
            int total = 0;
            Collections.sort(grades);
            for(int i=2; i<grades.size(); i++) {
                    total += grades.get(i);
                    j++;
            }
            
            return total/j;
    }
    
}
