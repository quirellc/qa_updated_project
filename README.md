# Quire Automation Test Suite

This repository contains automated test suites for both CKEditor 4 and CKEditor 5 implementations.

## Project Structure

```
quire_updated_project/
├── .semaphore/                          # CI/CD pipeline configurations
│   ├── semaphore_prod.yml              # Production sanity checks
│   ├── semaphore_staging5.yml          # Staging environment tests
│   ├── Regression_suite_semaphore_chrome.yml
│   ├── Regression_suite_semaphore_ff.yml
│   └── [other pipeline configs]
│
├── ck5/                                 # CKEditor 5 test suite (primary)
│   ├── pom.xml                         # Maven dependencies & configuration
│   ├── src/
│   │   ├── main/java/
│   │   │   ├── Quire_POM/              # Page Object Model classes
│   │   │   │   ├── BaseClass.java      # Base test class with setup/teardown
│   │   │   │   ├── Staging5.java       # Main page object for Staging5 environment
│   │   │   │   └── [other POM classes]
│   │   │   ├── reusableLibrary/        # Universal reusable methods
│   │   │   │   ├── ReusableMethodsLoggersPOM.java
│   │   │   │   ├── ReusableMethods_Loggers.java
│   │   │   │   └── ReusableMethods.java
│   │   │   ├── HTML_Report/            # Generated ExtentReports (auto-generated)
│   │   │   ├── downloads/              # Downloaded PDFs and extracted images
│   │   │   └── images/                 # Reference images for verification
│   │   │       ├── aei_logo.png
│   │   │       ├── aei_coverletter.png
│   │   │       └── [other logos]
│   │   └── test/java/
│   │       ├── Regression1.java        # Regression test suite part 1
│   │       ├── Regression2.java        # Regression test suite part 2
│   │       ├── Regression_Suite.java   # Combined regression tests
│   │       ├── SanityCheck_Prod.java   # Production sanity checks
│   │       ├── SanityCheck_Staging.java # Staging sanity checks
│   │       ├── CK_Editor.java          # CKEditor functionality tests
│   │       ├── New_CK5_Editor.java     # CK5-specific editor tests
│   │       ├── Quire_AI_Testing.java   # AI feature tests
│   │       ├── Smart_Tables_CK5.java   # Smart tables functionality
│   │       ├── FNMA_*_XML_Staging.java # FNMA XML generation tests
│   │       ├── Freddie_Macs.java       # Freddie Mac XML tests
│   │       ├── Marketing_Site.java     # Marketing site tests
│   │       └── [other test classes]
│   └── test-suite/                     # TestNG XML configurations
│       ├── testng.xml                  # Default test suite
│       ├── Regression_chrome.xml       # Regression tests (Chrome)
│       ├── Regression_ff.xml           # Regression tests (Firefox)
│       ├── AutomationSuiteParallel.xml # Parallel execution suite
│       ├── SanityCheck_Prod.xml        # Production sanity suite
│       └── [other suite configs]
│
├── ck4/                                 # CKEditor 4 test suite (legacy)
│   ├── pom.xml
│   ├── src/
│   │   ├── main/java/
│   │   └── test/java/
│   └── test-suite/
│
├── Test_Steps_and_Cleanup_Summary.md   # Test execution & cleanup documentation
└── README.md                            # This file
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
