package Quire_POM;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import reusableLibrary.ReusableMethodsLoggersPOM;

import java.io.IOException;
import java.util.Map;

/**
 * Helper class for PDF verification methods
 * Keeps PDF-related verification logic separate from page objects
 */
public class PDFVerificationHelper {
    
    private ExtentTest logger;
    
    public PDFVerificationHelper(ExtentTest logger) {
        this.logger = logger;
    }
    
    /**
     * Universal method to verify PDF logos
     * @param similarityThreshold Percentage match threshold (e.g., 95.0)
     * @param logoPaths Variable number of logo file paths to compare
     */
    public void verify_pdf_logos(double similarityThreshold, String... logoPaths) throws IOException {
        ReusableMethodsLoggersPOM.compareImagesInPDF_with_expected_logos(logger, similarityThreshold, logoPaths);
    }
    
    /**
     * Verify AEI style logos in PDF
     */
    public void verify_aei_styles_pdf() throws IOException {
        String aeiCoverLetter = System.getProperty("user.dir") + "/src/main/java/images/aei_coverletter.png";
        String aeiLogo = System.getProperty("user.dir") + "/src/main/java/images/aei_logo.png";
        String aeiCoverLetter_footer = System.getProperty("user.dir") + "/src/main/java/images/aei_cover_letter_footer.png";

        verify_pdf_logos(95.0, aeiCoverLetter, aeiLogo, aeiCoverLetter_footer);

        // Verify bullet indentation
        verify_pdf_bullet_indentation(
                "•QA Text 1",
                "•QA Text 2",
                "◦QA Indent Text 3",
                "◦QA Indent Text 4",
                "▪QA Sub-Indent Text 5",
                "▪QA Sub-Indent Text 6"
        );

        // Verify numbered list indentation
        verify_pdf_numbered_list_indentation(
                "1. QA Text 1",
                "2. QA Text 2",
                "1. QA Indent Text 3",
                "2. QA Indent Text 4",
                "1. QA Sub-Indent Text 5",
                "2. QA Sub-Indent Text 6"
        );
    }
    
    /**
     * Verify EFI style logos in PDF
     */
    public void verify_efi_styles_pdf() throws IOException {
        String efiLogo = System.getProperty("user.dir") + "/src/main/java/images/efi_logo.jpg";
        String efiFooterLogo = System.getProperty("user.dir") + "/src/main/java/images/efi_letterhead.jpg";
        verify_pdf_logos(87.0, efiLogo, efiFooterLogo);

        // Verify bullet indentation
        verify_pdf_bullet_indentation(
            "•QA Text 1",
            "•QA Text 2",
            "◦QA Indent Text 3",
            "◦QA Indent Text 4",
            "▪QA Sub-Indent Text 5",
            "▪QA Sub-Indent Text 6"
        );
        
        // Verify numbered list indentation
        verify_pdf_numbered_list_indentation(
            "1. QA Text 1",
            "2. QA Text 2",
            "1. QA Indent Text 3",
            "2. QA Indent Text 4",
            "1. QA Sub-Indent Text 5",
            "2. QA Sub-Indent Text 6"
        );
    }
    
    /**
     * Verify Whitestone style logos in PDF
     */
    public void verify_whitestone_styles_pdf() throws IOException {
        String whitestoneLogo = System.getProperty("user.dir") + "/src/main/java/images/whitestone_logo.jpg";
        String whitestoneFooterLogo = System.getProperty("user.dir") + "/src/main/java/images/whitestone_footer_logo.jpg";
        verify_pdf_logos(87.0, whitestoneLogo, whitestoneFooterLogo);

        // Verify bullet indentation
        verify_pdf_bullet_indentation(
            "•QA Text 1",
            "•QA Text 2",
            "◦QA Indent Text 3",
            "◦QA Indent Text 4",
            "▪QA Sub-Indent Text 5",
            "▪QA Sub-Indent Text 6"
        );

        // Verify numbered list indentation
        verify_pdf_numbered_list_indentation(
            "1. QA Text 1",
            "2. QA Text 2",
            "1. QA Indent Text 3",
            "2. QA Indent Text 4",
            "1. QA Sub-Indent Text 5",
            "2. QA Sub-Indent Text 6"
        );
    }

    /**
     * Verify Prince logo annotation in PDF
     */
    public void verify_prince_logo_pdf(boolean expectedToBePresent) throws IOException {
        // Check PDF annotations (tooltips/notes)
        java.util.List<String> annotations = ReusableMethodsLoggersPOM.getPDFAnnotations_from_most_recent_download();
        
        System.out.println("\n=== All Annotations Found ===");
        if (annotations.isEmpty()) {
            System.out.println("No annotations found in PDF");
            logger.log(LogStatus.INFO, "No annotations found in PDF");
        } else {
            for (int i = 0; i < annotations.size(); i++) {
                System.out.println((i + 1) + ". " + annotations.get(i));
                logger.log(LogStatus.INFO, (i + 1) + ". " + annotations.get(i));
            }
        }
        
        // Check for Prince in annotations
        boolean hasPrinceInAnnotations = annotations.stream()
            .anyMatch(annotation -> annotation.toLowerCase().contains("prince") || 
                                   annotation.toLowerCase().contains("this document was created with prince"));
        
        // Verify against expected value
        if (hasPrinceInAnnotations == expectedToBePresent) {
            if (expectedToBePresent) {
                System.out.println("\n✅ Prince logo annotation found in PDF - as expected");
                logger.log(LogStatus.PASS, "✅ Prince logo annotation found in PDF - as expected");
            } else {
                System.out.println("\n✅ Prince logo annotation NOT found in PDF - as expected");
                logger.log(LogStatus.PASS, "✅ Prince logo annotation NOT found in PDF - as expected");
            }
        } else {
            if (expectedToBePresent) {
                System.out.println("\n❌ Prince logo annotation NOT found in PDF - NOT expected");
                logger.log(LogStatus.FAIL, "❌ Prince logo annotation NOT found in PDF - NOT expected");
            } else {
                System.out.println("\n❌ Prince logo annotation found in PDF - NOT expected");
                logger.log(LogStatus.FAIL, "❌ Prince logo annotation found in PDF - NOT expected");
            }
        }
    }
    
    /**
     * Verify bullet-based indentation in PDF (•, ◦, ▪)
     * @param expectedIndentedText Array of text with expected bullet types
     *        Example: {"• Level 1 text", "◦ Level 2 text", "▪ Level 3 text"}
     */
    public void verify_pdf_bullet_indentation(String... expectedIndentedText) throws IOException {
        String pdfContent = ReusableMethodsLoggersPOM.getPDFContent_with_indentation_from_most_recent_download();
        
        logger.log(LogStatus.INFO, "=== VERIFYING BULLET INDENTATION ===");
        
        String[] lines = pdfContent.split("\n");
        boolean allFound = true;
        for (String expectedLine : expectedIndentedText) {
            // Extract bullet type and text
            String bulletType = "";
            char bulletChar = ' ';
            if (expectedLine.startsWith("•")) {
                bulletType = "Level 1 (•)";
                bulletChar = '•';
            } else if (expectedLine.startsWith("◦")) {
                bulletType = "Level 2 (◦)";
                bulletChar = '◦';
            } else if (expectedLine.startsWith("▪")) {
                bulletType = "Level 3 (▪)";
                bulletChar = '▪';
            }
            
            // Try exact match first
            boolean found = pdfContent != null && pdfContent.contains(expectedLine);
            String matchType = " (exact match)";
            
            // If exact match fails, try partial match (for PDF extraction issues)
            if (!found && pdfContent != null) {
                // Extract unique identifier (e.g., "4" from "QA Indent Text 4")
                String keyText = expectedLine.substring(1).trim(); // Remove bullet
                
                // Look for lines with same bullet and check if they contain the unique parts
                for (String line : lines) {
                    String trimmedLine = line.trim();
                    if (trimmedLine.startsWith(String.valueOf(bulletChar))) {
                        // Check if line contains key identifiers
                        // For "QA Indent Text 4", check for "QA", "Indent", and "4"
                        // For "QA Sub-Indent Text 6", check for "QA", "Sub", and "6"
                        
                        boolean hasQA = trimmedLine.contains("QA");
                        boolean hasNumber = false;
                        boolean hasKeyword = false;
                        
                        // Extract number from expected text
                        String[] parts = keyText.split(" ");
                        String lastPart = parts[parts.length - 1];
                        if (trimmedLine.contains(lastPart)) {
                            hasNumber = true;
                        }
                        
                        // Check for "Indent" or "Sub-Indent"
                        if (keyText.contains("Sub-Indent") && (trimmedLine.contains("Sub-Ind") || trimmedLine.contains("Sub-In"))) {
                            hasKeyword = true;
                        } else if (keyText.contains("Indent") && !keyText.contains("Sub-Indent") && trimmedLine.contains("Indent")) {
                            hasKeyword = true;
                        } else if (!keyText.contains("Indent") && trimmedLine.contains("Text")) {
                            hasKeyword = true;
                        }
                        
                        // If all key parts match, consider it found
                        if (hasQA && hasNumber && hasKeyword) {
                            found = true;
                            matchType = " (partial match - PDF extraction issue: " + trimmedLine + ")";
                            break;
                        }
                    }
                }
            }
            
            if (found) {
                System.out.println("✅ Found " + bulletType + ": " + expectedLine + matchType);
                logger.log(LogStatus.PASS, "✅ Found " + bulletType + ": " + expectedLine + matchType);
            } else {
                System.out.println("❌ NOT Found " + bulletType + ": " + expectedLine);
                logger.log(LogStatus.FAIL, "❌ NOT Found " + bulletType + ": " + expectedLine);
                allFound = false;
            }
        }
        
        if (allFound) {
            System.out.println("\n✅ All indented items verified successfully");
            logger.log(LogStatus.PASS, "✅ All indented items verified successfully");
        } else {
            System.out.println("\n❌ Some indented items were NOT found");
            logger.log(LogStatus.FAIL, "❌ Some indented items were NOT found");
        }
    }
    
    /**
     * Verify numbered list indentation in PDF
     * Checks if numbered items appear in correct order and detects indentation levels
     * @param expectedNumberedItems Array of expected numbered items in order
     *        Example: {"1. QA Text 1", "2. QA Text 2", "1. QA Indent Text 3"}
     */
    public void verify_pdf_numbered_list_indentation(String... expectedNumberedItems) throws IOException {
        String pdfContent = ReusableMethodsLoggersPOM.getPDFContent_with_indentation_from_most_recent_download();
        
        System.out.println("\n=== VERIFYING NUMBERED LIST INDENTATION ===");
        logger.log(LogStatus.INFO, "=== VERIFYING NUMBERED LIST INDENTATION ===");
        
        if (pdfContent == null) {
            System.out.println("❌ PDF content is null");
            logger.log(LogStatus.FAIL, "❌ PDF content is null");
            return;
        }
        
        boolean allFound = true;
        int previousIndex = -1;
        
        for (String expectedItem : expectedNumberedItems) {
            String trimmedItem = expectedItem.trim();
            
            // Determine indent level based on number restart
            String indentLevel = "Level 1 (no indent)";
            if (trimmedItem.startsWith("1.") && previousIndex > 0) {
                indentLevel = "Level 2 (indented - number restart)";
            }
            
            // Check if item exists in PDF (with or without space after period)
            String itemWithSpace = trimmedItem;
            String itemWithoutSpace = trimmedItem.replace(". ", ".");
            boolean found = pdfContent.contains(itemWithSpace) || pdfContent.contains(itemWithoutSpace);
            
            String foundFormat = "";
            if (pdfContent.contains(itemWithSpace)) {
                foundFormat = " (with space)";
            } else if (pdfContent.contains(itemWithoutSpace)) {
                foundFormat = " (no space after period)";
            }
            
            if (found) {
                System.out.println("✅ Found [" + indentLevel + "]: " + trimmedItem + foundFormat);
                logger.log(LogStatus.PASS, "✅ Found [" + indentLevel + "]: " + trimmedItem + foundFormat);
            } else {
                System.out.println("❌ NOT Found [" + indentLevel + "]: " + trimmedItem);
                logger.log(LogStatus.FAIL, "❌ NOT Found [" + indentLevel + "]: " + trimmedItem);
                allFound = false;
            }
            
            // Track the number for indent detection
            if (trimmedItem.matches("^(\\d+)\\..*")) {
                previousIndex = Integer.parseInt(trimmedItem.split("\\.")[0]);
            }
        }
        
        if (allFound) {
            System.out.println("\n✅ All numbered list items verified successfully");
            logger.log(LogStatus.PASS, "✅ All numbered list items verified successfully");
        } else {
            System.out.println("\n❌ Some numbered list items were NOT found");
            logger.log(LogStatus.FAIL, "❌ Some numbered list items were NOT found");
        }
    }
    
    /**
     * Verify PDF text content contains specific text
     * @param expectedText Text to search for in PDF
     * @param description Description for logging
     */
    public void verify_pdf_contains_text(String expectedText, String description) throws IOException {
        String pdfContent = ReusableMethodsLoggersPOM.getPDFContent_from_most_recent_download();
        
        if (pdfContent != null && pdfContent.contains(expectedText)) {
            System.out.println("✓ PDF contains: " + description);
            logger.log(LogStatus.PASS, "PDF verification passed: " + description);
        } else {
            System.out.println("✗ PDF does NOT contain: " + description);
            logger.log(LogStatus.FAIL, "PDF verification failed: " + description);
        }
    }
    
    /**
     * Verify downloaded PDF content by filename
     * @param filename Partial filename to search for
     * @param expectedText Text that should be in the PDF
     */
    public void verify_downloadedPDFContent(String filename, String expectedText) throws IOException {
        String pdfContent = ReusableMethodsLoggersPOM.getPdfContent_from_downloads(filename);
        
        if (pdfContent != null && pdfContent.contains(expectedText)) {
            System.out.println("✓ PDF verification passed: Found '" + expectedText + "' in " + filename);
            logger.log(LogStatus.PASS, "PDF verification passed: Found expected text in " + filename);
        } else {
            System.out.println("✗ PDF verification failed: '" + expectedText + "' NOT found in " + filename);
            logger.log(LogStatus.FAIL, "PDF verification failed: Expected text NOT found in " + filename);
        }
    }
    
    /**
     * Verify ZON template PDF content
     */
    public void verify_downloadedPDFContent() throws IOException {
        verify_downloadedPDFContent("QA Automation Testing ZON Template.pdf", "refresh text");
    }
    
    /**
     * Verify 1104 PDF content (prints content for debugging)
     */
    public void verify_downloadedPDFContent_1104() throws IOException {
        String pdfContent = ReusableMethodsLoggersPOM.getPdfContent_from_downloads("1104.pdf");
        System.out.println("PDF Content:\n" + pdfContent);
        logger.log(LogStatus.INFO, "Extracted PDF content from 1104.pdf");
    }
}
