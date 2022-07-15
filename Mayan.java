public class Mayan extends Language {

    public Mayan(String name, int numSpeakers) {
        super(name, numSpeakers, "Central America", "verb-object-subject");
        
    }

    @Override
    public void getInfo() {
         super.getInfo();
        System.out.println("Fun fact: Ki'che' is an ergative language.");
    }

    
    
    
}
