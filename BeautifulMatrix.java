import java.util.*  ;
public class BeautifulMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int [][] mtx =new int [5][5] ;
        //for defining each member of the array .
        for(int i= 0 ; i < 5 ; i++ ){ 
            for(int j = 0 ; j <5 ; j++){

                mtx[i][j] =sc.nextInt();
            }
        }

        int j2 ;
        int i2  ;
        int beautifulness =0;
        //calculate the total needed moves to reach the center .
        for(int i=0 ; i < 5 ; i++){

            for(int j = 0 ; j < 5 ; j++){
                    if(mtx[i][j] != 0){
                         j2 =Math.abs( 2 -j);
                         i2 =Math.abs(2-i) ;

                         beautifulness =i2 + j2 ;
                    }
            }
        }
        System.out.println(beautifulness);
    }
}
