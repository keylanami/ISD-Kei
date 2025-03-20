import java.util.Stack;
public class stackMainJurnal {

// helped by kak rafael and ariq, coded by keyla 607062400065 D3IF-48-02

    public static void main(String[] args) {
        
        String ubiArik = "[{}]";
        String ubiRafael = "[{(})]";
        String ubiArik2 = "[{)]";
        String ubiRafael2 = "[{";

        print(ubiArik, checkCocok(ubiArik));
        print(ubiRafael, checkCocok(ubiRafael));
        print(ubiArik2, checkCocok(ubiArik2));
        print(ubiRafael2, checkCocok(ubiRafael2));

    }

    public static boolean checkCocok(String stack){
        Stack<Character> open = new Stack<>();

        for (char hi : stack.toCharArray()){
            if (hi == '[' || hi == '{' || hi == '(') {
                open.push(hi);

            } else if(hi == ']' || hi == '}' || hi == ')'){
                if (open.isEmpty()) {
                    return false;
                }
                char opens = open.pop();
                if(!validasi(opens, hi)){
                    return false;
                }
            }   
        }
        return open.isEmpty();
    }

    public static boolean validasi(char open, char close){
        return (open == '[' && close == ']') ||
                (open == '{' && close == '}') ||
                (open == '(' && close == ')');
    }

    public static void print(String kurung, boolean checkCocok) {
        if (checkCocok) {
            System.out.println(kurung + " --> Cocok");
        } else {
            System.out.println(kurung +" --> Tidak Cocok" );
        }
    }
}
