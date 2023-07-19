package javanew;
import java.util.*;
import java.util.stream.Stream;

public class Stream8 {

	public static void main(String[] args) {
		  Stream.iterate(20, n->n+1)  
	        .filter(n->n%5==0)  
	        .limit(10)  
	        .forEach(n->System.out.println(n));  
	    }  
	}  