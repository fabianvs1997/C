package com.hsvc.cajero.atm.C.service.implement;

import com.hsvc.cajero.atm.C.entity.CuentasEntity;
import com.hsvc.cajero.atm.C.repository.CuentasRepository;
import com.hsvc.cajero.atm.C.service.ICuentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuentasServiceImplent implements ICuentasService {

    @Autowired
    private CuentasRepository dispensador;


    @Override
    public CuentasEntity getCuentasFindByAcount(String cuenta) {
        return this.dispensador.findByNumeroCuenta(cuenta);
    }
}
