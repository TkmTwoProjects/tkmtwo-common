package com.google.common.base;


import static com.google.common.base.TkmTwoConditions.checkNotBlank;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;


public class TkmTwoConditionsTest {

  
  @Test
  public void testCheckNotBlankUnaccept() {
    String[] ss = new String[] {
      (String) null,
      "\t",
      "  \t  ",
      "\n",
      " \n\n\n ",
      "\r\n\r\n\r\n "
    };
    for (String s : ss) {
      try {
        String ts = checkNotBlank(s);
        fail("Should not have accepted " + s);
      } catch (IllegalArgumentException iae) {
        ;
      }
    }
  }
  
  @Test
  public void testCheckNotBlankAccept() {
    String[] ss = new String[] {
      "word",
      "word ",
      " word",
      " word ",
      "\t word \t",
      "\r\n\r\nword\r\n"
    };
    for (String s : ss) {
      String ts = checkNotBlank(s);
      assertEquals("word", checkNotBlank(s));
    }
  }
  
  
  
  @Test
  public void testIsEmpty() {
    assertTrue(TkmTwoConditions.isEmpty(null));
    assertTrue(TkmTwoConditions.isEmpty(new ArrayList()));

    List<String> l = new ArrayList<String>();
    l.add("one");

    assertTrue(!TkmTwoConditions.isEmpty(l));
  }
  
  
  @Test
  public void testHasNulls() {
    assertTrue(TkmTwoConditions.hasNulls(null));

    List<String> l = new ArrayList<String>();
    l.add("one");
    l.add(null);
    l.add("three");

    assertTrue(TkmTwoConditions.hasNulls(l));
  }
    
  @Test
  public void testHasEmpties() {
    assertTrue(TkmTwoConditions.hasEmpties(null));

    List<List<String>> lol = new ArrayList<List<String>>();
    List<String> listOne = new ArrayList<String>();
    listOne.add("one");

    lol.add(listOne);
    assertTrue(!TkmTwoConditions.hasEmpties(lol));

    lol.add(new ArrayList<String>());
    assertTrue(TkmTwoConditions.hasEmpties(lol));

  }
    


}
