# RefactorLizar

## Getting Started

The **RefactorLizar** comes with a Java API to access its functionality.
While we document the API calls, the API entities will not be documented as they should be self-explanatory.

### Retrieve input source types

The **RefactorLizar** will provide different input source types. 
Input source types are installed as modules.
To check which input source types are available use the following code:

```java
List<InputSourceType> inputSourceTypes = RefactorLizar.listSupportedInputSourceTypes();
``` 

The `InputSourceType` will give you information on which parameters are necessary to use it.
If you want to use the filesystem input source type use the following code to retrieve the `InputSourceTypeId`:

```java
Optional<InputSourceType> optionalFileSystemInputSourceType =
        inputSourceTypes.stream()
                .filter(
                        inputSourceType ->
                                inputSourceType
                                        .getIdentifier()
                                        .equals(InputSourceTypeId.fileSystem()
                        )
                )
                .findFirst();

InputSourceTypeId fileSystemInputSourceTypeId = optionalFileSystemInputSourceType.get().getIdentifier();
```

### Build input sources

To initialize the **RefactorLizar** you need to provide input sources for the modular language and the simulator.

#### Simulator

For a local filesystem input source use the following code:

```java
Map<String, String> inputSourceTypeParameters =
                Map.of(
                        "path",
                        "path/to/modular-language"
                );

InputSourceSimulator inputSourceSimulator = new InputSourceSimulator(inputSourceTypeId, inputSourceTypeParameters);
```

#### Modular Language

For a local filesystem input source use the following code:

```java
Map<String, String> inputSourceTypeParameters =
                Map.of(
                        "path",
                        "path/to/simulator"
                );

InputSourceModularLanguage inputSourceModularLanguage = new InputSourceModularLanguage(inputSourceTypeId, inputSourceTypeParameters);
```

### Initialize RefactorLizar

Now you can initialize the **RefactorLizar** by passing in the input source for the simulator and the modular language.

```java
RefactorLizar refactorLizar = RefactorLizar.load(inputSourceSimulator, inputSourceModularLanguage);
```

### Visualize API

You can retrieve a Java POJO representation of a visualisation by utilizing the `Visualize API`.
The ID entities (`FeatureId`, `ComponentId`, `ClassId`) returned by these methods should be used for further calls against the API.

```java
// Retrieve features from the modular language and their used by relationship.
FeatureView featureView = refactorLizar.visualizeApi().provideFeatureView();

// Retrieve simulator components and their used by relationship.
ComponentView componentView = refactorLizar.visualizeApi().provideComponentView();

// Load simulator classes and their used by relationship for a certain component.
//
// HINT: Use the component ID from the previous call instead of building it yourself.
//
ClassView classView = refactorLizar.visualizeApi().provideClassView(ComponentId.of("component_name"));
```

### Analyze API

You can run different analyses on the modular language and the simulator.
Each analysis is a separate module.
Make sure they are installed before calling them.
Otherwise, an `AnalyzerNotFoundException` will be thrown.

#### Feature Scattering

A feature scattering occurs when a language feature is used in more than one simulator component.

```java
List<FeatureScattering> featureScatterings = refactorLizar.analyzeApi().detectFeatureScattering();
```

#### Language Blob

A language blob occurs when a simulator component uses more than one language feature.

```java
LanguageBlobsOnComponentLevel languageBlobsOnComponentLevel = refactorLizar.analyzeApi().detectLanguageBlobsOnComponentLevel();
```

#### Dependency Cycles

Dependency cycles are cycles regarding the used by relationship between classes and components respectively.

```java
DependencyCyclesOnClassLevel dependencyCyclesOnClassLevel = refactorLizar.analyzeApi().detectDependencyCyclesOnClassLevel();
```
