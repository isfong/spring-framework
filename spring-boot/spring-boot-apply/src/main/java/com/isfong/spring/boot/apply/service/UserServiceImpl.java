package com.isfong.spring.boot.apply.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.isfong.spring.boot.apply.mapper.UserMapper;
import com.isfong.spring.boot.apply.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl< UserMapper, User > implements UserService {
}
