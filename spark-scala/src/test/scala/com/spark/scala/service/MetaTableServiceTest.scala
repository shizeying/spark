package com.spark.scala.service

import com.spark.scala.domain.MetaTable
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
  * @Author ：史泽颖
  * @Date ： Create in  2019-05-02  23:33
  * @Description ：<描述>
  */
@RunWith(classOf[SpringRunner])
@SpringBootTest
class MetaTableServiceTest @Autowired()(metaTableService: MetaTableService){
  @Test
  def testSave()={
    val table = new MetaTable
    table.setDbId(1)
    table.setName("hdfs")
    table.setTableType("Char")
    metaTableService.save(table)
  }

  @Test
  def testQuery()={
    val query = metaTableService.query
    query.iterator().hasNext
  }


}
