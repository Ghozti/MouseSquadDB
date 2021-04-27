package ghozti.mousesquad.structure;

public class Person {

    private String name, emailOrPhone, osis;

    public Person(String name, String emailOrPhone, String osis){
        this.name = name;
        this.emailOrPhone = emailOrPhone;
        this.osis = osis;
    }

    public String getName(){
        return name;
    }

    public String getEmailOrPhone(){
        return emailOrPhone;
    }

    public String getOsis(){
        return osis;
    }
}
