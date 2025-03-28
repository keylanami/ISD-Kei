public class JurnalPOJOMap {
    private String name;
    private int age;
    private String role;

    public JurnalPOJOMap(String name, int age, String role){
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }


    @Override
    public int hashCode(){
        final int HASH_MULTIPLIER = 127;

        int hash = 0;
        for(int i = 0; i < name.length(); i++){
            hash = hash * HASH_MULTIPLIER + name.charAt(i); 
        }

        // INTEGER GAUSAH LOOPING
        hash = hash *HASH_MULTIPLIER + age;

        for(int i = 0; i < role.length(); i++){
            hash = hash * HASH_MULTIPLIER + role.charAt(i);
        }
        return hash;
    }


    @Override
    public boolean equals(Object object){
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        JurnalPOJOMap member = (JurnalPOJOMap) object;
        return name.equals(member.name) && role.equals(member.role) && age == member.age;
        
    }

   /* public boolean isDuplicate(JurnalPOJOMap other) {
        return this.equals(other);
    } */
 


    @Override
    public String toString(){
        return "Nama: " + name + "\nUmur: " + age + "\nPosisi: " +  role + "\n";
    }

}