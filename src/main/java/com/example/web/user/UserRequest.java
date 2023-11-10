package com.example.web.user;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

public class UserRequest {
    @Data
    public static class JoinDTO {

        @Size(min = 3, max = 20)
        @NotEmpty // 널과 공백이안됨
        private String username;

        @Size(min = 3, max = 20)
        @NotEmpty // 널과 공백이안됨
        private String password;

        @Size(min = 3, max = 100)
        @NotEmpty // 널과 공백이안됨
        private String email;

        public User toEntity() { // 디비에 인서트할때만
            return User.builder()
                    .username(username)
                    .password(password)
                    .email(email)
                    .build();
        }
    }

    @Data
    public static class LoginDTO {

        @Size(min = 3, max = 20)
        @NotEmpty // 널과 공백이안됨
        private String username;

        @Size(min = 3, max = 20)
        @NotEmpty // 널과 공백이안됨
        private String password;

        @Size(min = 3, max = 100)
        @NotEmpty // 널과 공백이안됨
        private String email;
    }
    @Data
    public static class Use_infoDTO {

        @Size(min = 3, max = 20)
        @NotEmpty // 널과 공백이안됨
        private String username;

        @Size(min = 3, max = 20)
        @NotEmpty // 널과 공백이안됨
        private String password;

        @Size(min = 3, max = 100)
        @NotEmpty // 널과 공백이안됨
        private String email;
    }

}
