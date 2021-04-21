package ru.ds.education.currencycbradapter.core.model;

import ru.ds.education.currencycbradapter.db.entity.enums.CursEnum;

import javax.persistence.*;
import java.util.Date;

public class CursDataDto {

    private long id;
    private CursEnum currency;
    private int curs;
    private Date cursDate;

    public CursDataDto(long id, CursEnum currency, int curs, Date cursDate) {
        this.id = id;
        this.currency = currency;
        this.curs = curs;
        this.cursDate = cursDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CursEnum getCurrency() {
        return currency;
    }

    public void setCurrency(CursEnum currency) {
        this.currency = currency;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public Date getCursDate() {
        return cursDate;
    }

    public void setCursDate(Date cursDate) {
        this.cursDate = cursDate;
    }
}
