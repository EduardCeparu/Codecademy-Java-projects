public class DNA {
 
    public static void main(String[] args) {
   
      //  -. .-.   .-. .-.   .
      //    \   \ /   \   \ / 
      //   / \   \   / \   \  
      //  ~   `-~ `-`   `-~ `-
   
 
   
  String dna1= "ATGCGATACGCTTGA";
  
  String dna2 = "ATGCGATACGTGA";
  
  String dna3 = "ATTAATATGTACTGA";
  
  String dna = dna1;

  //int lenght = dna.length();

  int start = dna.indexOf("ATG");
  int stop = dna.indexOf("TGA");

  if(start != -1 && stop != -1 && (stop - start) % 3 == 0) {
    System.out.println("All the conditions are true");
    String protein = dna.substring(start, stop +3);
    System.out.println("Protein " + protein );

  }else{
    System.out.println("No protein");
  }
}
}
  