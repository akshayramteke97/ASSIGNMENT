import java.util.Arrays;

public class SelectionSort {
	public static void main(String args[]) 
	{
	    int[] data = { 20, 12, 10, 15, 2 };
	    SelectionSort ss = new SelectionSort();
	    ss.selectionSort(data);
	    System.out.println("Sorted Array in Ascending Order: ");
	    System.out.println(Arrays.toString(data));
	}
		void selectionSort(int[] data)
		{
		    for (int step = 0; step <data.length - 1; step++) 
		    {
		      int min_idx = step;

		      for (int i = step + 1; i < data.length; i++)
		      {
		        if (data[i] < data[min_idx]) 
		        {
		          min_idx =i;
		        }
		      }
		      int temp = data[step];
		      data[step] = data[min_idx];
		      data[min_idx] = temp;
		    }
		  }
}