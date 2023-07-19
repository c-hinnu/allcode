package javanew;
import java.util.*;
class Produc{  
    int id;  
    String name;  
    float price;  
    public Produc(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class Stream9 {

	public static void main(String[] args) {
		 List<Produc> productsList = new ArrayList<Produc>();  
	        //Adding Products  
	        productsList.add(new Produc(1,"HP Laptop",25000f));  
	        productsList.add(new Produc(2,"Dell Laptop",30000f));  
	        productsList.add(new Produc(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Produc(4,"Sony Laptop",28000f));  
	        productsList.add(new Produc(5,"Apple Laptop",90000f));
	        productsList.stream()
	         .filter(p -> p.price == 30000)  
             .forEach(p -> System.out.println(p.name));    
}  

	}


