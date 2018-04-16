package ado;

import java.util.Arrays;

/**
 * 快速排序 给定一个数组, 
 * 1:选取数组第一个数作为基准点; 
 * 2:比基准点小的放左边,比基准点大的放右边; 
 * 3:重复步骤2,得到排序数组.
 *
 */
public class quickSort {
	 /**
     * 交换指定数组a的两个变量的值
     */
	private static void swap(int a[], int i, int j) {
		if(i == j) return;
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	/**
	 * 获取基准点
	 */
	private static int getMiddle(int array[], int low, int high) {
		// 当前元素所在位置
		int p_pos = low;
		// 基准点
		int middle = array[p_pos];
		for (int i = low + 1; i <= high; i++) {
			if (array[i] < middle) {
				p_pos++;
				swap(array, p_pos, i);
			}
		}
		swap(array, low, p_pos);
		return p_pos;
	}
	private static int[] getMiddle2(int array[], int low, int high) {
		// 当前元素所在位置
		int p_pos = low;
		// 基准点
		int middle = array[p_pos];
		for (int i = low + 1; i <= high; i++) {
			if (array[i] < middle) {
				p_pos++;
				swap(array, p_pos, i);
			}
		}
		swap(array, low, p_pos);
		return array;
	}
	/**
	 * 快速排序实现 
	 */
	private static void quickSort(int array[], int low, int high) {
		if (low < high) {
			int middle = getMiddle(array, low, high);
			quickSort(array, low, middle - 1); 
			quickSort(array, middle + 1, high);
		}
	}
    public static void quickSort(int[] a) {  
        if(a.length>0) {  
            quickSort(a, 0 , a.length-1);  
        }  
    }  
    
    public static void main(String[] args) {  
        int[] a = {4, 2, 4, 5, 7, 4, 5 ,3 ,9 ,0,-3,3,1};  
        System.out.println(Arrays.toString(a));  
        getMiddle2(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));  
    }  
}