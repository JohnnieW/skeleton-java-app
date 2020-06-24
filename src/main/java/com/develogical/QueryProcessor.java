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
        
        
        if(query.toLowerCase().contains("what is") && query.toLowerCase().contains("plus")){
        	String[] tokens = query.split(" ");
        	if(tokens.length > 6){
            	int num1 = Integer.parseInt(tokens[3]);
            	int num2 = Integer.parseInt(tokens[5]);
            	int num3 = Integer.parseInt(tokens[7]);
            	int sum = num1 + num2 + num3;
            	return sum + "";
        	}
        	int num1 = Integer.parseInt(tokens[3]);
        	int num2 = Integer.parseInt(tokens[5]);
        	int sum = num1 + num2;
        	return sum + "";
        }
        
        if(query.toLowerCase().contains("what is") && query.toLowerCase().contains("plus") ){
        	String[] tokens = query.split(" ");
        	int num1 = Integer.parseInt(tokens[3]);
        	int num2 = Integer.parseInt(tokens[5]);
        	int sum = num1 + num2;
        	return sum + "";
        }
        
        if(query.toLowerCase().contains("what is") && query.toLowerCase().contains("minus") ){
        	String[] tokens = query.split(" ");
        	int num1 = Integer.parseInt(tokens[3]);
        	int num2 = Integer.parseInt(tokens[5]);
        	int sum = num1 - num2;
        	return sum + "";
        }
        
        if(query.toLowerCase().contains("what is") && query.toLowerCase().contains("multiplied by") ){
        	String[] tokens = query.split(" ");
        	int num1 = Integer.parseInt(tokens[3]);
        	int num2 = Integer.parseInt(tokens[6]);
        	int sum = num1 + num2;
        	return sum + "";
        }
        
        if(query.toLowerCase().contains("what is") && query.toLowerCase().contains("to the power of") ){
        	String[] tokens = query.split(" ");
        	int num1 = Integer.parseInt(tokens[3]);
        	int num2 = Integer.parseInt(tokens[8]);
        	return (int)Math.pow(num1, num2) + "";
        }
        
        
        if(query.toLowerCase().contains("fibonacci") ){
        	String[] tokens = query.split(" ");
        	String temp = tokens[4].trim().replace("th", "").replace("st", "").replace("rd", "");
        	return fib(Integer.parseInt(temp)) + "";
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
        
        if(query.toLowerCase().contains("which of the following numbers are primes:")){
        	String temp = query.split(":")[2];    
        	String[] tokens = temp.split(",");
        	String primeList = "";
        	for(int i = 0; i < tokens.length; i++){
        		if(isPrime(Integer.parseInt(tokens[i].trim()))){
        			if(!primeList.isEmpty()){
        				primeList += ",";
        			}
        			primeList = primeList + tokens[i].trim();
        		}
        	}
        	return primeList;
        } 
        
        return "";
    }
  

    static boolean isPrime(int n) 
    { 
        // Corner case 
        if (n <= 1) 
            return false; 
  
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
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
    
    public static int fib(int n) 
    {
         int a = 0, b = 0, c = 1;
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
        }
        return a;
    }
    
}
