package com.lab.thelab.mapper;

import com.lab.thelab.entity.Answer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface AnswerMapper {
    List<Answer> queryAnswerList();

    //查询单个plan
    Answer queryAnswerById(String aid);

    //添加
    public void addAnswer(Answer answer);

    //修改
    public void  updateAnswer(Answer answer);

    //删除
    public void  deleteAnswer(String aid);

}
