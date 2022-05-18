package com.smalldogg.study.advanced;

import com.smalldogg.study.advanced.trace.logtrace.LogTrace;
import com.smalldogg.study.advanced.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
//        return new FieldLogTrace(); //싱글톤 의존성 주입
        return new ThreadLocalLogTrace();
    }
}
