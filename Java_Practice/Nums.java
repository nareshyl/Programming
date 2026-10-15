public class Nums{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        for(int i=1;i<=5;i++){
            sb.append(i);
            if(i<5){
                sb.append(" \n ");
            }
            
        }
        
        System.out.println(sb);
    }
}