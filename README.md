# An EMOF-Compliant Model for Bigraphs

*This project is an analogous implementation of [1] with some minor changes.*

The bigraphical meta model is implemented using EMF's Ecore meta model. The model serves as pure data model to improve the interoperability with other tools, thus, fostering the experimental evaluation of real-world applications. With this in mind, the meta model serves as a specification for future bigraph-related tools and can be regarded as a common interface. In order to support separation of concerns, other tools should add specific behavior superimposed upon this meta model. Hence, making it a implementation-agnostic meta model by moving implementation-specific details out from the meta model.

## Getting Started

Ecore allows to generate an API which provides basic functionalities for creating bigraphs, if that is enough for a specific use case. However, using the API directly has an artificial, cumbersome and less expressive character in terms of the bigraph theory (e.g., most of the nuances w.r.t. bigraphical semantic are hidden from the user, or extending the model with a signature by hand is time-consuming especially when many models are created). Therefore, the *Bigraph Framework* was developed and should be used instead.



### Maven configuration

```xml
<dependency>
  <groupId></groupId>
  <artifactId></artifactId>
  <version>${version}</version>
</dependency>
```

The following Maven repository must be added as well:

```xml
<dependency>
  <groupId></groupId>
  <artifactId></artifactId>
  <version>${version}</version>
</dependency>
```

(See Section [Deployment](#Deployment) for further information on that)

### Usage

*TODO*

## Details

The meta model is migrated to be CDO-compatible

An root objectt representing the acual bigraph is introduced. Formerly, the bigraph was 2



## Building from Source

It is not necessary to build from source to use the bigraphical meta model but if you want to try out the latest version, the project can be easily built with the [maven wrapper](https://github.com/takari/maven-wrapper). In this case, JDK 1.8 is needed.

```bash
$ ./mvnw clean install
```

If you want to build with the regular `mvn` command, you will need [Maven v3.5.0 or above](https://maven.apache.org/run-maven/index.html).

## Deployment

The artifact includes the Ecore meta model and the generated API. Everything is packed within the *.jar. The artifact is automatically deployed to a Git repository serving as a Maven repository.

See [DEPLOYMENT](Deployment.md) for further details on that topic.

## References

[1] Kehrer, T. et al. 2016. An EMOF-Compliant Abstract Syntax for Bigraphs. Electronic Proceedings in Theoretical Computer Science. 231, (Dec. 2016), 16–30. DOI:https://doi.org/10.4204/EPTCS.231.2.

