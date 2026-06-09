package com.sp.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sp.Beans.Address;
import com.sp.Beans.Student;

@Configuration
public class SpringConfig {
	@Bean
	public Address createaddrobj() {
		Address addr = new Address();
		
		addr.setHouse_no(123);
		addr.setCity("kolhapur");
		addr.setPincode(234234);
		return addr;
	}
	@Bean
	public Student createstdobj() {
		Student std = new Student();
		std.setName("Sanket");
		std.setRoll_No(12);
		std.setAddress(createaddrobj());
		return std;
		
	}

}
