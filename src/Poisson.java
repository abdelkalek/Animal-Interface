public abstract class Poisson extends Animal {

    @Override
    public String getType( )
    {
        if(this.getName() == null)
        {
            return "Je suis un animal. Je suis un Poisson";
        } else{
            return "Je suis un animal de nom "+this.getName()+". Je suis un Poisson ";
        }
    }

}
