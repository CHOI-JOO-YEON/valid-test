package com.joo.validtest.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.List;

@Data
public class RequestDto {

    @NotNull(message = "id는 Null일 수 없습니다.")
    private Integer id;

    @NotBlank(message = "이름은 비어있을 수 없습니다.")
    @Size(min = 1,max = 5,message = "이름은 1~5글자여야 합니다.")
    @Pattern(regexp = "^[가-힣]+$",message = "이름은 한글이어야 합니다.")
    private String firstName;

    @NotEmpty
    private String notEmptyString;

    @NotEmpty(message = "좋아하는 음식은 하나 이상이어야 합니다.")
    private List<String> favoriteFoods;

    @Min(value = 18 ,message = "18세 미만은 사용할 수 없습니다.")
    private Integer age;

    @Max(value = 250,message = "키는 250 이상일 수 없습니다.")
    @Positive(message = "키는 음수거나 0일 수 없습니다.")
    private Float height;

    @Max(value = 100, message = "점수는 100을 넘을 수 없습니다.")
    @PositiveOrZero(message = "점수는 음수일 수 없습니다.")
    private Integer score;

    @Min(value = -100,message = "역점수는 -100보다 작을 수 없습니다.")
    @NegativeOrZero(message = "역점수는 양수일 수 없습니다.")
    private Integer reverseScore;


    @Email(message = "이메일 형식을 확인해주십시오.")
    private String email;

}
