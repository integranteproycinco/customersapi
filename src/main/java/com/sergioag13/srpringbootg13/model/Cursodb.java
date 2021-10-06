/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergioag13.srpringbootg13.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author desaextremo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="curso")
public class Cursodb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cur_id")
    private int id;
    @Column(name="cur_nombre", nullable = false, length = 100)
    private String nombre;
    @Column(name="cur_descripcion",nullable = false, columnDefinition = "Text")
    private String descripcion;
     @Column(name="cur_temario",nullable = false, columnDefinition = "Text")
    private String temario;
}
