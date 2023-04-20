package com.hsvc.cajero.atm.C.controller;

import com.hsvc.cajero.atm.C.service.ICuentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CuentasController {


    @Autowired
    private ICuentasService service;


    @GetMapping("/cuenta")
    public ResponseEntity<?>getCuenta(@RequestParam("cuenta")String cuenta){
        return new ResponseEntity<>(this.service.getCuentasFindByAcount(cuenta), HttpStatus.OK);
    }
}
