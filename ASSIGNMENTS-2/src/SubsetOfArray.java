public class SubsetOfArray {

	public static void main(String[] args) {
		int [] ar1 = {2,3,5,9,6,4,2,6,4,1};
		int [] ar2 = {2,5,6,1};
		boolean flag=false;
		for(int i=0;i<ar2.length;i++)
		{
			for(int j=0;j<ar1.length;j++)
			{
				if(ar2[i]==ar1[j])
				{
					flag=true;
					break;
				}
				else
				{
					continue;
				}
			}
		}
		if(flag==true)
		{
			System.out.println("ar2 is subset of ar1");
		}
		else
		{
			System.out.println("ar2 is not subset of ar1");
		}

	}

}