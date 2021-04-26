package ru.ds.education.currencyapi.core.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.ds.education.currencyapi.db.entity.enums.CursEnum;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class CursDataDto {

    @ApiModelProperty("Id записи")
    private long id;
    @ApiModelProperty("Тип валюты")
    private CursEnum currency;
    @ApiModelProperty("Курс валюты")
    private int curs;
    @ApiModelProperty("Дата курса валюты")
    private LocalDate cursDate;

}
