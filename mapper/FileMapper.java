package com.lab.thelab.mapper;

import com.lab.thelab.entity.File;
import com.lab.thelab.entity.Plan;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FileMapper {
    //查看列表
    List<File> queryFileList();
    //添加档案
    public void addFile(File file);

    public void deleteFile(String fid);

    File queryFileById(String fid);

    public void  updateFile(File file);


}
