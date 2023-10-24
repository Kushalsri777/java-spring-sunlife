package com.example.springsecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassEncoderTest {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("admin123"));
		System.out.println(encoder.encode("manager123"));
		System.out.println(encoder.encode("emp123"));
		System.out.println(encoder.encode("sa123"));
		System.out.println(encoder.encode("sv123"));

	}
}

//insert into user values(101, 'admin', '$2a$10$s2L0oZilpuSNjpkGptIg2ees.dEZeJlclf/v8AFc8cuBP2Lk5U8Cu', 1, 'ADMIN');
//insert into user values(104, 'superadmin', '$2a$10$2ty3ial.GEDV.wIZD5WvS.sG3/7wMhYoMDJS6uznnLiNZpbxQGTnS', 1, 'SUPERADMIN');
//insert into user values(105, 'supervisor', '$2a$10$bMLlY10QN0UVMreBlh5Kge8czILH.oxYJ6mGzcEcaEXliyB5e5DQi', 1, 'SUPERVISOR');
