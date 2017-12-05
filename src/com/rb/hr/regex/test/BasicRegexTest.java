package com.rb.hr.regex.test;

import com.rb.hr.regex.BasicRegex;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BasicRegexTest {
  @Test
  @Ignore
  public void emailValidator2() throws Exception {
  }

  @Test(timeout = 5)
  public void emailValidator() throws Exception {
    BasicRegex br = new BasicRegex();

    assertTrue("Valid email: ", br.emailValidator2("riya@gmail.com"));
    assertTrue("Valid email: ", br.emailValidator2("samantha@gmail.com"));
    assertFalse("Valid email: ", br.emailValidator2("julia@gfmail.com"));
    assertFalse("Valid email: ", br.emailValidator2("julisaa@gmaiI.com"));
    assertFalse("Valid email: ", br.emailValidator2("julisaa@gmail.co"));
    assertTrue("Valid email: ", br.emailValidator2("@gmail.com"));
    assertTrue("Valid email: ", br.emailValidator2("gmail.com"));
  }

}