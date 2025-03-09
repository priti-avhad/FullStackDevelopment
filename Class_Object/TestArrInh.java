/*Q2. WAP to create class name as TestArr with method
void acceptArray(int a[],int b[]) : this method can accept array
as parameter
we have three child classes name as Union with method
void findUnionOfArray():this method can find the union of two
array and display
and we have one more child name as Intersection with method
void findInetersection() this method can find the intersection of
array and display it and we have third MergeArray with method
void mergeArray(): this method 
display it.*/


import java.util.Scanner;
class TestArr{
	int a[];
	int b[];
	
	void acceptArray(int a[],int b[]){
		this.a=a;
		this.b=b;
	}
}

class Union extends TestArr{
	void findUnionofArray(){
		int UnionArr[]=new int[a.length+b.length];
		int k=0;
		
		for(int i=0;i<a.length;i++){
			UnionArr[k++]=a[i];
		}
		
		for(int i=0;i<a.length;i++){
			boolean flag=false;
			for(int j=0;j<a.length;j++){
				if(a[i]==b[i]){
					flag=true;
					break;
				}
				
			}
			if(!flag){
				UnionArr[k++]=b[i];
			}
		}
		System.out.println("Union of array is:");
		for(int i=0;i<k;i++){
			System.out.println(UnionArr[i]+"  ");
		}
	}
}
class Inserction extends TestArr{
	void findIntersection(){
		System.out.println("\n Intersection elemnt:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]==b[j]){
					System.out.println(a[i]+"  ");
					break;
				}
			}
		}
	}
}
class MergedArray extends TestArr{
	void MergedArray(){
		int c[]=new int [a.length+b.length];
		int j=0;
		for(int i=0;i<a.length;i++){
			c[j++]=a[i];
		  }
		  
		  for(int i=0;i<b.length;i++){
			c[j++]=b[i];
		  }
		  System.out.println("MergedArray is:");
		  for(int i=0;i<c.length;i++){
			System.out.println(c[i]+" ");
		  }
	
		
	}
}
public class TestArrInh{
	public static void main(String[]args){
		Scanner scn=new Scanner(System.in);
		int a1[]=new int[5];
		System.out.println("Enter the First Array  Element:");
		for(int i=0;i<a1.length;i++){
			a1[i]=scn.nextInt();
		}
	       int a2[]=new int [5];
		System.out.println("Enter the Second Array Element:");
		for(int i=0;i<a2.length;i++){
			a2[i]=scn.nextInt();
		}
		
		Union u=new Union();
		u.acceptArray(a1,a2);
		u.findUnionofArray();
		
		Inserction i =new Inserction();
		i.acceptArray(a1,a2);
		i.findIntersection();
		
		MergedArray ma =new MergedArray();
		ma.acceptArray(a1,a2);
		ma.MergedArray();
	
	}
}