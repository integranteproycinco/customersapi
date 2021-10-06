/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergioag13.srpringbootg13.model;

import javax.xml.bind.annotation.XmlRootElement;
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
@XmlRootElement
public class Curso {
    private int id;
    private String nombre;
    private String descripcion;
    private String temario;
    
}
