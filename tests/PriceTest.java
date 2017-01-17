/**
 * Created by brittanyregrut on 4/18/16.
 */
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PriceTest
{
  @Test
  public void testConstructor(){

    try{
      Burrito mockBurrito = Mockito.mock(Burrito.class);
      Price test = new Price(mockBurrito);
    } catch(Exception e){
      fail();
    }
  }

  @Test
  public void testPrintReceipt(){
    Burrito test = new Burrito(true, "chicken", "white", "pinto", true, true, true, true);
    Price testPrice = new Price(test);
    double total = testPrice.printReceipt();
    assertEquals(9.88, total, 0.0000000001);
  }

  @Test
  public void notInTactTest(){
    Burrito test = new Burrito(true, "chicken", "white", "pinto", true, true, true, true);
    test.setInTact(false);
    Price testPrice = new Price(test);
    double total = testPrice.printReceipt();
    assertEquals(0, total, 0.0000000001);
  }

  @Test
  public void invalidFillingTest(){
    Burrito test = new Burrito(true, "wrong", "white", "pinto", true, true, true, true);
    Price testPrice = new Price(test);
    double total = testPrice.printReceipt();
    assertEquals(4.88, total, 0.0000000001);
  }

}
