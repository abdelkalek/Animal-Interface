import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
public class Chien extends Animal implements Domestique {

    public Chien(String n ) {
        super(n);
    }
    @Override
    public String getType( )
    {
        if(this.getName() == null)
        {
            return "Je suis un animal de nom . Je suis un mammifère. Je suis un chien.";
        } else{
            return "Je suis un animal de nom "+this.getName()+". Je suis un mammifère. Je suis un chien. ";
        }
    }

    @Override
    public void faireDeBeau() {
        System.out.println("Animal domestique.");

    }
}
