package laundry;


public class main {
    public static void main(String[] args) {
        
        sistemlaundry londri = new sistemlaundry();

        londri.terimaCucian(1, "Intan", 3, "biasa", 5);
        londri.terimaCucian(2, "Dudi", 4, "express", 3);
        londri.terimaCucian(3, "Ruli", 4, "kilat", 1);
        londri.terimaCucian(4, "Susi", 5, "biasa", 2);
        londri.terimaCucian(5, "Ira", 6, "biasa", 5);
        londri.terimaCucian(6, "Mayang", 7, "express", 4);

        londri.printUrutan();
    }
}
