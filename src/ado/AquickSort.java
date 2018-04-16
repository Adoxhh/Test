package ado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 快速排序 给定一个数组, 
 * 1:选取数组第一个数作为基准点; 
 * 2:比基准点小的放左边,比基准点大的放右边; 
 * 3:重复步骤2,得到排序数组.
 *
 */
public class AquickSort { 
	
    public static void quickSort(int[] a) {  
        if(a.length>0) {  
            quickSort(a, 0 , a.length-1);  
        }  
    }  
    
    private static void quickSort(int[] a, int low, int high) {
    	if (low < high) {
    		int middle = a.length/2;
			a = quickCore(a);
			quickSort(a, 0, middle); 
			quickSort(a, middle+1, high);
		}		
	}
    //获取基准点
    private static int[] quickCore(int[] a) {
		//基准点
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> r = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if(a[i]<=a[0]) {
				l.add(a[i]);
			}
			if(a[i]>a[0]) {
				r.add(a[i]);
			}
		}
		int[] p = new int[a.length];
		for (int i = 0; i < l.size(); i++) {
			p[i]=l.get(i);
		}
		for (int i = 0; i < r.size(); i++) {
			p[l.size()+i]=r.get(i);
		}
		return p;
	}
	/**
	 * 交换
	 */
	private static void change(int i, int j) {
		if(i == j) return;
		int temp = i;
		i=j;
		j=temp;
	}
	public static void main(String[] args) {  
//        int[] a = {4, 2, 4, 5, 7, 4, 5 ,3 ,9 ,0,-3,3,1};  
        int[] a = {2,1,3,2,1,4};  
        System.out.println(Arrays.toString(a));  
        quickSort(a,0,a.length);  
        System.out.println(Arrays.toString(a));  
    }  
}