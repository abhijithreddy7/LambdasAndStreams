package lambdas;
public class TargetType {
    public interface Email{
        String constructEmail(String name);
    }
    public String getEmail(String name,Email email){
        return null;
    }

    public static void main(String[] args) {
        new TargetType().getEmail("gmail",(String name)-> name+"@gmail.com");
    }
}