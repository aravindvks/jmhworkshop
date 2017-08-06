package com.ak.performance.pocs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openjdk.jmh.annotations.Benchmark;

public class StreamsPerfTest {

	@Benchmark
	public List getDistinctSortedListJava8(){
		List <Integer> ints = Arrays.asList(1,2,3,4,5,0,7,8,9,9,9,1,3,4,5,6,7,8,8,8,4,33,2,23,4,5,6,7);
		return ints.stream()
			.distinct()  // Internal Filtering
			.sorted() // Lazy (On demand) Internal processing
			.collect(Collectors.toList()); // Collection
			//.forEach(System.out::println); // Terminal Operation
	}
	
	@Benchmark
	public List getDistinctSortedListJava7(){
		List <Integer> ints = Arrays.asList(1,2,3,4,5,0,7,8,9,9,9,1,3,4,5,6,7,8,8,8,4,33,2,23,4,5,6,7);
		List <Integer> distinctInts = new ArrayList <Integer>();
				
		//External filtering with custom code
		for(Integer integer : ints){
			if(!distinctInts.contains(integer)){
				distinctInts.add(integer);
			}
		}
		//External sorting
		distinctInts.sort(Comparator.naturalOrder());
		return distinctInts;
		// External loop process to print
		/*for(Integer integer : distinctInts){
			System.out.println(integer);
		}*/
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
