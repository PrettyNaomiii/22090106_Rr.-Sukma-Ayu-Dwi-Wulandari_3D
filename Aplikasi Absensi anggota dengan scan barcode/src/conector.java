/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ragam
 */
public class conector {
    <repository>
    <id>central</id>
    <url>http://localhost/phpmyadmin/index.php?route=/table/sql&db=kehadiran&table=member</url>
</repository>

}

<connect>
    <!-- Other configurations -->

    <repositories>
        <repository>
            <id>central</id>
            <url>http://localhost/phpmyadmin/index.php?route=/table/sql&db=kehadiran&table=member</url>
        </repository>
    </repositories>

    <dependencies>
        <!-- Other dependencies -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.26</version> <!-- Use the latest version available -->
        </dependency>
    </dependencies>

    <!-- Other configurations -->
</connect>

