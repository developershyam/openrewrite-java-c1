
# Description
This is project to test open rewrite recipes.
Used another project __openrewrite-java-r1__ project as dependencies so download that and publish to maven local first.

# Run recipes with gradle build configuration
```gradle
rewrite {
     activeRecipe("com.sample.r1.MethodAddRecipe", "com.sample.r1.ExpandCustomerInfo")
}
```
```bash
gradle rewriteRun
```

# Run recipes with YAML configuration
This allows provide additional attributes which required by recipe
```yml
type: specs.openrewrite.org/v1beta/recipe
name: com.sample.MyTestRecipe1
recipeList:
  - com.sample.r1.ExpandCustomerInfo
  - com.sample.r1.MethodAddRecipe:
      fullyQualifiedClassName: com.sample.FooBar
      methodName: hello
  

```
```gradle
rewrite {
     activeRecipe("com.sample.MyTestRecipe1")
}
```
```bash
gradle rewriteRun
```

# To test different recipes
To run list of recipes add recipe name in activeRecipe(gradle build file).
List of recipes created in rewrite.yml
```gradle
rewrite {
     activeRecipe("com.sample.MyTestRecipe1")
}
```

# Hack for non compiling code

Add code as class filed in FooBar
```java
com.sample.NoExistClass noExistClass;
```

```bash
gradle rewriteRun -x compileJava
```