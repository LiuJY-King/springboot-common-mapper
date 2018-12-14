package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_test")
public class Test implements Serializable {
    @Id
    private Integer tid;
    @Column(name = "tname")
    private String name;

    private String email;

    private Date birthday;
}