package com.google.common.base;


import static com.google.common.base.TkmTwoStrings.isBlank;
import static com.google.common.base.TkmTwoStrings.blankToEmpty;
import static com.google.common.base.TkmTwoStrings.blankToNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TkmTwoStringsTest {
  
  public static final String[] blankStrings = new String[] {
    (String) null,
    "",
    "\t",
    "  \t  ",
    "\n",
    " \n\n\n ",
    "\r\n\r\n\r\n "
  };
  
  public static final String[] nonBlankStrings = new String[] {
    "one two",
    "one two ",
    " one two",
    " one two ",
    "\t one two \t",
    "\r\n\r\none two\r\n"
  };
  
  
  
  
  @Test
  public void testIsBlank() {
    for (String s : blankStrings) {
      assertTrue(isBlank(s));
    }
    for (String s: nonBlankStrings) {
      assertTrue(!isBlank(s));
    }
  }
  
  
  
  
  @Test
  public void testBlankToNull() {
    for (String s : blankStrings) {
      assertNull(blankToNull(s));
    }
    for (String s : nonBlankStrings) {
      assertEquals("one two", blankToNull(s));
    }
    
  }
  
  
  
  
  @Test
  public void testBlankToEmpty() {
    for (String s : blankStrings) {
      assertEquals("", blankToEmpty(s));
    }
    for (String s : nonBlankStrings) {
      assertEquals("one two", blankToEmpty(s));
    }
  }
  
  
  
  
}
