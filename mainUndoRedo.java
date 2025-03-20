public class mainUndoRedo {
    
    public static void main(String[] args) {
        UndoRedo<String> hi = new UndoRedo<>();
        
        hi.addData("Kamisato Ayaka");
        hi.addData("berasal");
        hi.addData("dari");
        hi.addData("inazuma");

        System.out.println("isi undo, current to oldest");
        hi.viewUndo();
        hi.viewRedo();

        System.out.println("\nMelakukan undo");
        hi.undoData();

        System.out.println("\nIsi undo setelah undo: ");
        hi.viewUndo();
        System.out.println("\nisi redo setelah undo:  ");
        hi.viewRedo();
    }

}
