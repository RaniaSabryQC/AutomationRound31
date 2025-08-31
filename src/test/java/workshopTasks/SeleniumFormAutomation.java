package workshopTasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

    public class SeleniumFormAutomation {

        private static WebDriver driver;
        private static WebDriverWait wait;

        public static void main(String[] args) {
            try {
                // Setup Chrome driver and options
                setupDriver();

                // Navigate to the form
                navigateToForm();

                // Fill the form with data
                fillFormData();

                // Submit the form
                submitForm();

                // Wait to see results
                Thread.sleep(3000);

                System.out.println("Form submission completed successfully!");

            } catch (Exception e) {
                System.err.println("An error occurred: " + e.getMessage());
                e.printStackTrace();
            } finally {
                // Close the browser
                if (driver != null) {
                    driver.quit();
                    System.out.println("Browser closed.");
                }
            }
        }

        /**
         * Setup Chrome WebDriver with options
         */
        private static void setupDriver() {
            // Set Chrome driver path (update this path based on your system)
            // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

            // Chrome options for better performance
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--disable-blink-features=AutomationControlled");
            options.setExperimentalOption("useAutomationExtension", false);
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

            // Initialize driver and wait
            driver = new ChromeDriver(options);
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            System.out.println("Chrome browser opened successfully!");
        }

        /**
         * Navigate to the Selenium test form
         */
        private static void navigateToForm() {
            String formUrl = "https://www.selenium.dev/selenium/web/web-form.html";
            driver.get(formUrl);

            // Wait for page to load
            wait.until(ExpectedConditions.titleContains("Web form"));

            System.out.println("Navigated to: " + formUrl);
            System.out.println("Page title: " + driver.getTitle());
        }

        /**
         * Fill all form fields with sample data
         */
        private static void fillFormData() {
            System.out.println("Starting to fill form data...");

            // Fill text input field
            WebElement textInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("my-text-id")));
            textInput.clear();
            textInput.sendKeys("Sample Text Input");
            System.out.println("✓ Text input filled");

            // Fill password field
            WebElement passwordField = driver.findElement(By.name("my-password"));
            passwordField.clear();
            passwordField.sendKeys("SecurePassword123");
            System.out.println("✓ Password field filled");

            // Fill textarea
            WebElement textarea = driver.findElement(By.name("my-textarea"));
            textarea.clear();
            textarea.sendKeys("This is a sample textarea content for testing purposes with Selenium WebDriver in Java.");
            System.out.println("✓ Textarea filled");

            // Select dropdown option
            WebElement dropdown = driver.findElement(By.name("my-select"));
            Select select = new Select(dropdown);
            select.selectByValue("2"); // Select option 2
            System.out.println("✓ Dropdown option selected");

            // Select radio button
            WebElement radioButton = driver.findElement(By.id("my-radio-2"));
            if (!radioButton.isSelected()) {
                radioButton.click();
            }
            System.out.println("✓ Radio button selected");

            // Check checkbox
            WebElement checkbox = driver.findElement(By.id("my-check-1"));
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
            System.out.println("✓ Checkbox checked");

            // Fill date picker
            WebElement datePicker = driver.findElement(By.name("my-date"));
            datePicker.clear();
            datePicker.sendKeys("12/25/2024");
            System.out.println("✓ Date picker filled");

            // Set color picker
            WebElement colorPicker = driver.findElement(By.name("my-colors"));
            // Use JavaScript to set color value as direct input might not work
            ((org.openqa.selenium.JavascriptExecutor) driver)
                    .executeScript("arguments[0].value = '#ff0000';", colorPicker);
            System.out.println("✓ Color picker set to red");

            // Set range slider
            WebElement rangeSlider = driver.findElement(By.name("my-range"));
            // Use JavaScript to set range value
            ((org.openqa.selenium.JavascriptExecutor) driver)
                    .executeScript("arguments[0].value = '75';", rangeSlider);
            System.out.println("✓ Range slider set to 75");

            System.out.println("All form fields filled successfully!");
        }

        /**
         * Submit the form
         */
        private static void submitForm() {
            // Find and click the submit button
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("button[type='submit']")));
            submitButton.click();

            System.out.println("✓ Form submitted!");

            // Wait for submission confirmation
            try {
                WebElement confirmationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[contains(text(), 'Form submitted') or contains(text(), 'Received!')]")));
                System.out.println("✓ Form submission confirmed: " + confirmationMessage.getText());
            } catch (Exception e) {
                System.out.println("Submission completed (confirmation message may vary)");
            }
        }
    }

    /*
     * SETUP INSTRUCTIONS:
     *
     * 1. Add Selenium WebDriver dependency to your project:
     *
     * For Maven (pom.xml):
     * <dependency>
     *     <groupId>org.seleniumhq.selenium</groupId>
     *     <artifactId>selenium-java</artifactId>
     *     <version>4.15.0</version>
     * </dependency>
     *
     * For Gradle (build.gradle):
     * implementation 'org.seleniumhq.selenium:selenium-java:4.15.0'
     *
     * 2. Download ChromeDriver:
     *    - Go to https://chromedriver.chromium.org/
     *    - Download the version matching your Chrome browser
     *    - Extract and place in your system PATH, or
     *    - Uncomment and update the System.setProperty line with the path
     *
     * 3. Compile and run:
     *    javac -cp "selenium-java-4.15.0.jar:." SeleniumFormAutomation.java
     *    java -cp "selenium-java-4.15.0.jar:." SeleniumFormAutomation
     *
     * FEATURES:
     * - Comprehensive form filling automation
     * - Explicit waits for reliable element interaction
     * - Error handling and cleanup
     * - Progress logging for debugging
     * - JavaScript execution for complex elements
     * - Chrome options for better automation performance
     * - Confirmation message detection
     */

