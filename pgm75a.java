		String str;
		int l,n,i;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		l=str.length();
		char a[]=str.toCharArray();
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)%2==0)
			{
				n=str.length()/2;
				a[n-1]='*';
				a[n]='*';
				for(i=0;i<str.length();i++)
				System.out.println(a[i]);
			}
			else
			{
				n=str.length()/2;
				a[n]='*';
				for(i=0;i<str.length();i++)
				System.out.println(a[i]);
			}
		}
	}
}
