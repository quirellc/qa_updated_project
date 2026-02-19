# QA Automation Test Steps & Cleanup Summary

This document provides separate, step-by-step instructions and cleanup actions for each test type. Each section lists only the clear actions to perform and the exact items to delete if the test fails, using the actual names and patterns from your UI.

---

## FNMA PCA XML Test

**Test Steps:**
1. Create a new PCA template: `QA Automation Testing PCA Template-Chrome`.
2. Add required sections to the template.
3. Generate XML for the PCA template.
4. Verify the XML version is 2.3.7.
5. Confirm alert messages and data integrity.

**If test fails, delete:**
| Item Type      | Example Name/Pattern |
|----------------|---------------------|
| Template       | QA Automation Testing PCA Template-Chrome |
| Project Folder | QA Automation Testing PCA Project Folder-Chrome (date_time) |

---

## FNMA ESA XML Test

**Test Steps:**
1. Create a new ESA template: `QA Automation Testing ESA Template-Chrome`.
2. Add required sections to the template.
3. Generate XML for the ESA template.
4. Verify XML output and data.

**If test fails, delete:**
| Item Type      | Example Name/Pattern |
|----------------|---------------------|
| Template       | QA Automation Testing ESA Template-Chrome |
| Project Folder | QA Automation Testing ESA Project Folder-Chrome (date_time) |

---

## FNMA ZON XML Test

**Test Steps:**
1. Create a new ZON template: `QA Automation Testing ZON Template-Chrome`.
2. Add required sections to the template.
3. Generate XML for the ZON template.
4. Verify XML output and data.

**If test fails, delete:**
| Item Type      | Example Name/Pattern |
|----------------|---------------------|
| Template       | QA Automation Testing ZON Template-Chrome |
| Project Folder | QA Automation Testing ZON Project Folder-Chrome (date_time) <br>*(Note: This is deleted during Medium Priority suite)* |

---

## CK5 Editor Test (CK_Editor, Smart_Tables_CK5)

**Test Steps:**
1. Create a new CK5 template: `QA Automation Testing New CK5 Template-Chrome`.
2. Add and edit WordBank items (e.g., `QA WordBank Item`, `QA WordBank Smart Table New Item`).
3. Save the CK5 template.
4. Generate and verify CK5 report.

**If test fails, delete:**
| Item Type        | Example Name/Pattern |
|------------------|---------------------|
| Project Folder   | QA Automation Testing New CK5 Project Folder-Chrome (date_time) |
| Template         | QA Automation Testing New CK5 Template-Chrome |
| WordBank Items   | Any WordBank item starting with `QA ` |

---

## Freddie Mac 1104 Test

**Test Steps:**
1. Create a new FM 1104 template: `QA Automation Testing FM 1104 Template-Chrome`.
2. Generate FM 1104 report.
3. Verify report and template.

**If test fails, delete:**
| Item Type      | Example Name/Pattern |
|----------------|---------------------|
| Template       | QA Automation Testing FM 1104 Template-Chrome |
| Project Folder | QA Automation Testing Freddie Mac 1104 Project Folder-Chrome (date_time) |

---

## Freddie Mac 1105 Test

**Test Steps:**
1. Create a new FM 1105 template: `QA Automation Testing FM 1105 Template-Chrome`.
2. Optionally, create a cloned FM 1105 template: `QA Automation Testing FM 1105 Cloned Template-Chrome`.
3. Generate FM 1105 report.
4. Verify report and template.

**If test fails, delete:**
| Item Type      | Example Name/Pattern |
|----------------|---------------------|
| Template       | QA Automation Testing FM 1105 Template-Chrome<br>QA Automation Testing FM 1105 Cloned Template-Chrome |

---

## Medium Priority Test Suite

**Test Steps:**
1. Run all regression and medium-priority test cases.
2. Verify output and results.

**If test fails, delete:**
| Item Type      | Example Name/Pattern |
|----------------|---------------------|
| Project Folder | QA Automation Testing Medium Priority Project Folder-Chrome (date_time) |
| Template       | QA Automation Testing Medium Priority Template-Chrome |
| Project Folder | QA Automation Testing ZON Project Folder-Chrome (date_time) |

---

**Legend:**
- `date_time` = Timestamp as shown in the UI.
- All names are case-sensitive and must match the UI exactly.

---

If you need this document in PDF or Word format, let me know and I will generate and provide the file.
