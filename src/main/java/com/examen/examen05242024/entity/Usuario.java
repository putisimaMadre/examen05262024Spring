package com.examen.examen05242024.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "usuario", schema = "ejercicio", catalog = "")
public class Usuario {
    @Id
    @Column(name = "login")
    private String login;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "cliente")
    private double cliente;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "fechaalta")
    private Date fechaalta;
    @Basic
    @Column(name = "fechabaja")
    private Date fechabaja;
    @Basic
    @Column(name = "status")
    private Character status;
    @Basic
    @Column(name = "intentos")
    private double intentos;
    @Basic
    @Column(name = "fecharevocado")
    private Date fecharevocado;
    @Basic
    @Column(name = "fecha_vigencia")
    private Date fechaVigencia;
    @Basic
    @Column(name = "no_acceso")
    private Integer noAcceso;
    @Basic
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    @Basic
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    @Basic
    @Column(name = "area")
    private Integer area;
    @Basic
    @Column(name = "fechamodificacion")
    private Date fechamodificacion;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCliente() {
        return cliente;
    }

    public void setCliente(double cliente) {
        this.cliente = cliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(Date fechaalta) {
        this.fechaalta = fechaalta;
    }

    public Date getFechabaja() {
        return fechabaja;
    }

    public void setFechabaja(Date fechabaja) {
        this.fechabaja = fechabaja;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public double getIntentos() {
        return intentos;
    }

    public void setIntentos(double intentos) {
        this.intentos = intentos;
    }

    public Date getFecharevocado() {
        return fecharevocado;
    }

    public void setFecharevocado(Date fecharevocado) {
        this.fecharevocado = fecharevocado;
    }

    public Date getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(Date fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public Integer getNoAcceso() {
        return noAcceso;
    }

    public void setNoAcceso(Integer noAcceso) {
        this.noAcceso = noAcceso;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Date getFechamodificacion() {
        return fechamodificacion;
    }

    public void setFechamodificacion(Date fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario that = (Usuario) o;
        return Double.compare(cliente, that.cliente) == 0 && Double.compare(intentos, that.intentos) == 0 && Objects.equals(login, that.login) && Objects.equals(password, that.password) && Objects.equals(nombre, that.nombre) && Objects.equals(email, that.email) && Objects.equals(fechaalta, that.fechaalta) && Objects.equals(fechabaja, that.fechabaja) && Objects.equals(status, that.status) && Objects.equals(fecharevocado, that.fecharevocado) && Objects.equals(fechaVigencia, that.fechaVigencia) && Objects.equals(noAcceso, that.noAcceso) && Objects.equals(apellidoPaterno, that.apellidoPaterno) && Objects.equals(apellidoMaterno, that.apellidoMaterno) && Objects.equals(area, that.area) && Objects.equals(fechamodificacion, that.fechamodificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, nombre, cliente, email, fechaalta, fechabaja, status, intentos, fecharevocado, fechaVigencia, noAcceso, apellidoPaterno, apellidoMaterno, area, fechamodificacion);
    }
}
