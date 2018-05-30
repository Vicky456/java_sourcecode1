import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;





public class project_pro {



    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        char[] str1=(sc.nextLine()).toCharArray();
        char[] str2=(sc.nextLine()).toCharArray();


        Arrays.sort(str1);
        Arrays.sort(str2);

        System.out.println(Arrays.toString(str1)+" "+Arrays.toString(str2));
        if(Arrays.toString(str1).equals(Arrays.toString(str2))){
            System.out.println("String is match");
        }else{
            System.out.println("String is not match");
        }

    }




}
