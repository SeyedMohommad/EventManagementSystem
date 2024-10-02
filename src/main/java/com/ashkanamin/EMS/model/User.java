package com.ashkanamin.EMS.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public User() {
    }

    public User(long id, String username, String password, Set<Role> roles, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.email = email;
    }

    @NotBlank(message = "Username is required")
    private String username;

    @NotBlank(message = "Password is required")
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles;


    public Set<Role> getRoles() {
        return roles;
    }

    public User setRoles(Set<Role> roles) {
        this.roles = roles;
        return this;
    }

    public @Email String getEmail() {
        return email;
    }

    public User setEmail(@Email String email) {
        this.email = email;
        return this;
    }

    public @NotBlank(message = "Password is required") String getPassword() {
        return password;
    }

    public User setPassword(@NotBlank(message = "Password is required") String password) {
        this.password = password;
        return this;
    }

    public @NotBlank(message = "Username is required") String getUsername() {
        return username;
    }

    public User setUsername(@NotBlank(message = "Username is required") String username) {
        this.username = username;
        return this;
    }

    public long getId() {
        return id;
    }

    public User setId(long id) {
        this.id = id;
        return this;
    }

    @Email
    private String email;
}
