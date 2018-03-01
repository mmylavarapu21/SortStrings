

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortStrings {
    public static void main(String[] args) {

        List<String> inputList = new ArrayList<>();
        System.out.println("Enter the list of strings : ");
        Scanner sc = new Scanner(System.in);
        for ( String entry = sc.nextLine(); entry.length() !=0;entry = sc.nextLine()) {
            inputList.add(entry);
        }
        List<Integer> numbers = new ArrayList<Integer>();
        List<String> strings = new ArrayList<String>();


        for (String s:inputList) {
            if(isNumber(s)) {
                numbers.add(Integer.parseInt(s));
            } else {
                strings.add(s);
            }
        }
        Collections.sort(numbers);
        Collections.sort(strings);

        //parse the list to place the element in the respective index
        int a=0 ,b=0;
        for(int i=0; i < inputList.size(); i++){
            if(isNumber(inputList.get(i))){
                inputList.set(i, numbers.get(a++).toString());
            }else{
                inputList.set(i, strings.get(b++));
            }
        }

        System.out.println("sorted list is : "+inputList);


    }
    private static boolean isNumber(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
    }
}


