package net.darkhax.ess;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class ESSHelper {
    
    /**
     * The current version of the library. Follows a Major-Release-Build structure. The major
     * number points to the current iteration of the project. The release number points to the
     * current release of the project. The build number refers to the current build of the
     * project and is handled by the build server.
     */
    public static final String VERSION = "1.0.0";
    
    /**
     * Attempts to read a DataCompound from the passed filepath string. See
     * {@link #readCompound(File)} for more information.
     * 
     * @param file A string representation of the filepath to read from.
     * @return DataCompound The data that was read from the file.
     */
    public static DataCompound readCompound (String file) {
        
        return readCompound(new File(file));
    }
    
    /**
     * Attempts to read a DataCompound from the passed file. This will use an
     * InflaterInputStream to read the compressed data from
     * {@link #writeCompound(DataCompound, File)}.
     * 
     * @param file The file to read data from.
     * @return DataCompound The data that was read from the file.
     */
    public static DataCompound readCompound (File file) {
        
        try (FileInputStream fileStream = new FileInputStream(file); ObjectInputStream objectStream = new ObjectInputStream(new InflaterInputStream(fileStream));) {
            
            return (DataCompound) objectStream.readObject();
        }
        
        catch (IOException | ClassNotFoundException exception) {
            
            exception.printStackTrace();
        }
        
        return null;
    }
    
    /**
     * Writes the passed DataCompound to the specified file location. See
     * {@link #writeCompound(DataCompound, File)} for more specifics.
     * 
     * @param data The DataCompound to write to the file.
     * @param file A String representation of the filepath to safe the file at.
     */
    public static void writeCompound (DataCompound data, String file) {
        
        writeCompound(data, new File(file));
    }
    
    /**
     * Writes the passed DataCompound to the specified file location. Makes use of
     * DeflaterOutputStream to compress the data. All data is forcefully compressed.
     * 
     * @param data the DataCompound to write to the file.
     * @param file The File to write the data to.
     */
    public static void writeCompound (DataCompound data, File file) {
        
        try (FileOutputStream fileStream = new FileOutputStream(file); ObjectOutputStream objectStream = new ObjectOutputStream(new DeflaterOutputStream(fileStream))) {
            
            objectStream.writeObject(data);
        }
        
        catch (final IOException exception) {
            
            exception.printStackTrace();
        }
    }
}
