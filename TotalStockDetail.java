public class TotalStockDetail {

	public static void main(String[] args) {

   Integer[] Product = {1,23,45,3,4};
   
   int sum = 0;
   
   for(int i=0;i<Product.length;i++)
   {
	   sum+=Product[i];
   }

   System.out.print(sum);
   
	}

}