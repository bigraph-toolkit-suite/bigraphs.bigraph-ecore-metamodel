# An EMOF-Compliant Model for Bigraphs

*This project is an analogous implementation of [1] with some minor changes.*

The bigraphical meta model is implemented using EMF's Ecore meta model. 
The model serves as pure data model to improve the interoperability with other tools, thus, 
fostering the experimental evaluation of real-world applications. 
With this in mind, the meta model serves as a specification for future bigraph-related 
tools and can be regarded as a common interface. In order to support 
separation of concerns, other tools should add specific behavior 
superimposed upon this meta model. Hence, making it a implementation-agnostic 
meta model by moving implementation-specific details out from the meta model.

## Getting Started

Ecore allows to generate an API which provides basic functionality for creating bigraphs, 
if that is enough for a specific use case. However, using the API directly has an artificial, 
cumbersome and less expressive character in terms of the bigraph theory 
(e.g., most of the nuances w.r.t. bigraphical semantic are hidden from the user, 
or extending the model with a signature by hand is time-consuming especially 
when many models are created). Therefore, the *Bigraph Framework* was 
developed and should be used instead.

### Maven configuration

```xml
<dependency>
  <groupId>de.tudresden.inf.st.bigraphs.model</groupId>
  <artifactId>bigraph-ecore-model</artifactId>
  <version>${revision}</version>
</dependency>
```

To resolve this dependency, the following Maven repository must be added in the project's `pom.xml`:

```xml
<repositories>
    <repository>
        <snapshots>
            <enabled>false</enabled>
        </snapshots>
        <id>bintray-st-tu-dresden-maven-repository</id>
        <name>bintray</name>
        <url>https://dl.bintray.com/st-tu-dresden/maven-repository</url>
    </repository>
</repositories>
```

### Usage

*TODO*

## Details

Here, the changes made to the original meta model, introduced in [1], are described:

- The meta model is migrated to be CDO-compatible
- A root object representing the actual bigraph is introduced. Formerly, 
the constituent of the bigraph were loosely coupled
- Some interfaces are added for easier object management


## Build configuration and Deployment

The artifact includes the Ecore meta model and the generated API. 
Everything is packed within the `*.jar`. The artifact is deployed to [Bintray](https://bintray.com/).

### Building from Source

It is not necessary to build from source to use the bigraphical meta model but 
if you want to try out the latest version, the project can be easily built 
with the regular `mvn` command. Therefore, you will need 
[Maven v3.5.0 or above](https://maven.apache.org/run-maven/index.html).

Execute the following goals to run the build:
```bash
$ mvn clean install
```

### Deploy Artifacts

Execute the following goals to deploy artifacts to [Bintray](https://bintray.com/):
```bash
$ mvn clean deploy
```

A working API key is needed and you must join the [st-tu-dresden organization](https://bintray.com/st-tu-dresden) at Bintray.

## References

[[1]] _Kehrer, T. et al. 2016. An EMOF-Compliant Abstract Syntax for Bigraphs. Electronic Proceedings in Theoretical Computer Science. 231, (Dec. 2016), 16–30. DOI:https://doi.org/10.4204/EPTCS.231.2._

