package usa_computing_olympiad;

import java.io.*;
import java.util.*;

public class livestock_lineup {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<String> livestock = new ArrayList<String>(Arrays.asList("Bessie", "Buttercup", "Belinda", "Bella", "Beatrice", "Blue", "Betsy", "Sue"));
		//displaying livestock
		System.out.println("original livestock array " + livestock + "\n");
	    
	    Collections.sort(livestock);
	    System.out.println("sorted livestock array " + livestock + "\n");
	    
	    
		
		BufferedReader r = new BufferedReader(new
				 FileReader("/users/hongli/java/lineup.in"));
		Integer constraint_count = Integer.parseInt(r.readLine());
		
		PrintWriter pw = new PrintWriter(new BufferedWriter(new
				 FileWriter("/users/hongli/java/lineup.out")));
		
		List<String> IndexArray1 = new ArrayList<String>();
		List<String> IndexArray2 = new ArrayList<String>();
		
		for (int i=0; i<constraint_count; i++) {
			String constraint = r.readLine();
			String[] cows_with_restriction = constraint.split(" ");
			//int cow1_index = findIndex(livestock, cows_with_restriction[0]);
			//int cow2_index = findIndex(livestock, cows_with_restriction[5]);
			IndexArray1.add(cows_with_restriction[0]);
			IndexArray2.add(cows_with_restriction[5]);
			System.out.println("Rule: " + constraint + "\n");  	
		}
	

        PermutateStringArray pstr = new PermutateStringArray();


		
		while (livestock != null) {
			System.out.println("Rule one cows need to be sorted: " + IndexArray1.get(0) + " " + IndexArray2.get(0));
			System.out.println("Rule two cows need to be sorted: " + IndexArray1.get(1) + " " + IndexArray2.get(1));
			//System.out.println(IndexArray2.get(0) + " " + IndexArray2.get(1));

			int cow1_rule1 = findIndex(livestock, IndexArray1.get(0));
			int cow2_rule1 = findIndex(livestock, IndexArray2.get(0));
			int cow1_rule2 = findIndex(livestock, IndexArray1.get(1));
			int cow2_rule2 = findIndex(livestock, IndexArray2.get(1));
			int cow1_rule3 = findIndex(livestock, IndexArray1.get(2));
			int cow2_rule3 = findIndex(livestock, IndexArray2.get(2));
			
			System.out.println("Rule one cow indexes: " + cow1_rule1 + " " + livestock.get(cow1_rule1) + " " + cow2_rule1+ " " + livestock.get(cow2_rule1));
			System.out.println("Rule two cow indexes: " + cow1_rule2 + " " + livestock.get(cow1_rule2) + " " + cow2_rule2+ " " + livestock.get(cow2_rule2));			

			if(Math.abs(cow1_rule1 - cow2_rule1) == 1 && Math.abs(cow1_rule2 - cow2_rule2) == 1  && Math.abs(cow1_rule3 - cow2_rule3) == 1 ) {
				System.out.println("Permuations of livestock array " + livestock + "\n");
				pw.println(livestock + "\n");
			} else {
				System.out.println("skip\n");
				//break;
			}
			
	        livestock= pstr.permutations(livestock);
	        
		} 

		
		r.close();
		pw.close();
		
		/*
		
		System.out.println("Test string permuation\n");
		
        String str = "ABC";
        int n = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, n-1);
        
        System.out.println("Test integer array permuation\n");
        PermutateArray pa=new PermutateArray();
        
        int[] arr= {1, 2, 3};
 
        List<List<Integer>> permute = pa.permute(arr);
 
        System.out.println("Permuations of array : [1, 2, 3] are:");
        System.out.println("=========================================");
        for(List<Integer> perm:permute)
        {
            System.out.println(perm);
        }
        
        

        System.out.println("Test String array permuation\n");
        PermutateStringArray pstr = new PermutateStringArray();
        
        livestock= pstr.permutations(livestock);
        System.out.println("Permuations of livestock array " + livestock + "\n");
        System.out.println("=========================================");
       
        livestock= pstr.permutations(livestock);
        System.out.println("Permuations of livestock array " + livestock + "\n");
        System.out.println("========================================="); */
	}
	
	private static int findIndex(ArrayList<String> livestock, String cow) {
		for (int i=0; i < livestock.size(); i++) {
			if (cow.equals(livestock.get(i))) {
				return i;
			}
		}
		return 1;
	}
	
	private static ArrayList<String> permutation(ArrayList<String> s) {
		return null;
	}
	
}
