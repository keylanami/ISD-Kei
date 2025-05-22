public class main {

// ORIGINALLY CODED BY KEYLA NAMIRA JOHAN 607062400065 D3IF-48-02
    public static void main(String[] args) {
        minheap tudulis = new minheap();

        tudulis.add(new pojo(5, "tugas ISD"));
        tudulis.add(new pojo(8, "rapat UKM"));
        tudulis.add(new pojo(3, "kuis SBD"));

        // while (tudulis.size() > 0) {
        //     System.out.println(tudulis.remove());
        // }


        
        System.out.println("Task terdekat yang harus diselesaikan : " + tudulis.peek());

        System.out.print(tudulis.peek());
        System.out.print(" selesai dilaksanakan, berikutnya ");
        tudulis.remove();
        System.out.print(tudulis.peek());
    }
}
