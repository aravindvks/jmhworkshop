package com.ak.performance.pocs;

import org.openjdk.jmh.annotations.Benchmark;

public class StringPerformanceTest {
	
	//@Benchmark
	public StringBuilder StringBuilderReturnDirectly(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Java");
		stringBuilder.append("Javac");
		stringBuilder.append("Javad");
		stringBuilder.append("Javae");
		stringBuilder.append("Javaf");
		stringBuilder.append("Javag");
		stringBuilder.append("Javah");
		stringBuilder.append("Javai");
		stringBuilder.append("Javaj");
		stringBuilder.append("Javafk");
		return stringBuilder;
	}
	
	//@Benchmark
	public String StringBuilderReturnAsToString(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Java");
		stringBuilder.append("Javac");
		stringBuilder.append("Javad");
		stringBuilder.append("Javae");
		stringBuilder.append("Javaf");
		stringBuilder.append("Javag");
		stringBuilder.append("Javah");
		stringBuilder.append("Javai");
		stringBuilder.append("Javaj");
		stringBuilder.append("Javafk");
		return stringBuilder.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
