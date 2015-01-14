# GradleCoverageTest
A test project that illustrates how the jacoco gradle plugin fails to generate coverage for classes that start with an "R"

# Generate Coverage Report
To generate a coverage report, run:
```
./gradlew createDebugCoverageReport
```

The report will get placed in `app/build/outputs/reports/coverage/debug/`

Notice that there are tests for the Righteous class and the NotRighteous class.
All of them pass, but coverage is only reported for the NotRighteous class.
