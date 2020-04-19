package testcases;

public class Junk {
    public static  void  main(String args[]){
        String s = "音読み, おんよみHoware youdoing音読み, おんよみjackie音読み, おんよみ5054546";

        s = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);


    }
}
