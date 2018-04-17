package ado;
/**
 * 快速排序 给定一个数组, 
 * 1:选取数组第一个数作为基准点; 
 * 2:比基准点小的放左边,比基准点大的放右边; 
 * 3:重复步骤2,得到排序数组.
 */
public class AquickSort {
	// 暴露只一个参数的公共接口
	public static void quickSort(int a[]) {
		sort(a, 0, a.length - 1);
	}

	// 快排算法的真正实现
	private static void sort(int[] a, int low, int high) {
		if (low >= high) {
			return;
		}
		int i = low, j = high; // 设置这两个变量的目的是为了保持low和high不变
		int pivotNum = a[i]; // 基准数
		while (i < j) {
			while (a[j] >= pivotNum && j > i) { // 循环结束的条件有二：一是找到比支点小的数，二是j==i
				j--;
			}
			if (j > i) { // 由于上面循环结束的功能性有两个，对于找到比支点小的数，即j!=i，要进行位置的交换，下同
				a[i] = a[j];
				i++;
			}
			while (a[i] < pivotNum && i < j) {
				i++;
			}
			if (i < j) {
				a[j] = a[i];
				j--;
			}
		}
		a[i] = pivotNum;
		sort(a, low, i - 1);
		sort(a, i + 1, high);
	}

	public static void main(String[] args) {
		int[] a = { 52, 39, 67, 95, 70, 8, 25, 52, 0, -1, 1, 1, -3 };
		quickSort(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}