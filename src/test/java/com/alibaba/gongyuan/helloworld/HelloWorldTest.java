package com.alibaba.gongyuan.helloworld;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
//import com.alibaba.gongyuan.helloworld.HelloWorld;

public class HelloWorldTest {
	
	public void HelloWorldTest(){
		
	}
	
	@ Test
	public void testSayHello(){
		HelloWorld hello = new HelloWorld();
		String result = hello.sayHello();
		assertEquals("Hello Maven",result);
	}

}
