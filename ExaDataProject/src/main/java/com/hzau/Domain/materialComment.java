package com.hzau.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class materialComment {
    private Integer id;
    private Integer material_id;
    private Integer user_id;
    private Integer parent_id;
    private String content;
    private Integer like_count;
    private Integer status;
    private LocalDateTime create_time;
}
