/**
 * @author NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: program data gaji karyawan
 * berbasis OOP
 */

public class Main {
    public static void main(String[] args) {
        GajiPegawai gaji = new GajiPegawai();
        gaji.setNama("Arsy Opraza Akma");
        gaji.setAlamat("Jalan Ciumbuleuit No.56");
        gaji.setUangTransport(250000);
        gaji.setUangTunjangan(300000);
        gaji.setGajiPokok(4500000);
        gaji.setTotalGaji(gaji.totalGaji(
                gaji.getUangTunjangan(), gaji.getUangTransport(), gaji.getGajiPokok()));

        gaji.tampilData(
                gaji.getNama(),
                gaji.getAlamat(),
                gaji.getUangTunjangan(),
                gaji.getUangTransport(),
                gaji.getGajiPokok(),
                gaji.getTotalGaji());

    }
}
