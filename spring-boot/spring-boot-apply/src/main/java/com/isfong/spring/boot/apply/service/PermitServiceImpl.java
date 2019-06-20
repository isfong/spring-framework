package com.isfong.spring.boot.apply.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.isfong.spring.boot.apply.mapper.PermitMapper;
import com.isfong.spring.boot.apply.model.Permit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PermitServiceImpl extends ServiceImpl< PermitMapper, Permit > implements PermitService {
}
