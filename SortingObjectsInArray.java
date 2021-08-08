import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

 class Product implements Comparable<Product>{
	int id;
	String name;
	float price;
	
	Product(int id,String name,float price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public String getName()   {  return name; }
	public int getId()   {  return id; }
	public float getPrice()   {  return price; }

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class NameCompare implements Comparator<Product>
{
    public int compare(Product m1, Product m2)
    {
        return m1.getName().compareTo(m2.getName());
    }
}

public class SortingObjectsInArray {

	public static void main(String[] args) {

		System.out.print("Enter number of products :");
		Scanner scanner = new Scanner(System.in);
		int numb = scanner.nextInt();
		
		Product prod [] = new Product[numb];
		
		

for(int i=0;i<numb;i++)
{
	
	
	System.out.print("Enter id :");
	int id = scanner.nextInt();
	
	System.out.print("Enter name :");
	String name = scanner.next();
	
	System.out.print("Enter price :");
	float price = scanner.nextFloat();
	
	prod[i] = new Product(id, name, price);
	

	
}

System.out.println("After Sorting ");

NameCompare nameCompare = new NameCompare();
Arrays.sort(prod, nameCompare);
for (Product p: prod)
    System.out.println(p.getId() + " " +
                       p.getName() + " " +
                       p.getPrice());
		
		

	}

}