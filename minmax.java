class Minmax{
 public static void main(String args[])
{
int min,max,temp;

   int arr[]={2,9,1,3,4};
   for(int i:arr)
{
  System.out.println(i);
}
 min=arr[0];
max=arr[0];
for(int i=0;i<arr.length;i++)
  {
if(min>arr[i])
{
       min=arr[i];
}}
       System.out.println("min:"+min);
for(int i=0;i<arr.length;i++)
  {


if(max<arr[i])
{
       max=arr[i];
}}
       System.out.println("max:"+max);
for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){
if(arr[i]>arr[j]){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}System.out.println(arr[i]);
}
for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){
if(arr[i]<arr[j]){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}System.out.println(arr[i]);
}
}
}

