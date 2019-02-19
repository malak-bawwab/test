package hw;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;

public class test {
		@Test
		public void test() {
		
			SC s=new SC();
			assertEquals(0,s.getcount());
			}
		@Test
				void test2() {
			product p=new product("java Book",1,127);
			SC s=new SC();
			s.add(p);
			assertEquals(1,s.getcount());
			assertEquals(127,s.gettotalprice());


			}
		@Test

				void test3() {
			product p1=new product("java Book",1,127);
			product p2=new product("java Book",1,100);

			SC s=new SC();
			s.add(p1);
			s.add(p2);
			assertEquals(2,s.getcount());
			assertEquals(227,s.gettotalprice());


			}
			
	}


