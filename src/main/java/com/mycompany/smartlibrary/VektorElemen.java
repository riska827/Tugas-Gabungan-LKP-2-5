/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartlibrary;

/**
 *
 * @author Riska Febriani
 */
public class VektorElemen extends AssetDesain {
    private String formatFile;

    public VektorElemen(String kodeAsset, String namaAsset, int tingkatKreatif, String formatFile) {
        super(kodeAsset, namaAsset, tingkatKreatif);
        this.formatFile = formatFile;
    }

    public String getFormatFile() {
        return this.formatFile;
    }

    @Override
    public void tampilkanInfo() {
        System.out.printf("[Vektor] Kode: %-8s | Nama: %-25s | Level: %d | Format: %s\n", 
                this.kodeAsset, this.namaAsset, this.tingkatKreatif, this.formatFile);
    }

    @Override
    public void caraPenggunaan() {
        System.out.println(" > Info Penggunaan: Diimpor ke Canva / Illustrator sebagai elemen ilustrasi scalable.");
    }
}
