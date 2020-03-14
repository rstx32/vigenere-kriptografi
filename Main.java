class Main{
    public static void main(String[] args){
        String plain    = "saya adalah manusia";
        String key      = "restuindera";
        String cipher   = "jeqt ulnoey mrrmlci";

        Vigenere v = new Vigenere(null,cipher,key);
        System.out.println("plain   : " + v.getPlain());
        System.out.println("cipher  : " + v.getCipher());
        System.out.println("key     : " + v.getKey());
    }
}