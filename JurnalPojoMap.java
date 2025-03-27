import java.util.HashSet;
import java.util.Objects;

public class JurnalPojoMap {
    private String name;
    private int age;
    private String posisi;

    public JurnalPojoMap(String name, int age, String posisi) {
        this.name = name;
        this.age = age;
        this.posisi = posisi;
    }

    @Override
    public int hashCode() {
        final int HASH_MULTIPLIER = 31;
        int hash = 0;
        hash = HASH_MULTIPLIER * hash + Objects.hashCode(name);
        hash = HASH_MULTIPLIER * hash + Objects.hashCode(age);
        hash = HASH_MULTIPLIER * hash + Objects.hashCode(posisi);        
        
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        JurnalPojoMap player = (JurnalPojoMap) object;

        return name.equals(player.name) && age == (player.age) && posisi.equals(player.posisi);
    }

    @Override
    public String toString() {
        return "Name = " + name + "\nAge = " + age + "\nPosition = " + posisi;
    }
}

