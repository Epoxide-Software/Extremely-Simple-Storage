# Extremely Simple Storage ![License](https://img.shields.io/badge/license-MIT-blue.svg "License Image")
A Java library for saving data in an extremely simple way. 

## Source Code
The latest source code can be found here on [GitHub](https://github.com/darkhax/Extremely-Simple-Storage). If you are using Git, you can use the following command to clone the project: `git clone git:github.com/darkhax/Extremely-Simple-Storage.git`

##Building from Source
This project can be built using the Gradle Wrapper included in the repository. When the `gradlew build` command is executed from within the repo directory, a compiled JAR will be created in `~/build/libs`. Sources and Javadocs will also be generated in the same directory. Alternatively the latest builds of Extremely Simple Storage along with Sources and Javadocs can be found [here](http://maven.epoxide.xyz/net/darkhax/opennbt/Extremely-Simple-Storage)

##Contributing
This project is open to contributions from other members of the community. If you would like to contribute towards this project you can open an issue, or create a new pull request. If you create a new pull request, please be sure to read the project [guidelines and coding standards](https://github.com/darkhax/Extremely-Simple-Storage/blob/master/CONTRIBUTING.md).

##Quick Start
Extremely Simple Storage is very easy to start using. The below is an example of how to read and write a DataCompound.
```
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

##Dependency Management
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
     <version>1.0.4</version>
</dependency>
```

If you are using [Gradle](https://gradle.org) to manage your dependencies, add the following into your `build.gradle` file. Make sure to update the version from time to time.
```
repositories {

    mavenCentral()
    maven { 
    
        url 'http://maven.epoxide.xyz' 
    }
}

dependencies {

    compile "net.darkhax.ess:ExtremelySimpleStorage:1.0.4"
}
```

##Legal Information
Extremely Simple Storage is licensed under the [MIT license](https://opensource.org/licenses/mit-license.html). Please see the `LICENSE.txt` for more details. 

##Credits
* [Darkhax](https://github.com/darkhax) - Maintainer of Extremely Simple Storage.
* [Lclc98](https://github.com/lclc98) - Maintainer of build system and gradle setup. 
