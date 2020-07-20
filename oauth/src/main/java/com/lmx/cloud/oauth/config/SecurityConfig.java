package com.lmx.cloud.oauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author: lmx
 * @create: 2020/7/19
 **/
@Configuration
@EnableWebSecurity  //启用 spring securty
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 定义用户信息服务
     * 密码编码器
     * 安全机智拦截
     * @return
     */

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    /**
//     * 配置基于内存的用户密码 ，后期也可以改成 userservicedetailimpal 来实现基于数据库查询 或者其他接口查询
//     *
//     * @param auth
//     * @throws Exception
//     */
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("admin")
//                .roles("admin")
//                .password(passwordEncoder().encode("123456"))
//
//                .and()
//
//                .withUser("lisi")
//                .roles("user")
//                .password(passwordEncoder().encode("123456"))
//        ;
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable() // 关掉 csrf限制
                .authorizeRequests()
                .antMatchers("/hello/**").authenticated()  //hello 下面都需要验证
                .anyRequest().permitAll()  //其他接口都放权
                .and()
                .formLogin()//允许form表单
                .successForwardUrl("/login-sucess");// 自定义 登录后的地址
    }



}
