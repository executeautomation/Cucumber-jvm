# Cucumber-jvm
Cucumber-JVM 5 with enhanced Cucumber Expressions

All new cucumber 5 released couple of weeks before and its awesome new way to use Cucumber expression. Cucumber expressions released way back in Cucumber-JVM 3.0.0 With it came the ability to register parameter- and data table-types by implementing the TypeRegistryConfigurer.

The TypeRegistryConfigurer however is not part of the glue. This made it impossible to access the test context. With cucumber-java this is now possible by using the @ParameterType, @DataTableType and @DocStringType annotations. This allows parameter-, data table- and docstring types to be mapped to objects which can only be created inside the test context.

Here is the complete video discussion
https://youtu.be/jCzpxvAJoZM


![Cucumber-JVM](./image/cucumber5.jpg)
