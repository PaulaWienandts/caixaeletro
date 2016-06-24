package caixa;
public class caixaeletronico {
public static void main (String[]args){
int saque;
int temp;
int n100=0;
int n50=0;
int n20=0;
int n10=0;
int n2=0;


double saca= 784 ;{
 if (saca>100) 
	 n100 = (int) (saca / 100);
	temp=(int) (saca%100);
}
	 if (saca>50){
		n50 =(int) (saca/50);
	 temp=temp%50;
	 }
	 if (saca>20){
		n20=(int) (saca-20);
	temp=temp%20;
	 }
	 if (saca>10){
		n10=(int) (saca-10);
		temp=temp%10;
	 }
	 if (saca>2){
			n2=(int) (saca-2);
		temp=temp%2;
		
	 }
System.out.println(n100);
System.out.println(n50);
System.out.println(n20);
System.out.println(n10);
System.out.println(n2);
}}
