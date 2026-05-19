package com.hzau.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Material {
    private Integer id;
    private Integer user_id;
    private Integer category_id;
    private String title;
    private String description;
    private String file_url;
    private String file_type;
    private String cover_image;
    private Integer download_count;
    private Integer view_count;
    private Integer like_count;
    private Integer comment_count;
    private Integer status;
    private LocalDateTime create_time;
    private LocalDateTime update_time;
}
