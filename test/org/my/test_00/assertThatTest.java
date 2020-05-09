package org.my.test_00;
	import static org.junit.Assert.*;
	import static org.hamcrest.CoreMatchers.*; 
	import org.junit.*;

public class assertThatTest {
	   //equalTo matcher에는 어떤 자바 인스턴스나 기본형 값이라도 넣을 수 있다.
	
	   @Test
	   public void IntTest() {
	     
		  int result = 6;
		  
	      assertTrue(result == 6);
	      
	      assertThat(result, equalTo(6));
	      
	      assertThat(result, is(6));
	   }
	   
	   @Test
	   public void StringTest() {
	     
		  String result = "abc";
		  
	      assertTrue(result.equals("abc"));
	      
	      assertThat(result, startsWith("abc"));
	      
	      assertThat("String값 비교", result, equalTo("abc"));
	      
	      assertThat(result, is("abc"));
	   }
	   
	   @Test
	   public void ArrayTest() {
	     
		  String[] result = {"a", "b", "c"};
		  
		  assertThat("배열값 비교", result, equalTo(new String[] {"a", "b", "c"}));
		  
		  assertThat(result, is(new String[] {"a", "b", "c"}));
	   }
}
