package com.ageofsys.example.custommethod;

import lombok.Getter;
import lombok.Setter;

/**
 * @author YongSu Son
 * @since 1.0
 */
@Getter
@Setter
public class PersonDto {
    private String fullName;

    public PersonDto(String fullName) {
        this.fullName = fullName;
    }
}
