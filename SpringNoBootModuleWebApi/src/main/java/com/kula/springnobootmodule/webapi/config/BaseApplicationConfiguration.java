package com.kula.springnobootmodule.webapi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages ={"com.kula.springnobootmodule"})
public class BaseApplicationConfiguration {
}
