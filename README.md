How to create new archetype
===========================

Install newly created archetype in M2 repo.
    mvn install


How to use new archetype
========================

1. Execute the following command in the directory where you want to generate new project:
    mvn archetype:generate -DarchetypeGroupId=com.yvv.cq5 -DarchetypeVersion=1.0.0 -DarchetypeArtifactId=basic-archetype

2. Fill in required properties. There are 3 basic properties which are common for all archetypes:
- groupId
- artifactId
- package
 
There can be other custom properties depending on the archetype configuration.