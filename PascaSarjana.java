public class PascaSarjana extends Mahasiswa implements ICumlaude,IBerprestasi{
     
    public PascaSarjana(String nama){
        super(nama);
    }
    @Override
    public void Lulus(){
        System.out.println(" Aku Sudah Menyelesaikan TESIS");
    }
    @Override
    public void meraihIPKTinggi(){
        System.out.println("IPK-ku lebih dari 3,71");
    }
    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }
}
