package ch.css.booleancalculator;


interface Element {
    boolean asBoolean();
    

    class True implements Element {
        @Override
        public boolean asBoolean() {
            return true;
        }

    }
}


