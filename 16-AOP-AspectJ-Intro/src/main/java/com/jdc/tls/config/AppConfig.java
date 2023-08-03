package com.jdc.tls.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.jdc.tls.bean","com.jdc.tls.log"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {

}
