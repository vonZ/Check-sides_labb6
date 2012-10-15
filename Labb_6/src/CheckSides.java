public class CheckSides {
    
    
    public String triangle(int a, int b, int c) {
        int d;
        
        //Om input Šr 0 eller negativt retuneras NO
        if(a < 0 || b < 0 || c < 0) return "NO";
        
        //Om b Šr stšrre Šn c
        if (b > c) {
            d = c;
            c = b;
            b = d;
        }
        
        //Om a Šr stšrre Šn c
        if (a > c) {
            d = c;
            c = a;
            a = d;
        }
        
        //Om a + b Šr stšrre Šn c retuneras YES
        if (a + b > c) return "YES";
        
        //Annars NO
        return "NO";
    
    }

}