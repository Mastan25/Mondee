package snippet;

public class Snippet {
	public static void main(String[] args) {
		<build>
		    <plugins>
		        <plugin>
		            <groupId>org.apache.maven.plugins</groupId>
		            <artifactId>maven-compiler-plugin</artifactId>
		            <version>3.8.1</version>
		            <configuration>
		                <source>1.8</source>
		                <target>1.8</target>
		            </configuration>
		        </plugin>
		    </plugins>
		    </build>
	}
}

