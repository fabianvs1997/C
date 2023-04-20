package com.hsvc.cajero.atm.C.repository;

import com.hsvc.cajero.atm.C.entity.CuentasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentasRepository extends JpaRepository<CuentasEntity, Integer> {

    @Query(value = "SELECT * FROM cuentas WHERE numero_cuenta= ?1", nativeQuery = true)
    CuentasEntity findByNumeroCuenta(String num);


}
