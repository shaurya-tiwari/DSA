public class frequencyCountOnString {

    public void countcharacters() {
        String word = "ertyuiodfghjkliuytredfghjkiuytrdhJjkoiuytresdcvbjkjytresxcvbn";

        // NOTE: always make 26 size of array space in hash, becase there are 26 number
        // of alphabets
        int[] charactersHash = new int[256]; 
        //NOTE : for 'A' or 'a' we use [26] space , but 
        // for usin mix valuues like aA , we use 256 space 

        // check for string if exist then +1 its count
        for (int i = 0; i < word.length(); i++) {
            char characters = word.charAt(i);
            // take the character andd if it exist increase the count ++.
            charactersHash[characters - 'A']++; // here +1 will not work because its character . in small letter
        }
        System.out.println("character appears =" + charactersHash['j' - 'A']); // count g from small letters
    }

    public static void main(String[] args) {
        frequencyCountOnString frequencyCountOnString = new frequencyCountOnString();
        frequencyCountOnString.countcharacters();
    }
}
