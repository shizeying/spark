package com.spark.scala.service

import com.spark.scala.domain.MetaTable
import com.spark.scala.repository.MetaTableRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
  * @Author ：史泽颖
  * @Date ： Create in  2019-05-02  23:25
  * @Description ：<描述>
  */
@Service
@Transactional
class MetaTableService @Autowired()(metaTableRepository: MetaTableRepository) {

  def save(metaTable: MetaTable): Unit ={
    metaTableRepository.save(metaTable)
  }

  def query()={
    metaTableRepository.findAll()
  }

}
