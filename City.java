 import java.util.List;
import java.util.ArrayList;

public class City {
    private String kota;
    private List<City> tetangga;

    public City(String kota){
        this.kota = kota;
        this.tetangga = new ArrayList<>();
    }

    public void tambahTetangga(City kota){
        tetangga.add(kota);
    }

    public String getKota() {
        return kota;
    }

    public List<City> getTetangga() {
        return tetangga;
    }

    @Override
    public String toString() {
        return kota;
    }
}

