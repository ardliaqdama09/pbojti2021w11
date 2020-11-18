public class Sarjana extends Mahasiswa implements ICumlaude {
    
    public Sarjana(String nama){
        super(nama);
    }
    @Override
    public void Lulus(){
        System.out.println("Aku Sudah Menyelesaikan SKRIPSI");
    }
    @Override
    public void meraihIPKTinggi(){
        System.out.println("IPK-ku lebih dari 3,51");
    }
}
