import java.util.Arrays;

class QuickSort {
	private static int pidx;

	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i;
	}

	public static void quickShort(int arr[], int low, int high) {
		if (low < high) {
			pidx = partition(arr, low, high);
		quickShort(arr, low, pidx - 1);
		quickShort(arr, pidx + 1, high);
		}
	}

	public static void main(String[] args) {
		int[] a = { 6, 3, 9, 5, 2, 8 };
		int n = a.length;
		quickShort(a, 0, n - 1);
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]);
//		}
		System.out.println(Arrays.toString(a));
	}
}