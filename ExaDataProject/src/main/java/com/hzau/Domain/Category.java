package com.hzau.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private Integer id;
    private String name;
    private String description;
    private Integer sort_order;
    private Integer status;
    private LocalDateTime create_time;
    private LocalDateTime update_time;
}
