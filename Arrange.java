import java.util.Scanner;
//
public class Arrange {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}	
	long a,b=10,d,f=0,c=0;
	int count=0;	
	for(int i=arr.length-1;i>=0;i--){
		a=arr[i];
		while(a!=0) {
			count++;
			a=a/10;
		}
	}
	for(int i=1;i<count;i++) {
		b=b*10;
	}	
	for(int i=arr.length-1;i>=0;i--){
		d=arr[i];
		while(d!=0) {
			count--;
			d=d/10;
			b=b/10;
		}
		c=arr[i]*b;
		f+=c;		
	}	
	System.out.println(f);	
}
}
