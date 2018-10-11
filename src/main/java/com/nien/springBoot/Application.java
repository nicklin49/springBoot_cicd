package com.nien.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.constructor.Construct;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
//		stringComparison();
//		test1();
//		testJson();
		
		try {
			System.out.println("1");
			testTry();
			System.out.println("2");
		} catch (Exception e) {
			System.out.println("3");
		} finally {
			System.out.println("4");
		}
	}
	
	public static void testTry() throws Exception {
		System.out.println("5");
		throw new Exception("Over");
	}
	
	public static void stringComparison() {
		String a = "a";
		String aa = a;
		
		System.out.println("a == aa :" + a == aa);
		System.out.println("a.equals(aa) :" + a.equals(aa));
	}
	
	public static void test1() {
		TestVO testVO = new TestVO();
		String value = testVO.getValue();
		// 寫法一
		if(value.equals("good")){
			System.out.println("value.equals(good)");
		}
		// 寫法二
		if("good".equals(value)){
			System.out.println("good.equals(value)");
		}
	}
	
	public static class TestVO{
		String value;
		public TestVO() {
			// do nothing
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		
	}
	
	public static void testJson() {
		// {"name": "kk", "number": 12}
		
		
		TestVO testVO = new TestVO();
		String value = testVO.getValue();
		// 寫法一
		if(value.equals("good")){
			System.out.println("value.equals(good)");
		}
		// 寫法二
		if("good".equals(value)){
			System.out.println("good.equals(value)");
		}
	}
	
}
