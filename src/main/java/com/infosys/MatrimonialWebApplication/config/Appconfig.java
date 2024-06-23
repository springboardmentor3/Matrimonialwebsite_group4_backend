//package com.infosys.MatrimonialWebApplication.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
////import org.springframework.security.authentication.AuthenticationManager;
////import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
////import org.springframework.security.core.userdetails.User;
////import org.springframework.security.core.userdetails.UserDetails;
////import org.springframework.security.core.userdetails.UserDetailsService;
////import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
////import org.springframework.security.crypto.password.PasswordEncoder;
////import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@Configuration
//public class Appconfig {
//
////    @Bean
////    public UserDetailsService userDetailsService(){
////      UserDetails user =  User.builder().username("ganeshamkaremore@gmail.com").password(passwordEncoder().encode("Karemore@123")).roles("ADMIN").build();
////      UserDetails user1 = User.builder().username("subhash.ghanshyam21@vit.edu").password(passwordEncoder().encode("Ghanesh@123")).roles("ADMIN").build();
////        return new InMemoryUserDetailsManager(user,user1);
////    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//
//}
