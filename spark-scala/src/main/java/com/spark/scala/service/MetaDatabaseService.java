package com.spark.scala.service;

import com.spark.scala.domain.MetaDatabase;
import com.spark.scala.repository.MetaDatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author：史泽颖
 * @Date： Create in  2019-05-02  22:42
 * @Description：<描述>
 */
@Service
@Transactional
public class MetaDatabaseService {
    @Autowired
    private MetaDatabaseRepository metaDatabaseRepository;

    public void save(MetaDatabase metaDatabase){
        metaDatabaseRepository.save(metaDatabase);
    }
    public Iterable<MetaDatabase> query(){
        return metaDatabaseRepository.findAll();
    }

}
