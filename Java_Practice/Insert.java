public class Insert{ 
    public static void main(String[] args) { 
        StringBuilder sb = new StringBuilder("Naresh"); 
        sb.insert(0, 'K'); 
        System.out.println(sb); 
    } 
}

public class delete{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I love Programming");
        sb.delete(2,7);
        System.out.println(sb);
    }

    
