class vigenere{
    public static void main(String[] args) {
        String plain    = "restu indera";
        String key      = "halo";
        String cipher   = "yedhb iyrlrl";
        System.out.println("hasil enkripsi : " + plain + " = " + enkripsi(plain,key));
        System.out.println("hasil dekripsi : " + cipher + " = " + dekripsi(cipher,key));
    }

    public static String enkripsi(String plain, String key){
        char[] tampungKey   = new char[plain.length()];
        char[] tampung      = new char[plain.length()];
        String hasilKey;
        String cipher;

        // menyesuaikan key dengan panjang plain
        for(int i=0, j=i; i<plain.length(); i++){
            // tambahkan spasi
            if(plain.charAt(i)==' '){
                tampungKey[i]=' ';
                continue;
            }else{
                tampungKey[i] = key.charAt(j);
            }

            // ulang ke awal jika key sudah berakhir
            if(j==key.length()-1)
                j=0;
            else
                j++;
        }
        hasilKey = new String(tampungKey);

        // enkripsi
        for(int i=0; i<plain.length(); i++){
            if(hasilKey.charAt(i)==' '){
                tampung[i]=' ';
                continue;
            }
            int x = (plain.charAt(i)-97) + (hasilKey.charAt(i)-97);
            if(x>26){
                x=(x-26)+97;
            }else{
                x+=97;
            }
            tampung[i]= (char)x;
        }

        cipher = new String(tampung);
        return cipher;
    }

    public static String dekripsi(String cipher, String key){
        char[] tampungKey   = new char[cipher.length()];
        char[] tampung      = new char[cipher.length()];
        String hasilKey;
        String plain;

        // menyesuaikan key dengan panjang cipher
        for(int i=0, j=i; i<cipher.length(); i++){
            // tambahkan spasi
            if(cipher.charAt(i)==' '){
                tampungKey[i]=' ';
                continue;
            }else{
                tampungKey[i] = key.charAt(j);
            }

            // ulang ke awal jika key sudah berakhir
            if(j==key.length()-1)
                j=0;
            else
                j++;
        }
        hasilKey = new String(tampungKey);

        // dekripsi
        for(int i=0; i<cipher.length(); i++){
            if(hasilKey.charAt(i)==' '){
                tampung[i]=' ';
                continue;
            }
            int x = (cipher.charAt(i)-97) - (hasilKey.charAt(i)-97);
            if(x<0){
                x+=123;
            }else{
                x+=97;
            }
            tampung[i]= (char)x;
        }

        plain = new String(tampung);
        return plain;
    }
}