import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class subset_problem {
}



class Main
{
    static void printSubsets(char set[],int nn)
    {
        int n = set.length;

        for (int i = 0; i < (1<<n); i++)
        {
            int to=0;
            String s="";
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    to += Integer.parseInt("" + set[j]);
                    s+=set[j]+",";
                    //System.out.print(set[j] + " ");
                }
            }


            if(to>=nn){
                System.out.println(" set is {"+s+"} total : "+to);
            }

            //System.out.print("{"+s+"} : "+(to>=nn?"True":"False")+"\n");





        }
    }

    static void demo_arg(int ... data){
        for (int i=0;i<data.length-1;i++){
            System.out.print(""+data[i]+",");
        }
        System.out.print(data[data.length-1]+"\n");


    }

    public static void main(String[] args)
    {

        char set[] = "123".toCharArray();
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.println("Ehter the total value");
        int n=30;//=sc.nextInt();


        printSubsets(set,n);

        //demo_arg(12,2,1,12,2,1,2,3,12,3,0,12,3,1,2,3,12,3,1,2);


        System.out.println("code is "+sc.getClass());



    }
}
