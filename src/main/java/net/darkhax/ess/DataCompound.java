package net.darkhax.ess;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;

public class DataCompound implements Serializable, Iterable<Serializable> {
    
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
     * Checks if the internal value map has the passed value.
     * 
     * @param value The value you are looking for.
     * @return boolean Whether or not the value passed is on the internal value map.
     */
    public boolean hasValue (Serializable value) {
        
        return valueMap.containsValue(value);
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
    
    /**
     * Allows an action to be applied on all values in the internal value map.
     * 
     * @param action The action to apply to all values in the internal value map.
     */
    public void forEach (BiConsumer<? super String, ? super Serializable> action) {
        
        this.valueMap.forEach(action);
    }
    
    /**
     * Replaces an existing value on the internal value map with a new one.
     * 
     * @param name The name of the value to replace.
     * @param value The value to replace the older value with.
     * @return Serializable The value that has been replaced.
     */
    public Serializable replace (String name, Serializable value) {
        
        return valueMap.replace(name, value);
    }
    
    /**
     * Gets a byte value from the internal value map. If no value is found with the given name,
     * a default value will be returned.
     * 
     * @param name The name of the value to search for.
     * @return byte The stored byte value, or a default value if no appropriate value was
     *         found.
     */
    public byte getByte (String name) {
        
        Serializable value = this.valueMap.get(name);
        return (value instanceof Byte) ? (byte) value : 0;
    }
    
    /**
     * Gets a short value from the internal value map. If no value is found with the given
     * name, a default value will be returned.
     * 
     * @param name The name of the value to search for.
     * @return short The stored short value, or a default value if no appropriate value was
     *         found.
     */
    public short getShort (String name) {
        
        Serializable value = this.valueMap.get(name);
        return (value instanceof Short) ? (short) value : 0;
    }
    
    /**
     * Gets a int value from the internal value map. If no value is found with the given name,
     * a default value will be returned.
     * 
     * @param name The name of the value to search for.
     * @return int The stored int value, or a default value if no appropriate value was found.
     */
    public int getInt (String name) {
        
        Serializable value = this.valueMap.get(name);
        return (value instanceof Integer) ? (int) value : 0;
    }
    
    /**
     * Gets a long value from the internal value map. If no value is found with the given name,
     * a default value will be returned.
     * 
     * @param name The name of the value to search for.
     * @return long The stored long value, or a default value if no appropriate value was
     *         found.
     */
    public long getLong (String name) {
        
        Serializable value = this.valueMap.get(name);
        return (value instanceof Long) ? (long) value : 0;
    }
    
    /**
     * Gets a float value from the internal value map. If no value is found with the given
     * name, a default value will be returned.
     * 
     * @param name The name of the value to search for.
     * @return float The stored float value, or a default value if no appropriate value was
     *         found.
     */
    public float getFloat (String name) {
        
        Serializable value = this.valueMap.get(name);
        return (value instanceof Float) ? (float) value : 0;
    }
    
    /**
     * Gets a double value from the internal value map. If no value is found with the given
     * name, a default value will be returned.
     * 
     * @param name The name of the value to search for.
     * @return double The stored double value, or a default value if no appropriate value was
     *         found.
     */
    public double getDouble (String name) {
        
        Serializable value = this.valueMap.get(name);
        return (value instanceof Double) ? (double) value : 0;
    }
    
    /**
     * Gets a byte[] value from the internal value map.
     * 
     * @param name The name of the value to search for.
     * @return byte[] The stored byte[] value, or a default value if no appropriate value was
     *         found.
     */
    public byte[] getByteArray (String name) {
        
        Serializable value = this.valueMap.get(name);
        return (value instanceof byte[]) ? (byte[]) value : new byte[0];
    }
    
    /**
     * Gets a String value from the internal value map.
     * 
     * @param name The name of the value to search for.
     * @return String The stored String value, or a default value if no appropriate value was
     *         found.
     */
    public String getString (String name) {
        
        Serializable value = this.valueMap.get(name);
        return (value instanceof String) ? (String) value : "";
    }
    
    /**
     * Gets a List value from the internal value map.
     * 
     * @param name The name of the value to search for.
     * @return List The stored List value, or a default value if no appropriate value was
     *         found.
     */
    public List<?> getList (String name) {
        
        Serializable value = this.valueMap.get(name);
        return (value instanceof List) ? (List<?>) value : null;
    }
    
    /**
     * Gets a DataCompound value from the internal value map.
     * 
     * @param name The name of the value to search for.
     * @return DataCompound The stored DataCompound value, or a default value if no appropriate
     *         value was found.
     */
    public DataCompound getDataCompound (String name) {
        
        Serializable value = this.valueMap.get(name);
        return (value instanceof DataCompound) ? (DataCompound) value : null;
    }
    
    /**
     * Gets a int[] value from the internal value map.
     * 
     * @param name The name of the value to search for.
     * @return int[] The stored int[] value, or a default value if no appropriate value was
     *         found.
     */
    public int[] getIntArray (String name) {
        
        Serializable value = this.valueMap.get(name);
        return (value instanceof int[]) ? (int[]) value : new int[0];
    }
    
    /**
     * Gets a double[] value from the internal value map.
     * 
     * @param name The name of the value to search for.
     * @return double[] The stored double[] value, or a default value if no appropriate value
     *         was found.
     */
    public double[] getDoubleArray (String name) {
        
        Serializable value = this.valueMap.get(name);
        return (value instanceof double[]) ? (double[]) value : new double[0];
    }
    
    /**
     * Gets a float[] value from the internal value map.
     * 
     * @param name The name of the value to search for.
     * @return flot[] The stored float[] value, or a default value if no appropriate value was
     *         found.
     */
    public float[] getFloatArray (String name) {
        
        Serializable value = this.valueMap.get(name);
        return (value instanceof float[]) ? (float[]) value : new float[0];
    }
    
    /**
     * Gets a long[] value from the internal value map.
     * 
     * @param name The name of the value to search for.
     * @return long[] The stored long[] value, or a default value if no appropriate value was
     *         found.
     */
    public long[] getLongArray (String name) {
        
        Serializable value = this.valueMap.get(name);
        return (value instanceof long[]) ? (long[]) value : new long[0];
    }
    
    /**
     * Gets a short[] value from the internal value map.
     * 
     * @param name The name of the value to search for.
     * @return short[] The stored short[] value, or a default value if no appropriate value was
     *         found.
     */
    public short[] getShortArray (String name) {
        
        Serializable value = this.valueMap.get(name);
        return (value instanceof short[]) ? (short[]) value : new short[0];
    }
    
    /**
     * Gets a String[] value from the internal value map.
     * 
     * @param name The name of the value to search for.
     * @return String[] The stored String[] value, or a default value if no appropriate value
     *         was found.
     */
    public String[] getStringArray (String name) {
        
        Serializable value = this.valueMap.get(name);
        return (value instanceof String[]) ? (String[]) value : new String[0];
    }
    
    @Override
    public Iterator<Serializable> iterator () {
        
        return this.valueMap.values().iterator();
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public DataCompound clone () {
        
        return new DataCompound((HashMap<String, Serializable>) this.valueMap.clone());
    }
    
    @Override
    public int hashCode () {
        
        return 31 * 1 + ((valueMap == null) ? 0 : valueMap.hashCode());
    }
    
    @Override
    public boolean equals (Object obj) {
        
        if (this == obj)
            return true;
            
        if (obj == null)
            return false;
            
        if (getClass() != obj.getClass())
            return false;
            
        DataCompound other = (DataCompound) obj;
        
        if (valueMap == null && other.valueMap == null)
            return true;
            
        else if (valueMap.equals(other.valueMap))
            return true;
            
        return false;
    }
    
    @Override
    public String toString () {
        
        return "DataCompound [valueMap=" + valueMap + "]";
    }
}
