import lombok.NoArgsConstructor;
@NoArgsConstructor
public class Chat extends Mammifere implements Domestique {

    public Chat(String n ) {
        super(n);
    }
    @Override
    public String getType( )
    {
        if(this.getName() == null)
        {
            return "Je suis un animal de nom . Je suis un mammifère. Je suis un Chat.";
        } else{
            return "Je suis un animal de nom "+this.getName()+". Je suis un mammifère. Je suis un Chat. ";
        }
    }

    @Override
    public void faireDeBeau() { }
}
