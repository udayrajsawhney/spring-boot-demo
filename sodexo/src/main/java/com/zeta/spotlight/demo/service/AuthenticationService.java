package com.zeta.spotlight.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private static final String JWT_SUPER_ADMIN_TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";

    public String getAdminToken() {
        return JWT_SUPER_ADMIN_TOKEN;
    }
}
