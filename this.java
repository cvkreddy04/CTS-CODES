class A
{
    A()
    {
        System.out.println("A()");
     }
    A(int a)
    {
       this();
       System.out.println(a);
     }
     A(int a,int b)
    {
      this(a);
      System.out.println(b);
    }
    public static void main(String args[]){
    A a1=new A(2,3);
}
}

       