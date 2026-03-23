# ProGuard configuration file

# Optimize bytecode
-optimizations !code/simplification/arithmetic

# Keep application class names
-keep class com.yourpackage.** { *; }

# Keep public classes, interfaces, and their members
-keep public class * { public protected *; }

# Add more rules as necessary to preserve the required classes and methods
