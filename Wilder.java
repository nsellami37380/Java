public class Wilder{

    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.aware = aware;
        this.firstname = firstname;
    }

    public String whoAmI(){
        if (aware){
            return String.format("Je m'appelle %s et je suis aware", firstname) ;
        } else{
            return String.format("Je m'appelle %s et je ne suis pas aware", firstname);
        }
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public boolean getAware(){
        return aware;
    }
    public void setAware(boolean aware){
        this.aware = aware;
    }
}

// class Classroom {
//     public static void main(String[] args) {
//         Wilder Jcv = new Wilder("Jean Claude", true);
//         Wilder HenrY = new Wilder("Henry", false);

//         System.out.println(Jcv.whoAmI());
//         System.out.println(HenrY.whoAmI());

//     }
// }