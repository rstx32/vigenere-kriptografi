class vigenere{
    public static void main(String[] args) {
        
    }

    public void enkripsi(String plain, String key){
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
            int y = (x%26)+97;
            tampung[i]= (char)y;
        }

        cipher = new String(tampung);
        System.out.println(cipher);
    }

    public void dekripsi(String cipher, String key){
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
            int y = (x%26)+97;
            tampung[i]= (char)y;
        }

        cipher = new String(tampung);
        System.out.println(cipher);
    }
}