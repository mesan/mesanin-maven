# Løsningsforslag steg-0

## Løsningsforslag 1 - interaktivt modus
Trykket [ENTER] der det allerede er fylt ut en verdi.

`mvn archetype:generate`

Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): 439:  
Choose org.apache.maven.archetypes:maven-archetype-quickstart version:  
1: 1.0-alpha-1  
2: 1.0-alpha-2  
3: 1.0-alpha-3  
4: 1.0-alpha-4  
5: 1.0  
6: 1.1  
Choose a number: 6:   
Define value for property 'groupId': : no.mesan.mesanin.maven  
Define value for property 'artifactId': : mesanin-maven  
Define value for property 'version':  1.0-SNAPSHOT: :   
Define value for property 'package':  no.mesan.mesanin.maven: :   
Confirm properties configuration:  
groupId: no.mesan.mesanin.maven  
artifactId: mesanin-maven  
version: 1.0-SNAPSHOT  
package: no.mesan.mesanin.maven  
 Y: :   
[INFO] ----------------------------------------------------------------------------  
[INFO] Using following parameters for creating project from Old (1.x) Archetype: maven-archetype-quickstart:1.1  
[INFO] ----------------------------------------------------------------------------  
[INFO] Parameter: basedir, Value: /home/andreasv/dev/mavenkurs  
[INFO] Parameter: package, Value: no.mesan.mesanin.maven  
[INFO] Parameter: groupId, Value: no.mesan.mesanin.maven  
[INFO] Parameter: artifactId, Value: mesanin-maven  
[INFO] Parameter: packageName, Value: no.mesan.mesanin.maven  
[INFO] Parameter: version, Value: 1.0-SNAPSHOT  
[INFO] project created from Old (1.x) Archetype in dir: /home/andreasv/dev/mavenkurs/mesanin-maven  
[INFO] ------------------------------------------------------------------------  
[INFO] BUILD SUCCESS  
[INFO] ------------------------------------------------------------------------  
[INFO] Total time: 37.420 s  
[INFO] Finished at: 2014-08-02T01:20:06+02:00  
[INFO] Final Memory: 11M/178M  
[INFO] ------------------------------------------------------------------------


## Løsningsforslag 2: one-liner
Dette er kommandoen hvis du er liker one-liners.

`mvn archetype:generate -DgroupId=no.mesan.mesanin.maven -DartifactId=mesanin-maven -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`