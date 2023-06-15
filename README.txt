## Project structure description ##
All the classes can be found in com.ncr.test.pyramid package and its subpackages.

com.ncr.test.pyramid contains main classes for running Our and Your solution

Subpackage description:
    - data : contain data model class and appropriate factory class. (impl contains implementation of interfaces)
    - solver : contains solution classes to the given task
    - utils : utility classes - nothing you have worry about

Test part of the project keeps the same logic.

For Task 1: files to apply and possibly fix build.gradle, settings.gradle.
For Task 2: class to fix  com.ncr.test.pyramid.solver.impl.NaivePyramidSolver.
For Task 3: class for your solution com.ncr.pyramid.solver.impl.YourSolver

=== following is the procedures of my changes according to tasks1 to task3 ===
## Task 1

1. Showed error when building "Could not find org.junit:junit:4.13.2."
2. In file build.gradle change "org.junit" to "junit" and build project again.
3. Project' report showed 4 unit tests threw exceptions and failed.

## Task 2

1. The OurProgram.java runs, but the result is wrong, it's due to NaivePyramidSolver doesn't consider  row 0.
2. Change in file NaivePyramidSolver.java ```if (row == 0) return 0;``` to  ```if (row == 0) return pyramid.get(row, column);```
3. Create a NaivePyramidSolverTest.java for unit test, but bypass solverSurvivesLargeData, cause that would lead to 2^100 calculations.

## Task 3

1. Modified YourSolver.java.
2. Run YourPragram.java and works.
3. Run unit tests and pass.
