package com.hzau.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class materialLike {
    private Integer id;
    private Integer material_id;
    private Integer user_id;
    private Integer type;
    private Integer status;
    private LocalDateTime create_time;
}
