# compress-string
A java program to compress a string 
import java.util.*;
import java.io.*;
class Compress
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str;
str=sc.next();
char arr[]=str.toCharArray();
int n,count,i,j;
n=str.length();
for(i=0;i<n;i++)
{  
   count=0;
   char a=arr[i];
    j=i;
    while(j<n-1)
    { 
       if(a==arr[j+1] && arr[j+1]!='0')
       {
          count++;
          arr[j+1]='0';
       }
       j++;
    }
    if(a!='0')
    {
    System.out.print(a);
    System.out.print(count+1);
    }

}
}
}
