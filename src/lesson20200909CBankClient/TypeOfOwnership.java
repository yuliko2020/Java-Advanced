package lesson20200909CBankClient;

/**
 * JavaAdvanced
 * 09/09/2020
 */
public enum TypeOfOwnership {
    GMBH {
        @Override
        public String getTypeString() {
            return "GmbH";
        }
    },
    AG {
        @Override
        public String getTypeString() {
            return "AG";
        }
    },
    EV {
        @Override
        public String getTypeString() {
            return "e.V";
        }
    };

    public abstract String getTypeString();


    public static TypeOfOwnership getTypeStringByString( String s ) { // код для объяснения

        if (s.equals("GMBH")) {
            return TypeOfOwnership.GMBH;
        } else if (s.equals("AG")) {
            return TypeOfOwnership.AG;
        } else if ( s.equals("e.V") || s.equals("eV")){
            return TypeOfOwnership.EV;
        }else {
            return null;
        }
    }

    @Override
    public String toString() {
        return getTypeString();
    }
}
