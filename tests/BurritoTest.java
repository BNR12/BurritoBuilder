import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BurritoTest
{
  @Test
  public void eatBurrito() throws Exception
  {
    Burrito b = new Burrito();
    b.eatBurrito();
    assertFalse(b.isInTact());
  }


  @Test
  public void isInTact() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "brown", true, true, true, true);
    assertTrue(b.isInTact());
  }


  @Test
  public void isSetInTact() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "brown", true, true, true, true);
    b.setInTact(false);
    assertFalse(b.isInTact());
  }

  @Test
  public void isWrapped() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "black", true, true, true, true);
    assertTrue(b.isWrapped());
  }

  @Test
  public void setWrapped() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "black", true, true, true, true);
    b.setWrapped(false);
    assertFalse(b.isWrapped());
  }

  @Test
  public void getMainFilling() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "brown", true, true, true, true);
    assertEquals(b.getMainFilling(), "chicken");
  }

  @Test
  public void setMainFilling() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "black", true, true, true, true);
    b.setMainFilling("steak");
    assertEquals(b.getMainFilling(), "steak");
  }

  @Test
  public void getRice() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "brown", true, true, true, true);
    assertEquals(b.getRice(), "brown");
  }

  @Test
  public void setRice() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "black", true, true, true, true);
    b.setRice("white");
    assertEquals(b.getRice(), "white");
  }

  @Test
  public void getBeans() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "brown", true, true, true, true);
    assertEquals(b.getBeans(), "brown");
  }

  @Test
  public void setBeans() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "black", true, true, true, true);
    b.setBeans("black");
    assertEquals(b.getBeans(), "black");
  }

  @Test
  public void hasSourCream() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "black", true, true, true, true);
    assertTrue(b.hasSourCream());
  }

  @Test
  public void setSourCream() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "black", true, true, true, true);
    b.setSourCream(false);
    assertFalse(b.hasSourCream());
  }

  @Test
  public void hasLettuce() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "black", true, true, true, true);
    assertTrue(b.hasLettuce());
  }

  @Test
  public void setLettuce() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "black", true, true, true, true);
    b.setLettuce(false);
    assertFalse(b.hasLettuce());
  }

  @Test
  public void hasGuac() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "black", true, true, true, true);
    assertTrue(b.hasGuac());
  }

  @Test
  public void setGuac() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "black", true, true, true, true);
    b.setGuac(false);
    assertFalse(b.hasGuac());
  }

  @Test
  public void hasCheese() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "black", false, true, false, true);
    b.setCheese(true);
    assertTrue(b.hasCheese());
  }

  @Test
  public void setCheese() throws Exception
  {
    Burrito b = new Burrito();
    b.setCheese(true);
    assertTrue(b.hasCheese());
  }

  @Test
  public void toStringTest() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "brown", true, true, true, true);
    assertEquals(b.toString(), "Burrito{wrapped=true, mainFilling='chicken', rice='brown', beans='brown', sourCream=true, lettuce=true, guac=true, cheese=true, inTact=true}");
  }

  @Test
  public void equalsTest() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "brown", true, true, true, true);
    Burrito c = new Burrito(true, "chicken", "brown", "brown", true, true, true, true);
    assertEquals(b, c);
  }

  @Test
  public void equalsTestFalse() throws Exception
  {
    Burrito b = new Burrito(true, "chicken", "brown", "brown", true, true, true, true);
    Burrito c = new Burrito(false, "chicken", "brown", "brown", true, true, true, true);
    assertNotEquals(b, c);
  }

}