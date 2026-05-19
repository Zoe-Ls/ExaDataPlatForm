package com.hzau.Domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Announcement {
    private Integer id;
    private String title;
    private String content;
    private Integer is_top;
    private Integer status;
    private Integer publisher_id;
    private LocalDateTime publish_time;
}
