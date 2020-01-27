import java.util.*;
class Fact
{
 static int fact(int n)
{
if(n==0 || n==1)
 return 1;
else
  return n*fact(n-1);
}
 public static void main(String args[])
{
int n=5,b=1;
int a=fact(n);
System.out.println("fact recursive value"+a);
for(int i=1;i<=6;i++)
{
b=b*i;
}
System.out.println("fact iterative value"+b);
}
}