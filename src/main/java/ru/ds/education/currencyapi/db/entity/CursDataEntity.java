package ru.ds.education.currencyapi.db.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.ds.education.currencyapi.db.entity.enums.CursEnum;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "curs_data")
public class CursDataEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    @Enumerated(EnumType.STRING)
    private CursEnum currency;

    @Column
    private int curs;

    @Column
    private LocalDate cursDate;

}
