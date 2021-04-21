package ru.ds.education.currencycbradapter.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ds.education.currencycbradapter.db.entity.CursData;

public interface CursRepository extends JpaRepository<CursData, Long> {
}
