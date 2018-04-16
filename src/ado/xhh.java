package ado;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class xhh {
	public static void main(String[] args) {
		int[] a = {2,1,3,2,1,4};  
		quickCore(a);
		 System.out.println(Arrays.toString(quickCore(a)));  
	}
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
			System.out.println(l.get(i));
			p[i]=l.get(i);
		}
		for (int i = 0; i < r.size(); i++) {
			System.out.println(r.get(i));
			p[l.size()+i]=r.get(i);
		}
		return p;
	}
}
