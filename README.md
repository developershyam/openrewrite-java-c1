
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
name: com.sample.MyTestRecipe
recipeList:
  - com.sample.r1.ExpandCustomerInfo
  - com.sample.r1.MethodAddRecipe:
      fullyQualifiedClassName: com.sample.FooBar
      methodName: hello
  

```
```gradle
rewrite {
     activeRecipe("com.sample.MyTestRecipe")
}
```
```bash
gradle rewriteRun
```