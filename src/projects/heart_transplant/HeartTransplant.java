package projects.heart_transplant;

public class HeartTransplant {

    /* ------ Instance variables  -------- */

    // Person array, each Person is read from the data file
    private Person[] listOfPatients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge[] survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause[] survivabilityByCause;

    /* ------ Constructor  -------- */

    /*
     * Initializes all instance variables to null.
     */
    public HeartTransplant() {

        this.listOfPatients = null;
        this.survivabilityByAge = null;
        this.survivabilityByCause = null;
    }

    /* ------ Methods  -------- */

    /*
     * Inserts Person p into listOfPatients
     *
     * Returns:  0 if successfully inserts p into array,
     *          -1 if there is not enough space to insert p into array
     */
    public int addPerson(Person p, int arrayIndex) {
        if (listOfPatients[arrayIndex] == null) {
            listOfPatients[arrayIndex] = p;
            return 0;
        }
        return -1;
    }

    /*
     * 1) Creates the listOfPatients array with numberOfLines length.
     *
     * 2) Reads from the command line data file.
     *    File Format: ID, Ethinicity, Gender, Age, Cause, Urgency, State of health
     *    Each line refers to one Person.
     *
     * 3) Inserts each person from file into listOfPatients
     *    Hint: uses addPerson() method
     *
     * Returns the number of patients read from file
     */
    public int readPersonsFromFile(int numberOfLines) {
        listOfPatients = new Person[numberOfLines];
        for (int i = 0; i < listOfPatients.length; i++) {
            Person p = new Person(StdIn.readInt(), StdIn.readInt(), StdIn.readInt(), StdIn.readInt(), StdIn.readInt(), StdIn.readInt(), StdIn.readInt());
            addPerson(p,i);
            //System.out.println(listOfPatients[i].toString());

        }
        return listOfPatients.length;
    }

    /*
     * 1) Creates the survivabilityByAge array with numberOfLines length.
     *
     * 2) Reads from the command line file.
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     *
     * 3) Inserts each rate from file into the survivabilityByAge array
     *
     * Returns the number of survivabilities rates read from file
     */
    public int readSurvivabilityRateByAgeFromFile (int numberOfLines) {

        survivabilityByAge = new SurvivabilityByAge[numberOfLines];
        for (int i = 0; i < survivabilityByAge.length; i++) {
            survivabilityByAge[i] = new SurvivabilityByAge(StdIn.readInt(), StdIn.readInt(), StdIn.readDouble());

        }
        return survivabilityByAge.length;
    }

    /*
     * 1) Creates the survivabilityByCause array with numberOfLines length.
     *
     * 2) Reads from the command line file.
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     *
     * 3) Inserts each rate from file into the survivabilityByCause array
     *
     * Returns the number of survivabilities rates read from file
     */
    public int readSurvivabilityRateByCauseFromFile (int numberOfLines) {

        survivabilityByCause = new SurvivabilityByCause[numberOfLines];
        for (int i = 0; i < survivabilityByCause.length; i++) {
            survivabilityByCause[i] = new SurvivabilityByCause(StdIn.readInt(), StdIn.readInt(), StdIn.readDouble());

        }
        return survivabilityByCause.length;
    }

    /*
     * Returns listOfPatients
     */
    public Person[] getListOfPatients() {
        return listOfPatients;
    }

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge[] getSurvivabilityByAge() {
        return survivabilityByAge;
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause[] getSurvivabilityByCause() {
        return survivabilityByCause;
    }

    /*
     * Returns a Person array in which with every Person that has
     * age above the parameter age from the listOfPatients array.
     *
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with age above the parameter age.
     *
     * Return null if there is no Person with age above the
     * parameter age.
     */
    public Person[] getPatientsWithAgeAbove(int age) {
        int count = 0;
        for (int i = 0; i < listOfPatients.length; i++) {
            if (listOfPatients[i].getAge()>age) {
                count++;
            }
        }
        if (count<=0) {
            return null;
        }
        Person[] pAge = new Person[count];
        for (int i = 0, index = 0; i < listOfPatients.length; i++) {
            if (listOfPatients[i].getAge()>age) {
                pAge[index] = listOfPatients[i];
                index++;
            }
        }
        return pAge;
    }

    /*
     * Returns a Person array with every Person that has the state of health
     * equal to the parameter state from the listOfPatients array.
     *
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with the state of health equal to the parameter state.
     *
     * Return null if there is no Person with the state of health
     * equal to the parameter state.
     */
    public Person[] getPatientsByStateOfHealth(int state) {
        int count = 0;
        for (int i = 0; i < listOfPatients.length; i++) {
            if (listOfPatients[i].getStateOfHealth() == state) {
                count++;
            }
        }
        if (count<=0) {
            return null;
        }
        Person[] pHealth = new Person[count];
        for (int i = 0, index = 0; i < listOfPatients.length; i++) {
            if (listOfPatients[i].getStateOfHealth() == state) {
                pHealth[index] = listOfPatients[i];
                index++;
            }
        }
        return pHealth;
    }

    /*
     * Returns a Person array with every person that has the heart
     * condition cause equal to the parameter cause from the listOfPatients array.
     *
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with the heart condition cause equal to the parameter cause.
     *
     * Return null if there is no Person with the heart condition cause
     * equal to the parameter cause.
     */
    public Person[] getPatientsByHeartConditionCause(int cause) {
        int count = 0;
        for (int i = 0; i < listOfPatients.length; i++) {
            if (listOfPatients[i].getCause() == cause) {
                count++;
            }
        }
        if (count<=0) {
            return null;
        }
        Person[] pCause = new Person[count];
        for (int i = 0, index = 0; i < listOfPatients.length; i++) {
            if (listOfPatients[i].getCause() == cause) {
                pCause[index] = listOfPatients[i];
                index++;
            }
        }
        return pCause;
    }

    /*
     * Assume there are numberOfHearts available for transplantation surgery.
     * Also assume that the hearts are of the same blood type as the
     * persons on the listOfPatients.
     * This method finds a set of persons to be the recepients of these
     * hearts.
     *
     * The method returns a Person array from the listOfPatients
     * array that have the highest potential for survivability after
     * the transplant. The array size is numberOfHearts.
     *
     * If numberOfHeartsAvailable is greater than listOfPatients
     * array size all Persons will receive a transplant.
     *
     * If numberOfHeartsAvailable is smaller than listOfPatients
     * array size find the set of people with the highest
     * potential for survivability.
     *
     * There is no correct solution, you may come up with any set of
     * persons from the listOfPatients array.
     */
    public Person[] match(int numberOfHearts) {
        Person[] pMatch = new Person[numberOfHearts];
        if (numberOfHearts>=listOfPatients.length) {
            return listOfPatients;
        } else {
            //Sort by age
            for (int i = 0 ; i < listOfPatients.length - 1; i++) {
                if(listOfPatients[i].getAge() > listOfPatients[i+1].getAge()) {
                    Person temp = listOfPatients[i];
                    listOfPatients[i] = listOfPatients[i+1];
                    listOfPatients[i+1] = temp;
                    i= -1;
                }
            }

            //Sort by urgency
            for (int i = 0 ; i < listOfPatients.length - 1; i++) {
                if(listOfPatients[i].getUrgency() < listOfPatients[i+1].getUrgency()) {
                    Person temp = listOfPatients[i];
                    listOfPatients[i] = listOfPatients[i+1];
                    listOfPatients[i+1] = temp;
                    i= -1;
                }
            }

            //Sort by state of health
            for (int i = 0 ; i < listOfPatients.length - 1; i++) {
                if(listOfPatients[i].getStateOfHealth() < listOfPatients[i+1].getStateOfHealth()) {
                    Person temp = listOfPatients[i];
                    listOfPatients[i] = listOfPatients[i+1];
                    listOfPatients[i+1] = temp;
                    i= -1;
                }
            }

            for (int i = 0; i < pMatch.length; i++) {
                pMatch[i] = listOfPatients[i];
            }
        }
        return pMatch;
    }


    /*
     * Client to test the methods you write
     */
    public static void main (String[] args) {

        //How to execute: cmd /c --% java HeartTransplant < data.txt
        HeartTransplant ht = new HeartTransplant();

        // read persons from file
        int numberOfLines = StdIn.readInt();
        int numberOfReadings = ht.readPersonsFromFile(numberOfLines);
        // Person test = new Person(10, 10, 14, 23, 3, 8, 5);
        StdOut.println(numberOfReadings + " patients read from file.");
        // StdOut.println(ht.addPerson(test, 5));
        StdOut.println();

        // read survivability by age from file
        numberOfLines = StdIn.readInt();
        numberOfReadings = ht.readSurvivabilityRateByAgeFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " survivability rates by age lines read from file.");
        StdOut.println();

        // read survivability by heart condition cause from file
        numberOfLines = StdIn.readInt();
        numberOfReadings = ht.readSurvivabilityRateByCauseFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " survivability rates by cause lines read from file.");
        StdOut.println();

        // list all patients
        for (Person p : ht.getListOfPatients()) {
            StdOut.println(p.toString());
        }
        StdOut.println();

        // list survivability by age rates
        for (SurvivabilityByAge rate : ht.getSurvivabilityByAge()) {
            StdOut.println(rate.toString());
        }
        StdOut.println();

        // list survivability by cause rates
        for (SurvivabilityByCause rate : ht.getSurvivabilityByCause()) {
            StdOut.println(rate.toString());
        }
        StdOut.println();

        // Person array in which with every Person that has age above the parameter age from the listOfPatients array
        int age = 70;
        StdOut.println(ht.getPatientsWithAgeAbove(age).length+" person/people above the age of "+age);
        for (Person p : ht.getPatientsWithAgeAbove(age)) {
            StdOut.println(p.toString());
        }
        StdOut.println();


        // Person array with every Person that has the state of health equal to the parameter state from the listOfPatients array
        int state = 7;
        StdOut.println(ht.getPatientsByStateOfHealth(state).length+" person/people with health state equal to "+state);
        for (Person p : ht.getPatientsByStateOfHealth(state)) {
            StdOut.println(p.toString());
        }
        StdOut.println();

        // Person array with every person that has the heart condition cause equal to the parameter cause from the listOfPatients array
        int cause = 0;
        StdOut.println(ht.getPatientsByHeartConditionCause(cause).length+" person/people with heart conditon cause code equal to "+cause);
        for (Person p : ht.getPatientsByHeartConditionCause(cause)) {
            StdOut.println(p.toString());
        }
        StdOut.println();

        // list all sorted patients
        for (Person p : ht.match(15)) {
            StdOut.println(p.toString());
        }

    }
}
