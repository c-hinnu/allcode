package javanew;
import java.util.*;
import java.util.stream.Collectors;
class Pro{  
    int id;  
    String name;  
    float price;  
    public Pro(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class Stream10 {

	public static void main(String[] args) {
		List<Pro> productsList = new ArrayList<Pro>();  
        //Adding Products  
        productsList.add(new Pro(1,"HP Laptop",25000f));  
        productsList.add(new Pro(2,"Dell Laptop",30000f));  
        productsList.add(new Pro(3,"Lenevo Laptop",28000f));  
        productsList.add(new Pro(4,"Sony Laptop",28000f));  
        productsList.add(new Pro(5,"Apple Laptop",90000f)); 
        // This is more compact approach for filtering data  
        Float totalPrice = productsList.stream()  
                    .map(p->p.price)  
                    .reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
        System.out.println(totalPrice);  
        // More precise code   
        float totalPrice2 = productsList.stream()  
                .map(p->p.price) 
              .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
        System.out.println(totalPrice2); 
     // Using Collectors's method to sum the prices.  
        double totalPrice3 = productsList.stream()  
                        .collect(Collectors.summingDouble(product->product.price));  
        System.out.println(totalPrice3);  
        
        
	}

}
