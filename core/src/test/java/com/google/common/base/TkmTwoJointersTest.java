package com.google.common.base;


import static com.google.common.base.TkmTwoStrings.isBlank;
import static com.google.common.base.TkmTwoStrings.blankToEmpty;
import static com.google.common.base.TkmTwoStrings.blankToNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Test;


public class TkmTwoJointersTest {

  
  @Test
  public void testComma() {
    String s = "zero,one,two";
    
    List<String> l = TkmTwoJointers.COMMA_SPLITTER.splitToList(s);
    assertEquals(3, l.size());
    assertEquals("zero", l.get(0));
    assertEquals("one", l.get(1));
    assertEquals("two", l.get(2));
    assertEquals(s, TkmTwoJointers.COMMA_JOINER.join(l));
  }
  
  @Test
  public void testCommaSpaces() {
    String s = ", zero ,,,,one , , ,,two, , ,";
    
    List<String> l = TkmTwoJointers.COMMA_SPLITTER.splitToList(s);
    assertEquals(3, l.size());
    assertEquals("zero", l.get(0));
    assertEquals("one", l.get(1));
    assertEquals("two", l.get(2));
    assertEquals("zero,one,two", TkmTwoJointers.COMMA_JOINER.join(l));
  }
  
  
  
  
  
  @Test
  public void testColon() {
    String s = "zero:one:two";
    
    List<String> l = TkmTwoJointers.COLON_SPLITTER.splitToList(s);
    assertEquals(3, l.size());
    assertEquals("zero", l.get(0));
    assertEquals("one", l.get(1));
    assertEquals("two", l.get(2));
    assertEquals(s, TkmTwoJointers.COLON_JOINER.join(l));
  }
  
  @Test
  public void testColonSpaces() {
    String s = ": zero ::::one : : ::two: : :";
    
    List<String> l = TkmTwoJointers.COLON_SPLITTER.splitToList(s);
    assertEquals(3, l.size());
    assertEquals("zero", l.get(0));
    assertEquals("one", l.get(1));
    assertEquals("two", l.get(2));
    assertEquals("zero:one:two", TkmTwoJointers.COLON_JOINER.join(l));
  }
  
  
  
  
  
  @Test
  public void testSemicolon() {
    String s = "zero;one;two";
    
    List<String> l = TkmTwoJointers.SEMICOLON_SPLITTER.splitToList(s);
    assertEquals(3, l.size());
    assertEquals("zero", l.get(0));
    assertEquals("one", l.get(1));
    assertEquals("two", l.get(2));
    assertEquals(s, TkmTwoJointers.SEMICOLON_JOINER.join(l));
  }
  
  @Test
  public void testSemicolonSpaces() {
    String s = "; zero ;;;;one ; ; ;;two; ; ;";
    
    List<String> l = TkmTwoJointers.SEMICOLON_SPLITTER.splitToList(s);
    assertEquals(3, l.size());
    assertEquals("zero", l.get(0));
    assertEquals("one", l.get(1));
    assertEquals("two", l.get(2));
    assertEquals("zero;one;two", TkmTwoJointers.SEMICOLON_JOINER.join(l));
  }
  
  
  
  
  
  @Test
  public void testMap() {
    String s = "numberZero=zero&numberOne=one&numberTwo=two";
    
    Map<String,String> m = TkmTwoJointers.MAP_SPLITTER.split(s);
    assertEquals(3, m.size());
    assertEquals("zero", m.get("numberZero"));
    assertEquals("one", m.get("numberOne"));
    assertEquals("two", m.get("numberTwo"));
    
    String js = TkmTwoJointers.MAP_JOINER.join(m);
    assertEquals(s.length(), js.length());
    assertTrue(js.contains("numberZero=zero"));
    assertTrue(js.contains("numberOne=one"));
    assertTrue(js.contains("numberTwo=two"));
    
  }
    
  
}
