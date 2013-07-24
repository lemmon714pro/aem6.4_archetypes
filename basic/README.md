Description
========================
CQ5 Basic Archetype. 
Contains OSGI modules with Slice activator, includes sample CQ project based on Twitter Bootstrap.
Contains profile for executing local SCA analysis (Checkstyle/PMD/FindBugs are used for that) and automatic SCA using Sonar QA platform.
Integrates with Cucumber. Has sample mock usage in unit tests using Powermock/Mockito.
Use this archetype as a starting point for creating new CQ5-based project according to the best guidelines.


Archetype Installation 
===========================
Execute:
    mvn install


Archetype Usage
========================

1. Execute the following command in the directory where you want to generate new project:
    mvn archetype:generate -DarchetypeGroupId=com.yvv.cq5 -DarchetypeVersion=1.0 -DarchetypeArtifactId=basic-archetype

2. Fill in required properties. 
- groupId - generated project's groupId, used in pom files
- artifactId - generated project's artifactId, used in pom files
- package - generated project's package, used in pom files as well as in java source code
- appsFolderName - This is the folder under /apps into which the bundle and package content will be installed. This is to some extent the ID of your CQ application, so set it carefully!
- artifactName - This is the descriptive name which will be set as the CQ artifact name
- packageGroup - This is the group identifier for the CQ package. Used within the CQ Package Manager and Package Share.

Example:
    mvn archetype:generate -DarchetypeGroupId=com.yvv.cq5 -DarchetypeVersion=1.0 -DarchetypeArtifactId=basic-archetype

    Define value for property 'groupId': com.yvv.sampleapp
    Define value for property 'artifactId': sampleapp-build
    Define value for property 'package': com.yvv.sampleapp
    Define value for property 'version': 1.0-SNAPSHOT
    Define value for property 'appsFolderName': sampleapp
    Define value for property 'artifactName': Sample Application
    Define value for property 'packageGroup': sampleapp-content-1.0-SNAPSHOT