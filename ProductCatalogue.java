


import java.util.Scanner;
import java.util.Vector;

public class ProductCatalogue {

	
	private int id;
	private String name;
	private float price;
	
	
	 ProductCatalogue(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	
	public static void main(String[] args) {


System.out.print("Enter number of products :");
Scanner scanner = new Scanner(System.in);

int numb = scanner.nextInt();

ProductCatalogue product[] = new ProductCatalogue[numb];

for(int i=0;i<numb;i++)
{
	
	
	System.out.print("Enter id :");
	int id = scanner.nextInt();
	
	System.out.print("Enter name :");
	String name = scanner.next();
	
	System.out.print("Enter price :");
	float price = scanner.nextFloat();
	
	product[i] = new ProductCatalogue(id, name, price);
	

	
}

System.out.print("Enter the id of product for searching :");
int SearchId = scanner.nextInt();

int c = 0;
for(int i=0;i<numb;i++)
{
  if(SearchId==product[i].id)
   {System.out.println("Name :"+product[i].name);
   System.out.println("Price :"+product[i].price);
   c=1;
   break;
   }
}

if(c==0)
{
	 System.out.println("Sorry Item is not Present");
}


	}

}


