package FahrenheitTest;

import CsitLabs.FahrenheitCalc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class FahrenheitTest {

      FahrenheitCalc calc = new FahrenheitCalc();

    @Test
    public void testForSucess(){
      assertEquals(0.0, calc.convertFormula(32),1);

    }

    @Test
    public void fail(){
     assertNotEquals(55.0,calc.convertFormula(32),1);
    }
}
