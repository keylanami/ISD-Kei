import java.util.Scanner;

public class Main {

//ORIGINALLY CODED BY KEYLA NAMIRA JOHAN 607062400065 D3IF-48-02
    public static void main(String[] args) {
        SingleLinkedList<PojoResep> linkedList = new SingleLinkedList<>();
        Scanner hi = new Scanner(System.in);
        int pilih;

    
        do {
            System.out.println("Welcome to Kei's Tavern!");
            System.out.println("1. Add Receipts at Front\n2. Add receipts at Back\n3. Delete Receipts at Front\n4. Delete Receipts at Back\n5. Print all receipts\n6. Search Receipts (name based)\n0. Finish this program\n\nChoose Menu!");
            pilih = hi.nextInt();
            hi.nextLine();
            
            switch (pilih) {
                case 1:
                    System.out.println("Enter food name: ");
                    String name = hi.next();
                    System.out.println("Enter ingredients: ");
                    String ingredients = hi.next();
                    System.out.println("Enter cooking time: ");
                    int time = hi.nextInt();

                    PojoResep inputFront = new PojoResep(name, ingredients, time);
                    linkedList.insertFront(inputFront);
                    System.out.println("INPUT COMPLETE\n");
                    break;
                
                case 2:
                    System.out.println("Enter food name: ");
                    String namee = hi.next();
                    System.out.println("Enter ingredients: ");
                    String ingredientss = hi.next();
                    System.out.println("Enter cooking time: ");
                    int timee = hi.nextInt();
                
                    PojoResep inputBack = new PojoResep(namee, ingredientss, timee);
                    linkedList.insertBack(inputBack);
                    System.out.println("INPUT COMPLETE\n");
                    break;

                case 3:
                    linkedList.removeFront();
                    break;

                case 4:
                    linkedList.removeBack();
                    break;

                case 5: 
                    linkedList.print();
                    break;

                case 6:
                    System.out.println("Search receipts: ");
                    String searchRe = hi.nextLine();
                    linkedList.search(searchRe);
                    break;
                
                case 0: 
                    System.out.println("The tavern has finished operating!\nOur final menu is: ");
                    linkedList.print();

                default:
                    break;
            }

        } while (pilih!=0);

        

        // testing

        /*
        linkedList.insertFront(new PojoResep("Ramen", "Tofu, Noodle, Sesame oil, Green onion, Seaweed, MSG", 20));
        linkedList.insertBack(new PojoResep("Fluffy Pancake", "Omega 3 Egg, Flour, Iching sugar, Vanilla essence, Honey", 7));
        linkedList.insertBack(new PojoResep("Ayam ungkep", "Chicken breast, Ketumbar bubuk, Ladaku, Bumbu ayam ungkep instant, Adequate amount of water ", 30));

        linkedList.print();
        */
        /*
        linkedList.removeBack();
        linkedList.print(); */
    }
}
