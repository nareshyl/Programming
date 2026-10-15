public class Delete{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("hello");
        sb.deleteCharAt(1);
        System.out.println(sb);

        StringBuffer sb1Buffer = new StringBuffer("Java");
        sb1Buffer.append("SE").append("Basics");
        System.out.println(sb1Buffer);
    }
}

