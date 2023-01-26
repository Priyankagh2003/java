import java.util.*;
class FatherException extends Exception
{
public String toString(){

return (&quot; age shd be greater than zero&quot;);
}

}
class SonException extends Exception
{
public String toString(){

return (&quot; son age is greater than father age&quot;);
}
}

class Father {
int age;
Father(){};
Father(int age){
this.age=age;}

void wrongAge() throws FatherException {
if(age&lt;=0){

throw new FatherException();}

}

}

class Son extends Father{
int sage;
Son(){};
Son(int son_age,int father_age){
super(father_age);
sage=son_age;}

void sonwrongage() throws SonException{
if(sage&gt;=age){
throw new SonException();}

}

}

class Lab7{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println(&quot;enter father age&quot;);
int fage=sc.nextInt();
Father f=new Father(fage);
try{
f.wrongAge();

}catch(Exception e)
{
System.out.println(&quot;exception &quot;+e);

}
System.out.println(&quot;enter father age and son age&quot;);
int fa=sc.nextInt();
int sa=sc.nextInt();
Son s=new Son(sa,fa);
try{
s.sonwrongage();

}catch(Exception e){
System.out.println(&quot;exception &quot;+e);

}
}
}
