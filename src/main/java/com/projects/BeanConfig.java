package com.projects;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// Main configuration class that allow to scan components
@Configuration
@ComponentScan(basePackages = "com.projects")
@EnableAspectJAutoProxy
public class BeanConfig {

}
