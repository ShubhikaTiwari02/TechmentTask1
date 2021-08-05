class MatrixMultiplication{  

public static void main(String args[]){  
//creating two matrices    
int a[][]={{10,5,4},{12,4,5},{10,10,5}};    
int b[][]={{1,5,4},{2,3,5},{2,1,5}};    
    
//creating another matrix to store the sum of two matrices    
int c[][]=new int[3][3];  //3 rows and 3 columns  
    
//adding and printing addition of 2 matrices    
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
System.out.print(c[i][j]+" ");    
}    
System.out.println();//new line    
}    
}} 