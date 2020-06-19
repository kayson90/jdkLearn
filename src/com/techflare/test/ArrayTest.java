package com.techflare.test;

import java.util.Arrays;
import java.util.Random;

/**
 * @author lvwenkai
 * @date 2020-06-12
 */
public class ArrayTest
{
	public static int[] shuffle(int[] nums)
	{
		if (nums == null)
		{
			return null;
		}
		//深拷贝
		//int[] a = nums.clone();
		for (int j = 1; j < nums.length; j++)
		{
			int i = new Random().nextInt(j + 1);
			swap(nums, i, j);
		}
		return nums;
	}

	private static void swap(int[] nums, int i, int j)
	{
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}

	public static void main(String[] args)
	{
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		Class<? extends int[]> aClass = a.getClass();
		System.out.println(aClass.getName());
		Arrays.stream(a).forEach(System.out::print);
		System.out.println();
		shuffle(a);
		Arrays.stream(a).forEach(System.out::print);
	}
}
