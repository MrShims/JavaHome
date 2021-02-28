package Lab2;
public class Lab2 {
    public static void main(String[] args){
        String[] keys = {"?","r","w" };
        ComLineParser pars = new ComLineParser(keys);
        System.out.println(pars.Parse(args));
    }
}
