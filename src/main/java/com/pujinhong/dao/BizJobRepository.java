package com.pujinhong.dao;

import com.pujinhong.entity.BizJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BizJobRepository extends JpaRepository<BizJob,Long>, JpaSpecificationExecutor<BizJob> {
}
