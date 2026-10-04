/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartlibrary;

import java.util.Scanner;

public class SmartLibrary {
    
    public static void cariKoleksi(String nama, AssetDesain[] daftarKoleksi, int jumlahKoleksi) {
        System.out.println("Mencari asset dengan Nama: " + nama);
        boolean ditemukan = false;
        for (int i = 0; i < jumlahKoleksi; i++) {
            if (daftarKoleksi[i].getNamaAsset().equalsIgnoreCase(nama)) {
                System.out.print(" Ditemukan: ");
                daftarKoleksi[i].tampilkanInfo();
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Asset tidak ditemukan.");
    }

    public static void cariKoleksi(int level, AssetDesain[] daftarKoleksi, int jumlahKoleksi) {
        System.out.println("Mencari asset dengan Level Kreatif: " + level);
        boolean ditemukan = false;
        for (int i = 0; i < jumlahKoleksi; i++) {
            if (daftarKoleksi[i].getTingkatKreatif() == level) {
                System.out.print(" Ditemukan: ");
                daftarKoleksi[i].tampilkanInfo();
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Asset tidak ditemukan.");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            AssetDesain[] daftarKoleksi = new AssetDesain[10];
            int jumlahKoleksi = 0;

            daftarKoleksi[jumlahKoleksi++] = new VektorElemen("AST01", "Minimalist Border", 3, "SVG");
            daftarKoleksi[jumlahKoleksi++] = new FotoPalette("AST02", "Editorial Moodboard", 5, 300);
            daftarKoleksi[jumlahKoleksi++] = new VektorElemen("AST03", "Typography Sticker", 2, "PNG");

            boolean isRunning = true;

            System.out.println("=============================================");
            System.out.println("     DESIGN ASSET MANAGER - STUDIO UNILA     ");
            System.out.println("=============================================");

            while (isRunning) {
                System.out.println("\nMenu Utama:");
                System.out.println("1. Tambah Asset Desain");
                System.out.println("2. Lihat Daftar Asset");
                System.out.println("3. Cari Asset");
                System.out.println("4. Keluar");
                System.out.print("Pilih Menu: 1-4: ");

                int pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1:
                        if (jumlahKoleksi < daftarKoleksi.length) {
                            System.out.println("\n--- Pilih Jenis Asset ---");
                            System.out.println("1. Elemen Vektor");
                            System.out.println("2. Foto & Palette Warna");
                            System.out.print("Pilihan (1/2): ");
                            int jenis = scanner.nextInt();
                            scanner.nextLine();

                            System.out.print("Masukkan Kode Asset  : ");
                            String kodeBaru = scanner.nextLine();
                            System.out.print("Masukkan Nama Asset  : ");
                            String namaBaru = scanner.nextLine();
                            System.out.print("Masukkan Level (1-5) : ");
                            int levelBaru = scanner.nextInt();
                            scanner.nextLine();

                            if (jenis == 1) {
                                System.out.print("Masukkan Format File (SVG/PNG/AI): ");
                                String format = scanner.nextLine();
                                daftarKoleksi[jumlahKoleksi] = new VektorElemen(kodeBaru, namaBaru, levelBaru, format);
                            } else if (jenis == 2) {
                                System.out.print("Masukkan Resolusi (DPI): ");
                                int dpi = scanner.nextInt();
                                scanner.nextLine();
                                daftarKoleksi[jumlahKoleksi] = new FotoPalette(kodeBaru, namaBaru, levelBaru, dpi);
                            }

                            jumlahKoleksi++;
                            System.out.println("Sukses! Asset berhasil ditambahkan.");
                        } else {
                            System.out.println("Maaf, kapasitas penyimpanan asset penuh!");
                        }
                        break;

                    case 2:
                        System.out.println("\n--- Daftar Asset Desain di Studio ---");
                        if (jumlahKoleksi == 0) {
                            System.out.println("Belum ada asset yang tersimpan.");
                        } else {
                            for (int i = 0; i < jumlahKoleksi; i++) {
                                System.out.print((i + 1) + ". ");
                                daftarKoleksi[i].tampilkanInfo();
                                daftarKoleksi[i].caraPenggunaan();
                                System.out.println();
                            }
                            System.out.println("** Total Item Studio: " + AssetDesain.totalAssetBerhasilDibuat + " **");
                        }
                        System.out.print("Tekan Enter untuk melanjutkan...");
                        scanner.nextLine();
                        break;

                    case 3:
                        System.out.println("\n--- Cari Asset ---");
                        System.out.println("1. Cari berdasarkan Nama");
                        System.out.println("2. Cari berdasarkan Level");
                        System.out.print("Pilih opsi (1/2): ");
                        int cariOpsi = scanner.nextInt();
                        scanner.nextLine();

                        if (cariOpsi == 1) {
                            System.out.print("Masukkan Nama Asset: ");
                            String qNama = scanner.nextLine();
                            cariKoleksi(qNama, daftarKoleksi, jumlahKoleksi);
                        } else if (cariOpsi == 2) {
                            System.out.print("Masukkan Level Kreatif: ");
                            int qLvl = scanner.nextInt();
                            scanner.nextLine();
                            cariKoleksi(qLvl, daftarKoleksi, jumlahKoleksi);
                        }
                        System.out.print("Tekan Enter untuk melanjutkan...");
                        scanner.nextLine();
                        break;

                    case 4:
                        isRunning = false;
                        System.out.println("\nTerima kasih! Program selesai.");
                        break;

                    default:
                        System.out.println("Pilihan tidak valid, silakan pilih 1-4.");
                }
            }
        }
    }
}
