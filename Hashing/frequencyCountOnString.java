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
            charactersHash[characters - 'A']++; // it says that A minus 256 , dotn use it if its 256 ,use it direct 
        }
        System.out.println("character appears =" + charactersHash['j' - 'A']); // use it direct if the  space is 256 
    }

    public static void main(String[] args) {
        frequencyCountOnString frequencyCountOnString = new frequencyCountOnString();
        frequencyCountOnString.countcharacters();
    }
}
// Simple Rule of Thumb: Agar array ka size 256 likha hai, toh pure code mein kahin bhi - 'a' ya - 'A' nahi aana chahiye. Bas direct variable ka naam pass karna hai.


// DIRECT  USE 
