package javaAppStatic;

/**
 *
 * @author Deise Kinsk
 */
public class clockWork {
    public static int hour;
    public static int minute;
    public static int seconds;
    
    private int id;
    private String locationName;
    
    //method
    public clockWork(){
    }
    
    public clockWork(int id, String locationName){
        this.id = id;
        this.locationName = locationName;
    }
    
    //GET
    public int getId(){
        return id;
    }
    
    public String getLocationName(){
        return locationName;
    }
    
    //SET    
    public void setId(int id){
        this.id = id;
    }
    
    public void setId(String locationName){
        this.locationName = locationName;
    }
      
    
}


