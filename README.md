<img src="./etc/logo-bigraph-metamodel-dark.png" style="zoom:90%;" />

# An EMOF-Compliant Metamodel for Bigraphs based on Ecore


Version | Notice | 
--- | ---
|1.3.0-SNAPSHOT| *This project is an analogous implementation of [[1]](#References) with some minor changes.*|


The metamodel for bigraphs, devised by Robin Milner, is implemented using EMF's Ecore metamodel. 
The model serves as pure data model to improve the interoperability with other bigraph-driven tools, thus, fostering the experimental evaluation of real-world applications. 
With this in mind, the metamodel serves as a specification for future tools and can be regarded as a common interface. 
In order to support separation of concerns, other tools should add specific behavior superimposed upon this metamodel. 
Hence, the aim of this project is to provide a uniform implementation-agnostic metamodel by moving implementation-specific details out from the metamodel.

## Getting Started

Ecore supports the creation of an API that provides the basic the functionality for creating bigraphs.
 That may be enough for a experimental use cases. 
However, using the generated API directly has an artificial, less expressive character in terms of the bigraph theory (i.e., most of the nuances of the bigraphical semantics are hidden from the user), and is often cumbersome (i.e., extending the model with a signature by hand is time-consuming especially when many models with different signatures are going to be created, bigraph operators cannot be used to create complex bigraphs). 
Therefore, the [*Bigraph Framework*](https://git-st.inf.tu-dresden.de/bigraphs/bigraph-framework) was developed and should be used instead.

### Maven Configuration

To use the Ecore bigraph metamodel in a Maven project:
```xml
<dependency>
  <groupId>de.tudresden.inf.st.bigraphs.model</groupId>
  <artifactId>bigraph-ecore-model</artifactId>
  <version>${version}</version>
</dependency>

<!-- The relevant Ecore dependencies should be provided as well -->
<dependency>
    <groupId>org.eclipse.emf</groupId>
    <artifactId>org.eclipse.emf.ecore</artifactId>
    <version>${emf.ecore.version}</version>
</dependency>
<dependency>
    <groupId>org.eclipse.emf</groupId>
    <artifactId>org.eclipse.emf.ecore.xmi</artifactId>
    <version>${emf.ecore.xmi.version}</version>
</dependency>
<dependency>
    <groupId>org.eclipse.emf</groupId>
    <artifactId>org.eclipse.emf.common</artifactId>
    <version>${emf.common.version}</version>
</dependency>
```

To resolve this dependency, the following Maven repository must be added in the project's `pom.xml`:

```xml
<repositories>
    <repository>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
        <id>STFactory</id>
        <name>st-tu-dresden-artifactory</name>
        <url>https://stgroup.jfrog.io/artifactory/st-tu-dresden-maven-repository/</url>
    </repository>
</repositories>
```

## Details

Here, the changes made to the original metamodel, introduced in [[1]](#References), are described:

- The metamodel is migrated to be CDO-compatible
- A root class `BBigraph` representing the actual bigraph is introduced. Formerly, the constituents of a bigraph were loosely coupled.
- Some interfaces are added for easier object management
- A separate Signature/Sortings metamodel were introduced: `BSignature` and `BSignature`


## Build Configuration

The Java artifact includes the Ecore metamodels and the generated APIs. 
Everything is packed within the `*.jar`. 
The artifact is deployed to the [ST-Group's Artifactory](https://stgroup.jfrog.io/).

### Building from Source

It is not necessary to build from source to use the Ecore bigraph metamodel but 
if you want to try out the latest version, the project can be easily built 
with the regular `mvn` command. Therefore, you will need 
[Maven v3.5.0 or above](https://maven.apache.org/run-maven/index.html).

First, checkout the `master` branch of this project.
Then, execute the following goals to run the build:
```bash
$ mvn clean install
```
The `*.jar` can be found inside the `./target/` folder of this project.
The dependency will be also installed in the Maven Local Repository, usually located under `~/.m2/` and 
can be used by following the instruction given [above](#Maven-Configuration)


### Deploying Artifacts

The Artifactoy details (username + password) for the deployment must be provided to the 
[Maven Artifactory Plugin](https://www.jfrog.com/confluence/display/JFROG/Maven+Artifactory+Plugin) as used in
the project's `pom.xml` file.

Execute the following goals to deploy the Java artifacts to the [Artifactory of ST-Group@TU-Dresden](https://stgroup.jfrog.io/):

```bash
# Use the default settings.xml located at ~/.m2/
$ mvn clean deploy

# Define the Artifactory details by providing the resp. properties
$ mvn deploy -Dusername=username -Dpassword=password
```

<!--
# provide a dedicated Maven settings.xml
$ mvn deploy -Dbuildnumber=1 -s settings.xml
-->

<!--
A working API key is needed and you must join the [st-tu-dresden organization](https://bintray.com/st-tu-dresden) at Bintray.
-->


## References

[1] _Kehrer, T. et al. 2016. An EMOF-Compliant Abstract Syntax for Bigraphs. Electronic Proceedings in Theoretical Computer Science. 231, (Dec. 2016), 16–30. DOI:https://doi.org/10.4204/EPTCS.231.2._

## License

This library is Open Source software released under the Apache 2.0 license.

```text
   Copyright 2020 Dominik Grzelak

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License. 
```



