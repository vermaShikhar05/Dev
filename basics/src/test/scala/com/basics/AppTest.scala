package com.basics

import org.junit.runner.RunWith
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatestplus.junit.JUnitRunner
@RunWith(classOf[JUnitRunner])
class AppTest extends AnyFlatSpec{

  "fooBar function" should "say Hello to processor"in{
    App.fooBar("processor")

  }

}
