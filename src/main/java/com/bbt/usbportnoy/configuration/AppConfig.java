package com.bbt.usbportnoy.configuration;

import com.bbt.usbportnoy.service.CallService;
import com.bbt.usbportnoy.service.TestCallService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jason on 1/3/17.
 */
@Configuration
public class AppConfig {
    @Bean
    public CallService callService() {
        return new TestCallService();
    }
}
