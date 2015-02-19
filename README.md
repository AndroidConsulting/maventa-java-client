# Maventa-java-client
Generated java client for maventa soap API

# Build 
    mvn clean deploy

# Add following to maven

    <repositories>
     <repository>
         <id>maventa-java-client-repo</id>
         <url>https://raw.github.com/AndroidConsulting/maventa-java-client/mvn-repo/</url>
         <snapshots>
             <enabled>true</enabled>
             <updatePolicy>always</updatePolicy>
         </snapshots>
     </repository>
    </repositories>
