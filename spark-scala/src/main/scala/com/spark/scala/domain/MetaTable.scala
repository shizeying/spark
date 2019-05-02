package com.spark.scala.domain

import javax.persistence.{Entity, Table}
import javax.persistence.GeneratedValue
import javax.persistence.Id

import scala.beans.BeanProperty


/**
  * @Author ：史泽颖
  * @Date ： Create in  2019-05-02  23:16
  * @Description ：<描述>
  */
@Entity
@Table
class MetaTable {

  @Id
  @GeneratedValue
  @BeanProperty
  var id: Integer = _
  @BeanProperty
  var name: String = _
  @BeanProperty
  var tableType: String = _
  @BeanProperty
  var dbId: Integer = _

}
