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
 *
 *
 *
 */
public final class TkmTwoJointers {

  public static final Joiner.MapJoiner MAP_JOINER =
    Joiner
    .on('&')
    .withKeyValueSeparator("=");

  public static final Splitter.MapSplitter MAP_SPLITTER =
    Splitter
    .on('&')
    .trimResults()
    .omitEmptyStrings()
    .withKeyValueSeparator('=');
  
  
  
  public static final Joiner COMMA_JOINER =
    Joiner
    .on(',')
    .skipNulls();
  
  public static final Splitter COMMA_SPLITTER =
    Splitter
    .on(',')
    .omitEmptyStrings()
    .trimResults();
  
  
  public static final Joiner COLON_JOINER =
    Joiner
    .on(':')
    .skipNulls();
  
  public static final Splitter COLON_SPLITTER =
    Splitter
    .on(':')
    .omitEmptyStrings()
    .trimResults();
  
  public static final Joiner SEMICOLON_JOINER =
    Joiner
    .on(';')
    .skipNulls();
  
  public static final Splitter SEMICOLON_SPLITTER =
    Splitter
    .on(';')
    .omitEmptyStrings()
    .trimResults();
  
  public static final Joiner DOT_JOINER =
    Joiner
    .on('.')
    .skipNulls();
  
  public static final Splitter DOT_SPLITTER =
    Splitter
    .on('.')
    .omitEmptyStrings()
    .trimResults();
  
}
