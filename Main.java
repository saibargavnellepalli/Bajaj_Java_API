import java.util.*;

class Main {
  public static void main(String[] args) {

   String data[] ={"a","1","3","334","Res"};
   LinkedHashMap<String,ArrayList<String>> map = new LinkedHashMap<>();

   //

    ArrayList<String> id = new ArrayList<>();
    id.add("saibargav_28052002");
    map.put("userId",id);

     ArrayList<String> mail = new ArrayList<>();
    id.add("saibargav1029@gmail.com");
    map.put("email",mail);


     ArrayList<String> roll = new ArrayList<>();
    id.add("12006134");
    map.put("roll",roll);

     ArrayList<String> oddList = new ArrayList<>();
     ArrayList<String> evenList = new ArrayList<>();
     ArrayList<String> alphaList = new ArrayList<>();

     map.put("oddNum",oddList);
    map.put("evenNum",evenList);
    map.put("alphabets",alphaList);

     getResponse(data,map);

  System.out.println(map);

}

  public static void getResponse(String data[], LinkedHashMap<String,ArrayList<String>> map){

    for(int i=0;i<data.length;i++){
      String cur = data[i];

      if(isNum(cur)){
        int num = Integer.valueOf(cur);

        if(num % 2==0){
           map.get("evenList").add(cur);
        }
        else{
           map.get("oddNum").add(cur);
        }
      }
      else{
        String cap = cur.toUpperCase();
       map.get("alphabets").add(cap);
      }
    }
  }


  public static boolean isNum(String cur){
    char ch[]= cur.toCharArray();

    for(char elm : ch){
      if((elm >= 'a' && elm<='z' )|| (elm >='A'|| elm <= 'Z')){
        return false;
      }
     
    }
    return true;
  }
}