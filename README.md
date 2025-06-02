
# Description
This is project to test open rewrite recipes.
Used another project __openrewrite-java-r1__ project as dependencies so download that and publish to maven local first.
```bash
# After clone openrewrite-java-r1 build and publish to maven local repo
# Run command inside project openrewrite-java-r1
gradle build
gradle publishToMavenLocal 
```

# Run recipes with gradle build configuration
Now you can use openrewrite-java-r1 to run recipe
```gradle
rewrite {
     activeRecipe("com.sample.r1.MethodAddRecipe", "com.sample.r1.CustomerInfoExpandRecipe")
}
```
```bash
gradle build
#Run recipe using gradle
gradle rewriteRun
```

# Run recipes with YAML configuration
This allows provide additional attributes which required by recipe
```yml
type: specs.openrewrite.org/v1beta/recipe
name: com.sample.MyTestRecipe1
recipeList:
  - com.sample.r1.CustomerInfoExpandRecipe
  - com.sample.r1.MethodAddRecipe:
      fullyQualifiedClassName: com.sample.User
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

Add code as class filed in User
```java
com.sample.NoExistClass noExistClass;
```

```bash
gradle rewriteRun -x compileJava
```
If code is valid to java syntax it can build LST without compile and work.
If code is non-compliance to java compilar then it won't bbuild LST and skip that file/unit. 

# Enable print Tree using debug
Use System env variable 
```bash
# Windows
set MOD_ENABLE_DEBUG=true

#Linux
export MOD_ENABLE_DEBUG=true
```