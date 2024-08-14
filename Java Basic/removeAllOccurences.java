public class removeAllOccurences {
    public static void main(String[] args) {
        String str = "Straw Hats Captain Monkey.D.Luffy & Vice-Captain Roronoa Zoro , So they Straw Hats are Unstoppable ";
        String substr = "Straw Hats";
        String rem = str.replace(substr,"").replace("\\s","").trim();
        System.out.println("After Removing of "+ substr + " the Updated String is: " + rem);
        System.out.println("Removed word is: " + substr);
    }
}