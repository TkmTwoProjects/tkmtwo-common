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

import java.net.URI;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;


public class UserInfoTest {

  @Test
  public void testValid()
  {
    UserInfo ui = UserInfo.valueOf("user:pass");
    assertEquals("user", ui.getUserName());
    assertEquals("pass", ui.getPassword());
    assertEquals("user:*", ui.toString());
  }
  
  @Test
  public void testDefault()
  {
    UserInfo ui = UserInfo.valueOf((String) null);
    assertNull(ui.getUserName());
    assertNull(ui.getPassword());
  }

  @Test
  public void testNull()
  {
    String s = null;
    UserInfo ui = UserInfo.valueOf(s);
    assertNull(ui.getUserName());
    assertNull(ui.getPassword());
  }

  @Test
  public void testBlank()
  {
    String s = "";
    UserInfo ui = UserInfo.valueOf(s);
    assertNull(ui.getUserName());
    assertNull(ui.getPassword());
  }

  
  @Test
  public void testNoColon()
  {
    UserInfo ui = UserInfo.valueOf("user");
    assertEquals("user", ui.getUserName());
    assertNull(ui.getPassword());
  }
  
    
  

}

