package com.pujinhong.entity;


import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "biz_job")
public class BizJob {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;


    String name;
}
