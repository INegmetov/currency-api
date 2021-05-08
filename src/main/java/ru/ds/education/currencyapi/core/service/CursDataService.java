package ru.ds.education.currencyapi.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ds.education.currencyapi.core.mapper.CursDataMapper;
import ru.ds.education.currencyapi.core.model.CursDataDto;
import ru.ds.education.currencyapi.db.entity.CursDataEntity;
import ru.ds.education.currencyapi.db.entity.enums.CursEnum;
import ru.ds.education.currencyapi.db.repository.CursRepository;

import java.time.LocalDate;

@Service
public class CursDataService {

    @Autowired
    private CursRepository cursRepository;

    @Autowired
    private CursDataMapper cursDataMapper;

    public CursDataDto addCurs(CursDataDto cursDataDto) {
        CursDataEntity newCurs = cursDataMapper.map(cursDataDto, CursDataEntity.class);
        newCurs = cursRepository.save(newCurs);
        cursDataDto = cursDataMapper.map(newCurs, CursDataDto.class);
        return cursDataDto;
    }

    public CursDataDto getCurs(Long id){
        CursDataEntity cursDataEntity = cursRepository.getOne(id);
        return cursDataMapper.map(cursDataEntity, CursDataDto.class);
    }

    public void deleteById(Long id){
        cursRepository.deleteById(id);
    }

    public CursDataDto updateCurs(Long id, CursDataDto cursDataDto){

        CursDataEntity newCursDataEntity = cursRepository.getOne(id);

        newCursDataEntity.setCurs(cursDataDto.getCurs());
        newCursDataEntity.setCursDate(cursDataDto.getCursDate());
        newCursDataEntity.setCurrency(cursDataDto.getCurrency());

        newCursDataEntity = cursRepository.save(newCursDataEntity);

        cursDataDto = cursDataMapper.map(newCursDataEntity, CursDataDto.class);

        return cursDataDto;
    }

    public CursDataDto getByCurrencyAndDate (CursEnum cursEnum, LocalDate localDate){
        CursDataEntity cursDataEntity = cursRepository.getByCurrencyAndDate(cursEnum, localDate);

        return  cursDataMapper.map(cursDataEntity, CursDataDto.class);

    }

}
