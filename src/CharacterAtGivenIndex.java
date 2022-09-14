public class CharacterAtGivenIndex {
    public static void main(String[] args) {

        characterAtIndexPrinter("Jitendra",3);

        characterAtIndexPrinter("Singh", 4);

    }

    public static void characterAtIndexPrinter(String name, int index){
        System.out.println("Character at given index is : "
                + name.charAt(index));
    }
}
