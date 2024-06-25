package com.lab.thelab.mapper;

import com.lab.thelab.entity.Efile;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EfileMapper {
    //查看列表
    List<Efile> queryEfileList();
    //添加档案
    public void addEfile(Efile efile);
    public  void deleteEfile(String efid);
}
