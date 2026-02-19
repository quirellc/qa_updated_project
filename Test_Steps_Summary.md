# Quire Regression Test Suite - Test Coverage Summary

This document outlines the automated regression tests executed in our CI/CD pipeline to ensure platform stability and functionality across all critical features.

---

## Overview

Our regression suite validates end-to-end workflows across multiple report types, XML generation, editor functionality, and compliance standards. Tests run automatically on both Chrome and Firefox browsers.

---

## Test Coverage

### 1. FNMA PCA XML Generation Test

**Purpose:** Validates Property Condition Assessment (PCA) template creation and XML export compliance.

**Test Workflow:**
- Creates PCA template with all required sections
- Generates XML output for FNMA submission
- Verifies XML version 2.3.7 compliance
- Validates data integrity and alert messages
- Confirms proper section mapping and field population

**Key Validations:**
- XML schema version correctness
- Required field population
- Data accuracy and completeness
- Alert message handling

---

### 2. FNMA ESA XML Generation Test

**Purpose:** Validates Environmental Site Assessment (ESA) template creation and XML export.

**Test Workflow:**
- Creates ESA template with required sections
- Generates XML output for FNMA compliance
- Verifies XML structure and data accuracy
- Validates section content and formatting

**Key Validations:**
- XML structure integrity
- Environmental data accuracy
- Section completeness
- Export functionality

---

### 3. FNMA ZON XML Generation Test

**Purpose:** Validates Zoning (ZON) template creation and XML export.

**Test Workflow:**
- Creates ZON template with required sections
- Generates XML output for FNMA submission
- Verifies XML data and structure
- Validates zoning-specific fields

**Key Validations:**
- XML format compliance
- Zoning data accuracy
- Required field validation
- Export integrity

---

### 4. CKEditor 5 Functionality Test

**Purpose:** Validates CKEditor 5 integration, WordBank functionality, and Smart Tables feature.

**Test Workflow:**
- Creates new CK5 template
- Tests WordBank item creation and editing
- Validates Smart Table functionality
- Generates and verifies report output
- Tests rich text editing features

**Key Validations:**
- Editor initialization and loading
- WordBank CRUD operations
- Smart Table insertion and editing
- Template saving and retrieval
- Report generation accuracy

---

### 5. Freddie Mac 1104 Report Test

**Purpose:** Validates Freddie Mac Form 1104 (Small Residential Income Property Appraisal Report) generation.

**Test Workflow:**
- Creates FM 1104 template
- Populates required fields
- Generates complete report
- Verifies template and report accuracy

**Key Validations:**
- Form 1104 compliance
- Field mapping accuracy
- Report generation
- Template integrity

---

### 6. Freddie Mac 1105 Report Test

**Purpose:** Validates Freddie Mac Form 1105 (Small Residential Income Property Appraisal Report) generation and cloning.

**Test Workflow:**
- Creates FM 1105 template
- Tests template cloning functionality
- Generates complete report
- Verifies template and cloned template accuracy

**Key Validations:**
- Form 1105 compliance
- Template cloning functionality
- Field mapping accuracy
- Report generation integrity

---

### 7. Medium Priority Test Suite

**Purpose:** Comprehensive regression suite covering additional critical workflows and edge cases.

**Test Workflow:**
- Executes all medium-priority test scenarios
- Validates cross-feature functionality
- Tests integration points
- Verifies data consistency across modules

**Key Validations:**
- Multi-feature integration
- Data consistency
- Edge case handling
- System stability

---

## Test Execution

### Automation Framework
- **Framework:** Selenium WebDriver with TestNG
- **Language:** Java
- **Browsers:** Chrome, Firefox
- **Reporting:** ExtentReports with detailed logs
- **CI/CD:** Semaphore CI with automated triggers

### Test Frequency
- **Staging Environment:** On-demand and scheduled runs
- **Production:** Sanity checks after deployments
- **Regression Suite:** Pre-release validation

### Success Metrics
- All test cases must pass before production deployment
- XML validation against FNMA/Freddie Mac schemas
- Report generation accuracy verification
- Cross-browser compatibility confirmation

---

## Test Artifacts

Each test run generates:
- **ExtentReports:** Detailed HTML reports with screenshots
- **Generated PDFs:** Sample reports for visual verification
- **XML Files:** Exported XML for schema validation
- **Logs:** Console and logger output for debugging

Reports are stored in: `ck5/src/main/java/HTML_Report/`

---

## Contact

For questions about test coverage or failures, contact the QA Automation team.
