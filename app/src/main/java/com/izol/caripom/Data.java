package com.izol.caripom;

import com.google.firebase.database.IgnoreExtraProperties;
import java.io.Serializable;
import com.izol.caripom.Data;

/**
 * Created by IZOL on 3/16/2019.
 */
@IgnoreExtraProperties
public class Data implements Serializable{

    private String nama;
    private String jenis;
    private String jam;
    private String pertamax;
    private String pertalite;
    private String solar;


    public void Data(){

    }

    public Data (String nama, String jenis, String jam, String pertamax, String pertalite, String solar) {
        this.nama = nama;
        this.jenis = jenis;
        this.jam = jam;
        this.pertamax = pertamax;
        this.pertalite = pertalite;
        this.solar = solar;
    }

    public String getNama() {return nama; }
    public void setNama (String nama) {this.nama = nama; }
    public String getJenis() {return jenis; }
    public void setJenis (String jenis) {this.jenis = jenis; }
    public String getJam() {return jam; }
    public void setJam (String jam) {this.jam = jam; }
    public String getPertamax() {return pertamax; }
    public void setPertamax (String pertamax) {this.pertamax = pertamax; }
    public String getpertalite() {return pertalite; }
    public void setpertalite (String pertalite) {this.pertalite = pertalite; }
    public String getSolar() {return solar; }
    public void setSolar (String solar) {this.solar = solar; }

    @Override
    public String toString(){
        return " "+nama+"\n" +
                " "+jenis+
                " "+jam+
                " "+pertamax+
                " "+pertalite+
                " "+solar ;
    }
}