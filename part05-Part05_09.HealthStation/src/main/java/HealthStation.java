
public class HealthStation {

private int tally;



    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.tally++;
        return person.getWeight();        
    }
    
    public void feed (Person person) {
        person.setWeight(weigh(person)+1);
    }
    
    public int weighings (){
        return this.tally;
    }

}
