class StaticBlock
{
      static int a;
      static
      {
        a=10;
        System.out.println("Static Block is called"+a);
      }
      static void setA(int a)
      {
         a=5;
         System.out.println("Static Method is called"+a);
      }
      public static void main(String ar[])
{
       System.out.println("main method is calling");
    setA(10);
}     
}