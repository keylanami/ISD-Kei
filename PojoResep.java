//ORIGINALLY CODED BY KEYLA NAMIRA JOHAN 607062400065 D3IF-48-02

public class PojoResep {

    private String foodName;
    private String ingredients;
    private int cookingTime;

    public PojoResep(String foodName, String ingredients, int cookingTime){
        this.foodName = foodName;
        this.ingredients = ingredients;
        this.cookingTime = cookingTime;
    }

    public String getFoodName() {
        return foodName;
    }

    @Override
    public String toString(){
        return "\n- Nama Resep: " + foodName + "\n Ingredients: " + ingredients + "\n Cooking time: " + cookingTime + " minutes";
    }

}
