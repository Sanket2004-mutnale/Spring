package com.sp.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sp.Beans.Address;
import com.sp.Beans.Student;

@Configuration
public class SpringConfig {
	@Bean
	public Address createAddrObj() {
		
		Address addr=new Address(200,"solapur",786563);
		return addr;
	}
	@Bean
    public Student createStdObj() {
		
		Student std=new Student("Sanket",12,createAddrObj());
		return std;
	}


}
