package com.rb.hr.misc.test;

import com.rb.hr.misc.FineCalculation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FineCalculationTest {
  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test(timeout = 1)
  public void fineCalculation() throws Exception {

    FineCalculation fc = new FineCalculation();

    int[] actualReturn = {9,6,2015};
    int[] expectReturn = {6,6,2015};

    // some tests
    assertEquals(45, fc.fineCalculation(actualReturn, expectReturn));
    assertEquals(0, fc.fineCalculation(new int[]{31,12,2009}, new int[]{1,1,2010}));
    assertEquals(10000, fc.fineCalculation(new int[]{1,1,2010}, new int[]{31,12,2009}));
  }

}