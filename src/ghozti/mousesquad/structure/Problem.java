package ghozti.mousesquad.structure;

public class Problem {

    private String name, description, solution;

    public Problem(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Problem(String name, String description, String solution){
        this.name = name;
        this.description = description;
        this.solution = solution;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String getSolution(){
        return solution;
    }
}
