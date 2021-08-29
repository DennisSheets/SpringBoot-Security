package com.example.demo.Auth;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

import java.util.List;

public class ApplicationUser extends JdbcDaoImpl {

    private final String password;
    private final String username;
    private final List<? extends GrantedAuthority> grantedAuthorities;
    private final Boolean isAccountNonExpired;
    private final Boolean isAccountNonLocked;
    private final Boolean isCredentialNonExpired;
    private final Boolean isEnabled;

    public ApplicationUser(String password,
                           String username,
                           List<? extends GrantedAuthority> grantedAuthorities,
                           Boolean isAccountNonExpired,
                           Boolean isAccountNonLocked,
                           Boolean isCredentialNonExpired,
                           Boolean isEnabled) {
        this.grantedAuthorities = grantedAuthorities;
        this.password = password;
        this.username = username;
        this.isAccountNonExpired = isAccountNonExpired;
        this.isAccountNonLocked = isAccountNonLocked;
        this.isCredentialNonExpired = isCredentialNonExpired;
        this.isEnabled = isEnabled;
    }

    public List<? extends GrantedAuthority> getGrantedAuthorities() {
        return grantedAuthorities;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public Boolean getAccountNonExpired() {
        return isAccountNonExpired;
    }

    public Boolean getAccountNonLocked() {
        return isAccountNonLocked;
    }

    public Boolean getCredentialNonExpired() {
        return isCredentialNonExpired;
    }

    public Boolean getEnabled() {
        return isEnabled;
    }
}
