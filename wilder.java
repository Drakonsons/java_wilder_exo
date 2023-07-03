class wilder {
    private String firstname;
    private boolean aware;

    public wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        if (this.aware == true) {
            return "Je m'appelle " + this.firstname + " et je suis aware";
        } else {
            return "Je m'appelle " + this.firstname + " et je ne suis pas aware";
        }
    }
}

class Classroom {
    public static void main(String[] args) {
        wilder wilder1 = new wilder("Jean-Jaque", true);
        wilder wilder2 = new wilder("Eude de la tourbetier", false);
        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
    }
}