package com.in28minutes.java.string;

import java.util.*;

class PairSum1 {
	static void printpairs(int[] arr, int sum) {
		HashSet<Integer> s = new HashSet<Integer>();
//		int[] A = {1, 4, 45, 6, 10, 8};
//		int n = 16;
		for (int i = 0; i < arr.length; ++i) {
			int temp = sum - arr[i];

			// checking for condition
			if (s.contains(temp)) {
				System.out.println(
						"Pair with given sum "
								+ sum + " is (" + arr[i]
								+ ", " + temp + ")");
			}
			s.add(arr[i]);
		}

		List l = Arrays.asList(arr);


	}

	// Driver Code
	public static void main(String[] args) {
		int[] A = {1, 4, 45, 6, 10, 8};
		int n = 16;
		printpairs(A, n);
		PairSum1 pairSum1 = new PairSum1();

		List intlist = new ArrayList<Integer>(List.of(19,1,11,5,25,11));
		//List<Integer> toBeSorted = new ArrayList<>(List.of(3,2,4,1,-2));
		intlist = Arrays.asList(A);
	//	pairSum1.pair(intlist,30);

	}


	public void pair(List intlist, Integer targetValue) {

//		intlist.add(3);
//		intlist.add(1);
//		intlist.add(11);
//		intlist.add(3);
//		intlist.add(5);
//		intlist.add(25);
//		intlist.add(11);
		System.out.println("intlist" + intlist);

		Set finalSet = new HashSet();
		for (int i = 0; i < intlist.size(); i++) {

			Integer temp = targetValue - (int)intlist.get(i);
			if (finalSet.contains(temp)) {
				System.out.println("paire:=" + "(" +  intlist.get(i) + ":" + temp + ")");

				//for(int j=0;j<finalSet.size();j++){


				Iterator setIter = finalSet.iterator();
			 while(setIter.hasNext()){
					 if(setIter.next().toString().equalsIgnoreCase(temp.toString()))
				 System.out.println("paireindex:" + i+":"+ setIter.next().toString());
				}

			}
			finalSet.add(intlist.get(i));
		}
//		Iterator setIter = finalSet.iterator();
//				 while(setIter.hasNext()){
//					 if(setIter.next().equals(19))
//				 System.out.println("paireindex:" + setIter.next());}
	}
}