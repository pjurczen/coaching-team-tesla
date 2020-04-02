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
    
    public class NOT implements Element {

        private Element element;

        public NOT(Element element) {
            this.element = element;
        }

        @Override
        public boolean asBoolean() {
            return ! this.element.asBoolean();
        }

    }
    
    
    public class OR implements Element {
        
        private Element leftHandSide;
        private Element rightHandSide;

        public OR(Element leftHandSide, Element rightHandSide) {
            this.leftHandSide = leftHandSide;
            this.rightHandSide = rightHandSide;
        }

        @Override
        public boolean asBoolean() {
            return this.leftHandSide.asBoolean() || this.rightHandSide.asBoolean();
        }

    }

}


