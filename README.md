# Quire Automation Test Suite

This repository contains automated test suites for both CKEditor 4 and CKEditor 5 implementations.

## Project Structure

```
quire_updated_project/
├── ck5/                    # CKEditor 5 test suite
│   ├── pom.xml
│   ├── src/
│   │   ├── main/java/
│   │   └── test/java/
│   └── test-suite/
│
└── ck4/                    # CKEditor 4 test suite
    ├── pom.xml
    ├── src/
    │   ├── main/java/
    │   └── test/java/
    └── test-suite/
```

## Running Tests

### CKEditor 5 Tests

Navigate to the `ck5/` directory and run Maven commands:

```bash
cd ck5
mvn clean test
```

Or run a specific test suite:

```bash
cd ck5
mvn test -Dfile=test-suite/AutomationSuiteParallel.xml
```

### CKEditor 4 Tests

Navigate to the `ck4/` directory and run Maven commands:

```bash
cd ck4
mvn clean test
```

Or run a specific test suite:

```bash
cd ck4
mvn test -Dfile=test-suite/AutomationSuiteParallel.xml
```

## Important Notes

- **Working Directory**: Always run tests from the respective project directory (`ck5/` or `ck4/`)
- **System.getProperty("user.dir")**: All file paths in the code use `System.getProperty("user.dir")` which automatically resolves to the current working directory
- **Reports**: Test reports are generated in `src/main/java/HTML_Report/` within each project
- **Downloads**: PDF and other downloaded files are stored in `src/main/java/downloads/` within each project

## IDE Setup

When opening the project in your IDE:
- For **CK5**: Open the `ck5/` folder as a Maven project
- For **CK4**: Open the `ck4/` folder as a Maven project

## Requirements

- Java 17
- Maven 3.x
- Chrome/Firefox browsers installed
