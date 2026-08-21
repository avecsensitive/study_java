package es_0820;

public class Ex_Numsbu {
    
    public boolean isNumber( String str){

        for( int i = 0; i <str.length(); i++){

            char ch =str.charAt(i);


            //      48      57
            if( ch<'0' ||ch > '9'){
                return false;

            }//if

        }//for


    }






}
