package ch.css.booleancalculator;


interface Element {



    boolean asBoolean();
    

    class True implements Element {
        @Override
        public boolean asBoolean() {
            return true;
        }

    }
    
    public class False implements Element {

        @Override
        public boolean asBoolean() {
            return false;
        }

    }
    
    public class OR implements Element {
        public OR(Element leftHandSide, Element rightHandSide) {
            // TODO Auto-generated constructor stub
        }

        @Override
        public boolean asBoolean() {
           
            return false;
        }

    }

}


