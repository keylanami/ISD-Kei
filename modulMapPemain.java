public class modulMapPemain {
    private String nama;
    private String posisi;

    public modulMapPemain(String nama, String posisi){
        this.nama = nama;
        this.posisi = posisi;
    }

    // hashing versi map    
    @Override
    public int hashCode(){
        final int HASH_MULTIPLIER = 31; // bebas aja bisa pake bilangan PRIMA lainnya

        int hash = 0;
        for(int i = 0; i < nama.length(); i++){
            hash = hash * HASH_MULTIPLIER + nama.charAt(i); // hash nama
        }

        for(int i = 0; i < posisi.length(); i++){
            hash = hash * HASH_MULTIPLIER + posisi.charAt(i); // hash posisi
        }

        return hash;
    }

    // ngebandingin
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        modulMapPemain pemain = (modulMapPemain) object;

        return nama.equals(pemain.nama) && posisi.equals(pemain.posisi);
    }


    // ngeprint
    @Override
    public String toString(){
        return "Nama: " + nama + "\n" + "Posisi: " +  posisi + "\n";
    }

}