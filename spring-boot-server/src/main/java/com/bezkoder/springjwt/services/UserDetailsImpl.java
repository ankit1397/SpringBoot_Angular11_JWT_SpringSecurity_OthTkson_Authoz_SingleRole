/*
 * package com.bezkoder.springjwt.services;
 * 
 * import java.util.Collection; import java.util.Collections; import
 * java.util.Objects; import org.springframework.security.core.GrantedAuthority;
 * import org.springframework.security.core.authority.SimpleGrantedAuthority;
 * import org.springframework.security.core.userdetails.UserDetails; import
 * com.bezkoder.springjwt.models.CustomUser; import
 * com.fasterxml.jackson.annotation.JsonIgnore;
 * 
 * public class UserDetailsImpl implements UserDetails { private static final
 * long serialVersionUID = 1L;
 * 
 * private Long id;
 * 
 * private String username;
 * 
 * private String email;
 * 
 * @JsonIgnore private String password;
 * 
 * private CustomUser user;
 * 
 * public UserDetailsImpl() { super(); }
 * 
 * public UserDetailsImpl(CustomUser user) { super(); this.setUser(user); }
 * 
 * public UserDetailsImpl(String username, String password) {
 * this.username=username; this.password=password; }
 * 
 * @Override public Collection<? extends GrantedAuthority> getAuthorities() {
 * return Collections.singleton(new SimpleGrantedAuthority("ROLE_USER")); }
 * 
 * public Long getId() { return id; }
 * 
 * public String getEmail() { return email; }
 * 
 * @Override public String getPassword() { return password; }
 * 
 * @Override public String getUsername() { return username; }
 * 
 * @Override public boolean isAccountNonExpired() { return true; }
 * 
 * @Override public boolean isAccountNonLocked() { return true; }
 * 
 * @Override public boolean isCredentialsNonExpired() { return true; }
 * 
 * @Override public boolean isEnabled() { return true; }
 * 
 * @Override public boolean equals(Object o) { if (this == o) return true; if (o
 * == null || getClass() != o.getClass()) return false; UserDetailsImpl user =
 * (UserDetailsImpl) o; return Objects.equals(id, user.id); }
 * 
 * public CustomUser getUser() { return user; }
 * 
 * public void setUser(CustomUser user) { this.user = user; } }
 */