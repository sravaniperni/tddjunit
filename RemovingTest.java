package tddjunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


/*TODO List
 *  1. ABCD => BCD
 *  2. AACD => CD
 *  3. BACD => BCD
 *  4. BBAA => BBAA
 *  5. AABAA => BAA
 */

public class RemovingTest
{
RemovingA obj =new RemovingA();

/*@BeforeEach
public void before() {
obj = new RemovingA();
}*/

 @Test
     public void test1() {
    	
assertEquals("BCD", obj.remove("ABCD"));
}
   
@Test
    public void test2() {
	
assertEquals("CD", obj.remove("AACD"));
}

@Test
    public void test3() {
	
assertEquals("BCD", obj.remove("BACD"));
}

@Test
    public void test4() {
assertEquals("BBAA", obj.remove("BBAA"));
}

@Test
    public void test5() {
assertEquals("BAA", obj.remove("AABAA"));
}

 }

   
    