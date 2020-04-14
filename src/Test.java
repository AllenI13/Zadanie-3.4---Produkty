public class Test {
    public static void main(String[] args) {
        Category category = new Category("Napoje", "Słodkie napoje");
        Category category2 = new Category("Słodycze", "Różne rodzaje słodkości");
        Product product = new Product("Coca cola",4.99, "Słodzony napój o smaku coli", category);
        Product product2 = new Product("Fanta",3.99, "Słodzony napój o smaku pomarańczy", category);
        Product product3 = new Product("Snickers",1.99, "Batonik z orzechami i karmelem w czekoladzie", category2);
        Product product4 = new Product("Wódka",19.99, "Imprezowy napój", null);
        SpecialOffer offer = new SpecialOffer(product, "Piątkowa zniżka na coca cole",
                "Zniżka obowiązuje od piątku do niedzieli", 20);
        System.out.println("Nazwa : " + product.name + " Cena : " + product.price + "Zł " + product.description);
        System.out.println("Nazwa : " + product2.name + " Cena : " + product2.price + "Zł " + product2.description);
        System.out.println("Nazwa : " + product3.name + " Cena : " + product3.price + "Zł " + product3.description);
        System.out.println("Nazwa : " + product4.name + " Cena : " + product4.price + "Zł " + product4.description);
    }
}
