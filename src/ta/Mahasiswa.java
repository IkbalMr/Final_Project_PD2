package ta;


public class Mahasiswa {
    
    private int nim;
    private String nama;
    private String alamat;
    private String tgl_lahir;
    private String jk;
    private String jurusan;
    private String email;
    
    public Mahasiswa(int NIM, String Nama, String Alamat, String TanggalLahir, String JenisKelamin, String Jurusan, String Email)
    {
        this.nim = NIM;
        this.nama = Nama;
        this.alamat = Alamat;
        this.tgl_lahir = TanggalLahir;
        this.jk = JenisKelamin;
        this.jurusan = Jurusan;
        this.email = Email;
        
    }
    
    public int getNIM()
    {
        return nim;
    }
    
    public String getNama()
    {
        return nama;
    }
    
    public String getAlamat()
    {
        return alamat;
    }
    
    public String getTglLhr()
    {
        return tgl_lahir;
    }
    
    public String getJK()
    {
        return jk;
    }
    
    public String getJurusan()
    {
        return jurusan;
    }
    
    public void setJurusan(String jurusan)
    {
        this.jurusan = jurusan;
    }
    
    public String getEmail()
    {
        return email;
    }
}
