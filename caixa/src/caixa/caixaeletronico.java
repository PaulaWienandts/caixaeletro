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
int saca= 784 ;
temp=saca;
 if (saca>100) {
	 n100 = (saca / 100);
	temp=(saca%100);
}
	 if (temp>50){
		n50 =(temp/50);
	 temp=temp%50;
	 }
	 if (temp>20){
		n20=(temp/20);
	temp=temp%20;
	 }
	 if (temp>10){
		n10=(temp/10);
		temp=temp%10;
	 }
	 if (temp>2){
			n2=(temp/2);
		temp=temp%2;
		
	 }
	 System.out.println("Quantidade de notas de 100: " +n100);
	 System.out.println("Quantidade de notas de 50: "+n50);
	 System.out.println("Quantidade de notas de 20: "+n20);
	 System.out.println("Quantidade de notas de 10: "+n10);
	 System.out.println("Quantidade de notas de 2: "+n2);
	 System.out.println("Total de notas:"+n100+n50+n20+n10+n2);
}}
