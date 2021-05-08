package ru.ds.education.currencyapi.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.ds.education.currencyapi.db.entity.CursDataEntity;
import ru.ds.education.currencyapi.db.entity.enums.CursEnum;

import java.time.LocalDate;

public interface CursRepository extends JpaRepository<CursDataEntity, Long> {

    @Query( value ="SELECT cd FROM CursDataEntity cd WHERE cd.currency = :cursEnum AND cd.cursDate = :localDate")
    CursDataEntity getByCurrencyAndDate(@Param("cursEnum") CursEnum cursEnum, @Param("localDate") LocalDate localDate);
}
