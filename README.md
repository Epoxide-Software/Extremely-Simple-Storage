# Extremely Simple Storage
A Java library for saving data in an extremely simple way.

## Source Code
The latest source code for this project can be found on [GitHub](https://github.com/Epoxide-Software/Extremely-Simple-Storage). If you are using Git, you can clone the project using the following command `git clone https://github.com/Epoxide-Software/Extremely-Simple-Storage`.

## Building from Source
This project can be built using the Gradle Wrapper included in the repository. When the `gradlew build` command is executed from within the repo directory, a compiled JAR will be created in `~/build/libs`. Sources and Javadocs will also be generated in the same directory. Alternatively the latest builds of Extremely Simple Storage along with Sources and Javadocs can be found [here](http://maven.epoxide.xyz/net/darkhax/ess/ExtremelySimpleStorage/).

## Contributing
This project is open to contributions from the public. If you would like to contribute to this project you can open an issue or create a new pull request. Pull requests are held to a high standard so please make sure to read the [Contributing Guidelines]() before hand. 

## Quick Start
Extremely Simple Storage is very easy to use and understand. `DataCompound` objects can be created at any time, and hold information using string keys. Using the tools provided, these objects can then be written to file. The following code block shows an example of how this looks.
```java
  // Creates a new DataCompound with various data stored.
  DataCompound data = new DataCompound();
  data.setValue("TestInteger", 1337);
  data.setValue("TestString", "Hello World!");
  data.setValue("TestIntegerArray", new int[] { 200, 200, 208, 208, 203, 205, 203, 205, 48, 30 });
  
  // Writes the DataCompound to a new file called Example.dat. Any extension can be used. 
  ESSFile.writeCompound(data, "Example.dat");
  
  // Reads the DataCompound from the Example.dat file.
  data = ESSHelper.readCompound("Example.dat");
```

## Dependency Management
If you are using [Maven](https://maven.apache.org/download.cgi) to manage your dependencies. Add the following into your `pom.xml` file. Make sure to update the version from time to time.
```
<repositories>
    <repository>
        <id>epoxide.xyz</id>
        <url>http://maven.epoxide.xyz</url>
    </repository>
</repositories>

<dependency>
     <groupId>net.darkhax.ess</groupId>
     <artifactId>ExtremelySimpleStorage</artifactId>
     <version>1.0.13</version>
</dependency>
```

If you are using [Gradle](https://gradle.org) to manage your dependencies, add the following into your `build.gradle` file. Make sure to update the version from time to time.
```
repositories {

    maven { 
    
        url 'http://maven.epoxide.xyz' 
    }
}

dependencies {

    compile "net.darkhax.ess:ExtremelySimpleStorage:1.0.13"
}
```

##Legal Information
Extremely Simple Storage is licensed under the [LGPL 2.1](https://www.gnu.org/licenses/old-licenses/lgpl-2.1.en.html). Please see the `LICENSE.txt` for more details. 

##Credits
* [Darkhax](https://github.com/darkhax) - Maintainer of Extremely Simple Storage.
* [Lclc98](https://github.com/lclc98) - Maintainer of build system and gradle setup. 
