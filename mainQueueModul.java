public class mainQueueModul {
    
    public static void main(String[] args) {
        queueLL<String> keiTavern = new queueLL<>();

        keiTavern.enqueue("xiangling");
        keiTavern.enqueue("ayaka");
        keiTavern.enqueue("fochalors");
        keiTavern.enqueue("mualani");
        keiTavern.enqueue("mavuika");

        System.out.println("antrian silky pudding kei: \n");
        keiTavern.dequeue();
        keiTavern.printQueue();



    }
}
