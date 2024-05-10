public import java.util.Scanner;
public class rough {
	
	public static String[] create_array(int n)
	{
		String str[]=new String[n];
		for(int i=0;i<str.length;i++)
		{

			str[i]="";
			for(int j=0;j<4;j++)
			{
				long num=System.currentTimeMillis()%10;
				
				str[i]=str[i]+num;
			}
			for(int k=0;k<3;k++)
			{
				long num=(System.currentTimeMillis()%26)+97;
				char ch=(char)num;
				str[i]=str[i]+ch;
			}
			for(int m=0;m<3;m++)
			{
				long num=System.currentTimeMillis()%10;
				str[i]=str[i]+num;
			}
			
		}
		return str;
	}
	
	public static int method1(String str[])
	{
		String sub="";
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			sub=str[i].substring(7,10);
			int num=Integer.parseInt(sub);
			if(num<=50)
			{
				count++;
			}
		}
		return count;
	}
	
	public static int method2 (String str[])
	{
		int new_count=0;
		for(int i=0;i<str.length;i++)
		{
			int h=Character.getNumericValue(str[i].charAt(7));
			int t=Character.getNumericValue(str[i].charAt(8));
			int u=Character.getNumericValue(str[i].charAt(9));
			int num=((100*h)+(10*t)+(u));
			if(num<=50)
			{
				new_count++;
			}
		}
		return new_count;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String A100[]=new String[100];
		String A500[]=new String[500];
		String A1000[]=new String[1000];
		A100=create_array(100);
		A500=create_array(500);
		A1000=create_array(1000);
		long start,end;
		long A100_m1,A100_m2,A500_m1,A500_m2,A1000_m1,A1000_m2;
		start=System.currentTimeMillis();
		method1(A100);
		end=System.currentTimeMillis();
		A100_m1=end-start;
		start=System.currentTimeMillis();
		method2(A100);
		end=System.currentTimeMillis();
		A100_m2=end-start;
		start=System.currentTimeMillis();
		method1(A500);
		end=System.currentTimeMillis();
		A500_m1=end-start;
		start=System.currentTimeMillis();
		method2(A500);
		end=System.currentTimeMillis();
		A500_m2=end-start;
		start=System.currentTimeMillis();
		method1(A1000);
		end=System.currentTimeMillis();
		A1000_m1=end-start;
		start=System.currentTimeMillis();
		method2(A1000);
		end=System.currentTimeMillis();
		A1000_m2=end-start;		
		System.out.println("approach\\size\t100\t500\t1000");
		System.out.println();
		System.out.println("method 1\t"+A100_m1+"\t"+A500_m1+"\t"+A1000_m1);
		System.out.println();
		System.out.println("methdod 2\t"+A100_m2+"\t"+A500_m2+"\t"+A1000_m2);
	}
} {
    
}
