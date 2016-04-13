package net.darkhax.ess;

import java.io.Serializable;
import java.util.HashMap;

public class DataCompound implements Serializable {
    
    /**
     * The serial UID for a DataCompound. Used by Java to confirm deserialization of a
     * DataCompound.
     */
    private static final long serialVersionUID = 3964207276467494972L;
    
    /**
     * A map which holds all the data held by the object.
     */
    private HashMap<String, Serializable> valueMap;
    
    /**
     * Constructs a default DataCompound with no data on it.
     */
    public DataCompound() {
        
        valueMap = new HashMap<String, Serializable>();
    }
    
    /**
     * Constructs a DataCompound object with a predefined map of data on it.
     * 
     * @param values A map of the data for the tag to initially have.
     */
    public DataCompound(HashMap<String, Serializable> values) {
        
        this.valueMap = values;
    }
    
    /**
     * Gets an array of all the names of the internal value map.
     * 
     * @return String[] An array of all internal map names.
     */
    public String[] getNames () {
        
        return this.valueMap.keySet().toArray(new String[valueMap.size()]);
    }
    
    /**
     * Gets an array of all the values of the internal value map.
     * 
     * @return Serializable[] An array of all internal values.
     */
    public Serializable[] getValues () {
        
        return this.valueMap.entrySet().toArray(new Serializable[valueMap.size()]);
    }
    
    /**
     * Checks if the internal value map is empty.
     * 
     * @return boolean Whether or not the internal value map is empty.
     */
    public boolean isEmpty () {
        
        return this.valueMap.isEmpty();
    }
    
    /**
     * Places a value on the internal value map.
     * 
     * @param name The name to store the value under.
     * @param data The data to store on the internal value map.
     */
    public void setValue (String name, Serializable data) {
        
        this.valueMap.put(name, data);
    }
    
    /**
     * Gets a value from the internal value map by searching for the name the value was
     * registered with.
     * 
     * @param name The name of the value to search for.
     */
    public Serializable getValue (String name) {
        
        return this.valueMap.get(name);
    }
    
    /**
     * Checks if a value with the given name exists on the internal value map.
     * 
     * @param name The name of the value to search for.
     * @return boolean Whether or not a value has been registered with the passed name.
     */
    public boolean hasName (String name) {
        
        return this.valueMap.containsKey(name);
    }
    
    /**
     * Removes a value from the internal value map with the passed name.
     * 
     * @param name The name of the tag to remove.
     */
    public void removeValue (String name) {
        
        this.valueMap.remove(name);
    }
    
    /**
     * Gets the size of the internal value map.
     * 
     * @return int The size of the internal value map.
     */
    public int getSize () {
        
        return this.valueMap.size();
    }
    
    /**
     * Empties the internal value map.
     */
    public void empty () {
        
        this.valueMap.clear();
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public DataCompound clone () {
        
        return new DataCompound((HashMap<String, Serializable>) this.valueMap.clone());
    }
}
