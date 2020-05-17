import lombok.*;
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public  class Animal {
    private String name ;
    public String getType( )
    {
        if(this.name == null)
        {
            return "Je suis un animal.";
        } else{
        return "Je suis un animal de nom "+this.name;
        }
    }


}
