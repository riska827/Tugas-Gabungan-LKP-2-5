/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartlibrary;

/**
 *
 * @author Riska Febriani
 */
public class FotoPalette extends AssetDesain {
    private int resolusiDPI;

    public FotoPalette(String kodeAsset, String namaAsset, int tingkatKreatif, int resolusiDPI) {
        super(kodeAsset, namaAsset, tingkatKreatif);
        this.resolusiDPI = resolusiDPI;
    }

    public int getResolusiDPI() {
        return this.resolusiDPI;
    }

    @Override
    public void tampilkanInfo() {
        System.out.printf("[Foto/Palette] Kode: %-8s | Nama: %-25s | Level: %d | Resolusi: %d DPI\n", 
                this.kodeAsset, this.namaAsset, this.tingkatKreatif, this.resolusiDPI);
    }

    @Override
    public void caraPenggunaan() {
        System.out.println(" > Info Penggunaan: Digunakan sebagai gambar latar atau referensi moodboard visual.");
    }
}
