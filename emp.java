import java.util.*;
class student
{
int id;
String name,branch;
long fee;
void studid(int id ,String name, String branch,long fee)
{
this.id=id;
this.name=name;
this.branch=branch;
this.fee=fee;
}
void display()
{
System.out.println(id+""+name+""+branch+""+fee);
}
public static void main(String args[]){
student st= new student();
st.studid(222,"reddy","aws",21900);
st.display();
}
}
