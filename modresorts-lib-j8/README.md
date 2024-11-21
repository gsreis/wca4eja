# ModResorts Demo Application

## Overview

This is the WebSphere Application Server version of the ModResorts application. It contains code issues that need to be addressed before migrating the applicaiton successfully to Liberty.


## Building

This is a standard maven applicaiton and the WAR can be built as follows:

```
mvn clean package
```

This version of ModResorts has dependencies on WAS APIs. You can install the dependencies needed in your local maven repo with the following command:

```
mvn install:install-file -Dfile=<some location>/was_public.jar -DpomFile=was-dependency/was_public-9.0.0.pom
```
