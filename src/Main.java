// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pizzas pizza1 = new BPiz().build();
        System.out.println(pizza1.toString() +"\n");
        Pizzas pizzaPsicopata = new BPiz().setPiña(true).build();
        System.out.println(pizzaPsicopata.toString() +"\n");
        Pizzas pizza3 = new BPiz()
                .setSalsa(true)
                .setTipoSalsa("tomate")
                .build();
        System.out.println(pizza3.toString() +"\n");
        }
    }