package net.darkhax.esstest;

import net.darkhax.ess.DataCompound;
import net.darkhax.ess.ESSHelper;

public class ESSTest {
    
    /**
     * A string which represents the system specific newline character.
     */
    public static final String NEW_LINE = System.getProperty("line.separator");
    
    public static void main (String[] args) {
        
        runIOTest();
    }
    
    private static void runIOTest () {
        
        System.out.println("Starting basic IO test");
        
        // Creates a new CompoundTag with various data stored.
        final DataCompound write = new DataCompound();
        write.setValue("TestInteger", 1337);
        write.setValue("TestString", "Hello World!");
        // write.setValue("TestIntegerArray", new int[] { 200, 200, 208, 208, 203, 205, 203,
        // 205, 48, 30 });
        
        // Writes the data file for the IO test.
        ESSHelper.writeCompound(write, "IOTest.dat");

        // Reads the NBT data from the NBTExample.nbt file.
        final DataCompound read = ESSHelper.readCompound("IOTest.dat");
        
        // Results for the test
        System.out.println("Test Integer: " + write.toString());
        System.out.println("Read Dump: " + read.toString());
        System.out.println("The IO test was " + (read.equals(write) ? "successful!" : "not successful") + NEW_LINE);

        // Read from the bundled stream
        DataCompound stream = ESSHelper.readCompound(ESSTest.class.getResourceAsStream("/IOTest.dat"));

        System.out.println("Read from jar: " + stream.toString());
    }
}