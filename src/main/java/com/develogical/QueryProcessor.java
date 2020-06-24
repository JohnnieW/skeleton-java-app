package com.develogical;

public class QueryProcessor {

    public String process(String query) {
    	
    	if(query.toLowerCase().contains("which city is the Eiffel tower in")) {
    		return "Paris";
    	}
    	
    	 if(query.toLowerCase().contains("which year was Theresa May first elected")){
    	        return "2017";
    	 }
    	
        if(query.toLowerCase().contains("who played james bond in the film dr no")){
        return "Sean Connery";
        }
    	
        if(query.toLowerCase().contains("what colour is a banana")){
        return "yellow";
        }
    	
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
        
        if(query.toLowerCase().contains("which of the following numbers is both a square and a cube:")){
        	String temp = query.split(":")[2];    
        	String[] tokens = temp.split(",");
        	for(int i = 0; i < tokens.length; i++){
        		if(checkPerfectSquare(Integer.parseInt(tokens[i].trim())) && isCube(Integer.parseInt(tokens[i].trim()))){
        			return tokens[i].trim();
        		}
        	}
        } 
        
        return "";
    }
    
    static boolean isCube(int x){
    	int a = (int) Math.round(Math.pow(x, 1.0/3.0));
    	return (x == a * a * a); 
    }
    
    static boolean checkPerfectSquare(int x)  
    { 

	double sq = Math.sqrt(x); 
	return ((sq - Math.floor(sq)) == 0); 
    } 
}
