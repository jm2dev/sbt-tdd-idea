package com.jm2dev

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class AppTest extends FunSuite
  with ShouldMatchers { 

  test("simple test") { 
    true should be(true)
  }  
}
