class Main{
    public static void main(String[] args){
        String plain    = "restu indera";
        String key      = "halo";
        String cipher   = "jeqt ulnoey mrrmlci";

        Vigenere v = new Vigenere(plain,null,key);
        System.out.println("plain   : " + v.getPlain());
        System.out.println("cipher  : " + v.getCipher());
        System.out.println("key     : " + v.getKey());
    }
}