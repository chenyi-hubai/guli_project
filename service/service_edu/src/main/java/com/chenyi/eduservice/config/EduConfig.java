package com.chenyi.eduservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.chenyi.eduservice.mapper")
public class EduConfig {
}
