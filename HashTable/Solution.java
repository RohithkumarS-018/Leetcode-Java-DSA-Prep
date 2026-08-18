import java.util.*;

public class Solution {
    public static List<List<String>> group(String arr[]){
        HashMap <String,List<String>> map= new HashMap<>();
        for(String b:arr){
            char ch[]=b.toCharArray();
            Arrays.sort(ch);
            String res=new String(ch);
            if(!map.containsKey(res)){
             map.put(res,new ArrayList<>());
            }
            map.get(res).add(b);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String arr[]=s.split(" ");
        List<List<String>> result=group(arr);
        for(List<String> list:result){
            System.out.println(list);
        }
    }
}