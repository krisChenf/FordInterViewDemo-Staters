package com.example.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Before
	public void bf(){
		System.out.println("开始执行测试方法.....");
	}
	@Test
	public void contextLoads() {

	}
	@After
	public void af(){
		System.out.println("测试方法执行完毕.....");
	}
}
