package ghozti.mousesquad.structure.displayer;

abstract class Displayer {

    public abstract void displayProperties(String a, String b, String c);

    public static class ProblemDisplayer extends Displayer{

        @Override
        public void displayProperties(String a, String b, String c) {

        }
    }
}
