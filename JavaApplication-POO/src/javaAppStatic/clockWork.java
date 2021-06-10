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
    
    public int getHour(){
        return hour;
    }
    
    public int getMinute(){
        return minute;
    }
    
    public int getSeconds(){
        return seconds;
    }
    
    //SET    
    public void setId(int id){
        this.id = id;
    }
    
    public void setId(String locationName){
        this.locationName = locationName;
    }
    
    public void setHour(int hour){
    this.hour = hour;
    }
    
    public void setMinute(int minute){
    this.minute = minute;
    }
    
    public void setSeconds(int seconds){
    this.seconds = seconds;
    }

    
}


