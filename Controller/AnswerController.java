package com.lab.thelab.controller;


import com.lab.thelab.entity.Answer;
import com.lab.thelab.mapper.AnswerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class AnswerController {

    @Autowired
    private AnswerMapper answerMapper;
    //学工处查看列表


    //业主查看列表
    @RequestMapping("/student_answer_list")
    public String studentAnswerList(Model model){
        List<Answer> studentanswerList =answerMapper.queryAnswerList();
        model.addAttribute("student_answer_list",studentanswerList);
        return "student/student_answer_list";
    }

    //添加
//1.跳转到添加页面

    @GetMapping("/toaddAnswer")
    public String addWordPage(){
        return "admin/addAnswer";
    }
    //2.提交表单

    @PostMapping("/addAnswer")
    public String addWord(Answer answer){
        answerMapper.addAnswer(answer);
        return "redirect:/word_list";
    }


    //删除
    @GetMapping("/delanswer/{aid}")
    public String deleteAnswer(@PathVariable("aid")String aid){
        answerMapper.deleteAnswer(aid);
        return "redirect:/student_answer_list";
    }
}