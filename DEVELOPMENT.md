## Getting Started with Development

> **Note:** The Java artifact is deployed to Maven Central.
> It includes the Ecore metamodels for signatures and pure bigraphs, and the generated APIs.
> Everything is packaged within the `*.jar`.

### **Recommended Setup**

For the best development experience, it is recommended to use the [Eclipse Modeling Tools](https://www.eclipse.org/downloads/packages/release/2025-06/r/eclipse-modeling-tools) which includes all necessary tools for working with Ecore and EMF-based models.

For this project, Maven is used as the build management tool.
It is not necessary to build from source to use the bigraph Ecore metamodel but
if you want to try out the latest version, the project can be easily built
with the regular `mvn` command.
The recommendation here is to build it with the regular `mvn` command.
You will need [Maven v3.6.3 or above](https://maven.apache.org/install.html).

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
can be used in other projects by following the instruction given in the README.


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
