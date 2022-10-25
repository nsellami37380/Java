
class Decipherer {

    String decipherMessage(String cryptedMessage){
        int keyNumber = cryptedMessage.length()/2;
        String sub_chaine = cryptedMessage.substring(5, keyNumber + 5);
        sub_chaine = sub_chaine.replace("@#?", " ");
        String result = "";
        for(int i = sub_chaine.length() - 1; i >= 0; i--)
        {
            result = result + sub_chaine.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Decipherer decipherer = new Decipherer();        
        System.out.println(decipherer.decipherMessage("0@sn9sirppa@#?ia'jgtvryko1"));
        System.out.println(decipherer.decipherMessage("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj"));
        System.out.println(decipherer.decipherMessage("aopi?sedohtém@#?sedhtmg+p9l!"));
    }
}