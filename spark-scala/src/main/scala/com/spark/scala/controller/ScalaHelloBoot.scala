package com.spark.scala.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

/**
  * @Author ：史泽颖
  * @Date ： Create in  2019-05-02  22:20
  * @Description ：<描述>
  */
@RestController
class ScalaHelloBoot {
  @RequestMapping(value = Array("/scalaHello"),method = Array(RequestMethod.GET))
  def sayHello(): String ={
    "scala hello"
  }

}
