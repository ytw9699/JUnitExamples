package org.my.test_00;
	import static org.hamcrest.CoreMatchers.is;
	import static org.junit.Assert.assertThat;
	import static org.junit.Assert.fail;
	import java.io.IOException;
	import org.junit.Rule;
	import org.junit.Test;
	import org.junit.rules.ExpectedException;

public class exceptionTest {
	   
	   @Test
	   public void excepitonTest1() {//2의 메소드와 같은것
		   try {
			   
			   //int result = 2/1;
			   int result = 2/0;
			   fail();//예외발생안하면 강제 테스트 실패 
			   
		   }catch(ArithmeticException e) {
			   System.out.println(e.getMessage());
			   assertThat(e.getClass().toString(), is("class java.lang.ArithmeticException"));
			   //예외발생후 상태검사에 유용
		   }
	   }
	
	   @Test(expected = ArithmeticException.class)//예외를 예상하고 잡는 테스트
	   public void excepitonTest2() {
	   //ArithmeticException 예외가 발생하면 바로 테스트 통과
	   //발생안하면 바로 실패!  
		   //int result = 2/1;
		   int result = 2/0;
		   
	       assertThat(result, is(2));//이 행까지 안내려옴
	   }
	   
	   @Rule//junit 규칙은 관점지향프로그래밍과 유사한 기능,테스트 집합에 종단관심사 부착할수있음 , 
	   public ExpectedException thrown = ExpectedException.none();
	   //ExpectedException규칙 > 예외를 검사하는데 좋은 점만 모아둔 규칙
		
	   @Test
	   public void excepitonTest3(){
		   	
		   thrown.expect(ArithmeticException.class);
		   //ArithmeticException예외가 발생할수 있음을 규칙에 알림
		   thrown.expectMessage("/ by zero");//예외 객체에 적절한 메시지가 있는지 검사 알림
		   //규칙에 대한 모든 기대 사항이 충족되면 테스트 통과
		   int result = 2/0;
	   }
	   
	   @Test
	   public void excepitonTest4() {
	     
		   int result = 2/2;
		   
	       assertThat(result, is(1));
	   }
	   
	   @Test()
	   public void excepitonTest5() throws IOException{//예외무시
		   
		   int result = 2/0;
		   
	       assertThat(result, is(2));
	   }
	   
}
