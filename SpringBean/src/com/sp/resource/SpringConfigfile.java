package com.sp.resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sp.bean")
//@ComponentScan({"com.sp.bean","------","-----"})//Multiple beans are Available
public class SpringConfigfile {

}
