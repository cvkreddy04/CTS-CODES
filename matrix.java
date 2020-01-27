class Matrix
{
      public static void main(String args[])
      {
           int a[][]={{1,2},{1,2}};
           int a1[][]={{3,1},{1,2}};
           int c[][]=new int[2][2];
System.out.println("A");
           for(int i=0;i<2;i++){
           for(int j=0;j<2;j++){
           System.out.print(a[i][j]+" ");
     }System.out.println();
}
System.out.println("B");
       for(int i=0;i<2;i++){
           for(int j=0;j<2;j++){
           System.out.print(a1[i][j]+" ");
}          System.out.println();
}
System.out.println("result");
for(int i=0;i<2;i++){
for(int j=0;j<2;j++){
c[i][j]=0;
for(int k=0;k<2;k++){
c[i][j]+=a[i][k]*a1[k][j];
}
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}}           