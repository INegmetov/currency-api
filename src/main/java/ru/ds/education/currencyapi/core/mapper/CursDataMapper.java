package ru.ds.education.currencyapi.core.mapper;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.builtin.PassThroughConverter;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;
import ru.ds.education.currencyapi.core.model.CursDataDto;
import ru.ds.education.currencyapi.db.entity.CursDataEntity;

import java.time.LocalDate;

@Component
public class CursDataMapper extends ConfigurableMapper {

    @Override
    protected void configure(MapperFactory factory) {
        factory.classMap(CursDataEntity.class, CursDataDto.class)
        .byDefault()
        .register();
        factory.getConverterFactory()
                .registerConverter(new PassThroughConverter(LocalDate.class));
    }
}
