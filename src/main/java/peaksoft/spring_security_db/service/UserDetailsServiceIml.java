package peaksoft.spring_security_db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import peaksoft.spring_security_db.entity.MyUser;
import peaksoft.spring_security_db.entity.User;
import peaksoft.spring_security_db.repository.UserRepository;

public class UserDetailsServiceIml implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User  user= repository.getUserByUsername(username);
        if (user==null){
            throw new UsernameNotFoundException("could not find user");
        }

        return new MyUser(user);
    }
}
