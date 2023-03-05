package je.panse.doro.samsara.i2toolkit;

	import java.io.File;
	import java.io.IOException;
	import java.util.Enumeration;
	import java.util.jar.JarEntry;
	import java.util.jar.JarFile;

	public class OpenJarFileWithClass {
	    public static void main(String[] args) {
	        
	        String className = "com.example.MyClass";
	        File jarFile = new File("path/to/jar/file.jar");
	        
	        try {
	            JarFile jar = new JarFile(jarFile);
	            
	            Enumeration<JarEntry> entries = jar.entries();
	            while (entries.hasMoreElements()) {
	                JarEntry entry = entries.nextElement();
	                if (entry.getName().replace("/", ".").equals(className + ".class")) {
	                    // Found the class file
	                    System.out.println("Successfully opened JAR file with class: " + className);
	                    break;
	                }
	            }
	            
	            jar.close();
	        } catch (IOException e) {
	            System.out.println("Failed to open JAR file with class: " + e.getMessage());
	        }
	    }
	}
