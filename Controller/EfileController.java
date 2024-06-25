package com.lab.thelab.controller;

import com.lab.thelab.entity.Efile;
import com.lab.thelab.mapper.EfileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EfileController {

    @Autowired
    private EfileMapper efileMapper;
    //管理员查看
    @RequestMapping("/efiles")
    public String queryEfileList(Model model){
        List<Efile> efileList =efileMapper.queryEfileList();
        model.addAttribute("efile_list",efileList);
        return "admin/efile_list";
    }
    //查看申请审核结果
    @RequestMapping("/stuefiles")
    public String stuEfileList(Model model){
        List<Efile> efileList =efileMapper.queryEfileList();
        model.addAttribute("stuefile",efileList);
        return "student/student_efile";
    }
    //添加
    //1.跳转到添加页面
    @GetMapping("/toaddefile")
    public String addefilePage(){
        return "admin/efile_add";
    }
    //2.添加到表中
    @PostMapping("/addefile")
    public String addefile(Efile efile){
        efileMapper.addEfile(efile);
        return "redirect:/efiles";
    }
    @GetMapping("/efiles/{efid}")
    public String deleteEfile(@PathVariable("efid")String efid) {
        efileMapper.deleteEfile(efid);
        return "redirect:/efiles";

    }
}
