class BankEmployee
{
   int empId;
   String empName;
   int empSalary;
   
    public BankEmployee()
    {
       empId=1;
         empName="0";
         empSalary=1;
    }
    public BankEmployee(int Id, String Name, int salary)
    {
        empId=Id;
         empName=Name;
         empSalary=salary;
   }
 
 //  void setEmployee(int id, String name, int salary)
   //{
     //    empId=id;
       //  empName=name;
         //empSalary=salary;
   //}
   
   void getEmployee()
   {
        System.out.println(""+empId+""+empName+""+empSalary);
   }
    int calculateSalary()
    {
        return salary;
    }
}