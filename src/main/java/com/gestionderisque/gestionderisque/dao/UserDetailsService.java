package com.gestionderisque.gestionderisque.dao;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserDetailsService {
	UserDetails loadUserByUsername(String username);
}
