class Vigenere{
    private String cipher;
    private String plain;
    private String key;

    public Vigenere(String plain, String cipher, String key){
        super();
        this.plain = enkripsi(plain, key);
        this.cipher = dekripsi(cipher, key);
        this.key = key;
    }

    public static void main(String[] args) {
        String plain    = "saya adalah manusia";
        String key      = "restuindera";
        String cipher   = "jeqt ulnoey mrrmlci";

        Vigenere v = new Vigenere(plain,cipher,key);
        System.out.println("plain   : " + v.plain);
        System.out.println("cipher  : " + v.cipher);
        System.out.println("key     : " + v.key);
        // System.out.println("hasil enkripsi : " + plain + " = " + enkripsi(plain,key));
        // System.out.println("hasil dekripsi : " + cipher + " = " + dekripsi(cipher,key));
    }

    public static String enkripsi(String plain, String key){
        char[] tampung = new char[plain.length()];
        String hasilKey;
        hasilKey = new String(adaptasiKey(key, plain));

        // enkripsi
        for(int i=0; i<plain.length(); i++){
            if(hasilKey.charAt(i)==' '){
                tampung[i]=' ';
                continue;
            }
            int x = (plain.charAt(i)-97) + (hasilKey.charAt(i)-97);
            if(x>26)
                x=(x-26)+97;
            else
                x+=97;
            
            tampung[i]= (char)x;
        }

        return (new String(tampung));
    }

    public static String dekripsi(String cipher, String key){
        char[] tampung = new char[cipher.length()];
        String hasilKey;
        hasilKey = new String(adaptasiKey(key, cipher));

        // dekripsi
        for(int i=0; i<cipher.length(); i++){
            if(hasilKey.charAt(i)==' '){
                tampung[i]=' ';
                continue;
            }
            int x = (cipher.charAt(i)-97) - (hasilKey.charAt(i)-97);
            if(x<0)
                x+=123;
            else
                x+=97;
            
            tampung[i]= (char)x;
        }

        return (new String(tampung));
    }

    public static String adaptasiKey(String key, String adaptasi){
        char[] tampungKey   = new char[adaptasi.length()];

        // menyesuaikan key dengan panjang adaptasi
        for(int i=0, j=i; i<adaptasi.length(); i++){
            // tambahkan spasi
            if(adaptasi.charAt(i)==' '){
                tampungKey[i]=' ';
                continue;
            }else{
                if(key.charAt(j)==' '){
                    return new String("key tidak boleh ada spasi!");
                }
                tampungKey[i] = key.charAt(j);                
            }

            // ulang ke awal jika key sudah berakhir
            if(j==key.length()-1)
                j=0;
            else
                j++;
        }

        return (new String(tampungKey));
    }
}