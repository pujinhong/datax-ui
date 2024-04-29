package com.pujinhong.controller;

import com.pujinhong.service.IBizJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pujinhong.entity.*;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobApiController {

    @Autowired
    IBizJobService jobService;

    @GetMapping("/list")
    List<BizJob> GetList(){

        return jobService.GetAllJob();
    }

}
