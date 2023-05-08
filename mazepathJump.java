import java.util.*;
public class mazepathJump {
    public static void main(String[] args)throws Exception{
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> paths =  getMazePathss(1,1,n,m);
        System.out.println(paths);
    }
    public static ArrayList<String> getMazePathss(int sr, int sc, int dr, int dc){
        if(sr == dr && dr == sc){
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();
        // horizontal moves
        for(int ms = 1; ms<= dc - sc; ms++){
            ArrayList<String> hpaths= getMazePathss(sr, sc+ms, dr,dc);
            for(String hpath : hpaths){
                paths.add("h" + ms + hpath);
            }
        }
        for(int ms=1; ms<= dr - sr; ms++){
            ArrayList<String> vpaths = getMazePathss(sr + ms,  sc, dr, dc);
            for(String vpath : vpaths){
                paths.add("v"+ms+vpath);
            }
        }
        for(int ms = 1; ms <= dr - sr && ms <= dc-sc; ms++){
            ArrayList<String> dpaths= getMazePathss(sr + ms, sc + ms, dr, dc);
            for(String dpath: dpaths){
                paths.add("d"+ ms + dpath);
            }
        }
        return paths;
    }
}
