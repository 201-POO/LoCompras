/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import java.util.Date;

/**
 *
 * @author Asullom
 */
public class CajaAperCierre {

    private int id;
    private Date fecha;
    private int esaper;
    private double saldo_do;
    private double saldo_so;
    private double saldo_do_bancos;
    private double saldo_so_bancos;
    private double gramos;
    
    private int user;
    private Date date_created;
    private Date last_updated;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getEsaper() {
        return esaper;
    }

    public void setEsaper(int esaper) {
        this.esaper = esaper;
    }

    public double getSaldo_do() {
        return saldo_do;
    }

    public void setSaldo_do(double saldo_do) {
        this.saldo_do = saldo_do;
    }

    public double getSaldo_so() {
        return saldo_so;
    }

    public void setSaldo_so(double saldo_so) {
        this.saldo_so = saldo_so;
    }

    public double getSaldo_do_bancos() {
        return saldo_do_bancos;
    }

    public void setSaldo_do_bancos(double saldo_do_bancos) {
        this.saldo_do_bancos = saldo_do_bancos;
    }

    public double getSaldo_so_bancos() {
        return saldo_so_bancos;
    }

    public void setSaldo_so_bancos(double saldo_so_bancos) {
        this.saldo_so_bancos = saldo_so_bancos;
    }

    public double getGramos() {
        return gramos;
    }

    public void setGramos(double gramos) {
        this.gramos = gramos;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Date getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Date last_updated) {
        this.last_updated = last_updated;
    }

    
    
}
