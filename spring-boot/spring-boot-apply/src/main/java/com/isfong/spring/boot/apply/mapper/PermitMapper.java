package com.isfong.spring.boot.apply.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.isfong.spring.boot.apply.model.Permit;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PermitMapper extends BaseMapper< Permit > {
}
