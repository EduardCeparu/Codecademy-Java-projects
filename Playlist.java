import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList <String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("songA");
    desertIslandPlaylist.add("songB");
    desertIslandPlaylist.add("songC");
    desertIslandPlaylist.add("songD");
    desertIslandPlaylist.add("songE");
    desertIslandPlaylist.add("songF");
    desertIslandPlaylist.add("songG");
    desertIslandPlaylist.add("songH");
    desertIslandPlaylist.add("songI");
    desertIslandPlaylist.add("songJ");

   System.out.println(desertIslandPlaylist);
   System.out.println(desertIslandPlaylist.size());

    int indexA = desertIslandPlaylist.indexOf("songF");
    int indexB = desertIslandPlaylist.indexOf("songG");

    String tempA = "songF";
    desertIslandPlaylist.set(indexA, "songG");

    System.out.println(desertIslandPlaylist);

    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);
}
  
}