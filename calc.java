import java.util.*;
class calculator
{
       int a,b;
       char ch;
       void calc(int a, int b,char ch)
{
       this.a=a;
       this.b=b;
       this.ch=ch;
       switch( ch){
       case '+' : System.out.println(a+b);
                  break;
       case '-' : System.out.println(a-b);
                  break;
       case '*' : System.out.println(a*b);
                  break;
       case '/' : System.out.println(a/b);
                  break;
}
}
public static void main(String args[]){
calculator c=new calculator();
c.calc(3,5,'*');
}
}