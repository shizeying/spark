package com.spark.scala.controller;

import com.spark.scala.domain.MetaDatabase;
import com.spark.scala.service.MetaDatabaseService;
import com.spark.scala.utils.ResultVo;
import com.spark.scala.utils.ResultVoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：史泽颖
 * @Date： Create in  2019-05-02  22:57
 * @Description：<描述>
 */
@RestController
@RequestMapping("/meta/database")
public class MetaDataBaseController {
    @Autowired
    private MetaDatabaseService metaDatabaseService;

    @RequestMapping(value = "/save",method = RequestMethod.PUT)
    public ResultVo save(@ModelAttribute MetaDatabase metaDatabase){
        metaDatabaseService.save(metaDatabase);
        return ResultVoUtil.success();
    }

    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public ResultVo query(){
        return ResultVoUtil.success( metaDatabaseService.query());
    }


}
