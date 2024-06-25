package com.lab.thelab.mapper;

import com.lab.thelab.entity.Apply;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ApplyMapper {

    //查询报名信息列表
    List<Apply> queryApplyList();
    //填写报名信息
    public void addApply(Apply apply);
    //删除报名信息
    public void deleteApply(String Aid);

}
