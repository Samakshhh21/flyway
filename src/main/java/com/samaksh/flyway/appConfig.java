package com.samaksh.flyway;

import com.samaksh.flyway.controller.testing2;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class appConfig {
    @Bean
    public testing2 test(){
        return new testing2(5);
    }
}
