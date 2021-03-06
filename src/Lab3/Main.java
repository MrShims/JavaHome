package Lab3;

public class Main {
    public static void main(String[] args)
    {
        String[] keys = {"?","r","w" };
        SimpleParser parse = new SimpleParser(keys);
        parse.Parse(args);
        System.out.println(parse.Parse(args));
        System.out.println(parse.getInFile());
        System.out.println(parse.getOutFile());

    }
}
