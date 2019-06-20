package com.isfong.spring.boot.apply.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@Accessors( chain = true )
public class Permit implements Serializable {

    private static final long serialVersionUID = 1252429049962262587L;
    @TableId( type = IdType.INPUT )
    private String id;
    private String parent;
    private String name;
    private String icon;
    private String path;
    private Integer level;
    private Integer type;
}
