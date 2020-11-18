public class Rektor {

    public void beriSertifikatCumlaude(ICumlaude mahasiswa) {
        System.out.println("Saya Rektor memberikan serifikat cumlaude.");
        System.out.println("Selamat!! Silahkan Perkenalkan Diri Anda");

        mahasiswa.Lulus();
        mahasiswa.meraihIPKTinggi();
        System.out.println("--------------------------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana anda bisa berprestasi?");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("--------------------------------------------------");
    }
}
