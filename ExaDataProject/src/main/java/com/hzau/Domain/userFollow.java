package com.hzau.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class userFollow {
    private Integer id;
    private Integer follower_id;
    private Integer following_id;
    private Integer status;
    private LocalDateTime create_time;
}
