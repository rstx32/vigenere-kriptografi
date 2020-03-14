class Main{
    public static void main(String[] args){
        String plain    = "saya adalah manusia";
        String key      = "restuindera";
        String cipher   = "jeqt ulnoey mrrmlci";

        Vigenere v = new Vigenere(plain,cipher,key);
        System.out.println("plain   : " + v.getPlain());
        // System.out.println("cipher  : " + v.cipher);
        // System.out.println("key     : " + v.key);
    }
}