package com.wipro.Java.DesignPatterns;

public class DecoratorFileDemo {

	    public static void main(String[] args) {

	        File file = new SimpleFile();

	        // adding features dynamically
	        file = new Compression(file);
	        file = new Encryption(file);
	        file = new Logging(file);

	        file.process();
	    }
	}

	// 1. Component Interface
	interface File {
	    void process();
	}

	// 2. Base Class
	class SimpleFile implements File {
	    public void process() {
	        System.out.println("Processing File");
	    }
	}

	// 3. Abstract Decorator
	abstract class FileDecorator implements File {
	    protected File file;

	    FileDecorator(File file) {
	        this.file = file;
	    }
	}

	// 4. Compression
	class Compression extends FileDecorator {

	    Compression(File file) {
	        super(file);
	    }

	    public void process() {
	        file.process(); // call original
	        System.out.println("Applying Compression");
	    }
	}

	// 5. Encryption
	class Encryption extends FileDecorator {

	    Encryption(File file) {
	        super(file);
	    }

	    public void process() {
	        file.process();
	        System.out.println("Applying Encryption");
	    }
	}

	// 6. Logging
	class Logging extends FileDecorator {

	    Logging(File file) {
	        super(file);
	    }

	    public void process() {
	        file.process();
	        System.out.println("Applying Logging");
	    }
	}
