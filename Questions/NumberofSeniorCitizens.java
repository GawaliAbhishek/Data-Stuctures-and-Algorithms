/*
 * You are given a 0-indexed array of strings details. Each element of details provides information about a given passenger compressed into a string of length 15. The system is such that:

The first ten characters consist of the phone number of passengers.
The next character denotes the gender of the person.
The following two characters are used to indicate the age of the person.
The last two characters determine the seat allotted to that person.
Return the number of passengers who are strictly more than 60 years old.
 */

 //https://leetcode.com/problems/number-of-senior-citizens/description/
public class NumberofSeniorCitizens {
    public static void main(String[] args) {
        String []arr={"1313579440F2036","2921522980M5644"};
        System.out.println((countSeniors(arr)));
    }

    public static int countSeniors(String[] details) {
       
        if(details.length==0)
        return -1;
        int count=0;
        for(int i=0;i<details.length;i++ ){
             StringBuilder age=new StringBuilder();
          char digit1=details[i].charAt(11);
          char digit2=details[i].charAt(12);
         age.append(digit1);
         age.append(digit2);
         System.out.println(age);
            if(Integer.parseInt(age.toString())>60)
            count++;
        }
        return count;
    }
}
