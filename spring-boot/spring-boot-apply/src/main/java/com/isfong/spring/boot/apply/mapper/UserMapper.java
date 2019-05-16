package com.isfong.spring.boot.apply.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.isfong.spring.boot.apply.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper< User > {
}
