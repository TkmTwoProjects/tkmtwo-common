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
package com.tkmtwo.common.java.net;

import java.io.File;
import java.net.URI;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class URIsTest {


  @Test
  public void testCreate()
  {
    URI arUri = URIs.valueOf("arapi://myaccount:mypassword@MyArHost:1803");
    System.out.println(URIs.confess(arUri));

    UserInfo ui = URIs.getUserInfo(arUri);
    assertEquals("myaccount", ui.getUserName());
    assertEquals("mypassword", ui.getPassword());
  }
  
  @Test
  public void testThis()
    throws Exception
  {
    URI uri = new URI("jdbc:jtds:sqlserver://DbUser:DbPass@DbServerName:1433/DbName");
    System.out.println(URIs.confess(uri));
  } 


  @Test
  public void testFile()
    throws Exception
  {
    System.out.println(URIs.confess(new URI("file://filehost/path/to/file.log")));
    System.out.println(URIs.confess(new URI("file:///path/to/file.log")));
    System.out.println(URIs.confess(new URI("file:file.log")));
    System.out.println(URIs.confess(new URI("file.log")));
  }
  
  @Test
  public void testFileCreate()
    throws Exception
  {
    File f = new File(new URI("file:///C:/tmp/tom.txt"));
    File fTwo = new File(new URI("file:/tom.txt"));
  }



}

