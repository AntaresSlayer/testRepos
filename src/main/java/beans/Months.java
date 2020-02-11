package beans;

public enum Months {
    JANUARY {
        @Override
        public String toString(){
            return "Jan";
        }
        public int getIndex(){
            return 1;
        }
    },
    FEBRUARY {
        @Override
        public String toString(){
            return "Feb";
        }
    }, MARCH {
        @Override
        public String toString(){
            return "Mar";
        }
    },
        APRIL {
        @Override
        public String toString(){
            return "Apr";
        }
    },
    MAY {
        @Override
        public String toString(){
            return "May";
        }
    },
    JUNE {
        @Override
        public String toString(){
            return "Jun";
        }
    },
    JULY {
        @Override
        public String toString(){
            return "Jul";
        }
    },
    AUGUST {
        @Override
        public String toString(){
            return "Aug";
        }
    },
    SEPTEMBER {
        @Override
        public String toString(){
            return "Sep";
        }
    },
    OCTOBER {
        @Override
        public String toString(){
            return "Oct";
        }
    },
    NOVEMBER {
        @Override
        public String toString(){
            return "Nov";
        }
    },
    DECEMBER     {
        @Override
        public String toString(){
            return "Dec";
        }
    }
}
