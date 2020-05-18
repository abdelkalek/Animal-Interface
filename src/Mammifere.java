import lombok.NoArgsConstructor;
@NoArgsConstructor
public abstract class Mammifere extends Animal {
public Mammifere(String N)
{
    super(N);
}
@Override
    public String getType()
    {
        if(this.getName() == null)
        {
            return "Je suis un animal.Je suis un mammifère";
        } else{
            return "Je suis un animal de nom "+this.getName()+". Je suis un mammifère";
        }
    }

}
