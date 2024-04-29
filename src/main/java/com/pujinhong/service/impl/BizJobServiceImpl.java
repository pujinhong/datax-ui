package com.pujinhong.service.impl;

import com.pujinhong.dao.BizJobRepository;
import com.pujinhong.entity.BizJob;
import com.pujinhong.service.IBizJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BizJobServiceImpl implements IBizJobService {


    @Autowired
    BizJobRepository bizJobRepository;
    @Override
    public List<BizJob> GetAllJob() {
        return bizJobRepository.findAll();
    }
}
