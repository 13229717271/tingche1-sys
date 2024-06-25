package com.lab.thelab.controller;

import com.lab.thelab.entity.File;
import com.lab.thelab.entity.Plan;
import com.lab.thelab.mapper.FileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FileController {

    @Autowired
    private FileMapper fileMapper;
    //管理员查看
    @RequestMapping("/files")
    public String queryFileList(Model model){
        List<File> fileList =fileMapper.queryFileList();
        model.addAttribute("file_list",fileList);
        return "admin/file_list";
    }
    //业主查看面试结果
    @RequestMapping("/stufiles")
    public String stuFileList(Model model){
        List<File> fileList =fileMapper.queryFileList();
        model.addAttribute("stufile",fileList);
        return "student/student_file";
    }
    //添加
    //1.跳转到添加页面
    @GetMapping("/toaddfile")
    public String addfilePage(){
        return "admin/file_add";
    }
    //2.添加到表中
    @PostMapping("/addfile")
    public String addfile(File file){
        fileMapper.addFile(file);
        return "redirect:/files";
    }

    //修改
    //1.去修改页面
    @GetMapping("/file/{fid}")
    public String toupdateFilePage(@PathVariable("fid")String fid,Model model){
        //根据id查询数据
        File file = fileMapper.queryFileById(fid);
        model.addAttribute("file", file);
        return "xgc/updateFile";
    }
    //2.修改页面数据
    @PostMapping("/updatefile")
    public String updateFile(File file){
        fileMapper.updateFile(file);
        return "redirect:/files";
    }


    //删除
    @GetMapping("/defile/{fid}")
    public String deleteFile(@PathVariable("fid")String fid) {
        fileMapper.deleteFile(fid);
        return "redirect:/files";

    }}
