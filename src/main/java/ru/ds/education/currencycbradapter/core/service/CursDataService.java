package ru.ds.education.currencycbradapter.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ds.education.currencycbradapter.core.model.CursDataDto;
import ru.ds.education.currencycbradapter.db.repository.CursRepository;

@Service
public class CursDataService {

    @Autowired
    private CursRepository cursRepository;

    public CursDataDto addCurs(CursDataDto cursDataDto) {
        ru.ds.education.currencycbradapter.db.entity.CursData newCurs =
                new ru.ds.education.currencycbradapter.db.entity.CursData(
                        cursDataDto.getCurrency(), cursDataDto.getCurs(),cursDataDto.getCursDate()
                );
        newCurs = cursRepository.save(newCurs);
        cursDataDto.setId(newCurs.getId());
        return cursDataDto;
    }
}
