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
        
        if(query.toLowerCase().contains("what is") && query.toLowerCase().contains("multiplied by") ){
        	String[] tokens = query.split(" ");
        	int num1 = Integer.parseInt(tokens[3]);
        	int num2 = Integer.parseInt(tokens[6]);
        	int sum = num1 + num2;
        	return sum + "";
        }
        
        if(query.toLowerCase().contains("which of the following numbers is the largest:")){
        	String temp = query.split(":")[2];    
        	String[] tokens = temp.split(",");
        	int max = 0;
        	for(int i = 0; i < tokens.length; i++){
        		max = Math.max(max, Integer.parseInt(tokens[i].trim()));
        	}
        	return max + "";
        }
        
        return "";
    }
}
