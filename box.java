class Box
{
   int boxLength, boxWidth, boxHeight;
   void setBox(int boxLength,int boxWidth,int boxHeight)
   {
      this.boxLength=boxLength;
      this.boxWidth=boxWidth;
      this.boxHeight=boxHeight;
   }
   void getBox()
  {
      System.out.println(""+boxLength+""+boxWidth+""+boxHeight);
  }
   Box()
   {
      boxLength=2;
      boxWidth=3;
      boxHeight=4;
      System.out.println(" "+(boxLength*boxWidth*boxHeight));
     
   }
    Box(int boxLength,int boxWidth,int boxHeight)
   {
      this.boxLength=boxLength;
      this.boxWidth=boxWidth;
      this.boxHeight=boxHeight;
      System.out.println(""+boxLength+""+boxWidth+""+boxHeight);
   }
    int vol()
    {
        return boxLength*boxWidth*boxHeight;
}
    }
class MainBox
{
    public static void main(String args[])
    {
    Box b=new Box(3,4,5);
    b.getBox();  
    int v=b.vol();
    System.out.println(v);
    b.setBox(2,3,4);
    int v1=b.vol();
    System.out.println(""+v1);
    Box b1=new Box();    
   } 
}
   
      
      

