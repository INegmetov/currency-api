package ru.ds.education.currencyapi.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ds.education.currencyapi.db.entity.CursDataEntity;

public interface CursRepository extends JpaRepository<CursDataEntity, Long> {
}
