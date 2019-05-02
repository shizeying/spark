package com.spark.scala.controller

import com.spark.scala.domain.MetaTable
import com.spark.scala.service.MetaTableService
import com.spark.scala.utils.ResultVoUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._

/**
  * @Author ：史泽颖
  * @Date ： Create in  2019-05-02  23:40
  * @Description ：<描述>
  */
@RestController
@RequestMapping(Array("/scala/metaTable"))
class MetaTableController @Autowired()(metaTableService:MetaTableService){

  @RequestMapping(value = Array("/save"),method = Array(RequestMethod.PUT))
  @ResponseBody
  def save(@ModelAttribute metaTable: MetaTable )={
    metaTableService.save(metaTable)
    ResultVoUtil.success
  }
  @RequestMapping(value = Array("/query"),method = Array(RequestMethod.GET))
  @ResponseBody
  def query()={
    ResultVoUtil.success(metaTableService.query)
  }
}
