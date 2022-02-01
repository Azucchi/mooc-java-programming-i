
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest(){
        if(elements.isEmpty()){
            return null;
        }
        
        String returnValue = "";
        
        for(String each: elements){
            if(each.length() > returnValue.length()){
                returnValue = each;
            }
        }
        
        return returnValue;
    }
    
    

}
