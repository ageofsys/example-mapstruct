package com.ageofsys.example.usingconstructor;

import lombok.Getter;

/**
 * @author YongSu Son
 * @since 1.0
 */
@Getter
public class Van {
    private String make;
    private String color;

    // 아래 생성자가 주석처리 되지 않으면 컴파일 오류가 발생한다.
    // 두 생성자 중 어떤걸 이용해야 할 지 알수 없기 때문이다.
    // public Van(String make) {
    //     this.make = make;
    //     this.color = "red";
    // }

    public Van(String make, String color) {
        this.make = make;
        this.color = color;
    }
}
