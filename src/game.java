public class game {

    static char[][] data=new char[4][5];
    static String value;

    static void init(){
        data[0]="apple".toCharArray();
        data[1]="bfdhg".toCharArray();
        data[2]="acahi".toCharArray();
        data[3]="tzunk".toCharArray();
    }





    static void data_pull(char ck,int i,int j){

        switch (ck){
            case '0':
                for (int k = 0; k < value.length(); k++) {
                    data[i][j + k] = '*';
                }
                break;
             case '1':
                for (int k = 0; k < value.length(); k++) {
                    data[i+k][j] = '*';
                }
                break;
             case '2':
                for (int k = 0; k < value.length(); k++) {
                    data[i-k][j] = '*';
                }
                break;
             case '3':
                for (int k = 0; k < value.length(); k++) {
                    data[i][j - k] = '*';
                }
                break;
             case '4':
                for (int k = 0; k < value.length(); k++) {
                    data[i+k][j + k] = '*';
                }
                break;
             case '5':
                for (int k = 0; k < value.length(); k++) {
                    data[i-k][j + k] = '*';
                }
                break;
             case '6':
                for (int k = 0; k < value.length(); k++) {
                    data[i+k][j - k] = '*';
                }
                break;
             case '7':
                for (int k = 0; k < value.length(); k++) {
                    data[i-k][j - k] = '*';
                }
                break;

        }


    }

    public static void main(String[] args) throws Exception{



        init();

        value="ghu";
        char ck='n';

        for(int i=0;i<data.length&&ck=='n';i++){
            for(int j=0;j<data[i].length;j++){
                if(data[i][j]==value.charAt(0)){



                    if(chack_draction_r(i, j,0,'0') == 'y') {
                        ck='y';
                        break;
                    }


                }
            }
        }



        for(int i=0;i<data.length;i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }


    static char chack_draction_r(int i, int j,int k,char d) {

        if(value.length()==k){
            data_pull(d,i,j);
            return 'y';
        }
        else {
            try{if (data[i][j + k] == value.charAt(k))
                chack_draction_r(i,j,k+1, '0');
            }catch (Exception e){}
            try{if (data[i+k][j] == value.charAt(k))
                chack_draction_r(i,j,k+1,'1');
            }catch (Exception e){}
            try{if (data[i-k][j] == value.charAt(k))
                chack_draction_r(i,j,k+1,'2');
            }catch (Exception e){}
            try{if (data[i][j - k] == value.charAt(k))
                chack_draction_r(i,j,k+1,'3');
            }catch (Exception e){}
            try{if (data[i+k][j + k] == value.charAt(k))
                chack_draction_r(i,j,k+1,'4');
            }catch (Exception e){}
            try{if (data[i-k][j + k] == value.charAt(k))
                chack_draction_r(i,j,k+1,'5');
            }catch (Exception e){}
            try{if (data[i+k][j - k] == value.charAt(k))
                chack_draction_r(i,j,k+1,'6');
            }catch (Exception e){}
            try{if (data[i-k][j - k] == value.charAt(k))
                chack_draction_r(i,j,k+1,'7');
            }catch (Exception e){}




        }
        return 'n';

    }


}
