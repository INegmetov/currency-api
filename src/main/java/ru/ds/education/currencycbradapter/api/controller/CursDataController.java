package ru.ds.education.currencycbradapter.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ds.education.currencycbradapter.core.model.CursDataDto;
import ru.ds.education.currencycbradapter.core.service.CursDataService;

@RestController
@RequestMapping("/api/curs")
public class CursDataController {

    @Autowired
    private CursDataService cursDataService;

    @PostMapping
    public CursDataDto addCursData (@RequestBody CursDataDto cursData){
        return cursDataService.addCurs(cursData);
    }

}
