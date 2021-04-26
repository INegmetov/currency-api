package ru.ds.education.currencyapi.api.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ds.education.currencyapi.core.model.CursDataDto;
import ru.ds.education.currencyapi.core.service.CursDataService;

@RestController
@RequestMapping("/api/curs")
public class CursDataController {

    @Autowired
    private CursDataService cursDataService;

    @ApiOperation(
            value = "Добавление нового значения курса валюты"
    )
    @PostMapping
    public CursDataDto addCursData (@RequestBody CursDataDto cursData){
        return cursDataService.addCurs(cursData);
    }

    @ApiOperation(
            value = "Получение курса валюты по id"
    )
    @RequestMapping(value ={"{id}"}, method = RequestMethod.GET)
    public CursDataDto getCurs ( @PathVariable("id") Long id){
        return cursDataService.getCurs(id);
    }

}
