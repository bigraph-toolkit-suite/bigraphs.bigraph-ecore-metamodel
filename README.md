<img src="./etc/logo-bigraph-metamodel-dark.png" style="zoom:90%;" />

# Bigraph Ecore Metamodel (BEM): An EMOF-Compliant Specification for Bigraphs

This project provides a reference implementation of the abstract syntax specification for bigraphs, as originally introduced in [[1]](#References). 
The implementation is based on the Ecore metamodeling language, part of the [Eclipse Modeling Framework (EMF)](https://projects.eclipse.org/projects/modeling.emf.emf).

This EMOF-compliant specification aligns with [[1]](#References), but it is subject to minor modifications as suggested in [[2]](#References).
Refer also to section ["Changes Made to the Original Specification"](#Changes-Made-to-the-Original-Specification) for a brief overview.

[How to Cite this Artifact](#How-to-Cite-this-Artifact)

> **Note:** This is a highly technical document intended primarily for developers and researchers working with software tools at the modeling and integration level. It is not intended for end-users of the Bigraph Framework API.

----

| Version        | Notice                                                                                             | 
|----------------|----------------------------------------------------------------------------------------------------|
| 2.0.1          | *(Release)*                                            |
| 1.6.1          | *(Release)*                                                                                          |
| 1.6.1-SNAPSHOT | *(SNAPSHOT)* Dependency fix                                                                          |
| 1.6.0          | *(Release)*                                                                                          |
| 1.6.0-SNAPSHOT | *(Draft) New namespace: org.bigraphs.model*                                                        |
| 1.5.0-SNAPSHOT | *(Draft) New build and deploy workflow; Dependencies updated*                                      |
| 1.4.0-SNAPSHOT | *(Draft) This project is an analogous implementation of [[1]](#References) with some minor changes.* |
----

## What are Bigraphs?

Bigraphs [[3]](#References), developed by Robin Milner, are a formal modeling framework rooted in category theory and widely used in computer science for representing and analyzing complex systems. Their primary applications lie in the domains of concurrency, mobility, and interaction.

As part of the broader field of process algebra, bigraphs provide a graphical and compositional means of modeling systems, processes, agents, or other dynamic and discrete structures.

## Rationale of This Specification

The metamodel for bigraphs is implemented using EMF’s Ecore metamodel and is called the *Bigraph Ecore Metamodel (BEM)*.
BEM functions as a pure data model designed to enhance interoperability with other tools, frameworks, and libraries, thereby supporting the experimental evaluation of real-world applications.

With this purpose, BEM acts as a specification for both existing and future tools and can be regarded as a common interface. 
To improve separation of concerns, it is recommended that additional tools build distinct behavior layers on top of this metamodel.

Therefore, the goal of this project is to provide a uniform, implementation-agnostic specification language (i.e., metamodel) for bigraphs by isolating implementation-specific details from the metamodel itself.

## Contents

This project contains two metamodels serving different purposes:
- Root
  - model/
    - bigraphBaseModel.aird: This file is used for workspace management and organizing models, particularly within the Eclipse environment.
    - Signature Metamodel: Contains the specification to instantiate basic and dynamic signatures, and place-sorted signatures
      - signatureBaseModel.ecore
      - signatureBaseModel.genmodel
    - Bigraph Metamodel: Contains the specification for instantiating pure bigraphs
      - bigraphBaseModel.ecore
      - bigraphBaseModel.genmodel

The information of the dedicated signature metamodel is used to extend the base bigraph metamodel as described in [[2]](#References).

The `*.ecore` files define the static structure and semantics of a signature or bigraph.
Typically, the namespace, types, properties, operations and references of a signature or bigraph model are defined therein.

The `*.genmodel` files contain configuration settings that define how code should be generated from the associated Ecore metamodels. 
It specifies information such as the target programming language, and other code generation-related settings.

The `*.aird` file is used to store and manage model-driven development workspaces, which can include multiple related models (e.g., `.ecore`, `.genmodel`) and the relationships between them.
These files are not directly involved in code generation.

## Getting Started

### **Recommended Setup**

For the best development experience, it is recommended to use the [Eclipse Modeling Tools](https://www.eclipse.org/downloads/packages/release/2025-06/r/eclipse-modeling-tools) which includes all necessary tools for working with Ecore and EMF-based models.

### Overview of the Structure

| ![signature-metamodel-hierarchy-ecore](etc/signature-metamodel-hierarchy-ecore.png) | ![bigraph-metamodel-hierarchy-ecore](etc/bigraph-metamodel-hierarchy-ecore.png) |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| Overview of the Base Signature MetaModel (*.ecore)           | Overview of the Base Bigraph MetaModel (*.ecore)             |

### Maven Configuration

To use the signature and bigraph Ecore metamodels in any Maven-based/Gradle-based Java project, the following dependencies have to be included in the `pom.xml`:
```xml
<dependency>
  <groupId>org.bigraphs.model</groupId>
  <artifactId>bigraph-ecore-model</artifactId>
  <version>${version}</version>
</dependency>

<!-- The related EMF dependencies should be provided as well to work with Ecore -->
<dependency>
    <groupId>org.eclipse.emf</groupId>
    <artifactId>org.eclipse.emf.ecore</artifactId>
    <!-- Minimum: 2.23.0 -->
    <version>${emf.ecore.version}</version>
</dependency>
<dependency>
    <groupId>org.eclipse.emf</groupId>
    <artifactId>org.eclipse.emf.ecore.xmi</artifactId>
    <!-- Minimum: 2.16.0 -->
    <version>${emf.ecore.xmi.version}</version>
</dependency>
<dependency>
    <groupId>org.eclipse.emf</groupId>
    <artifactId>org.eclipse.emf.common</artifactId>
    <!-- Minimum: 2.21.0 -->
    <version>${emf.common.version}</version>
</dependency>
```

The artifacts are deployed to Maven Central.

### Gradle Configuration

```
ext {
    version = '2.0.1' // or whatever the latest BEM version is
    emfEcoreVersion = '2.23.0' // Minimum: 2.23.0
    emfEcoreXmiVersion = '2.16.0' // Minimum: 2.16.0
    emfCommonVersion = '2.21.0' // Minimum: 2.21.0
}

dependencies {
    implementation "org.bigraphs.model:bigraph-ecore-model:${version}"

    // EMF dependencies
    implementation "org.eclipse.emf:org.eclipse.emf.ecore:${emfEcoreVersion}"        
    implementation "org.eclipse.emf:org.eclipse.emf.ecore.xmi:${emfEcoreXmiVersion}"  
    implementation "org.eclipse.emf:org.eclipse.emf.common:${emfCommonVersion}"       
}
```

### Note on the Generated API

Ecore supports the *automatic generation* of an API from metamodels, enabling the creation and manipulation of bigraphs and signatures in Java or other supported languages. For this purpose, `*.genmodel` files are provided for each metamodel.

This approach may suffice for some experimental or lightweight use cases. However, using the generated API directly can feel artificial and less expressive from the perspective of bigraph theory. Many of the theoretical nuances of bigraphical semantics are abstracted away, making it harder to reason about or work with bigraphs at a conceptual level. Additionally, manually extending the model with signatures can be tedious—especially when multiple models with varying signatures are involved—and the absence of built-in bigraph operators complicates the construction of complex structures.

For these reasons, the [Bigraph Framework](https://bigraphs.org/products/bigraph-framework/) was developed. It provides a higher-level, programmatic interface for working with bigraphs in Java and is the recommended tool for most practical applications.

## Changes Made to the Original Specification

Here, the changes made to the original metamodel introduced in [[1]](#References) are described:

- A class `BBigraph` is introduced representing a container for a whole bigraph and its parts. Formerly, the constituents of a bigraph were loosely coupled.
- A separate signature metamodel is introduced: `BSignature` and `BSorting`
  - The class `BKindSignature` is provided that implements kind bigraphs (i.e., place-sorted bigraphs)
- Setting and retrieving node attributes is supported
- The metamodel is migrated to be CDO-compatible
- Some interfaces are added for easier object management


Refer to [[2]](#References) for more details regarding the specific changes.

## How to Use the Specification

![metamodel-workflow](etc/metamodel-workflow.png)

Refer to [[2]](#References) for more details concerning the workflow on how to use the metamodels.


## Development: Build Configuration

> **Note:** The Java artifact is deployed to Maven Central.
> It includes the Ecore metamodels for signatures and pure bigraphs, and the generated APIs.
> Everything is packaged within the `*.jar`.

For this project, Maven is used as the build management tool.
It is not necessary to build from source to use the bigraph Ecore metamodel but
if you want to try out the latest version, the project can be easily built
with the regular `mvn` command.
The recommendation here is to build it with the regular `mvn` command.
You will need [Maven v3.6.3 or above](https://maven.apache.org/install.html).

> **Note:** The required version of Maven is 3.6.3 in combination with Java 11, and Maven >=3.8.3 with Java >=17.

### Initialize

First, checkout the `main` branch of this project:

```shell
$ git clone https://github.com/bigraph-toolkit-suite/bigraphs.bigraph-ecore-metamodel.git
```

The following command has to be run once:
```shell
$ mvn initialize
```
It installs some dependencies located in the `./libs/` folder of this project in your local Maven repository, which is usually located at `~/.m2/`.
These are required for the development and build process.
These currently include:
- org.eclipse.emf.cdo_4.20.0.v20221124-1637.jar
- org.eclipse.emf.cdo.common_4.20.0.v20221106-0628.jar
- org.eclipse.net4j.util_3.21.0.v20221123-1721.jar

They are necessary to make the bigraph Ecore model CDO-compatible.

### Building from Source

Execute the following goals to run the build:
```shell
$ mvn clean install
```
The `*.jar` can be found inside the `./target/` folder of this project.
The dependency will be also installed in the local Maven repository and 
can be used in other projects by following the instruction given [above](#Library-Approach)


### Deployment

**Prerequisites**

The Sonatype account details (username + password) for the deployment must be provided to the 
Maven Sonatype Plugin as used in the project's `pom.xml` file.

The Maven GPG plugin is used to sign the components for the deployment. More information can be found [here](https://central.sonatype.org/publish/requirements/gpg/).
It relies on the gpg command being installed:

```shell
$ sudo apt install gnupg2
```

and the GPG credentials being available e.g. from `settings.xml`:

- In `settings.xml` should be a profile and server configuration both with the `<id>central</id>` (see [here](https://central.sonatype.org/publish/publish-portal-maven/#credentials))

- Listing keys: `gpg --list-keys --keyid-format short`

**Release Deployment**

To perform a release deployment execute:
```shell
# Use the default settings.xml located at ~/.m2/
mvn clean deploy -DskipTests -P release,central
```

Artifacts must be manually released for Release Deployments in the Nexus Repository Manager.

> **Note for Snapshot-Releases:** For that the version tag in the `pom.xml` must be suffixed with `-SNAPSHOT`.

## FAQ

### What Is EMF?

The EMF is a Java-based framework for developing structured data models and building sophisticated software tools and application frameworks around them.
 It includes facilities for model definition, code generation, and runtime support, and is a core component of the [Eclipse Modeling Project](https://projects.eclipse.org/projects/modeling).

### What Is Ecore?

Ecore, in the context of EMF, is a metamodeling language and a central component of the framework. It is used to define the structure of models—such as classes, attributes, and relationships.
Ecore is based on a subset of the [MOF](http://www.omg.org/mof/) (Meta Object Facility) standard and can be regarded as a reference implementation of it. MOF is a widely recognized standard for metamodeling in software engineering.

You can also say that Ecore is EMF’s metamodel. Ecore can be considered an EMF model, thus functioning as its own metamodel.

Therefore, when we say *Bigraph Ecore Metamodel (BEM)*, we refer to the custom-designed base metamodel created using the Ecore modeling language within EMF.

### Why Metamodeling?

Metamodeling is a fundamental concept and practice within Model-Driven Engineering (MDE) that involves creating models to describe other models. 
In essence, a metamodel defines the structure, constraints, and relationships that its model instances must follow.
Metamodels provide a systematic and widely accepted way to define the syntax and semantics of modeling languages, as well as the organization of models within those languages.

## How to Cite this Artifact

BibTeX:
```text
@misc{grzelak_2023_10043063,
  author       = {Grzelak, Dominik},
  title        = {{Bigraph Ecore Metamodel (BEM): An EMOF-Compliant Specification for Bigraphs}},
  month        = oct,
  year         = 2023,
  publisher    = {Zenodo},
  doi          = {10.5281/zenodo.10043063},
  url          = {https://doi.org/10.5281/zenodo.10043063}
}
```

## References

- [1] Kehrer, T. et al. (2016). An EMOF-Compliant Abstract Syntax for Bigraphs. Electronic Proceedings in Theoretical Computer Science, 231, 16-30. DOI: https://doi.org/10.4204/EPTCS.231.2.
- [2] D. Grzelak, Model-oriented Programming with Bigraphical Reactive Systems: Theory and Implementation. Dresden University of Technology, Germany, 2024. [Online]. Available: https://nbn-resolving.org/urn:nbn:de:bsz:14-qucosa2-910504
- [3] Milner, Robin: The Space and Motion of Communicating Agents. 1st. Aufl. New York, NY, USA : Cambridge University Press, 2009 — ISBN 978-0-521-73833-0
- [4] [https://www.vogella.com/tutorials/EclipseEMF/article.html](https://www.vogella.com/tutorials/EclipseEMF/article.html)
- [5] Steinberg, D.; Budinsky, F.; Paternostro, M: EMF: Eclipse Modeling Framework. 2nd Revised edition. Upper Saddle River, NJ : Addison-Wesley Professional, 2008 — ISBN 978-0-321-33188-5
- [6] [https://eclipsesource.com/blogs/tutorials/emf-tutorial/](https://eclipsesource.com/blogs/tutorials/emf-tutorial/)

## License

The specification and this library are released under the Apache 2.0 license.

```text
Copyright 2019-present Bigraph Toolkit Developers

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
