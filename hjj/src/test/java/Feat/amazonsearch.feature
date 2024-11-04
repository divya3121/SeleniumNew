
Feature: Amazon Search
  
  Scenario Outline:
    Given Launch Amazon website
    When Enter the product to Search from sheetname"<SheetName>" and rownumber<rownumber>
    Then Validate Search Result

 Examples:
 |SheetName||rownumber|
 |data||0|