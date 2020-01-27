import java.util.*;
class pattern
{
public static void main(String args[])
{
int a=1,i=0,size;
Scanner sc=new Scanner(System.in);
size=sc.nextInt();
for(i=0;i<size;i++){
for(int j=0;j<=i;j++){
System.out.print(a);
a++;
}
System.out.print("\n");
a=1;
}
}
}