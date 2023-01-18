public class Main {
    public static void main(String[] args) {

        Shop s1 = new Shop("Europcar");

        Customer c1 = new Customer("Tiago");
        Customer c2 = new Customer("Augusto");
        Customer c3 = new Customer("Rafa");

        Vehicle hondaCbr = new Motocycle("Honda CBR", 0.005);

        hondaCbr.trip(70,60);



    }
}