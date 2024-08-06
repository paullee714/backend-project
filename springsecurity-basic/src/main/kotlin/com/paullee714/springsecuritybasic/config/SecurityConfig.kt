package com.paullee714.springsecuritybasic.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.password.NoOpPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.provisioning.InMemoryUserDetailsManager
import org.springframework.security.web.SecurityFilterChain

@Configuration
class SecurityConfig {

    @Bean
    fun userDetailService(): UserDetailsService {
        val inMemoryUserDetailManager =  InMemoryUserDetailsManager()
        val me: UserDetails = User.builder().username("paul").password("1234").build()
        inMemoryUserDetailManager.createUser(me)
        return inMemoryUserDetailManager
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return NoOpPasswordEncoder.getInstance()
    }

    @Bean
    fun securityFilterChain(httpSecurity: HttpSecurity) : SecurityFilterChain {
        httpSecurity.authorizeRequests { authorizeRequests ->
            authorizeRequests.anyRequest().authenticated()
        }
        return httpSecurity.build()
    }
}