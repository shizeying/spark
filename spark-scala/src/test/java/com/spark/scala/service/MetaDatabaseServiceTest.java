package com.spark.scala.service;

import com.spark.scala.domain.MetaDatabase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author：史泽颖
 * @Date： Create in  2019-05-02  22:45
 * @Description：<描述>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MetaDatabaseServiceTest {
    @Autowired
    private MetaDatabaseService metaDatabaseService;
    @Test
    public void testSave(){
        MetaDatabase metaDatabase = new MetaDatabase();
        metaDatabase.setName("default");
        metaDatabase.setLocation("hdfs://graduatehadoop:8020/user/hive/warehouse");
        metaDatabaseService.save(metaDatabase);
    }
    @Test
    public void testQuery(){
        Iterable<MetaDatabase> query = metaDatabaseService.query();
        for (MetaDatabase metaDatabase:query){
            System.out.println(metaDatabase.getId());
            System.out.println(metaDatabase.getName());
            System.out.println(metaDatabase.getLocation());
        }
    }
}
