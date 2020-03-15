package com.jth.restapi.configs;

import com.jth.restapi.accouts.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    AccountService accountService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Bean
    public TokenStore tokenStore() {
        return new InMemoryTokenStore();
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(accountService)
                .passwordEncoder(passwordEncoder);
    }

    // 이건 spring boot filter를 통과하기 전에 미리 걸러낸다.
    // 그래서 security에서는 해당 내용은 아무 것도 모른 채 그냥 통과시켜 준다.
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().mvcMatchers("/docs/index.html");
        // static method를 사용하는 spring boot의 기본 설정 경로는 다 웹시큐리티 설정을 무시하도록.
        // 다 통과되도록 설정.
        web.ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations());
    }

    // http security는 일단 spring filter를 통과한 뒤에 필터링한다.
    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .mvcMatchers("/docs/index.html").anonymous()
                .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).anonymous()
        ;
    }*/

    /*@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.anonymous()
                .and()
                .formLogin()
                .and()
                .authorizeRequests().mvcMatchers(HttpMethod.GET, "/api/**").authenticated()
                .anyRequest().authenticated()
        ;
    }*/

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.anonymous()
                .and()
                .formLogin()
                .and()
                .authorizeRequests().mvcMatchers(HttpMethod.GET, "/api/**").anonymous()
                .anyRequest().anonymous();

        http.cors()
                .and()
                .csrf().disable();
    }
}
