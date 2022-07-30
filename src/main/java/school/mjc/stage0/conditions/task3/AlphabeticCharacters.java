package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if(!(character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z')){
            System.out.println("wrong alphabet!");
        } else {
            switch (character){
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' :
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");
                    break;
            }

        }
    }
}
