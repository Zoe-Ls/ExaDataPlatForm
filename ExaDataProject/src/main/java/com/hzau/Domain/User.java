package com.hzau.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String avatar;
    private String grade;
    private String major;
    private String bio;
    private Integer role;
    private Integer status;
    private LocalDateTime create_time;
    private LocalDateTime update_time;
}
