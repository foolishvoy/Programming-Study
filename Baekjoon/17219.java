import java.util.*;
import java.io.*;

public class Main{
    public static void main  (String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int n = Integer.parseInt(st.nextToken());
       int m = Integer.parseInt(st.nextToken());
       HashMap<String,String> map = new HashMap<>();
       StringBuilder sb = new StringBuilder();
       for(int i = 0; i<n;i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            String site = st2.nextToken();
            String password = st2.nextToken();
            map.put(site, password);     
       }
       for(int i = 0; i<m;i++){
            sb.append(map.get(br.readLine()) + "\n");
       }
       System.out.println(sb.toString());
    }
}
