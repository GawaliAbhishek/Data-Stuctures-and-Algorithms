/*
https://leetcode.com/problems/add-binary/
 * Given two binary strings a and b, return their sum as a binary string.
 */
public class AddBinary {


    public static void main(String[] args) {
        System.out.println(addBinary("100010","11"));
    }

    public static String addBinary(String a, String b) {
           
        StringBuilder ba=new StringBuilder(a);
        StringBuilder bb=new StringBuilder(b);
        if(a.length()<b.length()){
            for(int i=0;i<b.length()-a.length();i++){
                ba.insert(0,"0");
            }
            a=ba.toString();
        }
        if(b.length()<a.length()){
            for(int i=0;i<a.length()-b.length();i++){
                bb.insert(0,"0");
            }
            b=bb.toString();
        }

        StringBuilder builder =new StringBuilder();

        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0&& j>=0){
        int sum=(a.charAt(i)-'0')+(b.charAt(j)-'0')+carry;
         carry=0;

         if(sum==1|| sum==0){
            builder.append(sum);
         }
         if(sum==2){
            builder.append("0");
            carry=1;
         }
         if(sum==3){
            builder.append("1");
            carry=1;
         }
         i--;
         j--;
            
        }

        builder.append(carry);
       builder.reverse();
     if(builder.length()!=1){  
      for(int n=0;n<builder.length();n++){
        if(builder.charAt(n)=='0'){
            builder.deleteCharAt(n);
        }
        else{
            break;
        }
      }
    }
      return builder.toString();

       
    }
}
