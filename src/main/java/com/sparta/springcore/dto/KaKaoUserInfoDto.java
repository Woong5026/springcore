package com.sparta.springcore.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class KaKaoUserInfoDto {
    private Long id;
    private String nickname;
    private String email;
}
