package com.hsvc.cajero.atm.C.service;

import com.hsvc.cajero.atm.C.entity.CuentasEntity;

public interface ICuentasService {

    CuentasEntity getCuentasFindByAcount(String cuenta);
}
