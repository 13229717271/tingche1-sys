package com.lab.thelab.controller;

import com.lab.thelab.entity.Apply;
import com.lab.thelab.mapper.ApplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ApplyController {

    @Autowired
    private ApplyMapper applyMapper;


    @RequestMapping("/applys")
    public String queryApplyList(Model model){
        List<Apply> applyList = applyMapper.queryApplyList();
        model.addAttribute("applys",applyList);
        return "admin/apply_list";
    }
    //查看结果
    @RequestMapping("/FaceApplyResult")
    public String FaceResult(Model model){
        List<Apply> faceapplyresult = applyMapper.queryApplyList();
        model.addAttribute("faceapplyresults",faceapplyresult);
        return "student/student_applyface_result";
    }


    //1.跳转到添加页面
    @GetMapping("/toaddApply")
    public String addApplyPage(){
        return "student/student_add_apply";
    }
    //2.添加到报名表中
    @PostMapping("/addApply")
    public String addApply(Apply apply){
        applyMapper.addApply(apply);
        //重定向到列表页面通过接口/student_plan_list
        return "redirect:/student_equip_list";
    }

    //审核
    @GetMapping("/deleteapply/{aid}")
    public String deleteApply(@PathVariable("aid")String aid){
        applyMapper.deleteApply(aid);
        return "redirect:/applys";
    }
}
