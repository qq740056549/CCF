package csp;
import java.util.*;
public class Main {
		public static void main(String []args){
			int n,i,j;
			int save[];
			save=new int [1000];
			int a[];
			a=new int[1000];
			Scanner cin=new Scanner(System.in);
			n=cin.nextInt();
			for(i=0;i<n;i++){
				a[i]=cin.nextInt();
			}
			int flag=0;
			for(i=0;i<n;i++){
				int max=0,min=0;
				for(j=0;j<n;j++){
					if(j==i)
						continue;
					if(a[j]>a[i]){
						max++;
					}
					if(a[j]<a[i]){
						min++;
					}
				}
				if(max==min){
					int b=0;
					for(int k=0;k<flag;k++){
						if(a[i]==save[k]){
							b=1;
						}
					}
					if(b==0){
						System.out.print(a[i]+" ");
						save[flag]=a[i];
						flag++;
					}
					
				}
			}
			if(flag==0)
				System.out.print(-1);
		}
}
