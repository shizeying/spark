package com.spark.scala.repository

import org.springframework.data.repository.CrudRepository
import com.spark.scala.domain.MetaTable
/**
  * @Author ：史泽颖
  * @Date ： Create in  2019-05-02  23:20
  * @Description ：<描述>
  */
trait MetaTableRepository extends CrudRepository[MetaTable,Integer]{
}
