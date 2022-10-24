import java.lang.reflect.Array;
import java.util.Arrays;

class Movies {

    public static void main(String[] args) {
        String[] moviesIndiana = 
        {
            "Indiana Jones and the Kingdom of the Crystal Skull",
            "Indiana Jones and the Last Crusade",
            "Indiana Jones and the Temple of Doom"
        };

        String[][] mainActors = 
        {
            {"Harrison Ford", "Shia LaBeouf", "Karen Allen"},
            {"Harrison Ford", "Sean Connery", "Denholm Elliott"},
            {"Harrison Ford", "Kate Capshaw", "Ke Huy Quant"}
        };

        for (int i = 0; i < moviesIndiana.length; i++){
            System.out.println("Dans le film " + moviesIndiana[i] +
            " les principaux acteurs sont : " +
            //+ Arrays.toString(mainActors[i]));
            mainActors[i][0] + ", " + mainActors[i][1] + ", " +
            mainActors[i][2] + "."
            );
        }
    }
}