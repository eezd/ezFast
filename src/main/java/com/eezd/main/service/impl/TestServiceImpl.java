package com.eezd.main.service.impl;

import com.eezd.main.domain.Test;
import com.eezd.main.mapper.TestMapper;
import com.eezd.main.service.ITestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class TestServiceImpl implements ITestService {

    private final TestMapper baseMapper;

    @Override
    public Test queryById(Long id) {
        return baseMapper.selectById(id);
    }
}
