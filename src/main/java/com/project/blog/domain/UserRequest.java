package com.project.blog.domain;
import java.util.Objects;

public record UserRequest(String name, String password) {
    public UserRequest {
        Objects.requireNonNull(name, "name cannot be null");
        Objects.requireNonNull(password, "password cannot be null");
    }
}
