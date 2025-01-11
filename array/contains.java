public class contains {
    public static boolean c(String s , String a , int i){
        
        if(i>s.length()-a.length()){
            return false;
        }
        
           String s1 = s.substring(i, i+a.length());
           if(s1.equals(a)){
            return true;
           }else{
            return c(s,a,i+1);
           }
    }
    public static void main(String[] args){
        String s = "abc";
        String a = "h";
        int i=0;
        System.out.println(c(s,a,i));  
    }
}
