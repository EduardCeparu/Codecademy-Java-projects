public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
    
    public void getInfo(){
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " +regionsSpoken + "." +
        " The language follows the word order: "+ wordOrder);
    }

    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }



    public static void main(String[] args) {
        Language spanish = new Language("Spanish", 200000, "Spain","Subject + verb + object");

        spanish.getInfo();

        Mayan yucatec = new Mayan("Yucatec", 30000);
        
        yucatec.getInfo();

        SinoTibetan chinese = new SinoTibetan("Mandarin Chinese", 17000000);
        chinese.getInfo();
        
        SinoTibetan burmese = new SinoTibetan("Burmese", 3012880);
        burmese.getInfo();
    }
}
