import java.util.*;
import java.io.*;
class Problem
{
	public static int answer(int[] a)
	{
		int mx=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(mx<a[i])
				mx=a[i];
			if(min>a[i])
				min=a[i];
		}
		return mx-min;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("C:/Users/biswa/OneDrive/Desktop/javaProject/input.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:/Users/biswa/OneDrive/Desktop/javaProject/output.txt"));
		int i;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		String line;
		String[] st=new String[n];
		bw.write("The goodies selected for distribution are:");
    	bw.newLine();
    	for(i=0;i<n;i++)
    	{
    		line=br.readLine();
    		bw.write(line);
    		bw.newLine();
    		st=line.split(":");
    		String price=st[1];
    		String str=price.trim();
    		arr[i]=Integer.parseInt(str);


    	}
        int ans=answer(arr);
    	bw.write("And the difference between the chosen goodie with highest price and the lowest price is "+ans);
    	bw.close();
	}
}