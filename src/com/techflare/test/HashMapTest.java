package com.techflare.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lvwenkai
 * @date 2020-06-09
 */
public class HashMapTest
{
	static final int tableSizeFor(int cap) {
		printBinary(cap);
		int n = cap - 1;
		printBinary(n);
		printBinary(n>>>1);
		n |= n >>> 1;
		printBinary(n);
		printBinary(n>>>2);
		n |= n >>> 2;
		printBinary(n);
		printBinary(n>>>4);
		n |= n >>> 4;
		printBinary(n);
		printBinary(n>>>8);
		n |= n >>> 8;
		printBinary(n);
		printBinary(n>>>16);
		n |= n >>> 16;
		printBinary(n);
		printBinary(n+1);
		return (n < 0) ? 1 : n + 1;
	}

	static final  void printBinary(int value){
		for(int i=0;i<32;i++){
			int t=(value & 0x80000000>>>i)>>>(31-i);
			System.out.print(t);
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		Map<String,Double> map  = new HashMap<>();
		map.put("abc",0.1);
		map.put("abc",0.1);
		map.put("abc",0.1);
		map.put("abc",0.1);
		System.out.println("hello");
		int res = tableSizeFor(100);
		System.out.println(res);
		printBinary(6);
	}
}
