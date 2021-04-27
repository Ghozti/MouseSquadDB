package ghozti.mousesquad.structure.displayer;

abstract class Displayer {

    public abstract void displayProperties(String a, String b, String c);

    public static class SolutionDisplayer extends Displayer {

        @Override
        public void displayProperties(String a, String b, String c) {

        }
    }

    public static class UnresolvedProblemDisplayer extends Displayer {

        @Override
        public void displayProperties(String a, String b, String c) {

        }
    }

    public static class peopleDisplayer extends Displayer {

        @Override
        public void displayProperties(String a, String b, String c) {

        }
    }
}
