package com.jth.spring.board.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class TodoSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .setName("com/jth/spring/board")
                .addScript("classpath:/schema.sql")
                .addScript("classpath:/data.sql")
                .build();
    }

    @Bean
    public BCryptPasswordEncoder psswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .passwordEncoder(psswordEncoder())
                .dataSource(dataSource());
    }

    @Bean
    public AccessChecker accessChecker() {
        return new AccessChecker();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/todos*").hasAuthority("USER")
                .antMatchers(HttpMethod.DELETE, "/todos*")
                .access("hasAuthority('ADMIN') or @accessChecker.hasLocalAccess(authentication)")
                .and()
                    .httpBasic().disable()
                    .formLogin()
                        .loginPage("/login.jsp")
                        .loginProcessingUrl("/login")
                        .failureUrl("/login.jsp?error=true")
                        .permitAll()
                .and()
                    .logout().logoutSuccessUrl("/logout-success.jsp");
    }
}
