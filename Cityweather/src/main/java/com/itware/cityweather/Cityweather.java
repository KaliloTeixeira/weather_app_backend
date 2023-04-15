/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itware.cityweather;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kalil
 */
@Entity
@Table(name = "cityweather")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cityweather.findAll", query = "SELECT c FROM Cityweather c"),
    @NamedQuery(name = "Cityweather.findById", query = "SELECT c FROM Cityweather c WHERE c.id = :id"),
    @NamedQuery(name = "Cityweather.findByCityname", query = "SELECT c FROM Cityweather c WHERE c.cityname = :cityname"),
    @NamedQuery(name = "Cityweather.findByTemperature", query = "SELECT c FROM Cityweather c WHERE c.temperature = :temperature"),
    @NamedQuery(name = "Cityweather.findByTime", query = "SELECT c FROM Cityweather c WHERE c.time = :time")})
public class Cityweather implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "cityname")
    private String cityname;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "temperature")
    private Double temperature;
    @Column(name = "time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;

    public Cityweather() {
    }

    public Cityweather(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cityweather)) {
            return false;
        }
        Cityweather other = (Cityweather) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.itware.cityweather.Cityweather[ id=" + id + " ]";
    }
    
}
