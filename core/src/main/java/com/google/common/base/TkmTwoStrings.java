/*
 *
 * Copyright 2014 Tom Mahaffey
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.google.common.base;



/**
 * Additional methods inspired by Guava.
 *
 *
 */
public class TkmTwoStrings {
  
  
  /**
   * Tell if the string is null, empty, or all whitespace.
   *
   * @param s a String
   * @return boolean telling if the string is "blank" or not
   */
  public static boolean isBlank(final String s) {
    if (s == null) { return true; }
    String ts = CharMatcher.WHITESPACE.trimFrom(s);
    return ts.isEmpty();
  }
  
  /**
   * Trims a string of whitespace and returns if non-blank; null otherwise.
   *
   * @param s a String
   * @return a String
   */
  public static String blankToNull(final String s) {
    if (s == null) { return null; }
    String ts = CharMatcher.WHITESPACE.trimFrom(s);
    if (ts.isEmpty()) { return null; }
    return ts;
  }
  
  
  
  /**
   * Trims a string of whitespace and returns if non-blank; empty otherwise.
   *
   * @param s a String
   * @return a String
   */
  public static String blankToEmpty(final String s) {
    if (s == null) { return ""; }
    String ts = CharMatcher.WHITESPACE.trimFrom(s);
    return ts;
  }
  
  
  
}
