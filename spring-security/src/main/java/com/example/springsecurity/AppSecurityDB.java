package com.example.springsecurity;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class AppSecurityDB extends WebSecurityConfigurerAdapter{

	@Autowired
	private DataSource dataSource;
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("admin").password("{noop}admin123").authorities("ADMIN");
//		auth.inMemoryAuthentication().withUser("manager").password("{noop}manager123").authorities("MANAGER");
//		auth.inMemoryAuthentication().withUser("emp").password("{noop}emp123").authorities("EMP");
//		auth.inMemoryAuthentication().withUser("superadmin").password("{noop}sa123").authorities("SUPERADMIN");
//		auth.inMemoryAuthentication().withUser("supervisor").password("{noop}sv123").authorities("SUPERVISOR");
		
		auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery("select user_name, user_pwd, user_enabled from user where user_name=?")
		.authoritiesByUsernameQuery("select user_name, user_role from user where user_name=?")
		.passwordEncoder(encoder);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/home").permitAll()
		.antMatchers("/welcome").authenticated()
		.antMatchers("/admin").hasAuthority("ADMIN")
		.antMatchers("/manager").hasAuthority("MANAGER")
		.antMatchers("/emp").hasAuthority("EMP")
		.antMatchers("/common").hasAnyAuthority("EMP", "MANAGER")
		.antMatchers("/sa").hasAuthority("SUPERADMIN")
		.antMatchers("/sv").hasAuthority("SUPERVISOR")
		.antMatchers("/mainapp").hasAnyAuthority("ADMIN", "SUPERVISOR")
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.defaultSuccessUrl("/welcome", true)
		.and()
		.logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.and()
		.exceptionHandling()
		.accessDeniedPage("/ad");
		
	}

	
}
