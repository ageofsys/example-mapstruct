package com.ageofsys.example.nestedbean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author YongSu Son
 * @since 1.0
 */
@Getter
@Setter
@AllArgsConstructor
public class RecordDto {
    private Long id;
    private String name;
    private Integer age;
}
