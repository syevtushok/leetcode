package org.esadev.neetcode.linked_lists.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DesigningBrowserHistory1472Test {

  @Test
  void base() {
    DesigningBrowserHistory1472 obj = new DesigningBrowserHistory1472("leetcode.com");
    obj.visit("google.com");
    obj.visit("facebook.com");
    obj.visit("youtube.com");
    String actual = obj.back(1);
    assertEquals("facebook.com", actual);
    actual = obj.back(1);
    assertEquals("google.com", actual);
    actual = obj.forward(1);
    assertEquals("facebook.com", actual);
    obj.visit("linkedin.com");
    actual = obj.forward(2);
    assert actual.equals("linkedin.com");
    actual = obj.back(2);
    assertEquals("google.com", actual);
    obj.back(7);
  }

  @Test
  void base1() {
    DesigningBrowserHistory1472 obj = new DesigningBrowserHistory1472("zav.com");
    obj.visit("kni.com");
    String actual = obj.back(7);
    assertEquals("zav.com", actual);
    actual = obj.back(7);
    assertEquals("zav.com", actual);
    obj.forward(5);
    obj.forward(1);
    obj.visit("pwrrbnw.com");
    obj.visit("mosohif.com");
    obj.back(9);

  }

  @Test
  void base3() {
    DesigningBrowserHistory1472 obj = new DesigningBrowserHistory1472("esgriv.com");
    obj.visit("cgrt.com");
    obj.visit("tip.com");
    String actual = obj.back(9);
    assertEquals("esgriv.com", actual);
    obj.visit("kttzxgh.com");
    obj.forward(7);
    obj.visit("crqje.com");
    obj.visit("iybch.com");
    obj.forward(5);
    obj.visit("uun.com");
    obj.back(10);
    obj.visit("hci.com");
    obj.visit("whula.com");
    obj.forward(10);
  }
}