package com.techflare.test;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author lvwenkai
 * @date 2020-06-18
 */
public class ConsumerTest
{
	private static  void  consumer(Consumer<Integer> consumer){
		consumer.accept(3);
	}

	private static void function(Function<Integer,Integer> function){
		Integer res = function.apply(2);
		System.out.println(res);
	}

	private static Integer test(Integer a){
		System.out.println("test");
		return a*a;
	}

	public static void main(String[] args)
	{
		consumer(System.out::println);
		function(System.out::println);
		function(ConsumerTest::test);
		consumer(ConsumerTest::test);
	}
}
