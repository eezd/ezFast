package com.eezd.main.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eezd.main.domain.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper extends BaseMapper<Test> {
}
