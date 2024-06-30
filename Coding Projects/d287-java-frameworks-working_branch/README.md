# Michael Dodge's JAVA Framworks D287 Project

## Below are the required notes for where changes were made in the code.


###  Prompt C: Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
<strong>1) Updated title and first header in the mainscreen.html to new shop name. Line 18 and 23 edited</strong><br>
<strong>2) added css to demo.css for page styling. Lines 1-8 were added</strong>

### Prompt D: Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

<strong>1) Created AboutScreenController and aboutscreen.html</strong><br>
<strong>2) Added "About" button to mainscreen.html and directed to "About" page. Line 24 added/edited</strong><br>
<strong>3) Added Home button to aboutscreen.html. Line 23 edited</strong>

### Prompt E: Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

<strong>1) Added 5 parts and products to the BootStrapData.java. Lines 72 - 151 edited</strong><br>
<strong>2) If checks added to BootStrapData.java to prevent overwite of data and prevent duplicates. Line 71 and 114 edited</strong>

### Prompt F: Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
#### •  The “Buy Now” button must be next to the buttons that update and delete products.
#### •  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
#### •  Display a message that indicates the success or failure of a purchase.

<strong>1) Added buy now button mapping to AddProductController.java. Edited Lines 184 - 210.</strong><br>
<strong>2) created confirmationbuyproduct.html.</strong><br>
<strong>3) Added buy button to mainscreen.html. Lines 90 and 91 edited.</strong></br>
<strong>4) created outofparterror.html </strong></br>
<strong>5) created outofproducterror.html</strong></br>

### Prompt G: Modify the parts to track maximum and minimum inventory by doing the following:
#### •  Add additional fields to the part entity for maximum and minimum inventory.
#### •  Modify the sample inventory to include the maximum and minimum fields.
#### •  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
#### •  Rename the file the persistent storage is saved to.
#### •  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

<strong>1) added setter and getter to Part.java. Lines 20,33-35,and 90-96 edited </strong><br>
<strong>2) added additional input fields for Min and Max Inventory fields to InhousePartForm.html and OutsourcedPartForm.html. Lines 34-43, 55-57 edited in both files</strong><br>
<strong>3) created InvPartsValidator.java to enforce inventory is between minimum and maximum value</strong>

### Prompt H: Add validation for between or at the maximum and minimum fields. The validation must include the following:
#### •  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
#### •  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
#### •  Display error messages when adding and updating parts if the inventory is greater than the maximum.

<strong>1) ValidInvParts.Java created to display message when inventory is not between min and max values </strong><br>
<strong>2) Lines 4 and 20 edited in Part.java to enforce ValidInvParts file and display message</stong>

### Prompt I:  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

<strong>1) edited lines 159-172 in PartTest.java to add two unit tests for the maximum and minimum fields.</strong>

### Prompt J: Remove the class files for any unused validators in order to clean your code.
<strong>Please Note: No unused validators were found. The below is a list of unused code found throughout the project.</strong><br>
<strong>1) edited lines 3-9 in AboutScreenController.java, removed unused code.</strong><br>
<strong>2) edited lines 4-16 in AddInhousePartController.java, removed unused code.</strong><br>
<strong>3) edited lines 4-16 in AddOutsourcedPartController.java, removed unused code.</strong><br>
<strong>4) edited lines 6-12 in AddPartController.java, removed unused code.</strong><br>
<strong>5) edited lines 5-6 in MainScreenController.java, removed unused code.</strong><br>
<strong>6) edited line 4 in PartRepository.java, removed unused code.</strong><br>
<strong>7) edited lines 3-5 in InhousePartService.java, removed unused code.</strong><br>
<strong>8) edited lines 3-5 in InhousePartServiceImpl.java, removed unused code.</strong><br>
<strong>9) edited line 4 in OutsourcedPartService.java, removed unused code.</strong><br>
<strong>10) edited line 4 in ProductService.java, removed unused code.</strong><br>
<strong>11) edited line 4 in ProductServiceImpl.java, removed unused code.</strong><br>
<strong>12) edited line 4 in PartService.java, removed unused code.</strong><br>
<strong>13) edited lines 3-5 in PartServiceImpl.java, removed unused code.</strong><br>
<strong>14) edited line 4 in DeletePartValidator.java, removed unused code.</strong><br>
<strong>15) edited line 4 in DeletePartValidator.java, removed unused code.</strong><br>
<strong>16) edited lines 5-7 in PriceProductValidator.java, removed unused code.</strong><br>
