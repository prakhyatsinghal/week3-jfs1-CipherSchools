import java.util. ArrayList;

public class Code No 2 {
    

    public static void change(String m) {
        System.out.println(m.toUpperCase());
    }
    public static void main(String[] args){
         ArrayList<String>languages = new ArrayList<String>();
        lang.add("Java");
        lang.add("CSharp");
        lang.add("Python");
        lang.add("PHP");
        for(String t : lang) {
            change(t);
        }
        
        lang.forEach(forEcah(Test0::change));
        change(lang.get(0));
        change(lang.ger(1));
        change(lang.get(2));
        change(lang.ger(3));
        
    

    }
}

