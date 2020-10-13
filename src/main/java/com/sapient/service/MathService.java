package com.sapient.service;

public class MathService {

	 public int FibonacciRecursive(int n){
		 
		 if (n <= 1) 
	            return n; 
	        return FibonacciRecursive(n - 1) + FibonacciRecursive(n - 2); 
	 }
	 
	 public int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }
	 
	 public boolean isPrime(int n) 
	    {  
	        if (n <= 1) 
	            return false; 
	  
	        for (int i = 2; i < n; i++) 
	            if (n % i == 0) 
	                return false; 
	  
	        return true; 
	    }
	 
	 public String getPrimes(int start, int end) {
		 String str = "";
		 for (int i = start; i <= end; i++) 
		   { 
			 
	           if (isPrime(i)) 
			   {  
	               str+= i + " "; 
	           }  
	       }
		 return str;
	 }
	
}
