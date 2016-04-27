package com.master.roleup.service;


import com.master.roleup.dao.interfaces.UserDao;
import com.master.roleup.model.TRoles;
import com.master.roleup.model.TUsers;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        TUsers user = userDao.findByUserName(username);
        List<GrantedAuthority> authorities = buildUserAuthority(user.getTRoles());

        return buildUserForAuthentication(user, authorities);
    }

    private User buildUserForAuthentication(TUsers user,
            List<GrantedAuthority> authorities) {
        return new User(user.getVlogin(),
                user.getVpasswordhash(), true,
                true, true, true, authorities);
    }

    private List<GrantedAuthority> buildUserAuthority(TRoles userRole) {

        Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
		// Build user's authorities
        setAuths.add(new SimpleGrantedAuthority(userRole.getVname()));
        List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);

        return Result;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
