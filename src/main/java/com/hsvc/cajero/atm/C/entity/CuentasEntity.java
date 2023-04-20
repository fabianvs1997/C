package com.hsvc.cajero.atm.C.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "cuentas")
@Data
public class CuentasEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idC;

    @Column(name = "numero_cuenta")
    private String numero_cuenta;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "nip")
    private int nip;




}
