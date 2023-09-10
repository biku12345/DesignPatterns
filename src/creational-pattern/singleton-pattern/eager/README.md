Here we have created an instance of a singleton in a static initializer. JVM executes a static initializer when the class is loaded and hence this is guaranteed to be thread-safe. Use this method only when your singleton class is light and is used throughout the execution of your program.


Initialization: The Singleton instance is created eagerly when the class is loaded. This means that the instance is created in a thread-safe manner because class loading is inherently thread-safe in Java.