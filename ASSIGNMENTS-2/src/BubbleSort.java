import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {7,5,2,4,6,1,4,8,9,5};
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				if(a[j]>a[j-1])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
