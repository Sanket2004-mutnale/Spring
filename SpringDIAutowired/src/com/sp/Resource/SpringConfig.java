package com.sp.Resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sp.Beans.Address;
import com.sp.Beans.Student;
import com.sp.Beans.Subject;

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
		//std.setAddress(createaddrobj()); it manull
		return std;
		
	}
	@Bean
	public Subject createsubobj() {
		Subject sub=new Subject();
		List<String> sub_list=new ArrayList<String>();
		sub_list.add("java");
		sub_list.add("python");
		sub_list.add("C++");
		sub.setSubject(sub_list);
		return sub;
		
	}


}
