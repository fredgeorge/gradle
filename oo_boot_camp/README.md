# oo_boot_camp_2021-05-03_kotlin

Copyright (c) 2021 by Fred George  
May be used freely except for training; license required for training.

OO Boot Camp reference implementation

## Setup for student and instructor code

Use the fredgeorge/gradle project, and the oo_boot_camp directory. Copy
to the desired location, rename as appropriate, and load into IntelliJ.

Tests should run (using Gradle). 

Trim the RectangleTest to just one area() assertion.
Keep the Rectangle class, but remove all but the class declaration
(including removing the constructor parameters)

## Student instructions

Kotlin is relatively easy to setup with IntelliJ IDEA. 
Gradle is used for building, and is a prerequisite. Install if necessary.
The following instructions are for installing the code 
in IntelliJ 2021 by JetBrains. 
Adapt as necessary for your environment.

Note: This implementation was setup to use IntelliJ 2021.1, Kotlin 1.5.21, 
Java SDK 15, and JUnit 5-style for testing.

Open the reference code:

- Download the source code from github.com/fredgeorge
    - Clone, or pull and extract the zip
- Open IntelliJ
- Choose "Open" (it's a Gradle project)
- Navigate to the reference code root, and enter

Source and test directories should already be tagged as such. Confirm or fix:

- File/Project Structure...
- Select "Modules"
    - Tag src directory as Sources in *exercises* module
    - Tag test directory as Tests in *tests* module
    - Add a *dependency* of the *tests* module on the *exercises* module 
    - Click "OK"
- Navigate to the RectangleTest class in the tests/test/unit package
    - The *@Test* directive should be red (wait for the compiler to catch up)
    - Choose the correction option that supports Junit5 (not 4)

Confirm that everything builds correctly (and necessary libraries exist).
There should be errors in RectangleTest. 
Fixing them is the first exercise!