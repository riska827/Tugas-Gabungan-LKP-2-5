/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartlibrary;

/**
 *
 * @author Riska Febriani
 */
public class AssetDesain {
    
    protected String kodeAsset;
    protected String namaAsset;
    protected int tingkatKreatif;

    public static int totalAssetBerhasilDibuat = 0;

    public AssetDesain(String kodeAsset, String namaAsset, int tingkatKreatif) {
        this.kodeAsset = kodeAsset;
        this.namaAsset = namaAsset;
        this.tingkatKreatif = tingkatKreatif;
        totalAssetBerhasilDibuat++;
    }

    public String getKodeAsset() { 
        return this.kodeAsset; 
    }

    public String getNamaAsset() { 
        return this.namaAsset; 
    }

    public int getTingkatKreatif() { 
        return this.tingkatKreatif; 
    }

    public void setTingkatKreatif(int tingkatKreatif) {
        if (tingkatKreatif >= 1 && tingkatKreatif <= 5) {
            this.tingkatKreatif = tingkatKreatif;
        } else {
            this.tingkatKreatif = 1;
        }
    }

    public void tampilkanInfo() {
        System.out.printf("Kode: %-8s | Nama: %-25s | Level: %d", 
                this.kodeAsset, this.namaAsset, this.tingkatKreatif);
    }

    public void caraPenggunaan() {
        System.out.println("Aset digunakan secara umum untuk proyek desain visual.");
    }
}
