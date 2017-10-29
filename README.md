# Cloud-Native Reference

This is a reference implementation for a cloud-native architecture. The microservice architectural style is used with the following design patterns:

* Command Query Responsibility Separation (CQRS).
* Event Sourcing
* Gateway Router
* Circuit-Breaker
* External Configuration Service
* Throttling

## Prerequisites

This reference implementation can be run through a series of Docker containers. The following software is required to build and execute the code.

* Java 8 SDK
* Docker
* Docker-Compose
* Gradle

The code was developed and tested with the Spring Tool Suite IDE running on MacOS 10.12.6 Sierra. A machine with at least 8GB is required to run all the containers concurrently.

## Running this Reference Implementation

### 1. Build the Docker Containers

Clone the Git repository to a directory

```bash
git clone https://github.com/drm317/cloud-native-reference.git
```

Then build the code and all the required Docker container images

```bash
cd cloud-native-reference
./gradlew clean image
```
