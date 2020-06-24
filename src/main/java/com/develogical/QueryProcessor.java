package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "William Shakespeare";
        }
        if (query.toLowerCase().contains("what is your name")) {
            return "JohnWalker";
        }
        
        if(query.toLowerCase().contains("what is") && query.toLowerCase().contains("plus") ){
        	String[] tokens = query.split(" ");
        	int num1 = Integer.parseInt(tokens[3]);
        	int num2 = Integer.parseInt(tokens[5]);
        	int sum = num1 + num2;
        	return sum + "";
        }
        
        if(query.toLowerCase().startsWith("which of the following numbers is the largest:")){
        	String temp = query.toLowerCase().replace("which of the following numbers is the largest:", "");
        	String[] tokens = temp.split(",");
        	int max = Math.max(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
        	return max + "";
        }
        
        return "";
    }
}
